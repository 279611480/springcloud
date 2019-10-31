package org.yun.mapper.provider;

import org.yun.dto.UserDTO;

import java.util.Map;

public class UserProvider {

    public String addUser(Map<String,Object> params){
        UserDTO dto = (UserDTO) params.get("userDTO");
        StringBuffer sql =
                new StringBuffer( "INSERT INTO user VALUES(' " + dto.getId() + " ' ,' " +dto.getName() + " '," + dto.getAge() + ")");
        return sql.toString();
    }
}
