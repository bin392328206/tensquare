package com.qf.my.ten.square.commons.persistence.Impl;

import com.qf.my.ten.square.commons.persistence.BaseDao;
import com.qf.my.ten.square.commons.persistence.BaseService;
import com.qf.my.ten.square.commons.utils.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author xiaowang
 * @date 2018/12/17 17:57
 */
public abstract class BaseServiceImpl<T extends Object,D extends BaseDao<T>>  implements BaseService<T> {
    @Autowired
    protected D baseDao;


    @Autowired
    private IdWorker idWorker;


    /**
     * 查询全部标签
     * @return
     */
    @Override
    public List<T> findAll(){
        return baseDao.findAll();
    }


    /**
     * 根据id查询标签
     *
     */
    @Override
    public T findById(String id){
        return baseDao.findById(id).get();
    }


    /**
     * 增加标签
     */
    @Override
    public void add(T t){
        baseDao.save(t);
    }


    /**
     * 修改标签
     */
    @Override
    public void update(T t){
        baseDao.save(t);
    }


    /**
     * 删除标签
     */
    @Override
    public void deleteById(String id){
        baseDao.deleteById(id);
    }
}
