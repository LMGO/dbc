package com.program.backend.service.impl;

import com.program.backend.dao.CommentDao;
import com.program.backend.entity.*;
import com.program.backend.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentDao commentDao;

    @Override
    public List<Comment> queryComment(String postingId) {
        return commentDao.queryComment(postingId);
    }

    @Override
    public String queryName(String userId) {
        return commentDao.queryName(userId);
    }

    @Override
    public String queryHead(String userId) {
        return commentDao.queryHead(userId);
    }

    @Override
    public String ChineseEnglish(String petName) {
        return commentDao.ChineseEnglish(petName);
    }

    @Override
    public String EnglishChinese(String petId) {
        return commentDao.EnglishChinese(petId);
    }

    @Override
    public List<Posting> listall(String userId) {
        return commentDao.listPosting();
    }

    @Override
    public boolean judge(String userId, String postingId) {
        if(commentDao.isLike(userId, postingId) > 0)
            return true;
        else
            return false;
    }

    @Override
    public boolean insertComment(Comment comment) {
        int effectedNum = commentDao.insertComment(comment);
        if(effectedNum > 0)
            return true;
        else
            return false;
    }

    @Override
    public boolean deleteComment(String commentId) {
        int effectedNum = commentDao.deleteComment(commentId);
        if(effectedNum > 0)
            return true;
        else
            return false;
    }

    @Override
    public List<Reply> queryReply(String commentId) {
        return commentDao.queryReply(commentId);
    }

    @Override
    public boolean insertReply(Reply reply) {
        int effectedNum = commentDao.insertReply(reply);
        if(effectedNum > 0)
            return true;
        else
            return false;
    }

    @Override
    public boolean deleteReply(String replyId) {
        int effectedNum = commentDao.deleteReply(replyId);
        if(effectedNum > 0)
            return true;
        else
            return false;
    }

    @Override
    public int likeCount(String postingId) {
        return commentDao.likeCount(postingId);
    }

    @Override
    public List<Postingpic> listPostingPic(String postingId) {
        return commentDao.listPostingPic(postingId);
    }

    @Override
    public int commenCount(String postingId) {
        return commentDao.commentCount(postingId);
    }

    @Override
    public List<Posting> listRelativePosting(String petId) {
        return commentDao.listRelativePosting(petId);
    }

    @Override
    public List<Posting> listMyPosting(String userId) {
        return commentDao.listMyPosting(userId);
    }

    @Override
    public boolean insertLike(String userId, String postingId) {
        int effectedNum = commentDao.insertLike(userId, postingId);
        if(effectedNum > 0)
            return true;
        else
            return false;
    }

    @Override
    public boolean deleteLike(String userId, String postingId) {
        int effectedNum = commentDao.deleteLike(userId, postingId);
        if(effectedNum > 0)
            return true;
        else
            return false;
    }

    @Override
    public List<Likenum> myLike(String userId) {
        return commentDao.myLike(userId);
    }

    @Override
    public Posting queryPosting(String postingId) {
        return commentDao.queryPosting(postingId);
    }
}
