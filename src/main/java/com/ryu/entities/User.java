package com.ryu.entities;

import lombok.*;

/**
 * user entity
 *
 * @author Ghost
 * @create 2018-10-16 17:41
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private Integer id;
    private String username;
    private String sex;
    private String password;
    private String email;
}
