package main;

import dsl.DSL;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by user on 07/02/17.
 */
public class ArduinoMLGListenerTest {

        @Test
        public void testBaseSample(){
                ArduinoMLGListener listener = Main.runListener("resources/simpleSample.txt");
                DSL dsl = listener.getDsl();
                assertEquals(dsl.getBricks().size(),1);
                assertTrue(dsl.getBricks().containsKey("led"));
                assertEquals(dsl.getBricks().get("led").getName(),"led");
                assertEquals(dsl.getBricks().get("led").getPin(),8);
                assertNotNull(dsl.getState("s0"));
                assertEquals(dsl.getState("s0").getName(),"s0");
                assertEquals(dsl.getStates().size(),1);
                assertEquals(dsl.getState("s0").getActions().size(),0);
                assertEquals(dsl.getState("s0").getTransitions().size(),0);

        }

        @Test(expected = RuntimeException.class)
        public void samePortTest(){
            Main.runListener("resources/samePort.txt");
        }

        @Test(expected = RuntimeException.class)
        public void outOfRangeTest(){
            Main.runListener("resources/outOfRange.txt");
        }

        @Test(expected = RuntimeException.class)
        public void sameBrickNameTest(){
            Main.runListener("resources/sameBrickName.txt");
        }
        @Test(expected = RuntimeException.class)
        public void sameStateTest(){
            Main.runListener("resources/sameStateTest.txt");
        }

        @Test
        public void serialPrintDeactivated(){
            //expected: when the serial output is deactivated but we try to serialprint
            //the serialprint action aren't taken into account
            ArduinoMLGListener mlg = Main.runListener("resources/deactivatedSerial.txt");
            DSL dsl  = mlg.getDsl();

            assertEquals(dsl.getState("s0").getActions().size(),0);
        }
}