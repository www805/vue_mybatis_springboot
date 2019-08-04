package com.zhuang.service.impl;

import com.zhuang.common.entity.Commentt;
import com.zhuang.common.param.CommentParam;
import com.zhuang.common.param.DeleteCommentParam;
import com.zhuang.mapper.CommenttMapper;
import com.zhuang.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommenttMapper commenttMapper;

    @Override
    public List<Commentt> getCommentList(int id) {
        return commenttMapper.getCommentList(id);
    }

    @Override
    public Long saveComment(CommentParam param) {

        Commentt commentt = new Commentt();
        commentt.setId(0L);
        commentt.setUserid(param.getUserid());
        commentt.setPid(param.getPid());
        commentt.setReplyuserid(param.getReplyuserid());
        commentt.setArticleid(param.getArticleid());
        commentt.setContent(param.getContent());

        commenttMapper.saveComment(commentt);

        return commentt.getId();
    }

    @Override
    public int deleteComment(int id) {
        return commenttMapper.deleteComment(id);
    }

    @Override
    public int updateComment(DeleteCommentParam param) {

        Commentt commentt = new Commentt();
        commentt.setId(param.getId());
        commentt.setContent(param.getContent());

        return commenttMapper.updateComment(commentt);
    }


}
