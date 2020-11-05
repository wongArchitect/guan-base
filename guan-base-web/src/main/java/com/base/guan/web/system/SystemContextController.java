package com.base.guan.web.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

/**
 * IndexController
 *
 * @author fanjianjun
 * @version 1.0
 * @date 2019/12/03
 */
@Controller
public class SystemContextController extends SuperController {

    /**
     * 登录
     *
     * @return index
     */
    public ModelAndView index() {
//        logger.info(" [{}] / [{}] 登录。。。",superSdf.format(new Date()), "jodron");
        return new ModelAndView("index");
    }

}
