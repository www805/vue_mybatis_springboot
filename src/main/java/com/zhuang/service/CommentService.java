package com.zhuang.service;

import com.zhuang.common.entity.Commentt;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentService {

    List<Commentt> getCommentList(int id);

    //增加评论
    int saveComment(@Param("commentt")Commentt commentt);

    //删除评论
    int deleteComment(int id);

    //修改评论
    int updateComment(Commentt commentt);

}
