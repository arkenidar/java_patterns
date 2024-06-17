package com.arkenidar;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello 'design patterns' of any kind!");

        // SingletonSettableBean
        System.out.println("=== SingletonSettableBean ===");
        SingletonSettableBean instance = SingletonSettableBean.getSingletonInstance();
        instance.setBeanInstance(new Bean("bean1", "value1"));
        instance.setBeanInstance(new Bean("bean2", "value2"));
        System.out.printf("Bean.getName(): %s%n", instance.getBeanInstance().getName());
    }
}