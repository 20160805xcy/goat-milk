package com.xcy.goatmilk.mapper;

import com.xcy.goatmilk.pojo.AppointmentInfo;
import com.xcy.goatmilk.pojo.dto.AppointmentInfoDto;
import com.xcy.goatmilk.pojo.qo.AppointmentInfoQo;
import com.xcy.goatmilk.table.AppointmentInfoTableData;
import com.xcy.goatmilk.util.MyMapper;

import java.util.List;

public interface AppointmentInfoMapper extends MyMapper<AppointmentInfo> {

    List<AppointmentInfoTableData> list(AppointmentInfoQo qo);

    AppointmentInfoDto get(Integer id);

    void deleteOneById(Integer id);

    void updateById(AppointmentInfo appointmentInfo);
}