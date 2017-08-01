package com.ssm.system.security.service;

import com.ssm.Users;
import com.ssm.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by chaoqunshe on 7/27/17.
 */
@Service
@Transactional(readOnly = true)
public class UserService {

    @Autowired
    private UsersMapper userMapper;

    @Transactional(readOnly = true)
    public Users getUserById(int userId) {
        return this.userMapper.selectByPrimaryKey(userId);
    }

}
