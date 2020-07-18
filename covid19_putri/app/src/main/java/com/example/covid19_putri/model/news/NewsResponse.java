/*
 * Made With Love
 * Author @Moh Husni Mubaraq
 * Not for Commercial Purpose
 */

package com.example.covid19_putri.model.news;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NewsResponse {
    @SerializedName("articles")
    private List<NewsModel> getArticles;

    public NewsResponse(List<NewsModel> getArticles) {
        this.getArticles = getArticles;
    }

    public List<NewsModel> getGetArticles() {
        return getArticles;
    }

    public void setGetArticles(List<NewsModel> getArticles) {
        this.getArticles = getArticles;
    }
}
