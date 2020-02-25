package ch.hesge.cours634.counter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UpperLimitedPositiveCounterTest {

    @Test
    public void incNoError() throws CounterException {
        UpperLimitedPositiveCounter counter = new UpperLimitedPositiveCounter(0,5);
        counter.add(4);
        counter.inc();
        assertEquals(5,counter.getValue());
    }

    @Test
    public void initCounter(){
        UpperLimitedPositiveCounter counter = new UpperLimitedPositiveCounter(0,5);
        Assert.assertEquals(0,counter.getValue());
    }

    @Test
    public void initCounterMoreThenMax() {
        UpperLimitedPositiveCounter counter = new UpperLimitedPositiveCounter(10,2);
        Assert.assertEquals(10,counter.getValue());
    }

    @Test
    public void initCounterNegative(){
        UpperLimitedPositiveCounter counter = new UpperLimitedPositiveCounter(-5,5);
        Assert.assertEquals(-5,counter.getValue());
    }

    @Test (expected = CounterException.class)
    public void incMoreThenMax() throws CounterException {
        UpperLimitedPositiveCounter counter = new UpperLimitedPositiveCounter(0,5);
        counter.add(5);
        counter.inc();
    }

    @Test
    public void IncLessThanZero() throws CounterException{
        UpperLimitedPositiveCounter counter = new UpperLimitedPositiveCounter(-2,5);
        counter.inc();
        Assert.assertEquals(-1,counter.getValue());
    }

    @Test
    public void addNoError() throws CounterException {
        UpperLimitedPositiveCounter counter = new UpperLimitedPositiveCounter(0,10);
        counter.add(1);
        Assert.assertEquals(1,counter.getValue());
    }

    @Test (expected = CounterException.class)
    public void addMoreThanMax() throws CounterException{
        UpperLimitedPositiveCounter counter = new UpperLimitedPositiveCounter(0,5);
        counter.add(6);
    }

    @Test (expected = CounterException.class)
    public void addNegative() throws CounterException{
        UpperLimitedPositiveCounter counter = new UpperLimitedPositiveCounter(0,5);
        counter.add(-2);
    }
}