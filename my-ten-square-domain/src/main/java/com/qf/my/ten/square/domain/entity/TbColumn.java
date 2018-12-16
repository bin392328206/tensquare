package com.qf.my.ten.square.domain.entity;


import lombok.Data;

import java.util.Date;

@Data
public class TbColumn {

  private String id;
  private String name;
  private String summary;
  private String userid;
  private Date createtime;
  private Date checktime;
  private String state;


 
}
