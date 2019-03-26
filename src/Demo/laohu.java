package Demo;
/*
继承 shirou
 */
public class laohu  extends shirou{
    public laohu() {
    }

    public laohu(String leixing, String name, String color) {
        super(leixing, name, color);
    }

    @Override
    public void pinzhong() {
        System.out.println("品种:"+getName()+"属于猫科");
    }
}
