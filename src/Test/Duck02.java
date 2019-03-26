package Test;

public class Duck02 extends Poultry02 {
    public Duck02() {
    }

    public Duck02(String name, String symptom, int age, String illness) {
        super(name, symptom, age, illness);
    }

    @Override
    public void showSymptom() {
        System.out.println("症状为:"+getSymptom());
    }
}
