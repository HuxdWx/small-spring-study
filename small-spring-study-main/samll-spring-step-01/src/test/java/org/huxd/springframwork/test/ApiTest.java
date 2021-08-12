package org.huxd.springframwork.test;

import org.huxd.springframwork.BeanDefinition;
import org.huxd.springframwork.BeanFactory;
import org.huxd.springframwork.UserService;
import org.junit.jupiter.api.Test;

/**
 * @program: small-spring-study-main
 * @ClassName ApiTest
 * @description:
 * @author: huxd
 * @create: 2021-08-12 22:57
 * @Version 1.0
 **/
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        // 初始化BeanFactory
        BeanFactory beanFactory = new BeanFactory();
        // 注册Bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService",beanDefinition);
        // 获取Bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

    }
}