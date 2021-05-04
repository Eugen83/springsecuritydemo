package com.eugenn.springsecuritydemo.model;

import lombok.Data;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Data
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "email")
    private String email;
    @Column(name= "first_name")
    private String first_name;
    @Column(name= "last_name")
    private String last_name;
    @Column(name= "password")
    private String password;

    @Column(name= "role")
    @Enumerated(value = EnumType.STRING)
    private Role role;
    @Column(name= "status")
    @Enumerated(value = EnumType.STRING)
    private Status status;
}
