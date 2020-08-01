package com.team5.bean.VO.userVO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminUserItem {
    private int id;
    private String username;
    private String password;
    private int gender;
    private Date birthday;
    private Date lastLoginTime;
    private String lastLoginIp;
    private int userLevel;
    private String nickname;
    private String mobile;
    private String avatar;
    private String weixinOpenid;
    private int status;
    private boolean deleted;

}
