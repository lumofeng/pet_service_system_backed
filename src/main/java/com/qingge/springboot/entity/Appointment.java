package com.qingge.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 
 * </p>
 *
 * @author 墨枫
 * @since 2022-03-06
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
  @ApiModel(value = "Appointment对象", description = "")
public class Appointment implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("主键")
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("宠物ID")
      private Integer petId;

      @ApiModelProperty("用户ID")
      private Integer userId;

      @ApiModelProperty("医生ID")
      private Long doctorId;

      @ApiModelProperty("任命时间")
      private LocalDateTime applTime;

      @ApiModelProperty("信息")
      private String applInfo;

      @ApiModelProperty("创建时间")
      private LocalDateTime createTime;

      @ApiModelProperty("状态")
      private String status;

      @ApiModelProperty("电话")
      private String phone;

      @ApiModelProperty("地址")
      private String address;


}
