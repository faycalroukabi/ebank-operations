package com.glwa.userservice.dto;

import com.glwa.userservice.enums.Role;
import lombok.Data;

@Data
public class AuthUserDto{
    private String id;
    private String username;
    private String password;
    private Role role;
    }