package com.qf.my.ten.square.domain.entity;


import lombok.Data;

@Data
public class TbGathering {

  private String id;
  private String name;
  private String summary;
  private String detail;
  private String sponsor;
  private String image;
  private java.sql.Timestamp starttime;
  private java.sql.Timestamp endtime;
  private String address;
  private java.sql.Timestamp enrolltime;
  private String state;
  private String city;




}
