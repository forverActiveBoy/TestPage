package com.alibaba.test;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.Permission;
import org.apache.shiro.authz.permission.AllPermission;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.mgt.SubjectFactory;
import org.apache.shiro.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class PermissionTest {
    public static void main(String[] args) {
        //  初始化工厂
        IniSecurityManagerFactory iniSecurityManagerFactory = new IniSecurityManagerFactory("classpath:shiro-permission.ini");
        //  获取安全管理器实例
        SecurityManager securityManager = iniSecurityManagerFactory.getInstance();
        //  将安全管理器注入工具类中
        SecurityUtils.setSecurityManager(securityManager);
        //  获取主体
        Subject subject = SecurityUtils.getSubject();
        //  认证
        subject.login(new UsernamePasswordToken("zhangsan","123"));
        System.out.println(subject.isAuthenticated());
        // 查看用户有没有这个角色
        boolean role =  subject.hasRole("role1");
        System.out.println(role);

        // 查看用户有没有这些角色
        List<String> roleList = new ArrayList<>();
        roleList.add("role1");
        roleList.add("role2");
        boolean[] hasRoles = subject.hasRoles(roleList);

        //  查看是否有这个权限
        boolean permitted =  subject.isPermitted("user:create");
        System.out.println(permitted);
        //  查看是否有这些权限，只要全部权限都有，才为true
        boolean permittedLost =  subject.isPermittedAll("user:delete","user:update");
        System.out.println(permittedLost);
    }
}
