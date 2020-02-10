package com.gmall.user.bean;

import lombok.Data;

import javax.persistence.Id;

@Data
public class UmsMemberReceiveAddress {
    @Id
    private String id;
    private String memberId;
    private String name;
    private String phoneNumber;
    private int defaultStatus;
    private String postCode;
    private String province;
    private String city;
    private String region;
    private String detailAddress;

}
