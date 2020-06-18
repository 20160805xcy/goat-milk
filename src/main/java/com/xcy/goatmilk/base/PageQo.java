package com.xcy.goatmilk.base;

import lombok.*;

/**
 * @author xcy
 * @Desc
 * @date 2020/6/18 11:43
 * @Version v1.0
 */
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public abstract class PageQo<T extends PageQo> extends Qo {

    private static final long serialVersionUID = 6372061201255573434L;
    /**
     * 页数
     */
    protected Integer page;

    /**
     * 单页显示总条数
     */
    protected Integer rows;

}
