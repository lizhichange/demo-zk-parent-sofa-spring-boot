package com.fulihui.demo.zk.service.impl;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import com.fulihui.demo.zk.facade.api.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by lizhi on 2018-11-23.
 */
@SofaService(interfaceType = DemoService.class, bindings = {@SofaServiceBinding(bindingType = "bolt")})
@Component
public class DemoServiceImpl implements DemoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoServiceImpl.class);


    @Override
    public String say(String str) {
        LOGGER.info("say,str:{}", str);
        return str;
    }
}
