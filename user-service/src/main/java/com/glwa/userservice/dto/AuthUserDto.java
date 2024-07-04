package com.glwa.userservice.dto;

import com.glwa.userservice.enums.Role;
import lombok.Data;

@Data
public record AuthUserDto(
    String id,
    String username,
    String password,
    Role role
    ){}