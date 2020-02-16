package structural.adapter;

import org.junit.Test;

/**
 * @author 朱志军
 * @create 2020-02-10 12:35
 * @desc 测试类
 **/
public class TestAdapter {

    public void use(Target t){
        t.handleReq();
    }

    @Test
    public void test1(){
        TestAdapter ta = new TestAdapter();
        Adaptor a = new Adaptor();
        Target t = new Adapter(a);
        ta.use(t);
    }

}
