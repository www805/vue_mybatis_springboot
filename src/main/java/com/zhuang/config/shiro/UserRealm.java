package com.zhuang.config.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * 自定义验证类
 */
public class UserRealm extends AuthorizingRealm {

    /**
     * 执行权限逻辑
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行权限逻辑");

        //给资源进行授权
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        //添加资源的授权字符串
        info.addStringPermission("user:getUser");

        return info;
    }

    /**
     * 执行认证逻辑（登录）
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("执行认证逻辑");

        //假设数据库的用户名和密码
        String name = "www805";
        String password = "123456";

        //编写shiro判断逻辑，判断用户名和密码
        //1、判断用户名
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        if(!token.getUsername().equals(name)){
            //用户名不存在
            return null;
        }

        //2、判断密码
        return new SimpleAuthenticationInfo("", password, "");
    }
}
