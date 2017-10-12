package cxy.ssm.dao.old;

import cxy.ssm.model.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/10/12 18:17 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {


    /**
     * 通过继承 SqlSessionDaoSupport 设置通过 Spring 管理的 SqlSessionFactory 并获取 sqlSession
     * @param id
     * @return
     * @throws Exception
     */
    public User findOne(Integer id) throws Exception {
        SqlSession sqlSession = this.getSqlSession();
        User user = sqlSession.selectOne("traditional.findOne", id);
        return user;
    }
}
