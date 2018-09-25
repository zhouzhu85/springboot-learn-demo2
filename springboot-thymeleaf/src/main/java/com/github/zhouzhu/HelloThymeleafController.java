package com.github.zhouzhu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: HelloThymeleafController
 * @author:zhouzhu
 * @Date: 2018/9/25 16:38
 * @Version: V1.0
 */
@Controller
public class HelloThymeleafController {
    @RequestMapping("/")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("host","www.baidu.com");
        return "index";
    }
}
