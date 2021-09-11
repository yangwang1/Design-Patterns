package com.yangwang.java.jiandangongchang1;

/**
 * @author yangwang
 * @date 2021-09-09-0:41
 */
public class PasswordLogin implements Login{
    @Override
    public boolean verify(String name, String password) {

        return true;
    }
}
