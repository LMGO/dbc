package com.program.backend.dao;

import com.program.backend.entity.Comment;
import com.program.backend.entity.Likenum;
import com.program.backend.entity.Posting;
import com.program.backend.entity.Postingpic;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentDaoTest {
    @Autowired
    private CommentDao commentDao;

    @Test
    public void listPosting() {
        List<Posting> postingList = commentDao.listPosting();
        assertEquals(6, postingList.size());
    }

    @Test
    public void queryHead(){
        String head = commentDao.queryHead("18687251007");
        assertEquals("/Library/WebServer/Documents/16.png", head);
    }

    @Test
    public void queryName(){
        String name = commentDao.queryName("18687251007");
        assertEquals("鲤阅哲", name);
    }

    @Test
    public void queryComment() {
        List<Comment> commentList = commentDao.queryComment("tiezi31550338");
        assertEquals(2, commentList.size());
    }

    @Test
    public void EnglishChinese(){
        String Chinese = commentDao.EnglishChinese("Alaskan_malamute");
        assertEquals("阿拉斯加雪橇犬（阿拉斯加犬、阿拉斯加马拉缪特、阿拉斯加马拉穆）", Chinese);
    }

    @Test
    public void ChineseEnglish(){
        String English = commentDao.ChineseEnglish("美国水猎犬");
        assertEquals("American_water_spaniel", English);
    }

    @Test
    public void likeCount(){
        int count = commentDao.likeCount("tiezi3231540115");
        assertEquals(2, count);
    }

    @Test
    public void insertComment(){
        Comment comment = new Comment();
        comment.setPostingId("tiezi31320787");
        comment.setUserId("18687251007");
        comment.setCommentId("2019-12-19 9:51:33 18687251007");
        comment.setCommentDate("2019-12-19 09:51:33");
        comment.setCommentContent("对啊，我收集了好多它对表情包呢！");
        int count = commentDao.insertComment(comment);
        assertEquals(1, count);
    }

    @Test
    public void deleteComment(){
        int count = commentDao.deleteComment("2019-12-19 9:51:33 15508711230");
        assertEquals(1, count);
    }

    @Test
    public void isLike(){
        int count = commentDao.isLike("18487315405", "tiezi3231540115");
        assertEquals(1, count);
    }

    @Test
    public void listPostingPic(){
        List<Postingpic> postingpic = commentDao.listPostingPic("tiezi3223013931");
        assertEquals(2, postingpic.size());
    }

    @Test
    public void commentCount(){
        int count = commentDao.commentCount("tiezi31550338");
        assertEquals(2, count);
    }

    @Test
    public void listRelativePosting(){
        List<Posting> posting = commentDao.listRelativePosting("Poodle");
        assertEquals(1, posting.size());
    }

    @Test
    public void listMyPosting(){
        List<Posting> posting = commentDao.listMyPosting("15508711230");
        assertEquals(2, posting.size());
    }

    @Test
    public void insertLike(){
        int count = commentDao.insertLike("15508711230","tiezi31550338");
        assertEquals(1, count);
    }

    @Test
    public void deleteLike(){
        int count = commentDao.deleteLike("15508711230","tiezi4101034241");
        assertEquals(1, count);
    }

    @Test
    public void myLike(){
        List<Likenum> likenum = commentDao.myLike("18687251007");
        assertEquals(1, likenum.size());
    }

    @Test
    public void queryPosting(){
        Posting posting = commentDao.queryPosting("tiezi31320787");
        assertEquals("金毛真可爱", posting.getPostingContent());
    }
}
