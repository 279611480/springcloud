package org.yun.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.yun.dto.UserDTO;
import org.yun.mapper.UserMapper;
import org.yun.service.UserService;
import org.yun.vo.UserVO;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public UserVO selectById(String id) {
        return userMapper.selectById(id);
    }

    @Override
    @Transactional
    public void addUser(@RequestBody UserDTO userDTO) {
        userMapper.addUser(userDTO);
    }

    //http://localhost:8002/user/selectAll
    @Override
    public List<UserVO> selectAll() {
        return userMapper.selectAll();
    }
}
