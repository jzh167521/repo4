package Demo;

public class bao extends shirou{
    public bao() {
    }

    public bao(String leixing, String name, String color) {
        super(leixing, name, color);
    }

    @Override
    public void pinzhong() {
        System.out.println("品种:"+getName()+"属于豹科");
    }
}
