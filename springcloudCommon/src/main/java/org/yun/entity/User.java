package org.yun.entity;

import lombok.*;
import javax.persistence.Table;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {

    private String id;
    private String name;
    private Integer age;



}
