package Test;

public class Test04 {
    public static void main(String[] args) {
        Rectangle04 r = new Rectangle04(20,5);
        double area = r.area();
        System.out.println("长方形周长为:"+area);
        double perimeter = r.perimeter();
        System.out.println("长方形面积为:"+perimeter);
        Circle04 c = new Circle04(5);
        double area1 = c.area();
        System.out.println("圆形周长为:"+area1);
        double perimeter1 = c.perimeter();
        System.out.println("圆形面积为:"+perimeter1);

    }
}
