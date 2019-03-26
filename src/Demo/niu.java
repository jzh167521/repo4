package Demo;
/*
继承shicao
 */
public class niu extends shicao{

    public niu() {
    }

    public niu(String leixing, String name, String color) {
        super(leixing, name, color);
    }

    @Override
    public void gongneng() {
        System.out.println("功能:"+getName()+"可以产出牛奶....");
    }


}
