package com.qf.my.ten.square.commons.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author xiaowang
 * @date 2018/12/17 17:27
 */
public interface BaseDao<T extends Object> extends JpaRepository<T,Object>, JpaSpecificationExecutor<T>{
}
