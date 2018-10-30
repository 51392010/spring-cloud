package com.xin.jump.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity(name = "USER")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(length = 64, name = "ID")
    private Long id;

    @Column(length = 64, name = "USERNAME")
    private String username;

    @Column(length = 64, name = "NAME")
    private String name;

    @Column(length = 64, name = "AGE")
    private Integer age;

    @Column(length = 64, name = "BALANCE")
    private BigDecimal balance;
}
