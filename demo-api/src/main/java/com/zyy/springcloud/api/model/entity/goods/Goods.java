package com.zyy.springcloud.api.model.entity.goods;

import com.zyy.springcloud.api.model.entity.BaseEntity;

import java.math.BigDecimal;

/**
 * 商品model
 *
 * @author: zhangyanyan
 * @date: 2018/2/13
 */
public class Goods extends BaseEntity {
    private static final long serialVersionUID = 1089458430405148208L;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 单价
     */
    private BigDecimal price;
    /**
     * 商品详情
     */
    private String descb;
    /**
     * 库存
     */
    private Integer repertory;
    /**
     * 状态
     */
    private String status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescb() {
        return descb;
    }

    public void setDescb(String descb) {
        this.descb = descb;
    }

    public Integer getRepertory() {
        return repertory;
    }

    public void setRepertory(Integer repertory) {
        this.repertory = repertory;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
