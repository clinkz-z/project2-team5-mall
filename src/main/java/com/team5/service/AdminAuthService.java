package com.team5.service;

import com.team5.bean.BO.AdminLoginBO;
import com.team5.bean.VO.authVO.DashBoardVO;

public interface AdminAuthService {
    int login(AdminLoginBO loginBO);

    DashBoardVO dashBoard();
}
