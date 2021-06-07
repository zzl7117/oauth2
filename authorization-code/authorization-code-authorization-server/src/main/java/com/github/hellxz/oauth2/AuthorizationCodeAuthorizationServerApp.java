package com.github.hellxz.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 授权服务器 入口
 *
 * @author hellxz
 */
@SpringBootApplication
public class AuthorizationCodeAuthorizationServerApp {

    public static void main(String[] args) {
        SpringApplication.run(AuthorizationCodeAuthorizationServerApp.class, args);
    }
    //参考地址 https://www.cnblogs.com/hellxz/p/oauth2_oauthcode_pattern.html#%E5%8F%97%E4%BC%97%E5%89%8D%E6%8F%90
    // 登录地址 ： http://localhost:8080/oauth/authorize?client_id=client-a&client_secret=client-a-secret&response_type=code
    //登录用户/密码： hellxz/xyz
}
