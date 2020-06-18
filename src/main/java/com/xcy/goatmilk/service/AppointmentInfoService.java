package com.xcy.goatmilk.service;

import com.xcy.goatmilk.pojo.AppointmentInfo;
import com.xcy.goatmilk.pojo.dto.AppointmentInfoDto;
import com.xcy.goatmilk.pojo.qo.AppointmentInfoQo;
import com.xcy.goatmilk.wrapper.Page;

/**
 * @author xcy
 * @Desc
 * @date 2020/6/18 12:01
 * @Version v1.0
 */
public interface AppointmentInfoService {
    /**
     * 预约信息列表查询
     * @param qo 查询参数
     * @return 查询结果
     */
    Page list(AppointmentInfoQo qo);


    /**
     * 预约信息详情查询
     * @param id 付汇记录id
     * @return 预约信息详情
     */
    AppointmentInfoDto get(Integer id);


    /**
     * 新增预约信息
     * @param appointmentInfo
     */
    void add(AppointmentInfo appointmentInfo);

    /**
     * 作废一条预约信息
     * @param id
     */
    void deleteOneById(Integer id);

    /**
     * 修改预约信息
     * @param appointmentInfo
     */
    void updateById(AppointmentInfo appointmentInfo);
}
