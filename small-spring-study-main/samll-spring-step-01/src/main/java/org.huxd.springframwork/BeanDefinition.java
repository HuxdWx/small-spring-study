package org.huxd.springframwork;

/**
 * @program: small-spring-study-main
 * @ClassName BeanDefinition
 * @description: 定义Bean实例化信息，现在的实现是以一个Object存放对象
 * @author: huxd
 * @create: 2021-08-12 22:47
 * @Version 1.0
 **/
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean){
        this.bean = bean;
    }

    public Object getBean(){
        return bean;
    }
}