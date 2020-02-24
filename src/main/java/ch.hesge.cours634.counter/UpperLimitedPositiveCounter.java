package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter {

    private int max;

    public UpperLimitedPositiveCounter(int val, int max) {
        super(val);
        this.max = max;
    }

    @Override
    public void inc() throws CounterException {
        checkMax(1);
        super.inc();
    }

    @Override
    public void add(int step) throws CounterException {
        checkMax(step);
        checkPositive(step);
        super.add(step);
    }

    private void checkMax(int i) throws CounterException {
        if (getValue() + i > max) {
            throw new CounterException("Counter can not exceed max value");
        }
    }

    private void checkPositive(int step) throws CounterException {
        if (getValue()+step < 0){
            throw new CounterException("Counter can not be negative");
        }
    }

    @Override
    public String toString() {
        return "UpperLimitedPositiveCounter{" +
                "value=" + max +
                "max=" + max +
                '}';
    }
}
