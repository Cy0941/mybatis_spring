package cxy.ssm.dao.mapper;

import cxy.ssm.model.User;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/10/12 22:13 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public interface UserMapper {

    User findOne(Integer id) throws Exception;

}
