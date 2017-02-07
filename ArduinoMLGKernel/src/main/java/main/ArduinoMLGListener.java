package main;

import dsl.*;
import grammar.RuleSetGrammarBaseListener;
import grammar.RuleSetGrammarParser;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 25/01/17.
 */
public class ArduinoMLGListener extends RuleSetGrammarBaseListener {
    private DSL dsl;
    private Transition transition;
    private List<Condition> conditionList;
    private State state;
    @Override
    public void enterDebounce(@NotNull RuleSetGrammarParser.DebounceContext ctx){
        dsl.setDebounce(Integer.parseInt(ctx.DIGIT().getText()));
    }
    @Override
    public void enterSerial(@NotNull RuleSetGrammarParser.SerialContext ctx ){
        dsl.setSerialActivated(BinaryState.valueOf(ctx.binaryState().getText().toString()) == BinaryState.HIGH);
    }
    @Override
    public void enterSensor(@NotNull RuleSetGrammarParser.SensorContext ctx){
        Sensor s = new Sensor();
        s.setName(ctx.TEXT().toString());
        s.setPin(Integer.parseInt(ctx.DIGIT().getText()));
        dsl.addBrick(s);
    }
    @Override
    public void enterActuator(@NotNull RuleSetGrammarParser.ActuatorContext ctx) {
        Actuator a = new Actuator();
        a.setName(ctx.TEXT().toString());
        a.setPin(Integer.parseInt(ctx.DIGIT().getText()));
        dsl.addBrick(a);
    }

    @Override
    public void enterSpeaker(@NotNull RuleSetGrammarParser.SpeakerContext ctx){
        Speaker s = new Speaker();
        s.setName(ctx.TEXT().toString());
        s.setPin(Integer.parseInt(ctx.DIGIT().getText()));
        dsl.addBrick(s);
    }

    @Override
    public void enterInit(@NotNull RuleSetGrammarParser.InitContext ctx){
        dsl.setInitState(ctx.TEXT().toString());
    }

    @Override
    public void enterLogicalAction(@NotNull RuleSetGrammarParser.LogicalActionContext ctx){
        LogicalAction logicalAction = new LogicalAction();
        logicalAction.setActuator((Actuator) dsl.getBrick(ctx.TEXT().toString()));
        logicalAction.setBinaryState(BinaryState.valueOf(ctx.binaryState().getText().toString()));
        state.addAction(logicalAction);
    }
    @Override
    public void enterSerialPrint(@NotNull RuleSetGrammarParser.SerialPrintContext ctx){
        if(dsl.isSerialActivated()) {
            SerialPrint serialPrint = new SerialPrint();
            serialPrint.setText(ctx.TEXT().toString());
            state.addAction(serialPrint);
        }
    }
    @Override
    public void enterTone(@NotNull RuleSetGrammarParser.ToneContext ctx){
        Tone tone = new Tone();
        tone.setFrequency(Long.parseLong(ctx.DIGIT(0).toString()));
        tone.setLength(Long.parseLong(ctx.DIGIT(1).toString()));
        tone.setSpeaker((Speaker)dsl.getBrick(ctx.TEXT().toString()));
        RuleSetGrammarParser.StateContext stateContext = (RuleSetGrammarParser.StateContext)ctx.getParent().getParent();
        state.addAction(tone);
    }

    @Override
    public void enterTransition(@NotNull RuleSetGrammarParser.TransitionContext ctx ){
        transition = new Transition();
        transition.setTarget(dsl.getState(ctx.TEXT().toString()));
        conditionList = new ArrayList<>();
    }

    @Override
    public void enterLogicalCondition(@NotNull RuleSetGrammarParser.LogicalConditionContext ctx){
        LogicalCondition logicalCondition = new LogicalCondition();
        conditionList.add(logicalCondition);
        logicalCondition.setSensor((Sensor) dsl.getBrick(ctx.TEXT().toString()));
        logicalCondition.setBinaryState(BinaryState.valueOf(ctx.binaryState().toString()));
    }
    @Override
    public void enterTimeCondition(@NotNull RuleSetGrammarParser.TimeConditionContext ctx){
        TimeCondition timeCondition = new TimeCondition();
        conditionList.add(timeCondition);
        timeCondition.setWaitTime(Long.parseLong(ctx.DIGIT().toString()));
    }

    @Override
    public void exitTransition(@NotNull RuleSetGrammarParser.TransitionContext ctx){

        transition.setConditions(conditionList);
        state.addTransition(transition);
    }

    @Override
    public void enterState(@NotNull RuleSetGrammarParser.StateContext ctx){
        state = dsl.getState(ctx.TEXT().toString());
    }
    @Override public void enterDsl(@NotNull RuleSetGrammarParser.DslContext ctx) {
        dsl = new DSL();



        for(RuleSetGrammarParser.StateContext sc : ctx.state()) {
            State s = new State(sc.TEXT().toString());
            dsl.addState(s);
        }


    }

    public DSL getDsl(){
        return dsl;
    }


    public String getProgram(){
        return dsl.toString();
    }
}
