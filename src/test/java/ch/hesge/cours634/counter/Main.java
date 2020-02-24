package ch.hesge.cours634.counter;

public class Main {

    public static void main(String[] args) throws CounterException{
        testCounter();
        testUpperLimitedPositiveCounter();

    }

    private static void testUpperLimitedPositiveCounter() {
        //Pas nécessaire de tester à nouveau les méthodes présentes dans Counter
        //Test des exceptions
        UpperLimitedPositiveCounter counter;

        //Test valeur max
        counter = new UpperLimitedPositiveCounter(0,5);
        try {
            counter.add(10);
            System.out.println("Exception non lancée, erreur");
        } catch (CounterException e) {
            System.out.println("Ok");;
        }
    }

    private static void testCounter() throws CounterException {
        Counter counter;

        //Tester constructeur
        counter = new Counter();
        if(counter.getValue()!=0){
            throw new IllegalArgumentException("Test constructor failed, expected value 0");
        }

        counter = new Counter(9);
        if(counter.getValue()!=9){
            throw new IllegalArgumentException("Test constructor failed, expected value 9");
        }

        //Tester inc
        counter = new Counter();
        counter.inc();
        if (counter.getValue()!=1){
            throw new IllegalArgumentException("Increment not working");
        }

        //Test add
        counter = new Counter();
        counter.add(5);
        if(counter.getValue()!=5){
            throw new IllegalArgumentException("Test add failed");
        }
    }
}
