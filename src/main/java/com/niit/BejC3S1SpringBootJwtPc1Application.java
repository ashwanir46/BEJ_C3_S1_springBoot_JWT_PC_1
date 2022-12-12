package com.niit;

import com.niit.filter.JwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BejC3S1SpringBootJwtPc1Application {

    public static void main(String[] args) {

        SpringApplication.run(BejC3S1SpringBootJwtPc1Application.class, args);
    }

    @Bean
    public FilterRegistrationBean jwtFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new JwtFilter());
        filterRegistrationBean.addUrlPatterns("/api/v1/*");
        return filterRegistrationBean;

    }
}
