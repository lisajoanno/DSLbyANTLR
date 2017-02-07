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
    private String result;
    @Override public void enterDsl(@NotNull RuleSetGrammarParser.DslContext ctx) {
        dsl = new DSL();
        boolean serialActivated = false;
        if(ctx.serial() != null) {
            serialActivated = BinaryState.valueOf(ctx.serial().binaryState().getText().toString()) == BinaryState.HIGH;
        }
        dsl.setSerialActivated(serialActivated);

        if(ctx.debounce() != null){
            dsl.setDebounce(Integer.parseInt(ctx.debounce().DIGIT().getText()));
        }
        for(RuleSetGrammarParser.SensorContext sc : ctx.sensor()){
            Sensor s = new Sensor();
            s.setName(sc.TEXT().toString());
            s.setPin(Integer.parseInt(sc.DIGIT().getText()));
            dsl.addBrick(s);
        }

        for(RuleSetGrammarParser.ActuatorContext ac : ctx.actuator()){
            Actuator a = new Actuator();
            a.setName(ac.TEXT().toString());
            a.setPin(Integer.parseInt(ac.DIGIT().getText()));
            dsl.addBrick(a);
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
            for(RuleSetGrammarParser.ActionContext ac : sc.action()){
                Action action = null;
                if(ac.logicalAction() != null) {
                    LogicalAction logicalAction = new LogicalAction();
                    RuleSetGrammarParser.LogicalActionContext lac = ac.logicalAction();
                    logicalAction.setActuator((Actuator) dsl.getBrick(lac.TEXT().toString()));
                    logicalAction.setBinaryState(BinaryState.valueOf(lac.binaryState().getText().toString()));
                    action = logicalAction;
                } else if (ac.serialPrint() != null){
                    if(!serialActivated){
                       // System.err.println("trying to print without serial, ignoring action !");
                    }
                    {
                        SerialPrint serialPrint = new SerialPrint();
                        RuleSetGrammarParser.SerialPrintContext spc = ac.serialPrint();
                        serialPrint.setText(spc.TEXT().toString());
                        action = serialPrint;
                    }
                } else {
                    Tone tone = new Tone();
                    RuleSetGrammarParser.ToneContext toneContext = ac.tone();
                    tone.setFrequency(Long.parseLong(toneContext.DIGIT(0).toString()));
                    tone.setLength(Long.parseLong(toneContext.DIGIT(1).toString()));
                    tone.setSpeaker((Speaker)dsl.getBrick(toneContext.TEXT().toString()));
                    action = tone;
                }
                if(action != null)
                    s.addAction(action);
            }

            for(RuleSetGrammarParser.TransitionContext tc : sc.transition()){
                Transition transition = new Transition();
                transition.setTarget(dsl.getState(tc.TEXT().toString()));
                for(RuleSetGrammarParser.ConditionContext cc : tc.condition()){
                    Condition condition = null;
                    if(cc.logicalCondition() != null){
                        LogicalCondition logicalCondition = new LogicalCondition();
                        RuleSetGrammarParser.LogicalConditionContext lc = cc.logicalCondition();
                        logicalCondition.setBinaryState(BinaryState.valueOf(lc.TEXT().getText().toUpperCase()));
                        logicalCondition.setSensor((Sensor)dsl.getBrick(lc.binaryState().getText().toString()));

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
            dsl.setInitState(ic.TEXT().toString());
        }
        result = dsl.toString();


    }


    public String getProgram(){
        return result;
    }
}
