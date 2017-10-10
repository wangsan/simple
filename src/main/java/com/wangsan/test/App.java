package com.wangsan.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.wangsan.test.configuration.ApplicationConfig;
import com.wangsan.test.service.Image;
import com.wangsan.test.service.SimpleService;

/**
 * do it
 *
 * @author wangsan
 * @date 2017/10/10
 */
public class App {

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        SimpleService simpleService = (SimpleService) context.getBean("simpleService");

        List<Image> all = simpleService.findAll();

        Image entity = new Image();
        entity.setId((long) all.size() + 1);
        entity.setImageBase64("test image");
        simpleService.add(entity);

        all = simpleService.findAll();
        all.stream().forEach(System.out::println);
    }
}
