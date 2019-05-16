package com.knowater.ddms.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Buildings {
    private Integer id;

    private String serialNumber;

    private String buildName;

    private String remark;

    private Integer status;
}
