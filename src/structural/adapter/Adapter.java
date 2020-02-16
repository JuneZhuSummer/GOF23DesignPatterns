package structural.adapter;

/**
 * @author 朱志军
 * @create 2020-02-10 12:37
 * @desc 适配器（目标接口的实现类）
 * 两种方式实现（1、类适配--继承实现 2、对象适配--对象注入实现）
 * 此处使用对象适配的方式实现，更为灵活
 **/
public class Adapter implements Target{

    private Adaptor adaptor;

    @Override
    public void handleReq() {
        adaptor.request();
    }

    public Adapter(Adaptor adaptor) {
        this.adaptor = adaptor;
    }

}
