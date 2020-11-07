import all.config.MyConfig;
import all.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        //如果完全使用了配置类方式，我们就只能通过AnnotationConfig 上下文来获取容器，通过配置类的class对象加载！
       ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User user =(User) context.getBean("getUser");
        System.out.println(user.getName());
    }
}
