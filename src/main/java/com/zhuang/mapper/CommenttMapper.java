package com.zhuang.mapper;


import com.zhuang.common.entity.Commentt;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommenttMapper {

    //获取评论
    List<Commentt> getCommentList(@Param("id")int id);

    //增加评论
    int saveComment(@Param("commentt")Commentt commentt);

    //删除评论
    int deleteComment(int id);

    //修改评论
    int updateComment(Commentt commentt);

}
