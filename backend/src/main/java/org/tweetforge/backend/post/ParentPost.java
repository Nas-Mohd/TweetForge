package org.tweetforge.backend.post;

import org.tweetforge.backend.user.Like;

import java.util.List;

public abstract class ParentPost {
    private String text;
    private List<Like> likes;
    private List<String> keywords;

    public ParentPost() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Like> getLikes() {
        return likes;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public abstract void delete();
    

}