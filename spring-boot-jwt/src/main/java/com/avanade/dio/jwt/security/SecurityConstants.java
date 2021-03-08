package com.avanade.dio.jwt.security;

public class SecurityConstants {

    // SECRET = utilizado junto com a geração do token, para quer a aplicação posso interpretá-lo (decriptar e encriptar)
    public static final String SECRET = "SecretKeyToGenJWTs";
    public static final long EXPIRATION_TIME = 864_000_000; // Milissegundos = 10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/login";
    public static final String STATUS_URL = "/status";
}