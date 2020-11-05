package com.base.guan.web.system;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * IndexController
 *
 * @author fanjianjun
 * @version 1.0
 * @date 2019/12/03
 */
@Controller
public class UserController extends SuperController {

    /**
     * 首页 / 登录
     *
     * @return index
     */
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ModelAndView index() {
        logger.info("  / [{}]  用户 。。。","jodron");
        return new ModelAndView("index");
    }

}
