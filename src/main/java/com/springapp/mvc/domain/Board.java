package com.springapp.mvc.domain;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: yoyojyv
 * Date: 2013. 11. 1.
 * Time: 오전 1:23
 * To change this template use File | Settings | File Templates.
 */

@Entity
// @Table("Board")
public class Board {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;


  @Column
  // @Column(name = "subject")
  private String subject;

  @Column
  // @Column(name = "contents")
  private String contents;

  public Long getId() {
    return id;
  }

  public String getSubject() {
    return subject;
  }

  public String getContents() {
    return contents;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public void setContents(String contents) {
    this.contents = contents;
  }


  @Override
  public String toString() {
    return "id: " + id + ", subject: " + subject + ", contents : " + contents;
  }
}
