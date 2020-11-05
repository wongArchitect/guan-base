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
public class LoginController  extends SuperController {

    /**
     * 首页 / 登录
     *
     * @return index
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login() {
        logger.info("  / [{}] 登录系统 。。。","jodron");
        return new ModelAndView("login");
    }

    /**
     * 用户设置（参数管理）
     * http://layout.jd.com/ParameterConfig
     *
     * @return index
     */
    @RequestMapping(value = "/parameter", method = RequestMethod.GET)
    public ModelAndView toParameterConfig() {
        return new ModelAndView("index");
    }

    /**
     * 管理员设置
     * http://layout.jd.com/AdminSettings
     *
     * @return index
     */
    @RequestMapping(value = "/settings", method = RequestMethod.GET)
    public ModelAndView toAdminSettings() {
        return new ModelAndView("index");
    }
}
