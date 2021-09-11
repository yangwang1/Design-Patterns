package com.yangwang.java.jiandangongchang1;

/**
 * 1.简单工厂模式：
 * 优点：调用者不用创建对象，全都交给工厂，增加新的方式时只需要修改工厂逻辑，不需要改调用代码。
 * 缺点：所有逻辑都在工厂中，如果工厂逻辑出问题，整个系统都会受到影响。
 * @author yangwang
 * @date 2021-09-09-0:59
 */
public class Test {

    public static void main(String[] args) {
        String loginType = "password";
        String name = "name";
        String password = "password";
        Login login = LoginManager.factory(loginType);
        boolean bool = login.verify(name, password);
        if (bool) {
            System.out.println("登陆成功");
        } else {
            System.out.println("登录失败");
        }
    }
}
