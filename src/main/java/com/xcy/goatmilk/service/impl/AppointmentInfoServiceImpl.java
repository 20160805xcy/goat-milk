package com.xcy.goatmilk.service.impl;

import com.github.pagehelper.PageInfo;
import com.xcy.goatmilk.base.BaseService;
import com.xcy.goatmilk.mapper.AppointmentInfoMapper;
import com.xcy.goatmilk.pojo.AppointmentInfo;
import com.xcy.goatmilk.pojo.dto.AppointmentInfoDto;
import com.xcy.goatmilk.pojo.qo.AppointmentInfoQo;
import com.xcy.goatmilk.service.AppointmentInfoService;
import com.xcy.goatmilk.table.AppointmentInfoTableData;
import com.xcy.goatmilk.wrapper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xcy
 * @Desc
 * @date 2020/6/18 12:02
 * @Version v1.0
 */
@Service
public class AppointmentInfoServiceImpl extends BaseService implements AppointmentInfoService {

    @Autowired
    private AppointmentInfoMapper appointmentInfoMapper;


    @Override
    public Page list(AppointmentInfoQo qo) {
        super.startPage(qo);
        List<AppointmentInfoTableData> pageList = appointmentInfoMapper.list(qo);

        PageInfo<AppointmentInfoTableData> pageInfo = new PageInfo<>(pageList);
        return super.wrap(pageInfo);
    }

    @Override
    public AppointmentInfoDto get(Integer id) {
        AppointmentInfoDto appointmentInfoDto = appointmentInfoMapper.get(id);

        return appointmentInfoDto;
    }

    @Override
    public void add(AppointmentInfo appointmentInfo) {
        appointmentInfoMapper.insert(appointmentInfo);
    }

    @Override
    public void deleteOneById(Integer id) {
        appointmentInfoMapper.deleteOneById(id);
    }

    @Override
    public void updateById(AppointmentInfo appointmentInfo) {
        appointmentInfoMapper.updateById(appointmentInfo);
    }
}
