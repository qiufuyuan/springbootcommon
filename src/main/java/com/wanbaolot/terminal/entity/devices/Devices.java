package com.wanbaolot.terminal.entity.devices;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author wanbao
 * @since 2020-03-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("wb_devices")
public class Devices implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer serialNo;


}
