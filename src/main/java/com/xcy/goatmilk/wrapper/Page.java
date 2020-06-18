package com.xcy.goatmilk.wrapper;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author xcy
 * @Desc
 * @date 2020/6/18 12:02
 * @Version v1.0
 */
@Data
public class Page<T> implements Serializable {
    private static final long serialVersionUID = 6192718632881593829L;
    /**
     * 总条数
     */
    private long total;

    /**
     * 总页数
     */
    private Integer pages;

    /**
     * 数据
     */
    private List<T> rows;

    public Page() {
        this.pages = 0;
        this.total = 0L;
        this.rows = null;
    }

}