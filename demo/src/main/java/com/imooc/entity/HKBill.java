package com.imooc.entity;


//说明 ： 如果想返回多个表的数据，那么就找一个主表，
// 定义一个实体类，然后继承主表的实体类，
// 在这个实体类里面定义好想要返回的字段


public class HKBill {
    private String name;
    private String code;
    private String bill_type;
    private String bill_date;
    private String png_location;
    private String pdf_location;
    private String email;
    private String rowkey;

    public String getRowkey() {
        return rowkey;
    }

    public void setRowkey(String rowkey) {
        this.rowkey = rowkey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBill_type() {
        return bill_type;
    }

    public void setBill_type(String bill_type) {
        this.bill_type = bill_type;
    }

    public String getBill_date() {
        return bill_date;
    }

    public void setBill_date(String bill_date) {
        this.bill_date = bill_date;
    }

    public String getPng_location() {
        return png_location;
    }

    public void setPng_location(String png_location) {
        this.png_location = png_location;
    }

    public String getPdf_location() {
        return pdf_location;
    }

    public void setPdf_location(String pdf_location) {
        this.pdf_location = pdf_location;
    }
}
