package com.lu_xinghe.project600final.Favorites.FavDetails;

/**
 * Created by Lu,Xinghe on 2/14/2016.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties({ "comment" })
public class News2 implements Serializable{
    String select;
    String article1, article2, subtitle1, subtitle2, author, date, image1, image2, imageDescription1,
            imageDescription2, month, title, year, id, newsType;
    String  eventTitle, eventLocation, eventDay, eventMonth, eventYear, eventLong, eventLat, link,
            youTubeMovieId;

    public News2() {

    }

    public String getSelect(){return select;}

    public void setSelect(String select){this.select=select;}

    public String getYouTubeMovieId() {
        return youTubeMovieId;
    }
    public void setYouTubeMovieId(String ytm) {
        this.youTubeMovieId = ytm;
    }
    //
    public String getLink() {
        return link;
    }
    public void setLink(String lk) {
        this.link = lk;
    }
    //
    public String getEventLat() {
        return eventLat;
    }
    public void setEventLat(String el) {
        this.eventLat = el;
    }
    //
    public String getEventLong() {
        return eventLong;
    }
    public void setEventLong(String el) {
        this.eventLong = el;
    }
    //
    public String getEventYear() {
        return eventYear;
    }
    public void setEventYear(String ey) {
        this.eventYear = ey;
    }
    //
    public String getEventMonth() {
        return eventMonth;
    }
    public void setEventMonth(String em) {
        this.eventMonth = em;
    }

    public String getEventTitle() {return eventTitle;}
    public void setEventTitle(String et) {this.eventTitle = et;}
    //
    public String getEventLocation() {return eventLocation;}
    public void setEventLocation(String el) {this.eventLocation = el;}

    public String getEventDay() {
        return eventDay;
    }
    public void setEventDay(String ed) {
        this.eventDay = ed;
    }

    public String getArticle1() {
        return article1;
    }

    public void setArticle1(String article1) {
        this.article1 = article1;
    }

    public String getArticle2() {
        return article2;
    }

    public void setArticle2(String article2) {
        this.article2 = article2;
    }

    public String getSubtitle1(){return subtitle1;}

    public void setSubtitle1(String subtitle1){this.subtitle1=subtitle1;}

    public String getSubtitle2(){return subtitle2;}

    public void setSubtitle2(String subtitle2){this.subtitle2=subtitle2;}

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImageDescription1() {
        return imageDescription1;
    }

    public void setImageDescription1(String imageDescription1) {
        this.imageDescription1 = imageDescription1;
    }

    public String getImageDescription2() {
        return imageDescription2;
    }

    public void setImageDescription2(String imageDescription2) {
        this.imageDescription2 = imageDescription2;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNewsType(){return newsType;}

    public void setNewsType(String newsType){this.newsType = newsType;}

}
