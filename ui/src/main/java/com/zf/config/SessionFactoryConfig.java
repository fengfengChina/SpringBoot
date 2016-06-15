package com.zf.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.thymeleaf.expression.Lists;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

/**
 * SessionFactory
 *
 * @author zf
 * @date 16/6/14
 */
@Configuration
public class SessionFactoryConfig {

    /**
     * mybatis 配置路径
     */
    private static String MYBATIS_CONFIG = "mybatis-config.xml";

    /**
     * mybatis mapper resource 路径
     */
    private static String MAPPER_PATH = "classpath*:mapper/*.xml";

    @Autowired
    private DataSource dataSource;


    /**
     * 创建sqlSessionFactoryBean 实例
     * 并且设置configtion 如驼峰命名.等等
     * 设置mapper 映射路径
     * 设置datasource数据源
     * @return
     */
    @Bean
    public SqlSessionFactoryBean createSqlSessionFactoryBean() {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource(MYBATIS_CONFIG));
        createResourceArray();
        sqlSessionFactoryBean.setMapperLocations(createResourceArray());
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

    /**
     * 创建mapper资源路径
     * @return
     */
    private Resource[] createResourceArray() {
        List<Resource> resources = new ArrayList<>();
        resources.add(new ClassPathXmlApplicationContext(MAPPER_PATH));
        return resources.toArray(new Resource[1]);
    }
}
