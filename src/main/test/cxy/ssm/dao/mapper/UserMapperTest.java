package cxy.ssm.dao.mapper;

import cxy.ssm.model.User;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/10/12 22:19 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class UserMapperTest extends TestCase {

    private ApplicationContext applicationContext;

    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    }

    public void testFindOne() throws Exception {
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        User one = userMapper.findOne(1);
        System.out.println(one);
    }

}