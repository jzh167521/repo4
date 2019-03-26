package Test;

public class Circle04 extends Shape04 {
//4.Circle编写有参构造方法(半径),重写计算周长和面积的方法（圆的周长:2π*r,圆的面积:π*r*r）



    public Circle04() {
    }

    public Circle04( int r) {
        super(r);
    }

    @Override
    public double perimeter() {
        return Math.PI*getR()*getR();
    }

    @Override
    public double area() {
        return 2*Math.PI*getR();
    }
}
