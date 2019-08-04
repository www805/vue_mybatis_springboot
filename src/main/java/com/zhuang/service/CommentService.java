package com.zhuang.service;

import com.zhuang.common.entity.Commentt;
import com.zhuang.common.param.CommentParam;
import com.zhuang.common.param.DeleteCommentParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentService {

    List<Commentt> getCommentList(int id);

    //增加评论
    Long saveComment(@Param("commentt") CommentParam param);

    //删除评论
    int deleteComment(int id);

    //修改评论
    int updateComment(DeleteCommentParam param);

}
