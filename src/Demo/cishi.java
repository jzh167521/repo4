package Demo;

public class cishi {
    public static void main(String[] args) {

        niu niu = new niu("食草动物","奶牛","黑白");
        niu.show();// 取得Animal 里面的show 打印信息方法
        niu.chi();// 取得Animal 里面的抽象方法 在食草动物里面重写后的chi方法
        niu.gongneng();// 取得 shicao 里面的抽象方法 在牛里面重写的gongneng方法
        System.out.println("----------------");
        yang yang = new yang("食草动物","羊","白");
        yang.show();
        yang.chi();
        yang.gongneng();

        System.out.println("===============================");

        laohu laohu = new laohu("食肉动物","孟加拉虎","白");
        laohu.show();
        laohu.chi();
        laohu.pinzhong();

        System.out.println("----------------");
        bao bao = new bao("食肉动物","美洲豹","黄豹纹");
        bao.show();
        bao.chi();
        bao.pinzhong();

    }
}
