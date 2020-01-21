package creation.prototype;

import java.util.Date;

/**
 * @author 朱志军
 * @create 2020-01-17 22:24
 * @desc 原型模式（深克隆）
 **/
public class Sheep2 implements Cloneable{
    private String sname;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();

        //添加深克隆
        Sheep2 s = (Sheep2) obj;
        //Date类实现了Cloneable接口
        s.birthday = (Date) this.birthday.clone();
        return obj;       //直接调用clone方法
    }

    public Sheep2(String sname, Date birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
