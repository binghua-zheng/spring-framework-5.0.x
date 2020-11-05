package com.binghuazheng.mvc.init.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @ClassName RootConfig
 * @Description TODO
 * @Author Administrator
 * @Date 2020/9/27 23:49
 * @Version 1.0
 */
@ComponentScan(value="com.binghuazheng", excludeFilters = {
        @Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
})
public class RootConfig {
}
