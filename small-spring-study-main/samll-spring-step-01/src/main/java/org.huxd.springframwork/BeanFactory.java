package org.huxd.springframwork;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: small-spring-study-main
 * @ClassName BeanFactory
 * @description: 代表Bean对象的工厂，可以存放Bean定义到Map中以及获取
 * @author: huxd
 * @create: 2021-08-12 22:49
 * @Version 1.0
 **/
public class BeanFactory {

    private Map<String,BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name,BeanDefinition beanDefinition){
        beanDefinitionMap.put(name,beanDefinition);
    }

}