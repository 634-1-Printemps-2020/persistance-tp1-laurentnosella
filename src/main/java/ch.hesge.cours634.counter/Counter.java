package ch.hesge.cours634.counter;

public class Counter implements ICounter {

    int val;
    int valMin;
    int valMax;

    public Counter(int valMin, int valMax) {
        this.valMin = valMin;
        this.valMax = valMax;
    }

    @Override
    public void inc() throws CounterException {
        val += 1;
        if (val < 0){
            throw CounterException;
        }
    }

    @Override
    public void add(int step) throws CounterException {
        if (step < 1){
            throw CounterException;
        }
        else {
            val += step;
        }
    }

    @Override
    public int getValue() {
        return val;
    }
}
