package com.niit.service;


import com.niit.domain.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class JwtSecurityTokenGeneratorImpl implements SecurityTokenGenerator {


    @Override
    public Map<String, String> generateToken(User user) {

        String jwtToken = null;

        jwtToken = Jwts.builder() //jwt builder instance
                .setSubject(user.getUsername()) //set subject as a user firstname
                .setIssuedAt(new Date())  //it will give us to current date
                .signWith(SignatureAlgorithm.HS256, "secretkey") //algo and security key value
                .compact();

        Map<String, String> map = new HashMap<>();
        map.put("token", jwtToken);
        map.put("message", "User Successfully logged in");
        return map;
    }
}

