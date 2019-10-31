package org.yun.vo;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserVO {

    private String id;
    private String name;
    private Integer age;

}