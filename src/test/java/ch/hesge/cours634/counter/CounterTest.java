package ch.hesge.cours634.counter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    Counter counter;

    @Test
    void inc() throws CounterException {
        counter = new Counter();
        counter.inc();
        assertEquals(1,counter.getValue());
    }

    @Test
    void add() {
        //Todo:Mise en place test sur add
    }

    @Test
    void getValue() {
        //Todo:Mise en place test sur getValue
    }
}