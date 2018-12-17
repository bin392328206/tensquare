package com.qf.my.ten.square.domain.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="tb_label")
public class TbLabel extends Object implements Serializable {

  @Id
  private String id;



  private String labelname;
  private String state;
  private Long count;
  private String recommend;
  private Long fans;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getLabelname() {
    return labelname;
  }

  public void setLabelname(String labelname) {
    this.labelname = labelname;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public long getCount() {
    return count;
  }

  public void setCount(long count) {
    this.count = count;
  }

  public String getRecommend() {
    return recommend;
  }

  public void setRecommend(String recommend) {
    this.recommend = recommend;
  }

  public long getFans() {
    return fans;
  }

  public void setFans(long fans) {
    this.fans = fans;
  }
}
