package com.zf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * SwaggerConfig2
 *
 * @author zf
 * @date 16/6/16
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig2 {
//    /**
//     * SpringBoot默认已经将classpath:/META-INF/resources/和classpath:/META-INF/resources/webjars/映射
//     * 所以该方法不需要重写，如果在SpringMVC中，可能需要重写定义（我没有尝试）
//     * 重写该方法需要 extends WebMvcConfigurerAdapter
//     *
//     */
////    @Override
////    public void addResourceHandlers(ResourceHandlerRegistry registry) {
////        registry.addResourceHandler("swagger-ui.html")
////                .addResourceLocations("classpath:/META-INF/resources/");
////
////        registry.addResourceHandler("/webjars/**")
////                .addResourceLocations("classpath:/META-INF/resources/webjars/");
////    }
//
//    /**
//     * 可以定义多个组，比如本类中定义把test和demo区分开了
//     * （访问页面就可以看到效果了）
//     *
//     */
//    @Bean
//    public Docket testApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("test")
//                .genericModelSubstitutes(DeferredResult.class)
////                .genericModelSubstitutes(ResponseEntity.class)
//                .useDefaultResponseMessages(false)
//                .forCodeGeneration(true)
//                .pathMapping("/")// base，最终调用接口后会和paths拼接在一起
//                .select()
//                .paths(or(regex("/api/.*")))//过滤的接口
//                .build()
//                .apiInfo(testApiInfo());
//    }
//
//    @Bean
//    public Docket demoApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("demo")
//                .genericModelSubstitutes(DeferredResult.class)
////              .genericModelSubstitutes(ResponseEntity.class)
//                .useDefaultResponseMessages(false)
//                .forCodeGeneration(false)
//                .pathMapping("/")
//                .select()
//                .paths(or(regex("/demo/.*")))//过滤的接口
//                .build()
//                .apiInfo(demoApiInfo());
//    }

//    private ApiInfo testApiInfo() {
//        ApiInfo apiInfo = new ApiInfo("Electronic Health Record(EHR) Platform API",//大标题
//                "EHR Platform's REST API, all the applications could access the Object model data via JSON.",//小标题
//                "0.1",//版本
//                "NO terms of service",
//                "365384722@qq.com",//作者
//                "The Apache License, Version 2.0",//链接显示文字
//                "http://www.apache.org/licenses/LICENSE-2.0.html"//网站链接
//        );
//
//        return apiInfo;
//    }
//
//    private ApiInfo demoApiInfo() {
//        ApiInfo apiInfo = new ApiInfo("Electronic Health Record(EHR) Platform API",//大标题
//                "EHR Platform's REST API, for system administrator",//小标题
//                "1.0",//版本
//                "NO terms of service",
//                "365384722@qq.com",//作者
//                "The Apache License, Version 2.0",//链接显示文字
//                "http://www.apache.org/licenses/LICENSE-2.0.html"//网站链接
//        );
//
//        return apiInfo;
//    }
}
