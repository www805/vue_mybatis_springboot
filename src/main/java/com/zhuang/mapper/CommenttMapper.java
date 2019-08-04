package com.zhuang.mapper;


import com.zhuang.common.entity.Commentt;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommenttMapper {

    //获取评论
    List<Commentt> getCommentList(@Param("id")int id);

    //增加评论
    Integer saveComment(@Param("commentt")Commentt commentt);

    //删除评论
    Integer deleteComment(int id);

    //修改评论
    Integer updateComment(@Param("commentt")Commentt commentt);

}
