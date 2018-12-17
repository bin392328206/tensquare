package com.qf.my.ten.square.commons.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.lang.reflect.ParameterizedType;

/**
 * @author xiaowang
 * @date 2018/12/17 20:06
 */
public abstract class BaseController<T extends Object,S extends BaseService<T>> {

    @Autowired
    protected S service;



    /**
     * 每次进入的查询id
     * @param id
     * @return
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    @ModelAttribute
    public T getById(String id) throws IllegalAccessException, InstantiationException {
        if (id == null) {
            ParameterizedType ptype = (ParameterizedType) this.getClass().getGenericSuperclass();
            Class clazz = (Class<T>) ptype.getActualTypeArguments()[0];
            T o = (T) clazz.newInstance();
            return o;
        } else {
            return service.findById(id);
        }
    }
}
