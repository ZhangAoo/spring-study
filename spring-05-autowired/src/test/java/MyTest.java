import all.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){
     ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        People people = (People)context.getBean("people");
        people.getCat().shout();
        people.getDog().shout();
    }

    @Test
    public void test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = (People)context.getBean("people");
        people.getCat().shout();
        people.getDog().shout();
    }
}
