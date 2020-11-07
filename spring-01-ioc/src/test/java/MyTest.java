import all.mapper.impl.UserMapperImpl;
import all.mapper.impl.UserMapperSqlImpl;
import all.service.UserService;
import all.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){
//        //用户实际调用的业务层，mapper层他们不需要接触
//        UserService userService=new UserServiceImpl();
//
//        ((UserServiceImpl)userService).setUserMapper(new UserMapperImpl());
//
//        userService.getUser();

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl)context.getBean("UserServiceImpl");
        userServiceImpl.getUser();

    }

}
