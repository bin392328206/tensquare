package com.qf.my.ten.square.domain.entity;

import lombok.Data;

import java.util.Date;

@Data
public class TbReply {

  private String id;
  private String problemid;
  private String content;
  private Date createtime;
  private Date updatetime;
  private String userid;
  private String nickname;


 
}
