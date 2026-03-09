package cn.duck.springbootusermanagement.utils;

import io.jsonwebtoken.*;

import java.util.Date;

public class JwtUtil {

    private static final String SECRET = "upwork-secret";

    public static String generateToken(String username) {

        return Jwts.builder()
                .setSubject(username)
                .setExpiration(new Date(System.currentTimeMillis() + 86400000))
                .signWith(SignatureAlgorithm.HS512, SECRET)
                .compact();
    }

    public static String parseToken(String token) {

        Claims claims = Jwts.parser()
                .setSigningKey(SECRET)
                .parseClaimsJws(token)
                .getBody();

        return claims.getSubject();
    }

}