package Test;

public class Employee05 {
//1.定义员工Employee类,该类具有如下成员:
//(1)属性：姓名(name,字符串类型)，工号(workId,字符串类型)，部门(dept,字符串类型),属性私有
    private String name;
    private String workId;
    private String dept;
//(2)方法:
//①空参数构造和满参数构造

    public Employee05() {
    }

    public Employee05(String name, String workId, String dept) {
        this.name = name;
        this.workId = workId;
        this.dept = dept;
    }
    //②提供属性的set/get方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

//③定义showMsg方法，方法没有形参，方法的返回值类型是void,方法内打印depart和name和id

    public void showMsg(){

        System.out.println(dept+"的:"+name+",员工编号:"+workId);
    }
}
