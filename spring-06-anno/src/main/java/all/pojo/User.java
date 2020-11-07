package all.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
// 等价于<bean id="user" class="all.pojo.User"></bean>
@Component
public class User {
    @Value("张三丰")
    public String name;
}
