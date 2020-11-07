package all.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data

public class User {
    @Value("哈哈哈")
    private String name;
}
