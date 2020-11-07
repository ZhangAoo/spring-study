import all.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean的作用域：
 * 单例模式：从容器中get的是同一个对象（Spring默认机制！！！）
 * 原型模式：（prototype）每次从容器中get，都是一个新的对象
 * java web开发中使用的作用域：
 * request：请求一次，然后就失效
 * session：对象一直存放在session中
 * application：全局一直存在
 */
public class MyTest {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }
}
