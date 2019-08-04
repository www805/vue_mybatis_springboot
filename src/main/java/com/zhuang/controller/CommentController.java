package com.zhuang.controller;

import com.sun.org.apache.regexp.internal.RE;
import com.zhuang.common.entity.Commentt;
import com.zhuang.common.entity.User;
import com.zhuang.common.param.CommentParam;
import com.zhuang.common.param.DeleteCommentParam;
import com.zhuang.mapper.CommenttMapper;
import com.zhuang.service.CommentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api(value = "评论管理接口", tags = {"评论接口"})
@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    //查询所有评论
    @ApiOperation(value = "查询所有评论", notes = "查询所有评论")
    @GetMapping("/getComment/{id}")
    public List<Commentt> getCommentList(@PathVariable("id") int id){
        return commentService.getCommentList(id);
    }


    //新增评论
    @ApiOperation(value = "新增评论", notes = "新增评论/或回复")
    @PostMapping("/saveComment")
    public Long saveComment(CommentParam param){
        return commentService.saveComment(param);
    }

    //删除评论
    @ApiOperation(value = "删除评论", notes = "通过评论id删除一条评论")
    @DeleteMapping("/deleteComment/{id}")
    public int deleteComment(@PathVariable("id") int id) {
        return commentService.deleteComment(id);
    }

    //修改评论
    @ApiOperation(value = "修改评论", notes = "修改一条评论")
    @PutMapping("/updateComment")
    public int updateComment(DeleteCommentParam param) {
        return commentService.updateComment(param);
    }


}
