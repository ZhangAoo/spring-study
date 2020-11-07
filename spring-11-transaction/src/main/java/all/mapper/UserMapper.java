package all.mapper;

import all.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    public List<User> selectUser();
    public int addUser(User user);
    public int deleteUser(@Param("id") int id);

}
