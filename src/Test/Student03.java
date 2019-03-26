package Test;

public class Student03 extends Person03{
//3.定义Student类，继承Person,该类具有如下成员:
//(1)属性：分数(score,int类型)
    private int score;
//(2)构造方法：无参构造方法，有参构造方法

    public Student03(int score) {
        this.score = score;
    }

    public Student03(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }


//(3)成员方法：getXxx方法，setXxx方法，考试方法kaoshi，方法没有形参，返回值类型是void，方法内打印xx学生考试得了yy分（xx是变量，yy也是变量）


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void kaoshi(){
        System.out.println(getName()+"同学,考试得了:"+score+"分");
    }
}
