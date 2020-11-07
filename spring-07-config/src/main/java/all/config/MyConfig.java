package all.config;

import all.pojo.User;
import all.pojo.User2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Configuration ：（底层是@Component，也是组件，注册到容器中）代表这是一个配置类，和xxx.xml一样
 */
@Configuration
@ComponentScan("all.pojo")
@Import(User2.class)
public class MyConfig {
    //注册一个bean，想当于xml中的bean标签
    //方法名相当于bean标签中的id属性
    //返回值相当于bean标签中的class属性
    @Bean
    public User getUser(){
        return new User() ;//就是返回要注入到bean的对象
    }
}
