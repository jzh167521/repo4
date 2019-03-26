package Test;

public abstract class Shape04 {
//1.定义抽象父类形状Shape,该类具有如下成员:
//(1)属性
//①长（chang,int类型）
    private int chang;
//②宽（kuan,int类型）
    private  int kuan;
//③半径(r,int类型)
    private int r;
//(2)方法
//①空参构造和满参数构造

    public Shape04() {
    }

    public Shape04(int chang, int kuan) {
        this.chang = chang;
        this.kuan = kuan;

    }
    public Shape04(int r){
        this.r = r;
    }
    //②属性的Get/set方法

    public int getChang() {
        return chang;
    }

    public void setChang(int chang) {
        this.chang = chang;
    }

    public int getKuan() {
        return kuan;
    }

    public void setKuan(int kuan) {
        this.kuan = kuan;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

//③抽象方法perimeter,方法没有形参，方法的返回值类型是double,方法是求形状的面积
    public abstract double perimeter();

//④抽象方法area，方法没有形参，方法的返回值类型是double,方法是求形状的周长
    public abstract double area();
}
