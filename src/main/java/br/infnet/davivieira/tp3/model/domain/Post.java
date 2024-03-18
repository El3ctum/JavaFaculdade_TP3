package br.infnet.davivieira.tp3.model.domain;

import javax.persistence.*;
import java.util.List;


@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String content;
    @ManyToOne(fetch = FetchType.LAZY) // Consider lazy fetching
    private User user;

    public Post() {
    }

    public Post(String title, String content) {
        this.setTitle(title);
        this.setContent(content);
    }

    @Override
    public String toString() {
        return "Post: " + id + " - " + title + " - " + content;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
