package com.team5.service;

import com.team5.bean.BO.AdminLoginBO;
import com.team5.bean.VO.authVO.DashBoardVO;
import com.team5.mapper.AdminAuthMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminAuthServiceImpl implements AdminAuthService {
    @Autowired
    AdminAuthMapper adminAuthMapper;


    /**
     * 登陆
     * @param loginBO
     * @return
     */
    @Override
    public int login(AdminLoginBO loginBO) {
        return adminAuthMapper.login(loginBO);
    }

    @Override
    public DashBoardVO dashBoard() {
        DashBoardVO dashBoardVO = new DashBoardVO();
        dashBoardVO.setGoodsTotal(adminAuthMapper.getGoodsTotal());
        dashBoardVO.setOrderTotal(adminAuthMapper.getOrderTotal());
        dashBoardVO.setProductTotal(adminAuthMapper.getProductTotal());
        dashBoardVO.setUserTotal(adminAuthMapper.gerUserTotal());
        return dashBoardVO;
    }
}
