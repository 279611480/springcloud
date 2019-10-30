package org.yun.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//包含了  @Getter  @Setter  @ToString 以及equalAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String id;
    private String name;
    private Integer age;


}
