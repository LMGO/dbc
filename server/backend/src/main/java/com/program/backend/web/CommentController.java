package com.program.backend.web;

import com.program.backend.entity.*;
import com.program.backend.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.*;

@CrossOrigin
@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @RequestMapping(value="/listcomment", method = RequestMethod.GET)
    private Map<String, Object> listComment(String postingId){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Comment> comment = commentService.queryComment(postingId);
        for(int j = 0; j < comment.size(); j ++){
            String commentUserId = comment.get(j).getUserId();
            comment.get(j).setUserHead(commentService.queryHead(commentUserId));
            comment.get(j).setUserName(commentService.queryName(commentUserId));
        }
        modelMap.put("commentList", comment);
        return modelMap;
    }

    @RequestMapping(value = "/listall", method = RequestMethod.GET)
    private Map<String, Object> listAll(String userId){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Posting> posting = commentService.listall(userId);
        List<Comment> comment;
        for(int i = 0; i < posting.size(); i++){
            String postingId = posting.get(i).getPostingId();
            String postingUserId = posting.get(i).getUserId();
            posting.get(i).setUserHead(commentService.queryHead(postingUserId));
            posting.get(i).setUserName(commentService.queryName(postingUserId));
            comment = commentService.queryComment(postingId);
            for(int j = 0; j < comment.size(); j ++){
                String commentUserId = comment.get(j).getUserId();
                comment.get(j).setUserHead(commentService.queryHead(commentUserId));
                comment.get(j).setUserName(commentService.queryName(commentUserId));
            }
            posting.get(i).setComment(comment);
            posting.get(i).setCommentCount(commentService.commenCount(postingId));
            posting.get(i).setLikeSum(commentService.likeCount(postingId));
            posting.get(i).setPetName(commentService.EnglishChinese(posting.get(i).getPetId()));
            posting.get(i).setPostingpic(commentService.listPostingPic(postingId));
            if(commentService.judge(userId, postingId))
                posting.get(i).setIslike(true);
            else
                posting.get(i).setIslike(false);
        }
        modelMap.put("postingList", posting);
        return modelMap;
    }

    @RequestMapping(value="/addcomment", method = RequestMethod.POST)
    private Map<String, Object> addComment(String userId, String commentContent, String postingId){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        SimpleDateFormat sdf = new SimpleDateFormat(("yyyy-MM-dd HH:mm:ss"));
        String commentDate = sdf.format(new Date());
        String commentId = commentDate+" "+userId;
        Comment comment = new Comment();
        comment.setUserId(userId);
        comment.setCommentContent(commentContent);
        comment.setPostingId(postingId);
        comment.setCommentDate(commentDate);
        comment.setCommentId(commentId);
        modelMap.put("Success", commentService.insertComment(comment));
        return modelMap;
    }

    @RequestMapping(value="/deletecomment", method = RequestMethod.GET)
    private Map<String, Object> deleteComment(String commentId){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("delete comment:", commentService.deleteComment(commentId));
        return modelMap;
    }

    @RequestMapping(value="/listreply", method = RequestMethod.GET)
    private Map<String, Object> listReply(String commentId){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Reply> replyList = commentService.queryReply(commentId);
        modelMap.put("replyList", replyList);
        return modelMap;
    }

    @RequestMapping(value="/addreply", method = RequestMethod.POST)
    private Map<String, Object> addReply(String commentId, String userId, String replyContent, String replyUser){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        SimpleDateFormat sdf = new SimpleDateFormat(("yyyy-MM-dd HH:mm:ss"));
        String replyDate = sdf.format(new Date());
        String replyId = replyDate+" "+userId;
        Reply reply = new Reply();
        reply.setReplyId(replyId);
        reply.setCommentId(commentId);
        reply.setUserId(userId);
        reply.setReplyContent(replyContent);
        reply.setReplyDate(replyDate);
        reply.setReplyUser(replyUser);
        modelMap.put("Success:", commentService.insertReply(reply));
        return modelMap;
    }

    @RequestMapping(value="/deletereply", method = RequestMethod.GET)
    private Map<String, Object> deleteReply(String replyId){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("delete reply:", commentService.deleteReply(replyId));
        return modelMap;
    }

    @RequestMapping(value="/chinesetoenglish", method = RequestMethod.GET)
    private Map<String, String> ChineseEnglish(String petName){
        Map<String, String> modelMap = new HashMap<>();
        modelMap.put("petId", commentService.ChineseEnglish(petName));
        return modelMap;
    }

    @RequestMapping(value = "/listrelativeposting", method = RequestMethod.GET)
    private Map<String, Object> listRelativePosting(String userId, String petId){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Posting> posting = commentService.listRelativePosting(petId);
        List<Comment> comment;
        for(int i = 0; i < posting.size(); i++){
            String postingId = posting.get(i).getPostingId();
            String postingUserId = posting.get(i).getUserId();
            posting.get(i).setUserHead(commentService.queryHead(postingUserId));
            posting.get(i).setUserName(commentService.queryName(postingUserId));
            comment = commentService.queryComment(postingId);
            for(int j = 0; j < comment.size(); j ++){
                String commentUserId = comment.get(j).getUserId();
                comment.get(j).setUserHead(commentService.queryHead(commentUserId));
                comment.get(j).setUserName(commentService.queryName(commentUserId));
            }
            posting.get(i).setComment(comment);
            posting.get(i).setCommentCount(commentService.commenCount(postingId));
            posting.get(i).setLikeSum(commentService.likeCount(postingId));
            posting.get(i).setPetName(commentService.EnglishChinese(posting.get(i).getPetId()));
            posting.get(i).setPostingpic(commentService.listPostingPic(postingId));
            if(commentService.judge(userId, postingId))
                posting.get(i).setIslike(true);
            else
                posting.get(i).setIslike(false);
        }
        modelMap.put("postingList", posting);
        return modelMap;
    }

    @RequestMapping(value = "/listmyposting", method = RequestMethod.GET)
    private Map<String, Object> listMyPosting(String userId){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Posting> posting = commentService.listMyPosting(userId);
        List<Comment> comment;
        for(int i = 0; i < posting.size(); i++){
            String postingId = posting.get(i).getPostingId();
            String postingUserId = posting.get(i).getUserId();
            posting.get(i).setUserHead(commentService.queryHead(postingUserId));
            posting.get(i).setUserName(commentService.queryName(postingUserId));
            comment = commentService.queryComment(postingId);
            for(int j = 0; j < comment.size(); j ++){
                String commentUserId = comment.get(j).getUserId();
                comment.get(j).setUserHead(commentService.queryHead(commentUserId));
                comment.get(j).setUserName(commentService.queryName(commentUserId));
            }
            posting.get(i).setComment(comment);
            posting.get(i).setCommentCount(commentService.commenCount(postingId));
            posting.get(i).setLikeSum(commentService.likeCount(postingId));
            posting.get(i).setPetName(commentService.EnglishChinese(posting.get(i).getPetId()));
            posting.get(i).setPostingpic(commentService.listPostingPic(postingId));
            if(commentService.judge(userId, postingId))
                posting.get(i).setIslike(true);
            else
                posting.get(i).setIslike(false);
        }
        modelMap.put("postingList", posting);
        return modelMap;
    }

    @RequestMapping(value="/insertlike", method = RequestMethod.GET)
    private Map<String, Object> insertLike(String userId, String postingId){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("like", commentService.insertLike(userId, postingId));
        return modelMap;
    }

    @RequestMapping(value="/deletelike", method = RequestMethod.GET)
    private Map<String, Object> deleteLike(String userId, String postingId){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("cancelLike", commentService.deleteLike(userId, postingId));
        return modelMap;
    }

    @RequestMapping(value = "/listmylike", method = RequestMethod.GET)
    private Map<String, Object> listMyLike(String userId){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Likenum> likenum = commentService.myLike(userId);
        String[] postings = new String[likenum.size()];
        List<Posting> posting = new LinkedList<Posting>();
        for(int i = 0; i < likenum.size(); i++){
            posting.add(commentService.queryPosting(likenum.get(i).getPostingId()));
        }
        List<Comment> comment;
        for(int i = 0; i < posting.size(); i++){
            String postingId = posting.get(i).getPostingId();
            String postingUserId = posting.get(i).getUserId();
            posting.get(i).setUserHead(commentService.queryHead(postingUserId));
            posting.get(i).setUserName(commentService.queryName(postingUserId));
            comment = commentService.queryComment(postingId);
            for(int j = 0; j < comment.size(); j ++){
                String commentUserId = comment.get(j).getUserId();
                comment.get(j).setUserHead(commentService.queryHead(commentUserId));
                comment.get(j).setUserName(commentService.queryName(commentUserId));
            }
            posting.get(i).setComment(comment);
            posting.get(i).setCommentCount(commentService.commenCount(postingId));
            posting.get(i).setLikeSum(commentService.likeCount(postingId));
            posting.get(i).setPetName(commentService.EnglishChinese(posting.get(i).getPetId()));
            posting.get(i).setPostingpic(commentService.listPostingPic(postingId));
            if(commentService.judge(userId, postingId))
                posting.get(i).setIslike(true);
            else
                posting.get(i).setIslike(false);
        }
        modelMap.put("postingList", posting);
        return modelMap;
    }
}
