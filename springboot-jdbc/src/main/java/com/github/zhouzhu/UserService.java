package com.github.zhouzhu;


public interface UserService {

    /**
     * 新增用户
     * @param name
     * @param age
     */
    void create(String name,Integer age);

    /**
     * 根据name删除用户
     * @param name
     */
    void deleteByName(String name);

    /**
     * 获取用户总量
     * @return
     */
    Integer getAllUsers();

    /**
     * 删除所有用户
     */
    void deleteAllUsers();
}
