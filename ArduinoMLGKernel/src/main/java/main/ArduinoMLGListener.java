package main;

import dsl.*;
import grammar.RuleSetGrammarBaseListener;
import grammar.RuleSetGrammarParser;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by user on 25/01/17.
 */
public class ArduinoMLGListener extends RuleSetGrammarBaseListener {
    private DSL dsl;
    @Override public void enterDsl(@NotNull RuleSetGrammarParser.DslContext ctx) {
        dsl = new DSL();

        for(RuleSetGrammarParser.SensorContext sc : ctx.sensor()){
            Sensor s = new Sensor();
            s.setName(sc.TEXT().toString());
            s.setPin(Integer.parseInt(sc.DIGIT().getText()));
            dsl.addBrick(s);
            System.out.println("SENSOR "+sc.TEXT()+" DETECTED ON "+sc.DIGIT() );
        }

        for(RuleSetGrammarParser.ActuatorContext ac : ctx.actuator()){
            Actuator a = new Actuator();
            a.setName(ac.TEXT().toString());
            a.setPin(Integer.parseInt(ac.DIGIT().getText()));
            dsl.addBrick(a);
            System.out.println("ACTUATOR "+ac.TEXT()+" DETECTED ON "+ac.DIGIT() );
        }
        for(RuleSetGrammarParser.SpeakerContext spc : ctx.speaker()){
            Speaker s = new Speaker();
            s.setName(spc.TEXT().toString());
            s.setPin(Integer.parseInt(spc.DIGIT().getText()));
            dsl.addBrick(s);
        }



        for(RuleSetGrammarParser.StateContext sc : ctx.state()) {
            State s = new State(sc.TEXT().toString());
            dsl.addState(s);
        }
        for(RuleSetGrammarParser.StateContext sc : ctx.state()){
            State s = dsl.getState(sc.TEXT().toString());
            System.out.println("STATE "+sc.TEXT());
            for(RuleSetGrammarParser.ActionContext ac : sc.action()){
                Action action = null;
                if(ac.logicalAction() != null) {
                    LogicalAction logicalAction = new LogicalAction();
                    RuleSetGrammarParser.LogicalActionContext lac = ac.logicalAction();
                    logicalAction.setActuator((Actuator) dsl.getBrick(lac.TEXT().get(0).toString()));
                    logicalAction.setBinaryState(BinaryState.valueOf(lac.TEXT(1).toString().toUpperCase()));
                    action = logicalAction;
                } else if (ac.serialPrint() != null){
                    SerialPrint serialPrint = new SerialPrint();
                    RuleSetGrammarParser.SerialPrintContext spc = ac.serialPrint();
                    serialPrint.setText(spc.getText());
                    action = serialPrint;
                } else {
                    Tone tone = new Tone();
                    RuleSetGrammarParser.ToneContext toneContext = ac.tone();
                    tone.setFrequency(Long.parseLong(toneContext.DIGIT(0).toString()));
                    tone.setLength(Long.parseLong(toneContext.DIGIT(1).toString()));
                    tone.setSpeaker((Speaker)dsl.getBrick(toneContext.TEXT().toString()));
                    action = tone;
                }

                s.addAction(action);
            }

            for(RuleSetGrammarParser.TransitionContext tc : sc.transition()){
                Transition transition = new Transition();
                transition.setTarget(dsl.getState(tc.TEXT().toString()));
                System.out.println("\tTRANSITION TO STATE "+tc.TEXT());
                for(RuleSetGrammarParser.ConditionContext cc : tc.condition()){
                    Condition condition = null;
                    if(cc.logicalCondition() != null){
                        LogicalCondition logicalCondition = new LogicalCondition();
                        RuleSetGrammarParser.LogicalConditionContext lc = cc.logicalCondition();
                        logicalCondition.setBinaryState(BinaryState.valueOf(lc.TEXT(1).getText().toUpperCase()));
                        logicalCondition.setSensor((Sensor)dsl.getBrick(lc.TEXT(0).getText()));

                        condition = logicalCondition;
                    } else {
                        RuleSetGrammarParser.TimeConditionContext tcc = cc.timeCondition();
                        TimeCondition timeCondition = new TimeCondition();
                        timeCondition.setWaitTime(Long.parseLong(tcc.DIGIT().getText()));
                        condition = timeCondition;

                    }
                    transition.addCondition(condition);
                }
                s.addTransition(transition);
            }

        }

        for(RuleSetGrammarParser.InitContext ic : ctx.init()){
            System.out.println("INITIAL STATE:"+ic.TEXT());
            //TODO set the initial state
            dsl.setInitState(ic.TEXT().toString());
        }
        System.out.println(dsl.toString());


    }

}
