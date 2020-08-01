package com.team5.service;

import com.team5.bean.BO.userBO.AdminUserBO;
import com.team5.bean.VO.userVO.AdminUserVO;

public interface AdminUserService {
    AdminUserVO userList(AdminUserBO userBO);
}
