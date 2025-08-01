package com.qg.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SoftwareVO {
    private Long id;
    @JsonProperty("author_id")
    private Long authorId;
    private Long softwareId;
    private Double price;
    private String introduction;
    private String version;
    @TableField("status")
    private Integer status;
    private String picture;
    private String type;
    private String name;
    @TableLogic
    private int isDeleted;
    // 佐证材料
    private String material;

    public SoftwareVO() {
    }

    public SoftwareVO(Long id, Long authorId, Long softwareId, Double price, String introduction,
                      String version, Integer status, String picture, String type, String name, int isDeleted, String material) {
        this.id = id;
        this.authorId = authorId;
        this.softwareId = softwareId;
        this.price = price;
        this.introduction = introduction;
        this.version = version;
        this.status = status;
        this.picture = picture;
        this.type = type;
        this.name = name;
        this.isDeleted = isDeleted;
        this.material = material;
    }

    public Long getSoftwareId() {
        return softwareId;
    }

    public void setSoftwareId(Long softwareId) {
        this.softwareId = softwareId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
