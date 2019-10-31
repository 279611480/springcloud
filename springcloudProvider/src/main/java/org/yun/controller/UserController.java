package org.yun.controller;


import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yun.dto.UserDTO;
import org.yun.service.UserService;
import org.yun.vo.UserVO;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {

//    String uuid = UUID.randomUUID().toString().replace("-", "");

    @Autowired
    UserService userService;

    @RequestMapping("/selectById/{id}")
    public UserVO selectById(@PathVariable String id) {
        if (StringUtils.isNotEmpty(id)) {
            UserVO uservo = userService.selectById(id);
            return uservo;
        }
        return null;
    }

    @RequestMapping("/addOrEditUser")
//    public void addOrEditUser(@RequestBody UserDTO userDTO){}
    public void addUser(){
        try {
            UserDTO userDTO = new UserDTO().builder().id(UUID.randomUUID().toString().replace("-", "")).name("芸").age(18).build();
            userService.addUser(userDTO);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //http://localhost:8002/user/selectAll
    @RequestMapping("/selectAll")
    public List<UserVO> selectAll(){
        try {
            return userService.selectAll();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


}
