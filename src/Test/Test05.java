package Test;

public class Test05 {
    public static void main(String[] args) {
        Manager05 m = new Manager05("张小强","M001","销售部");
        Clerk05 c = new Clerk05("李小亮","C001","销售部");
        c.setManager(m);
        c.showMsg();


        m.setClerk(c);
        m.showMsg();
    }
}
