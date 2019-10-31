package org.yun.service;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.yun.dto.UserDTO;
import org.yun.vo.UserVO;

import java.util.List;

public interface UserService {

    @RequestMapping("/user/selectById/{id}")
    UserVO selectById(@RequestParam("id") String id);

    @RequestMapping
    void addUser(@RequestBody UserDTO userDTO);

    @RequestMapping
    List<UserVO> selectAll();

}
