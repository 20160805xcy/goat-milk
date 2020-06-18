package com.xcy.goatmilk.pojo.qo;

import com.xcy.goatmilk.base.PageQo;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * @author xcy
 * @Desc
 * @date 2020/6/18 11:42
 * @Version v1.0
 */
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class AppointmentInfoQo extends PageQo<AppointmentInfoQo> {
    private static final long serialVersionUID = -8511788205073129624L;

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

}
