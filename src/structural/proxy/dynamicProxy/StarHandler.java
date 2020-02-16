package structural.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author 朱志军
 * @create 2020-02-10 21:19
 * @desc 处理类
 **/
public class StarHandler implements InvocationHandler {

    private Star realStar;

    public StarHandler(Star realStar) {
        this.realStar = realStar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = null;
        if (method.getName().equals("sing")){
            invoke = method.invoke(realStar, args);
        }
        return invoke;
    }
}
