package com.fulihui.demo.zk.service;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author lizhi
 * @date 2018-11-23
 */
@ComponentScan(basePackages = {"com.fulihui.demo"})
@org.springframework.boot.autoconfigure.SpringBootApplication
public class SofaServiceApplication {



    public static void main(String[] args) {
        new SpringApplicationBuilder(SofaServiceApplication.class).web(true).run(args);

    }

}
