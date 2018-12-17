package com.qf.my.ten.square.ui.service.Impl;

import com.qf.my.ten.square.commons.persistence.Impl.BaseServiceImpl;
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
public class LabelServiceImpl extends BaseServiceImpl<TbLabel,LabelDao> implements LableService {


    @Autowired
    private IdWorker idWorker;

    /**
     * 增加标签
     */
    @Override
    public void add(TbLabel tbLabel){
        tbLabel.setId(idWorker.nextId()+"");
        baseDao.save(tbLabel);
    }




}
