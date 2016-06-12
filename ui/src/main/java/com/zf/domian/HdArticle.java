package com.zf.domian;

import javax.persistence.*;

/**
 * HdArticle
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_article", schema = "", catalog = "wholesale")
public class HdArticle {
    @Id
    @GeneratedValue()
    private int articleId;
    private String atId;
    private String title;
    private String content;
    private String author;
    private String isShow;
    private String createTime;
    private Integer shopId;

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }


    public String getAtId() {
        return atId;
    }

    public void setAtId(String atId) {
        this.atId = atId;
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


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public String getIsShow() {
        return isShow;
    }

    public void setIsShow(String isShow) {
        this.isShow = isShow;
    }


    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdArticle hdArticle = (HdArticle) o;

        if (articleId != hdArticle.articleId) return false;
        if (atId != null ? !atId.equals(hdArticle.atId) : hdArticle.atId != null) return false;
        if (title != null ? !title.equals(hdArticle.title) : hdArticle.title != null) return false;
        if (content != null ? !content.equals(hdArticle.content) : hdArticle.content != null) return false;
        if (author != null ? !author.equals(hdArticle.author) : hdArticle.author != null) return false;
        if (isShow != null ? !isShow.equals(hdArticle.isShow) : hdArticle.isShow != null) return false;
        if (createTime != null ? !createTime.equals(hdArticle.createTime) : hdArticle.createTime != null) return false;
        if (shopId != null ? !shopId.equals(hdArticle.shopId) : hdArticle.shopId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = articleId;
        result = 31 * result + (atId != null ? atId.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (isShow != null ? isShow.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (shopId != null ? shopId.hashCode() : 0);
        return result;
    }
}
