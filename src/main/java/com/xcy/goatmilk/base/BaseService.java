package com.xcy.goatmilk.base;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xcy.goatmilk.wrapper.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.MappedSuperclass;

/**
 * @author xcy
 * @Desc
 * @date 2020/6/18 12:04
 * @Version v1.0
 */
@MappedSuperclass
public class BaseService {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 包装数据到自定义分页
     */
    @SuppressWarnings("unchecked")
    protected Page wrap(PageInfo pageInfo) {
        Page page = new Page();
        if (pageInfo != null) {
            page.setPages(pageInfo.getPages());
            page.setTotal(pageInfo.getTotal());
            page.setRows(pageInfo.getList());
        }
        return page;
    }

    /**
     * 分页
     */
    protected void startPage(PageQo qo) {
        PageHelper.startPage(qo.getPage() == null ? 0 : qo.getPage(), qo.getRows() == null ? 5 : qo.getRows());
    }


}
