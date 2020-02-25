package ch.hesge.cours634.counter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    Counter counter;
    int testVar = 10;

    @Test
    void initCounterPositive(){
        counter = new Counter(testVar);
        assertEquals(testVar,counter.getValue());
    }

    @Test
    void initCounterNegative(){
        counter = new Counter(-10);
        assertEquals(-10,counter.getValue());
    }

    @Test
    void incPositive() throws CounterException {
        counter = new Counter();
        counter.inc();
        assertEquals(1,counter.getValue());
    }

    @Test
    void incNegative() throws CounterException{
        counter = new Counter();
        counter.add(-5);
        counter.inc();
        assertEquals(-4,counter.getValue());
    }

    @Test
    void addPositive() throws CounterException {
        counter = new Counter();
        counter.add(testVar);
        assertEquals(testVar,counter.getValue());
    }

    @Test
    void addNegative() throws CounterException{
        counter = new Counter();
        counter.add(-10);
        assertEquals(-10,counter.getValue());
    }

    @Test
    void getValue() {
        counter = new Counter(testVar);
        assertEquals(testVar,counter.getValue());
    }
}