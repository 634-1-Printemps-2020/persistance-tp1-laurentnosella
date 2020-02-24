package ch.hesge.cours634.counter;

import java.util.Objects;

public class Counter implements ICounter {

    private int val;

    public Counter() {
    }

    public Counter(int val) {
        this.val = val;
    }

    @Override
    public void inc() throws CounterException {
        val += 1;
    }

    @Override
    public void add(int step) throws CounterException {
            val += step;
    }

    @Override
    public int getValue() {
        return val;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "val=" + val +
                '}';
    }
}
