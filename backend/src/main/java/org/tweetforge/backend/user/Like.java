package org.tweetforge.backend.user;

import org.tweetforge.backend.post.ParentPost;

public class Like {
    private ParentPost post;
    private User user;

    public ParentPost getPost() {
        return post;
    }

    public void setPost(ParentPost post) {
        this.post = post;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
