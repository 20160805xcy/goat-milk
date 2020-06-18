package com.xcy.goatmilk.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * 程序启动后通过ApplicationRunner处理一些事务
 */
@Component
public class MyApplicationRunner implements ApplicationRunner {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${server.port}")
    private int port;

    @Override
    public void run(ApplicationArguments args) {
        logger.info("部署完成，访问地址：http://localhost:" + port + "/swagger-ui.html");
    }
}
