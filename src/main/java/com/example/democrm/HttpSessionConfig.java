package com.example.democrm;

import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * To keep sessions in in-memory Redis instance
 * @author Paul
 */
@EnableRedisHttpSession 
public class HttpSessionConfig {
}