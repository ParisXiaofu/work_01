package com.flh.model.entity;

public class customer {
    private int custId;
    private String custTel;
    private String custName;
    private String custPwd;

    public customer() {
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustTel() {
        return custTel;
    }

    public void setCustTel(String custTel) {
        this.custTel = custTel;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustPwd() {
        return custPwd;
    }

    public void setCustPwd(String custPwd) {
        this.custPwd = custPwd;
    }
}
