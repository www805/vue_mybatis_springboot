package com.zhuang.service.impl;

import com.zhuang.common.entity.Commentt;
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
    public int saveComment(Commentt commentt) {
        return commenttMapper.saveComment(commentt);
    }

    @Override
    public int deleteComment(int id) {
        return commenttMapper.deleteComment(id);
    }

    @Override
    public int updateComment(Commentt commentt) {
        return commenttMapper.updateComment(commentt);
    }


}
