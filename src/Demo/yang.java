package Demo;


/*
继承 shicao
 */
public class yang extends shicao {

    public yang() {
    }

    public yang(String leixing, String name, String color) {
        super(leixing, name, color);
    }

    @Override
    public void gongneng() {

        System.out.println("功能:"+getName()+"可以产出羊奶.....");
    }


}
