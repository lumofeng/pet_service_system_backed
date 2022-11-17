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
 * @since 2022-03-03
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
  @ApiModel(value = "Pet对象", description = "")
public class Pet implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

    private Integer userId;

    private String name;

    private Double weight;

    private Double height;

    private String type;

    private LocalDateTime createTime;


}
