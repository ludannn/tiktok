package com.tiktok.service;

import com.tiktok.bean.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tiktok.bean.dto.UserIdAndTokenDto;

/**
 * @Description: user
 * @Author: jeecg-boot
 * @Date:   2023-08-03
 * @Version: V1.0
 */
public interface IUserService extends IService<User> {

    User queryById(UserIdAndTokenDto userIdAndTokenDto);
}
