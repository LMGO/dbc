package com.program.backend.service;

import com.program.backend.entity.*;

import java.util.List;

public interface CommentService {
    List<Comment> queryComment(String postingId);
    String queryName(String userId);
    String queryHead(String userId);
    String ChineseEnglish(String petName);
    String EnglishChinese(String petId);
    List<Posting> listall(String userId);
    boolean judge(String userId, String postingId);
    boolean insertComment(Comment comment);
    boolean deleteComment(String commentId);
    List<Reply> queryReply(String commentId);
    boolean insertReply(Reply reply);
    boolean deleteReply(String replyId);
    int likeCount(String postingId);
    List<Postingpic> listPostingPic(String postingId);
    int commenCount(String postingId);
    List<Posting> listRelativePosting(String petId);
    List<Posting> listMyPosting(String userId);
    boolean insertLike(String userId, String postingId);
    boolean deleteLike(String userId, String postingId);
    List<Likenum> myLike(String userId);
    Posting queryPosting(String postingId);
}
