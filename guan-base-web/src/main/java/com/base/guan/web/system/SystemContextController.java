package com.base.guan.web.system;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

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
