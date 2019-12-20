/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 18 13:46:46 GMT 2019
 */

package com.program.backend.service.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.program.backend.dao.CommentDao;
import com.program.backend.entity.Comment;
import com.program.backend.entity.Posting;
import com.program.backend.entity.Postingpic;
import com.program.backend.entity.Reply;
import com.program.backend.service.impl.CommentServiceImpl;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CommentServiceImpl_ESTest extends CommentServiceImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn(0, (-278)).when(commentDao0).deleteLike(anyString() , anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      boolean boolean0 = commentServiceImpl0.deleteLike("", "The names of the fields/properties to read should not be empty");
      boolean boolean1 = commentServiceImpl0.deleteLike(" D+Y$\"Q", " D+Y$\"Q");
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn((-1)).when(commentDao0).insertLike(anyString() , anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      boolean boolean0 = commentServiceImpl0.insertLike("", "MX$Ie7!x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn(1630).when(commentDao0).insertLike(anyString() , anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      boolean boolean0 = commentServiceImpl0.insertLike("(QDZciK", "The name of the field/property to read should not be empty");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn((-1)).when(commentDao0).deleteReply(anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      boolean boolean0 = commentServiceImpl0.deleteReply("F@0UA-~cn_o,E9");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn((-1)).when(commentDao0).insertReply(any(com.program.backend.entity.Reply.class));
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      Reply reply0 = new Reply();
      boolean boolean0 = commentServiceImpl0.insertReply(reply0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn((-1)).when(commentDao0).deleteComment(anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      boolean boolean0 = commentServiceImpl0.deleteComment("7p;Iz");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn((-89)).when(commentDao0).insertComment(any(com.program.backend.entity.Comment.class));
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      Comment comment0 = new Comment();
      boolean boolean0 = commentServiceImpl0.insertComment(comment0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(commentDao0).isLike(anyString() , anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      boolean boolean0 = commentServiceImpl0.judge("D*)'lg^G", "com.program.backend.entity.Reply");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      LinkedList<Reply> linkedList0 = new LinkedList<Reply>();
      Reply reply0 = new Reply();
      linkedList0.offer(reply0);
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0).when(commentDao0).queryReply(anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      List<Reply> list0 = commentServiceImpl0.queryReply("@`hQ'AIK%bA");
      assertTrue(list0.contains(reply0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn("").when(commentDao0).queryName(anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      String string0 = commentServiceImpl0.queryName((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn("").when(commentDao0).queryName(anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      String string0 = commentServiceImpl0.queryName("]El*imz");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn("=I.l!'^8op", "").when(commentDao0).queryHead(anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      String string0 = commentServiceImpl0.queryHead("@bH-H06~5YQRs");
      String string1 = commentServiceImpl0.queryHead("");
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn((List<Comment>) null).when(commentDao0).queryComment(anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      List<Comment> list0 = commentServiceImpl0.queryComment("_%8vy=uhI;{\"70[6");
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      LinkedList<Comment> linkedList0 = new LinkedList<Comment>();
      Comment comment0 = new Comment();
      linkedList0.add(comment0);
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0).when(commentDao0).queryComment(anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      List<Comment> list0 = commentServiceImpl0.queryComment(" D+Y$\"Q");
      assertTrue(list0.contains(comment0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      LinkedList<Posting> linkedList0 = new LinkedList<Posting>();
      Posting posting0 = new Posting();
      linkedList0.add(posting0);
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0).when(commentDao0).listPosting();
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      List<Posting> list0 = commentServiceImpl0.listall("E!V1Z0@62ZJ");
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(commentDao0).listRelativePosting(anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      List<Posting> list0 = commentServiceImpl0.listRelativePosting("h/lP{j33J[YM7q{F7");
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      LinkedList<Posting> linkedList0 = new LinkedList<Posting>();
      Posting posting0 = new Posting();
      linkedList0.addLast(posting0);
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0).when(commentDao0).listRelativePosting(anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      List<Posting> list0 = commentServiceImpl0.listRelativePosting("xgzO>l|*");
      assertTrue(list0.contains(posting0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(commentDao0).ChineseEnglish(anyString());
      doReturn((String) null, (String) null, (String) null).when(commentDao0).EnglishChinese(anyString());
      doReturn(0, 0).when(commentDao0).commentCount(anyString());
      doReturn(0, 0).when(commentDao0).deleteComment(anyString());
      doReturn(0).when(commentDao0).deleteLike(anyString() , anyString());
      doReturn(0).when(commentDao0).deleteReply(anyString());
      doReturn(0).when(commentDao0).insertComment(any(com.program.backend.entity.Comment.class));
      doReturn((List) null).when(commentDao0).listPosting();
      doReturn((List) null, (List) null).when(commentDao0).listPostingPic(anyString());
      doReturn((List) null).when(commentDao0).queryComment(anyString());
      doReturn((String) null).when(commentDao0).queryHead(anyString());
      doReturn((List) null).when(commentDao0).queryReply(anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      commentServiceImpl0.EnglishChinese("2Emr@~](,N:S`@$");
      Comment comment0 = new Comment();
      boolean boolean0 = commentServiceImpl0.insertComment(comment0);
      commentServiceImpl0.commenCount("");
      boolean boolean1 = commentServiceImpl0.deleteLike("b!3DDI", (String) null);
      commentServiceImpl0.deleteComment(" Eu&f");
      commentServiceImpl0.commenCount("org.springframework.boot.web.client.RestTemplateBuilder$RequestFactoryCustomizer");
      commentServiceImpl0.listall("");
      commentServiceImpl0.listPostingPic("4`");
      commentServiceImpl0.ChineseEnglish("WnGz)iU8vgR-]%DlB0");
      commentServiceImpl0.queryHead("");
      commentServiceImpl0.queryReply("com.program.backend.entity.Posting");
      commentServiceImpl0.EnglishChinese("G");
      commentServiceImpl0.EnglishChinese("G");
      boolean boolean2 = commentServiceImpl0.deleteReply("");
      assertTrue(boolean2 == boolean1);
      
      commentServiceImpl0.queryComment((String) null);
      commentServiceImpl0.listPostingPic("jA&ud2G");
      boolean boolean3 = commentServiceImpl0.deleteComment((String) null);
      assertTrue(boolean3 == boolean0);
      assertFalse(boolean3);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      LinkedList<Postingpic> linkedList0 = new LinkedList<Postingpic>();
      Postingpic postingpic0 = new Postingpic();
      linkedList0.add(postingpic0);
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0).when(commentDao0).listPostingPic(anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      List<Postingpic> list0 = commentServiceImpl0.listPostingPic("2X^-N");
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(commentDao0).listMyPosting(anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      List<Posting> list0 = commentServiceImpl0.listMyPosting("com.program.backend.service.impl.CommentServiceImpl");
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      LinkedList<Posting> linkedList0 = new LinkedList<Posting>();
      Posting posting0 = new Posting();
      linkedList0.add(posting0);
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0).when(commentDao0).listMyPosting(anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      List<Posting> list0 = commentServiceImpl0.listMyPosting("");
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn(1900).when(commentDao0).likeCount(anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      int int0 = commentServiceImpl0.likeCount((String) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn((-2473)).when(commentDao0).likeCount(anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      int int0 = commentServiceImpl0.likeCount("H6b@[psc|6=f|Wb");
      assertEquals((-2473), int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn(15).when(commentDao0).commentCount(anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      int int0 = commentServiceImpl0.commenCount("TS,{%[w<UA]#Svg");
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn((-278)).when(commentDao0).commentCount(anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      int int0 = commentServiceImpl0.commenCount("TS,{%[w<UA]#Svg");
      assertEquals((-278), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn("Value extractor must not be null").when(commentDao0).EnglishChinese(anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      String string0 = commentServiceImpl0.EnglishChinese("");
      assertEquals("Value extractor must not be null", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn("").when(commentDao0).EnglishChinese(anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      String string0 = commentServiceImpl0.EnglishChinese("The object to extract field/property from should not be null");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn("C_T36qXP4").when(commentDao0).ChineseEnglish(anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      String string0 = commentServiceImpl0.ChineseEnglish("/1JUU?h~!bYRNSw");
      assertEquals("C_T36qXP4", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn("").when(commentDao0).ChineseEnglish(anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      String string0 = commentServiceImpl0.ChineseEnglish("Q");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      // Undeclared exception!
      try { 
        commentServiceImpl0.queryName("fZ=j7jLdHP#I8;l2");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.program.backend.service.impl.CommentServiceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      // Undeclared exception!
      try { 
        commentServiceImpl0.queryHead("4qdd0#*");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.program.backend.service.impl.CommentServiceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      // Undeclared exception!
      try { 
        commentServiceImpl0.queryComment("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.program.backend.service.impl.CommentServiceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      // Undeclared exception!
      try { 
        commentServiceImpl0.listall((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.program.backend.service.impl.CommentServiceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      // Undeclared exception!
      try { 
        commentServiceImpl0.listPostingPic((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.program.backend.service.impl.CommentServiceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      // Undeclared exception!
      try { 
        commentServiceImpl0.listMyPosting("#p]k&)?<0");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.program.backend.service.impl.CommentServiceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      // Undeclared exception!
      try { 
        commentServiceImpl0.likeCount("K|");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.program.backend.service.impl.CommentServiceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      // Undeclared exception!
      try { 
        commentServiceImpl0.judge((String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.program.backend.service.impl.CommentServiceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      // Undeclared exception!
      try { 
        commentServiceImpl0.deleteComment((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.program.backend.service.impl.CommentServiceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      // Undeclared exception!
      try { 
        commentServiceImpl0.commenCount("T(hlm]h3=?`}#");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.program.backend.service.impl.CommentServiceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      // Undeclared exception!
      try { 
        commentServiceImpl0.EnglishChinese("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.program.backend.service.impl.CommentServiceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      // Undeclared exception!
      try { 
        commentServiceImpl0.ChineseEnglish("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.program.backend.service.impl.CommentServiceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn(24).when(commentDao0).deleteLike(anyString() , anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      boolean boolean0 = commentServiceImpl0.deleteLike("X", "X");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(commentDao0).insertLike(anyString() , anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      boolean boolean0 = commentServiceImpl0.insertLike("(mSMW_c", "(mSMW_c");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn(368).when(commentDao0).deleteReply(anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      boolean boolean0 = commentServiceImpl0.deleteReply("r5'Ja=wyR");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn(368).when(commentDao0).insertReply(any(com.program.backend.entity.Reply.class));
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      Reply reply0 = new Reply();
      boolean boolean0 = commentServiceImpl0.insertReply(reply0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(commentDao0).insertReply(any(com.program.backend.entity.Reply.class));
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      Reply reply0 = new Reply();
      boolean boolean0 = commentServiceImpl0.insertReply(reply0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn(24).when(commentDao0).deleteComment(anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      boolean boolean0 = commentServiceImpl0.deleteComment("X");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn(24).when(commentDao0).insertComment(any(com.program.backend.entity.Comment.class));
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      Comment comment0 = new Comment();
      boolean boolean0 = commentServiceImpl0.insertComment(comment0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn(1459).when(commentDao0).isLike(anyString() , anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      boolean boolean0 = commentServiceImpl0.judge("nk}NkOvq;", "nk}NkOvq;");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn((-1241)).when(commentDao0).isLike(anyString() , anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      boolean boolean0 = commentServiceImpl0.judge("X", "X");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn("(mSMW_c").when(commentDao0).queryName(anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      String string0 = commentServiceImpl0.queryName("(mSMW_c");
      assertEquals("(mSMW_c", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CommentServiceImpl commentServiceImpl0 = new CommentServiceImpl();
      CommentDao commentDao0 = mock(CommentDao.class, new ViolatedAssumptionAnswer());
      doReturn(24).when(commentDao0).likeCount(anyString());
      Injector.inject(commentServiceImpl0, (Class<?>) CommentServiceImpl.class, "commentDao", (Object) commentDao0);
      Injector.validateBean(commentServiceImpl0, (Class<?>) CommentServiceImpl.class);
      int int0 = commentServiceImpl0.likeCount("X");
      assertEquals(24, int0);
  }
}
