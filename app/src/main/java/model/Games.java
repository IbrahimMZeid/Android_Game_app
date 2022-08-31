package model;

import com.example.projecttry.HomeRVModel;

import java.util.ArrayList;

public class Games {
    private String title;
    private String subTitle;
    private String homeImageUrl;
    private String url;
    private String content;
    private String state;
    private String email;

    public Games() {

    }


    public Games(String title, String subTitle, String homeImageUrl, String url, String content, String state, String email) {
        this.title = title;
        this.subTitle = subTitle;
        this.homeImageUrl = homeImageUrl;
        this.url = url;
        this.content = content;
        this.state = state;
        this.email = email;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public void setHomeImageUrl(String homeImageUrl) {
        this.homeImageUrl = homeImageUrl;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUrl() {
        return url;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public String getHomeImageUrl() {
        return homeImageUrl;
    }

    public String getState() {
        return state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
