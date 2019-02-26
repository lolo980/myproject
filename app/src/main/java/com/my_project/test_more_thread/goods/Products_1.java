package com.my_project.test_more_thread.goods;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Administrator on 2019\2\25 0025.
 * 生产者和消费者先后处理的product资源是同一个，要确保这一点，
 * 可以按单例模式来设计product类，也可以将同一个product对象通过构造方法传递给生产者和消费者，
 */

public class Products_1 {
    private String name;
    private int count = 1;
    private boolean flag = false;//为wait和notify提供判断标记
    //为生产者和消费者提供同一个锁对象和同一个condition
    public  Lock lock = new ReentrantLock();
    public  Condition pro_con = lock.newCondition();
    public  Condition con_con = lock.newCondition();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
