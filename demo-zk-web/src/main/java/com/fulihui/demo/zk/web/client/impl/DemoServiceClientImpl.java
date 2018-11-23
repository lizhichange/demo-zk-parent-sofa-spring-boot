package com.fulihui.demo.zk.web.client.impl;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import com.fulihui.demo.zk.facade.api.DemoService;
import com.fulihui.demo.zk.web.client.DemoServiceClient;
import org.springframework.stereotype.Component;

/**
 *
 * @author lizhi
 * @date 2018-11-23
 */
@Component
public class DemoServiceClientImpl implements DemoServiceClient {

    @SofaReference(interfaceType = DemoService.class, binding = @SofaReferenceBinding(bindingType = "bolt"))
    DemoService demoService;

    @Override
    public String say(String str) {
        return demoService.say(str);
    }
}
