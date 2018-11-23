package com.fulihui.demo.zk.web;

import com.fulihui.demo.zk.web.client.DemoServiceClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;

/**
 * @author lizhi
 * @date 2018-11-23
 */

@ComponentScan(basePackages = {"com.fulihui.demo"})
@org.springframework.boot.autoconfigure.SpringBootApplication
public class SofaWepApplication {


    private static final Logger LOGGER= LoggerFactory.getLogger(SofaWepApplication.class);
    @Autowired
    DemoServiceClient demoServiceClient;

    public static void main(String[] args) {
        new SpringApplicationBuilder(SofaWepApplication.class).web(true).run(args);

    }

    @PostConstruct
    void init() throws InterruptedException {

        for (int i = 0; i < 111; i++) {
            Thread.sleep(2000);
            try {
                String say = demoServiceClient.say("11111111111");
                System.out.println(say);
            } catch (Exception e) {
                LOGGER.error(e.getMessage(), e);
            }
        }

    }
}

