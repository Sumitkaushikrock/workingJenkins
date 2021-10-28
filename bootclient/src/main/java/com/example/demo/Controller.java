package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

@RestController
public class Controller {
    @GetMapping("/hello")
    public String get() {
        return "byessx";
    }

    @GetMapping("/visits")
    public String visits() {
        Jedis jedis = new Jedis("redis-server");
        String visits = jedis.get("visits");
        if (visits != null) {
            Integer i = Integer.valueOf(visits);
            jedis.set("visits", String.valueOf(i + 1));
        } else {
            jedis.set("visits", "0");
        }

        return jedis.get("visits");
    }
}
