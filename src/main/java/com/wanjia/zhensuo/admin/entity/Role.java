package com.wanjia.zhensuo.admin.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    private Long id;
    private String name;
    private Timestamp createTime;
    private Timestamp updateTime;
} 