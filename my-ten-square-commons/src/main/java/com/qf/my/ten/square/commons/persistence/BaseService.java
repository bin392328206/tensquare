package com.qf.my.ten.square.commons.persistence;

import java.util.List;

/**
 * @author xiaowang
 * @date 2018/12/17 17:55
 */
public interface BaseService<T extends Object> {

    List<T> findAll();

    T findById(String id);

    public void add(T tbLabel);


    void update(T tbLabel);

    void deleteById(String id);
}
