package creation.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 朱志军
 * @create 2020-01-17 22:24
 * @desc 原型模式（浅克隆）
 **/
public class Sheep implements Cloneable, Serializable {
    private String sname;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();       //直接调用clone方法
    }

    public Sheep(String sname, Date birthday) {
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
