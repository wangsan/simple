package com.wangsan.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @author wangsan
 * @date 2017/10/10
 */
@Service
public class SimpleService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void add(Image entity) {
        jdbcTemplate.update("INSERT INTO image (id, imageBase64) VALUES (?, ?)",
                entity.getId(), entity.getImageBase64());
        System.out.println("image Added!!");
    }

    public List<Image> findAll() {
        List<Image> persons = jdbcTemplate.query("SELECT * FROM image", new BeanPropertyRowMapper(Image.class));
        return persons;
    }
}
