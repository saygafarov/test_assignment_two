package com.example.task.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.hibernate.PropertyValueException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
    }

    //@Bean
//    public DataSource dataSource() {
//        ComboPooledDataSource dataSource = new ComboPooledDataSource();
//        try {
//            dataSource.setDriverClass("org.postgresql.Driver");
//            dataSource.setJdbcUrl("jdbc:postgresql://localhost:5432/testdb");
//            dataSource.setUser("postgres");
//            dataSource.setPassword("Welcome04$");
//        } catch ( PropertyVetoException e) {
//            e.printStackTrace();
//        }
//        return dataSource;
//    }
}
