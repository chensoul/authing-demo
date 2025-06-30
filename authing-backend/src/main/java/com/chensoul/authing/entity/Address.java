package com.chensoul.authing.entity;

import lombok.Data;

@Data
public class Address {
    /**
     * 所在国家
     */
    private String country;
    /**
     * 所在省份
     */
    private String province;
    /**
     * 所在城市
     */
    private String city;

    /**
     * 用户所在区域
     */
    private String region;

    /**
     * 所处街道地址
     */
    private String streetAddress;

    /**
     * 所处地址
     */
    private String address;

    /**
     * 标准的完整地址
     */
    private String formatted;

    /**
     * 邮政编码号
     */
    private String postalCode;
}
