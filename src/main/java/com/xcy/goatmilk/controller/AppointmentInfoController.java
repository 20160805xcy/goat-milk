package com.xcy.goatmilk.controller;

import com.xcy.goatmilk.config.aop.WebLog;
import com.xcy.goatmilk.pojo.AppointmentInfo;
import com.xcy.goatmilk.pojo.dto.AppointmentInfoDto;
import com.xcy.goatmilk.pojo.qo.AppointmentInfoQo;
import com.xcy.goatmilk.service.AppointmentInfoService;
import com.xcy.goatmilk.wrapper.BackResult;
import com.xcy.goatmilk.wrapper.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author xcy
 * @Desc
 * @date 2020/6/17 19:40
 * @Version v1.0
 */
@Api(description = "预约信息")
@RestController
@RequestMapping("appointmentInfo")
public class AppointmentInfoController {

    @Autowired
    private AppointmentInfoService appointmentInfoService;

    @ApiOperation("预约信息查询")
    @GetMapping("list")
    @WebLog(description = "预约信息查询")
    public BackResult list(@ModelAttribute AppointmentInfoQo qo) {
        return BackResult.successBack(appointmentInfoService.list(qo));
    }


    @ApiOperation(value = "预约信息详情查询")
    @GetMapping("{id}")
    @WebLog(description = "预约信息查询")
    public Result<AppointmentInfoDto> get(@PathVariable(name = "id") Integer id) {
        return new Result<>(appointmentInfoService.get(id));
    }


    @ApiOperation("新增预约信息")
    @PostMapping("insert")
    @WebLog(description = "新增预约信息")
    public BackResult insetOne(@ModelAttribute AppointmentInfo appointmentInfo) {
        appointmentInfoService.add(appointmentInfo);
        return BackResult.successBack();
    }

    @ApiOperation("删除新增预约信息")
    @DeleteMapping("deleteOneById/{id}")
    @WebLog(description = "删除新增预约信息")
    public BackResult deleteOneById(@PathVariable Integer id) {
        appointmentInfoService.deleteOneById(id);
        return BackResult.successBack();
    }

    @ApiOperation("修改预约信息")
    @PutMapping("updateById/{id}")
    @WebLog(description = "修改预约信息")
    public BackResult updateById(@ModelAttribute AppointmentInfo appointmentInfo) {
        appointmentInfoService.updateById(appointmentInfo);
        return BackResult.successBack();
    }

}
