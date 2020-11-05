package com.base.guan.web.system;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;

/**
 * IndexController
 *
 * @author fanjianjun
 * @version 1.0
 * @date 2019/12/03
 */
@Controller
public class SuperController {

    public static final Logger logger = LoggerFactory.getLogger(SuperController.class);

    final SimpleDateFormat superSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


}
