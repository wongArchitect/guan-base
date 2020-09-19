package com.base.guan.web.controller;

import com.base.guan.web.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * IndexController
 *
 * @author lishudong
 * @version 1.0
 * @date 2019/12/03
 */
@Controller
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    /**
     * 首页/history页面
     * http://layout.jd.com
     *
     * @return index
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        logger.info("登录");
        return new ModelAndView("index");
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

    /**
     * 新建 商品布局
     * http://layout.jd.com/create
     *
     * @return index
     */
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView toCreate() {
        return new ModelAndView("index");
    }

    /**
     * 计算结果 商品布局
     * http://layout.jd.com/result
     *
     * @return index
     */
    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public ModelAndView toResult(String layoutId) {
        ModelAndView view = new ModelAndView("index");
        view.addObject("layoutId", layoutId);
        return view;
    }
}
