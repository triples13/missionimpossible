package com.learning.interview;

import java.util.List;
import java.util.Objects;

public class User {

    private String emailId;
    private String password;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(emailId, user.emailId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailId);
    }
}
