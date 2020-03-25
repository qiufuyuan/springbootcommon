package com.wanbaolot.terminal.service.devices.impl;

import com.wanbaolot.terminal.entity.devices.Devices;
import com.wanbaolot.terminal.dao.devices.DevicesMapper;
import com.wanbaolot.terminal.service.devices.IDevicesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wanbao
 * @since 2020-03-25
 */
@Service
public class DevicesServiceImpl extends ServiceImpl<DevicesMapper, Devices> implements IDevicesService {

}
