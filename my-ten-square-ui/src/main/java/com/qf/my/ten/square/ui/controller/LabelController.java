package com.qf.my.ten.square.ui.controller;

/**
 * @author xiaowang
 * @date 2018/12/16 15:03
 */

import com.qf.my.ten.square.commons.entity.Result;
import com.qf.my.ten.square.commons.entity.StatusCode;
import com.qf.my.ten.square.domain.entity.TbLabel;
import com.qf.my.ten.square.ui.service.Impl.LabelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 标签控制
 */
@Controller
@RequestMapping(value = "label")
public class LabelController  {

    @Autowired
    private LabelServiceImpl labelService;

    /**
     * 查询全部列表
     *
     */

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Result findAll(){
        List<TbLabel> list= labelService.findAll();

        return new Result(true, StatusCode.Ok,"查询全部成功",list);
    }


    /**
     * 根据id查询标签
     *
     */

    @RequestMapping(value ="/get/id")
    @ResponseBody
    public Result findById( String id){
        TbLabel tbLabel = labelService.findById(id);
        return new Result(true, StatusCode.Ok,"查询成功",tbLabel);
    }


    /**
     * 增加标签
     *
     */

    @RequestMapping(value = "add",method = RequestMethod.POST)
    @ResponseBody
    public Result add(TbLabel tbLabel){
        labelService.add(tbLabel);
        return new Result(true, StatusCode.Ok,"新增成功");

    }

    /**
     * 修改标签
     * @param tbLabel
     * @return
     */
    @RequestMapping(value="update" ,method = RequestMethod.POST)
    public Result update(TbLabel tbLabel){
        labelService.update(tbLabel);
        return new Result(true, StatusCode.Ok,"修改成功");
    }


    /**
     * 删除标签
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    @ResponseBody
    public Result deleteById(String id){
        labelService.deleteById(id);
        return new Result(true, StatusCode.Ok,"删除成功");
    }




}
