package com.binghuazheng.mvc.init.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * TODO
 * 亦可以 @EnableWebMvc
 * 然后实现WebMvcConfigurer接口
 *
 *
 *
 * @ClassName AppConfig
 * @Description TODO
 * @Author Administrator
 * @Date 2020/9/27 23:48
 * @Version 1.0
 */
@ComponentScan(value = "com.binghuazheng", includeFilters = {
        @Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
}, useDefaultFilters = false)
@EnableWebMvc
public class AppConfig {


}
