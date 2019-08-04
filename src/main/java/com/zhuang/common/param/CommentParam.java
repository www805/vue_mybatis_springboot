package com.zhuang.common.param;

public class CommentParam {

    private String content;
    private Long userid;
    private Long articleid;
    private Integer pid;
    private Integer replyuserid;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
