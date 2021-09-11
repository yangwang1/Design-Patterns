package com.yangwang.java.jiandangongchang1;

/**
 *
 * @author yangwang
 * @date 2021-09-09-0:24
 */
public class DomainLogin implements Login {

    @Override
    public boolean verify(String name, String password) {

        return true;
    }
}
