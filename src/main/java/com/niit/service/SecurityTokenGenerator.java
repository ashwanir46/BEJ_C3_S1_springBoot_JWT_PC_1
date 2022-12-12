package com.niit.service;

import com.niit.domain.User;

import java.util.Map;

public interface SecurityTokenGenerator {

    Map<String, String> generateToken(User user);
}
