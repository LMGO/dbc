package com.program.backend.dao;

import com.program.backend.entity.*;

import java.util.List;

public interface CommentDao {
    List<Posting> listPosting();
    String queryHead(String userId);
    String queryName(String userId);
    List<Comment> queryComment(String postingId);
    String EnglishChinese(String petId);
    String ChineseEnglish(String petName);
    int likeCount(String postingId);
    int insertComment(Comment comment);
    int deleteComment(String commentId);
    List<Reply> queryReply(String commentId);
    int insertReply(Reply reply);
    int deleteReply(String replyId);
    int isLike(String userId, String postingId);
    List<Postingpic> listPostingPic(String postingId);
    int commentCount(String postingId);
    List<Posting> listRelativePosting(String petId);
    List<Posting> listMyPosting(String userId);
    int insertLike(String userId, String postingId);
    int deleteLike(String userId, String postingId);
    List<Likenum> myLike(String userId);
    Posting queryPosting(String postingId);
}
