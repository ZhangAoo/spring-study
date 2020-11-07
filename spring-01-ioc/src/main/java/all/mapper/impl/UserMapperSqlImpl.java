package all.mapper.impl;

import all.mapper.UserMapper;

public class UserMapperSqlImpl implements UserMapper {
    public void getUser() {
        System.out.println("Mysql获取用户数据");
    }
}
