package ch.hesge.cours634.counter;

import org.junit.Test;

import static org.junit.Assert.*;

public class UpperLimitedPositiveCounterTest {

    @Test (expected = CounterException.class)
    public void inc() throws CounterException {
        UpperLimitedPositiveCounter counter = new UpperLimitedPositiveCounter(0,5);
        counter.add(10);
    }

    @Test
    public void add() {
    }
}