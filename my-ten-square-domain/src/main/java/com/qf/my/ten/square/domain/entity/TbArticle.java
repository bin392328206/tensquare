package com.qf.my.ten.square.domain.entity;


import lombok.Data;

import java.util.Date;

@Data
public class TbArticle {

  private String id;
  private String columnid;
  private String userid;
  private String title;
  private String content;
  private String image;
  private Date createtime;
  private Date updatetime;
  private String ispublic;
  private String istop;
  private long visits;
  private long thumbup;
  private long comment;
  private String state;
  private String channelid;
  private String url;
  private String type;
}

