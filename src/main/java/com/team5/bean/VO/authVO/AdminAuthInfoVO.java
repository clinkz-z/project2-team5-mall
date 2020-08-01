package com.team5.bean.VO.authVO;

import lombok.Data;

import java.util.List;

@Data
public class AdminAuthInfoVO {
    private String name;
    private String avatar;
    private List<String> roles;
    private List<String> perms;
}
