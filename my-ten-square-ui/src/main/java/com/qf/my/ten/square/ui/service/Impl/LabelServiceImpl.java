package com.qf.my.ten.square.ui.service.Impl;

import com.qf.my.ten.square.commons.utils.IdWorker;
import com.qf.my.ten.square.domain.entity.TbLabel;
import com.qf.my.ten.square.ui.dao.LabelDao;
import com.qf.my.ten.square.ui.service.LableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

/**
 * @author xiaowang
 * @date 2018/12/16 14:51
 * 标签业务逻辑层
 */

@Service
public class LabelServiceImpl implements LableService {

    @Autowired
    private LabelDao labelDao;


    @Autowired
    private IdWorker idWorker;


    /**
     * 查询全部标签
     * @return
     */
    @Override
    public List<TbLabel> findAll(){
        return labelDao.findAll();
    }


    /**
     * 根据id查询标签
     *
     */
    @Override
    public TbLabel findById(String id){
        return labelDao.findById(id).get();
    }


    /**
     * 增加标签
     */
    @Override
    public void add(TbLabel tbLabel){
        tbLabel.setId(idWorker.nextId()+"");
        labelDao.save(tbLabel);
    }


    /**
     * 修改标签
     */
    @Override
    public void update(TbLabel tbLabel){
        labelDao.save(tbLabel);
    }


    /**
     * 删除标签
     */
    @Override
    public void deleteById(String id){
        labelDao.deleteById(id);
    }
}
