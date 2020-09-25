package com.minhhung.sprint3.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Table(name= "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_category")
    private Integer id;

    @Column(name = "name_category")
    @NotEmpty(message = "Tên loại không được để trống")
    private String nameCategory;

    @JsonBackReference(value = "category")
    @OneToMany(mappedBy  = "category", cascade = CascadeType.ALL)
    private List<Goods> goods;

    @Column(name = "delete_flag")
    private Integer deleteFlag;

    public Category() {
    }

    public Category(Integer id, String name) {
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", nameCategory='" + nameCategory + '\'' +
                ", goods=" + goods +
                ", deleteFlag=" + deleteFlag +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

}
