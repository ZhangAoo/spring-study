package all.mapper;

import all.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{


//原来都是用sqlSession的操作，现在使用SqlSessionTemplate
    private SqlSessionTemplate sqlSession;

//    public void setSqlSession(SqlSessionTemplate sqlSession) {
//        this.sqlSession = sqlSession;
//    }


    public List<User> selectUser() {
        User user = new User(5,"李四", "abcabc");

        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        mapper.addUser(user);
        mapper.deleteUser(5);
        return mapper.selectUser();
    }

    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
