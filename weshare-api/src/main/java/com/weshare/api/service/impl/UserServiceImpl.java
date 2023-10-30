package com.weshare.mbg.service.impl;

import com.weshare.mbg.entity.User;
import com.weshare.mbg.mapper.UserMapper;
import com.weshare.mbg.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Moncoder
 * @since 2023-10-30 18:56:23
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
