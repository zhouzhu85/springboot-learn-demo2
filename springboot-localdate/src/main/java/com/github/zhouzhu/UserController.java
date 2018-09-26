package com.github.zhouzhu;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: UserController
 * @author:zhouzhu
 * @Date: 2018/9/26 15:52
 * @Version: V1.0
 */
@Controller
public class UserController {
    @PostMapping(value = "/user2",
        consumes = MediaType.APPLICATION_XML_VALUE,
            produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public User create(@RequestBody User user){
        user.setName("name："+user.getName());
        user.setAge(user.getAge()+100);
        return user;
    }
}
