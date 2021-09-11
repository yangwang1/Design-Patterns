package com.yangwang.java.jiandangongchang1;

/**
 * @author yangwang
 * @date 2021-09-09-0:55
 */
public class LoginManager {

    public static Login factory(String type){
        if ("password".equals(type)){
            return new PasswordLogin();
        } else if ("passcode".equals(type)){
            return new DomainLogin();
        } else {
            throw new RuntimeException("没有找到登录类型");
        }
    }
}
