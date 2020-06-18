package com.xcy.goatmilk.base;

import lombok.Data;

import java.io.Serializable;

/**
 * @author xcy
 * @Desc
 * @date 2020/6/18 11:44
 * @Version v1.0
 */
@Data
public abstract class Qo implements Serializable {

    private static final long serialVersionUID = -8754051608374086461L;
    /**
     * 客户ID 前端无需传,由后台解析token AOP置入
     */
    protected Integer userId;

    /**
     * 登录名
     */
    protected String userName;

    /**
     * 角色
     */
    protected Integer role;
}
