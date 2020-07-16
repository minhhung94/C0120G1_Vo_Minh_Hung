package com.minhhung.sprint3.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Table(name= "goods")
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_good")
    private Integer id;

    @Column(name = "name_good")
    @NotEmpty(message = "Tên hàng hoá không được để trống")
    private String nameGood;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;

    @Column(name = "quantity")
    @NotEmpty(message = "Số lượng không được để trống")
    private Integer quantity;

    @Column(name = "price")
    @NotEmpty(message = "Giá không được để trống")
    private Integer price;

    @Column(name = "trademark")
    @NotEmpty(message = "Nhãn hiệu không được để trống")
    private String trademark;

    @Column(name = "sale_off")
    private Integer saleOff;

    @Column(name = "images")
    private String images;

    @Column(name = "delete_flag")
    private Integer deleteFlag;

    @JsonBackReference(value = "goods")
    @OneToMany(mappedBy  = "goods", cascade = CascadeType.ALL)
    private List<Bills> bills;

    public Goods() {
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", nameGood='" + nameGood + '\'' +
                ", category=" + category +
                ", quantity=" + quantity +
                ", price=" + price +
                ", trademark='" + trademark + '\'' +
                ", saleOff=" + saleOff +
                ", images='" + images + '\'' +
                ", deleteFlag=" + deleteFlag +
                ", bills=" + bills +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameGood() {
        return nameGood;
    }

    public void setNameGood(String nameGood) {
        this.nameGood = nameGood;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public Integer getSaleOff() {
        return saleOff;
    }

    public void setSaleOff(Integer saleOff) {
        this.saleOff = saleOff;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public List<Bills> getBills() {
        return bills;
    }

    public void setBills(List<Bills> bills) {
        this.bills = bills;
    }
}
