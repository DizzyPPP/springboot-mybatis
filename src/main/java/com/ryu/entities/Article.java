package com.ryu.entities;

import lombok.*;
import org.springframework.context.annotation.Bean;

import java.util.Date;

/**
 * entities
 *
 * @author Administrator
 * @create 2018-06-29 15:32
 */


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Article {
    private Integer id;
    private String title;
    private String content;
    private Date createTime;
    private Date editTime;


}
