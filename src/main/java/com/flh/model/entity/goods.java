package com.flh.model.entity;

public class goods {
    private int goodsId;
    private String goodsName;
    private double goodsPrices;
    private String goodsInfo;
    private int goodsInventoryNum;

    public goods() {
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getGoodsPrices() {
        return goodsPrices;
    }

    public void setGoodsPrices(double goodsPrices) {
        this.goodsPrices = goodsPrices;
    }

    public String getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(String goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

    public int getGoodsInventoryNum() {
        return goodsInventoryNum;
    }

    public void setGoodsInventoryNum(int goodsInventoryNum) {
        this.goodsInventoryNum = goodsInventoryNum;
    }
}
