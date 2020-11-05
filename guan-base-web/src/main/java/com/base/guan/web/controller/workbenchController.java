package com.base.guan.web.controller;

import com.base.guan.web.system.SuperController;
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
public class workbenchController extends SuperController {

    /**
     * 登录
     *
     * @return index
     */
    @RequestMapping(value = "/workbench", method = RequestMethod.GET)
    public ModelAndView workbench() {
        logger.info("  / [{}] 打开工作台 。。。","jodron");
        return new ModelAndView("workbench");
    }

}
