package Test;

public class C01 extends B01{
    int numc = 30;

    @Override
    public void showB() {
        System.out.println("B类中numb:"+numb);
    }

    @Override
    public void showA() {
        System.out.println("A类中numa:"+numa);
    }

    public void showC(){
        System.out.println("C类中numc:"+numc);
    }
}
