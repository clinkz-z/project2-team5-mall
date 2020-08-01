package com.team5.controller;

import com.team5.bean.BO.AdminLoginBO;
import com.team5.bean.VO.BaseRespVO;
import com.team5.bean.VO.authVO.AdminAuthInfoVO;
import com.team5.bean.VO.authVO.DashBoardVO;
import com.team5.service.AdminAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminAuthController {
    @Autowired
    AdminAuthService adminAuthService;

    /**
     * 登录
     * @param loginBO
     * @return
     */
    @RequestMapping("admin/auth/login")
    public BaseRespVO login(@RequestBody AdminLoginBO loginBO) {
        int code = adminAuthService.login(loginBO);
        if (code == 1) {
            return BaseRespVO.ok("abc");
        } else {
            return BaseRespVO.fail("用户名或密码错误！");
        }
        //return BaseRespVO.ok("abc");
    }

    /**
     * 获取信息
     * @return
     */
    @RequestMapping("admin/auth/info")
    public String info() {
        // AdminAuthInfoVO infoVO = adminAuthService.info(token);
        return "{\"errno\":0,\"data\":{\"roles\":[\"超级管理员\"],\"name\":\"admin123\",\"perms\":[\"*\"],\"avatar\":\"https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif\"},\"errmsg\":\"成功\"}";
    }

    /**
     * 首页
     * @return
     */
    @RequestMapping("admin/dashboard")
    public BaseRespVO dashboard() {
        DashBoardVO dashBoardVO = adminAuthService.dashBoard();
        return BaseRespVO.ok(dashBoardVO);
    }
}
