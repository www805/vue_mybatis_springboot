package com.zhuang.entity;


import java.io.Serializable;

public class Permission implements Serializable {

  private long id;
  private String permissionname;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getPermissionname() {
    return permissionname;
  }

  public void setPermissionname(String permissionname) {
    this.permissionname = permissionname;
  }

}
