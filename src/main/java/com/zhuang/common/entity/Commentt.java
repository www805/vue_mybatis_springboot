package com.zhuang.common.entity;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Commentt implements Serializable {

  private Long id;
  private String content;
  private String createtime;
  private List<Commentt> commentts = new ArrayList<Commentt>(); //回复人
  private User user;  //回复人信息
  private User buser;  //被回复人信息

  private Long userid;
  private Long articleid;
  private Integer pid;
  private Integer replyuserid;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getCreatetime() {
    return createtime;
  }

  public void setCreatetime(String createtime) {
    this.createtime = createtime;
  }

  public List<Commentt> getCommentts() {
    return commentts;
  }

  public void setCommentts(List<Commentt> commentts) {
    this.commentts = commentts;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public User getBuser() {
    return buser;
  }

  public void setBuser(User buser) {
    this.buser = buser;
  }

  public Long getUserid() {
    return userid;
  }

  public void setUserid(Long userid) {
    this.userid = userid;
  }

  public Long getArticleid() {
    return articleid;
  }

  public void setArticleid(Long articleid) {
    this.articleid = articleid;
  }

  public Integer getPid() {
    return pid;
  }

  public void setPid(Integer pid) {
    this.pid = pid;
  }

  public Integer getReplyuserid() {
    return replyuserid;
  }

  public void setReplyuserid(Integer replyuserid) {
    this.replyuserid = replyuserid;
  }
}
