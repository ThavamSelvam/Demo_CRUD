package com.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user_details")
@NoArgsConstructor
@Setter
@Getter
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

    private String userName;
    private String mobileNumber;
    private String email;
    private String password;
    private String role;
    private String name;


}
