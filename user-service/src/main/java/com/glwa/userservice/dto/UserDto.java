package com.glwa.userservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.glwa.userservice.model.UserDetails;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto {
    private String id;
    private String username;
    private String email;
    private UserDetails userDetails;
}
