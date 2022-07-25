package com.abhishekraj1130.springbootblogrestapi;

import lombok.Data;

@Data
public class LoginDto {
    private String usernameOrEmail;
    private String password;
}
