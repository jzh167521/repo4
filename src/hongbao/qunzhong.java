package hongbao;

import java.util.ArrayList;

public class qunzhong extends User{

    public qunzhong() {
    }

    public qunzhong(String name, int yue) {
        super(name, yue);
    }


    // 收红包方法   在集合中随便拿一份 因为集合中的钱都相同  是平分的   (拿到的这分钱删除在集合中)
    public void shou(ArrayList<Integer> list){
            // 删除集合中的0角标的钱  返回删除的这元素 这个元素就是 群众拿到的钱
        Integer remove = list.remove(0);

        // 在吧钱存入群众的余额中 原有的钱+上收到的红包
        setYue(remove+getYue());


    }

}
