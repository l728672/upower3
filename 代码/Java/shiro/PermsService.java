package com.exam.shiro;
/*
 * @Description:
 * @Author: 1013962464521.com
 * @Date: 2020/4/6
 * @param null:
 * @return: null
 **/
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Component;

/**
 * js调用 thymeleaf 实现按钮权限
 * 
 */
@Component("perms")
public class PermsService
{
    public boolean hasPerm(String permission)
    {
        return SecurityUtils.getSubject().isPermitted(permission);
    }
}
