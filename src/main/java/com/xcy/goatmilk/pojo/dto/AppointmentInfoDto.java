package com.xcy.goatmilk.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author xcy
 * @Desc
 * @date 2020/6/18 12:35
 * @Version v1.0
 */
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class AppointmentInfoDto{
    private static final long serialVersionUID = -7167878326150412253L;

    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value = "用户id")
    private Integer userId;

    @ApiModelProperty(value = "用户名称")
    private String userName;

    @ApiModelProperty(value = "手机号")
    private String mobileNumber;

    @ApiModelProperty(value = "预约开始时间")
    private String effectiveForm;

    @ApiModelProperty(value = "预约结束时间")
    private String effectiveTo;

    @ApiModelProperty(value = "详细地址")
    private String address;

    @ApiModelProperty(value = "是否作废")
    private Integer voided;

    @ApiModelProperty(value = "创建日期")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

}
