package all.service;

import all.mapper.UserMapper;
import all.mapper.impl.UserMapperImpl;
import all.mapper.impl.UserMapperSqlImpl;

/**
 * 使用set注入后，程序不再具有主动性，而是变成了被动的接收对象！
 */

public class UserServiceImpl implements UserService{


    private UserMapper userMapper;

    //利用set进行动态实现值得注入！
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public void getUser() {
        userMapper.getUser();

    }
}
