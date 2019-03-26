package Test;

public abstract class Poultry02 {
//(1)私有成员变量：动物种类(name，字符串类型)，症状(symptom，字符串类型)，年龄(age,int类型)，
// 病因（illness，字符串类型）
    private String name;
    private String symptom;
    private int age;
    private String illness;

//(2)提供空参和带参构造方法

    public Poultry02() {
    }

    public Poultry02(String name, String symptom, int age, String illness) {
        this.name = name;
        this.symptom = symptom;
        this.age = age;
        this.illness = illness;
    }
    //(3)成员方法
//①抽象方法showSymptom，展示症状
    public abstract void showSymptom();
//②普通方法showMsg，展示家禽类的信息
    public void showMsg(){
        System.out.println("动物种类:"+name+",年龄:"+age);
        System.out.println("入院原因:"+illness);
    }
//③提供setXxx和getXxx方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }
}
