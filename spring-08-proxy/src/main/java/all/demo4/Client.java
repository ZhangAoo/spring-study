package all.demo4;

import all.demo2.Service;
import all.demo2.ServiceImpl;

public class Client {
    public static void main(String[] args) {
        //真实角色
        ServiceImpl service = new ServiceImpl();
        //代理角色：不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //设置要代理的对象
        pih.setTarget(service);
        //动态生成代理类
        Service proxy = (Service) pih.getProxy();

        proxy.add();

    }
}
