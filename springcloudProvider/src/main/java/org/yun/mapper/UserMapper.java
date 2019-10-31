package org.yun.mapper;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.yun.dto.UserDTO;
import org.yun.mapper.provider.UserProvider;
import org.yun.vo.UserVO;

import java.util.List;

@Repository
public interface UserMapper {

    @Select("SELECT * FROM user WHERE id=#{id}")
    UserVO selectById(@Param("id") String id);

    @InsertProvider(method = "addUser" , type = UserProvider.class)
    void addUser(@Param("userDTO") UserDTO userDTO);

    @Select("SELECT * FROM user")
    List<UserVO> selectAll();
}
