package Test;

public class Test06 {
    public static void main(String[] args) {
        // 创建购物车对象
        GouWuChe06 gwc = new GouWuChe06();

        Goods goods = new Goods("电脑",001,6999);
        Goods goods1 = new Goods("键盘",002,199);
        Goods goods2 = new Goods("鼠标",003,59);

        // 调用gwc 集合的方法 添加商品
        System.out.println("================添加商品===============");
        gwc.addGoos(goods);
        gwc.addGoos(goods1);
        gwc.addGoos(goods2);

        // 调用 打印商品的方法 查看添加的商品
        gwc.showGoods();
        // 调用总价 方法
        gwc.total();

        System.out.println("===================移除鼠标====================");

        // 调用移除商品的方法
        gwc.removeGoods(goods2);

        // 再次调用 移除商品后的 信息商品展示
        gwc.showGoods();

        // 最后调用 移除鼠标后的 价格
        gwc.total();


    }
}
