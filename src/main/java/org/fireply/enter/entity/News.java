package org.fireply.enter.entity;
// Generated 2016-5-19 7:55:16 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * News generated by hbm2java
 */
public class News implements java.io.Serializable {

    private String id;
    private User user;
    private String title;
    private String content;
    private Date createTime;
    private Set<Commit> commits = new HashSet<Commit>(0);

    public News() {
    }

    public News(String id, String title, String content, Date createTime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createTime = createTime;
    }

    public News(String id, User user, String title, String content, Date createTime, Set<Commit> commits) {
        this.id = id;
        this.user = user;
        this.title = title;
        this.content = content;
        this.createTime = createTime;
        this.commits = commits;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Set<Commit> getCommits() {
        return this.commits;
    }

    public void setCommits(Set<Commit> commits) {
        this.commits = commits;
    }

}
