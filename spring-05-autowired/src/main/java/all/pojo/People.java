package all.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * @Autowired
 * 直接在属性上使用即可！也可以在set方法上使用
 * 使用Autowired我们可以不用写set方法，前提是自动装配的属性在IOC（spring）容器中存在，且符合类型byType
 *
 * @Qualifier
 * 如果@Autowired自动装配的环境比较复杂，自动装配无法通过一个注解【@Autowired】完成时，可以使用@Qualifier(value ="xxx")
 * 去配合@Autowired的使用，指定一个唯一的bean注入
 *
 * @Resource和@Autowired的区别
 * 相同：都是自动装配使用，都可以放在属性字段上
 * 区别：@Autowired通过byType方式实现，如果有多个类型相同，再通过byName
 *      @Resource是先通过byName的方式实现，如果找不到名字，则通过byType实现，两个都找不到就报空指针
 *
 *
 *
 */
@Data
public class People {
   //如果显示定义了Autowired的required属性为false，说明这个对象可以为null，否则不可以为null，会报空指针异常
//    @Autowired(required = false)
    @Resource(name = "dog333")
    private Dog dog;
    @Autowired
    @Qualifier(value ="cat666")
    private Cat cat;
    private String name;
}
