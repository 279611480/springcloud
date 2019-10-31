package org.yun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.yun.entity.User;
import org.yun.vo.UserVO;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/consumer")
public class UserConsumerController {

    private static String REST_URL_PREFIX = "http://localhost:8002";

    @Autowired
    RestTemplate restTemplate;
    //http://localhost:8003/consumer/add
    @RequestMapping("/add")
    public void addUser(){
        //get请求
        restTemplate.getForEntity(REST_URL_PREFIX + "/user" + "/addOrEditUser",void.class);
    }
    //http://localhost:8003/consumer/selectById/1
    @RequestMapping(value="/selectById/{id}")
    public UserVO get(@PathVariable("id") String id){
        //查看拼URL  拼成什么样了
//        String url = REST_URL_PREFIX + "/user" + "/selectById" + "/" + id ;
        UserVO userVO = restTemplate.getForObject(REST_URL_PREFIX + "/user" + "/selectById" + "/" + id, UserVO.class);
        return userVO;
    }
    //http://localhost:8003/consumer/selectAll
    @RequestMapping(value="/selectAll")
    public List<UserVO> selectAll(){
        List list = restTemplate.getForObject(REST_URL_PREFIX + "/user/selectAll", List.class);
        return list;
    }
}
