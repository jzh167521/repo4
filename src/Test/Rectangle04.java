package Test;

public class Rectangle04 extends Shape04 {
// 3.Rectangle编写有参构造方法(长,宽),重写计算周长和面积的方法（矩形的周长:2*（长+宽），矩形的面积:长*宽）


    public Rectangle04() {
    }

    public Rectangle04(int chang, int kuan) {
        super(chang, kuan);
    }

    @Override
    public double perimeter() {
        return getChang()*getKuan();
    }

    @Override
    public double area() {
        return 2*(getChang()+getKuan());
    }
}
