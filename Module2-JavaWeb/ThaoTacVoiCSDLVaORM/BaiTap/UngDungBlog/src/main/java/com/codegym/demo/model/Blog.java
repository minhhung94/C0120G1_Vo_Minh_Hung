package com.codegym.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "blogs")
public class Blog {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String summary;
    private String detail;

    public Blog() {
    }
    public Blog(String summary,String detail) {
        this.summary = summary;
        this.detail = detail;
    }
    @Override
    public String toString() {
        return String.format("Blog[id=%d, summary='%s', detail='%s']", id, summary, detail);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
