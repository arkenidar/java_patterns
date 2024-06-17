
package com.arkenidar;

public class SingletonSettableBean {

    private static SingletonSettableBean singleton = null;
    private static Bean instance = null;

    private SingletonSettableBean() {
    }

    public static SingletonSettableBean getSingletonInstance() {
        if (singleton == null)
            singleton = new SingletonSettableBean();
        return singleton;
    }

    public void setBeanInstance(Bean newInstance) {
        if (instance == null)
            instance = newInstance;
    }

    public Bean getBeanInstance() {
        return instance;
    }
}
