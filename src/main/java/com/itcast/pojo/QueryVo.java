package com.itcast.pojo;

import java.io.Serializable;
import java.util.List;

/**
 *
 **/
public class QueryVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private User user;

    List<Integer> idsList;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Integer> getIdsList() {
        return idsList;
    }

    public void setIdsList(List<Integer> idsList) {
        this.idsList = idsList;
    }

}
