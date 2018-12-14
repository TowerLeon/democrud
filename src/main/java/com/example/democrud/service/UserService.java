/**
 * FileName: UserService
 * Author:   Lenovo
 * Date:     12/14/2018 7:50 PM
 * Description:
 * History:
 */
package com.example.democrud.service;
import com.example.democrud.bean.*;

/**
 *
 * Title: UserService
 * Description:用户接口
 * Version:1.0.0
 * @author pancm
 * @date 2018年1月9日
 */
public interface UserService {

    /**
     * 新增用户
     * @param user
     * @return
     */
    boolean addUser(User user);

    /**
     * 修改用户
     * @param user
     * @return
     */
    boolean updateUser(User user);


    /**
     * 删除用户
     * @param id
     * @return
     */
    boolean deleteUser(int id);

    /**
     * 根据用户名字查询用户信息
     * @param userName
     */
    User findUserByName(String userName);

    /**
     * 根据用户ID查询用户信息
     * @param userId
     */
    User findUserById(int userId);

    /**
     * 根据用户ID查询用户信息
     * @param userAge
     */
    User findUserByAge(int userAge);
}