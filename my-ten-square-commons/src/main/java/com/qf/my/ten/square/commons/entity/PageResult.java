package com.qf.my.ten.square.commons.entity;

import lombok.Data;

import java.util.List;

/**
 * 这是返回分页数据
 * @param <T>   分页对象
 */

@Data
public class PageResult<T>  {
    /**
     * 总条数
     */
    private Long total;

    /**
     * 分页数据
     */

    private List<T> row;

}
