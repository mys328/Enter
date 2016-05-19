package org.fireply.enter.entity;
// Generated 2016-5-19 7:55:16 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Account generated by hbm2java
 */
public class Account implements java.io.Serializable {

    private String id;
    private String wexinId;
    private String alipayId;
    private Set<User> users = new HashSet<User>(0);

    public Account() {
    }

    public Account(String id) {
        this.id = id;
    }

    public Account(String id, String wexinId, String alipayId, Set<User> users) {
        this.id = id;
        this.wexinId = wexinId;
        this.alipayId = alipayId;
        this.users = users;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWexinId() {
        return this.wexinId;
    }

    public void setWexinId(String wexinId) {
        this.wexinId = wexinId;
    }

    public String getAlipayId() {
        return this.alipayId;
    }

    public void setAlipayId(String alipayId) {
        this.alipayId = alipayId;
    }

    public Set<User> getUsers() {
        return this.users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

}
