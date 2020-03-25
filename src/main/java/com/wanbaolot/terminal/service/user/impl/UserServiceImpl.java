package com.wanbaolot.terminal.service.user.impl;

import com.wanbaolot.terminal.entity.user.User;
import com.wanbaolot.terminal.dao.user.UserMapper;
import com.wanbaolot.terminal.service.user.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
