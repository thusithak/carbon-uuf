package org.wso2.carbon.uuf.core.auth;

import java.io.Serializable;

public class User implements Serializable {

    private final String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
