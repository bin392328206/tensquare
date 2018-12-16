package com.qf.my.ten.square.domain.entity;


import lombok.Data;

import java.util.Date;

@Data
public class TbProblem {

  private String id;
  private String title;
  private String content;
  private Date createtime;
  private Date updatetime;
  private String userid;
  private String nickname;
  private long visits;
  private long thumbup;
  private long reply;
  private String solve;
  private String replyname;
  private Date replytime;



}
