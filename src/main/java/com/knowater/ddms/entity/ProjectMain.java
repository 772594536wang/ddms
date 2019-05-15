package com.knowater.ddms.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ProjectMain {
    private Integer id;

    private String serialNumber;

    private String projectName;

    private String orgName;

    private String address;

    private String contact;

    private String mobile;

    private Integer projectType;

    private String manager;

    private Date approvalTime;

    private Date createTime;

    private String createUser;

    private Date updateTime;

    private String updateUser;

    private String remark;

    private Integer status;
}
