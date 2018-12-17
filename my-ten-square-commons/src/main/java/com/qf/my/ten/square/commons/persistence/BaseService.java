package com.qf.my.ten.square.commons.persistence;

import java.util.List;

/**
 * @author xiaowang
 * @date 2018/12/17 17:55
 */
public interface BaseService<T extends Object> {
    /**
     * 查询全部
     * @return
     */
    List<T> findAll();

    /**
     * 通过id查询
     * @param id
     * @return
     */
    T findById(String id);

    /**
     * 添加对象
     * @param tbLabel
     */
    public void add(T tbLabel);

    /**
     * 更新对象
     * @param tbLabel
     */
    void update(T tbLabel);

    /**
     * 删除对象
     * @param id
     */
    void deleteById(String id);
}
