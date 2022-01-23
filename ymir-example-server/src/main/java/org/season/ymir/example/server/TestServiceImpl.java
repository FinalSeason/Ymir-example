package org.season.ymir.example.server;


import org.season.ymir.common.TestResponse;
import org.season.ymir.common.TestService;
import org.season.ymir.common.utils.GsonUtils;
import org.season.ymir.core.annotation.Service;
import org.season.ymir.core.context.RpcContext;

import java.util.Random;

/**
 * TODO
 *
 * @author KevinClair
 */
@Service
public class TestServiceImpl implements TestService {

    @Override
    public TestResponse test(TestResponse name) {
        System.out.println(GsonUtils.getInstance().toJson(RpcContext.getContext().getAttachments()));
        System.out.println("接口被调用");
        return name;
    }
}
