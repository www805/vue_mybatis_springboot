package com.zhuang.entity;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Role implements Serializable {

  private long id;
  private String rolename;
  private List<Permission> permissions = new ArrayList<Permission>();//一个角色有多个权限

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getRolename() {
    return rolename;
  }

  public void setRolename(String rolename) {
    this.rolename = rolename;
  }

  public List<Permission> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<Permission> permissions) {
    this.permissions = permissions;
  }

  @Override
  public String toString() {
    return "Role{" +
            "id=" + id +
            ", rolename='" + rolename + '\'' +
            ", permissions=" + permissions +
            '}';
  }
}
