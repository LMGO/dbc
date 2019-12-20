package com.program.backend.entity;

import java.util.List;

public class Posting {
    private String postingId;
    private String userId;
    private String petId;
    private String petName;
    private String postingContent;
    private String postingTime;
    private boolean islike;
    private List<Comment> comment;
    private String userName;
    private String userHead;
    private int likeSum;
    private List<Postingpic> postingpic;
    private int commentCount;

    public String getPostingId() {
        return postingId;
    }

    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }

    public String getPostingContent() {
        return postingContent;
    }

    public void setPostingContent(String postingContent) {
        this.postingContent = postingContent;
    }

    public String getPostingTime() {
        return postingTime;
    }

    public void setPostingTime(String postingTime) {
        this.postingTime = postingTime;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }


    public List<Comment> getComment() {
        return comment;
    }

    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserHead() {
        return userHead;
    }

    public void setUserHead(String userHead) {
        this.userHead = userHead;
    }

    public int getLikeSum() {
        return likeSum;
    }

    public void setLikeSum(int likeSum) {
        this.likeSum = likeSum;
    }

    public List<Postingpic> getPostingpic() {
        return postingpic;
    }

    public void setPostingpic(List<Postingpic> postingpic) {
        this.postingpic = postingpic;
    }

    public boolean isIslike() {
        return islike;
    }

    public void setIslike(boolean islike) {
        this.islike = islike;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }
}

