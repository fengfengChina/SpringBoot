package com.zf.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;


import org.apache.ibatis.datasource.DataSourceFactory;
import org.apache.ibatis.datasource.jndi.JndiDataSourceFactory;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


/**
 * MyBatisConfig
 *
 * @author zf
 * @date 16/6/12
 */
@Configuration
@MapperScan("com.zf.dao")
public class MyBatisConfig {
    private static final Logger logger = LoggerFactory.getLogger(MyBatisConfig.class);
    @Bean
    public DataSource createDataSource() throws SQLException {
        return DataSourceBuilder.create(Thread.currentThread().getContextClassLoader())
                .driverClassName("com.mysql.jdbc.Driver")
                .url("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&connectTimeout=60000&socketTimeout=60000&autoReconnect=true&autoReconnectForPools=true&failOverReadOnly=false&useSSL=false")
                .username("root")
                .password("root").build();
    }
}
