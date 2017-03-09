package org.generaltune.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhumin on 2017/3/9.
 */
@Controller //@Service @Component
@RequestMapping("/Login")  //url:/模块/资源/{id}/细分   /seckill/list
public class LoginController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

}
