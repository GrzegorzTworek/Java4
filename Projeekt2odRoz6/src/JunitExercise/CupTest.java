package JunitExercise;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.time.Duration;
import java.util.InvalidPropertiesFormatException;

import static org.junit.jupiter.api.Assertions.*;

//@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class CupTest {


    @Test
    void xxx(){
        String s = "cat";
        String w = "cat";
        assertEquals(s,w);
    }

    @Test
    void testisEmpty(){
        Cup cup = new Cup ("Water", 75.0);
        assertFalse(cup.isEmpty(),"ciag nie jest pusty");
    }
    @Test
    void testSetLiquidWithNull(){
        Cup cup = new Cup ("Water", 75.0);
        cup.setLiquidType(null);
        assertNotNull(cup.getLiquidType());
    }

    @Disabled("Disable test until Library team fixes bug 2532")
    @Test
    void testTestExternalLibrary(){
        //Imagine depending on someone else code
        // ..
        fail();

    }

    @Test
    //@Tag("Math")
    void testSetBadPercentThrows(){
        Cup cup = new Cup ("Water", 75.0);
        //cup.setPercentFull(-1);
        assertThrows(IllegalArgumentException.class,
                ()->cup.setPercentFull(-1)
                );
    }

    @Test
    //@Tag("Math")
    void testObjectCreation(){
        Cup cup = new Cup ("Water", 75.0);
        assertEquals("Water", cup.getLiquidType());
        assertEquals(75, cup.getPercentFull(), 0.001);
    }

    @Test
    void testObjectCreationWithAssertAll(){
        Cup cup = new Cup ("Water", 75.0);
        assertAll("Correctly builds objest",
                ()->assertEquals("Water", cup.getLiquidType()),
                ()->assertEquals(75, cup.getPercentFull(), 0.001,"powinno zwracac dobrze")
        );
    }

    public double guessThePercent(Cup cup){
        while (true){
            double guess = Math.random();
            if (Math.abs(guess- cup.getPercentFull()) < 100) {
                return guess;

            }
        }
    }
    @Test
    void guessThePercent(){
        Cup cup =new Cup ("Water", 50);
        assertTimeoutPreemptively(
                Duration.ofSeconds(5),
                ()-> guessThePercent(cup) >0);
    }
}