package com.qf.my.ten.square.domain.entity;


import lombok.Data;

import java.util.Date;

@Data
public class TbUser {

  private String id;
  private String mobile;
  private String password;
  private String nickname;
  private String sex;
  private Date birthday;
  private String avatar;
  private String email;
  private Date regdate;
  private Date updatedate;
  private Date lastdate;
  private long online;
  private String interest;
  private String personality;
  private long fanscount;
  private long followcount;


 
}
