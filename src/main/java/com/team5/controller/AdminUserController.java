package com.team5.controller;

import com.team5.bean.BO.userBO.AdminUserBO;
import com.team5.bean.VO.BaseRespVO;
import com.team5.bean.VO.userVO.AdminUserVO;
import com.team5.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminUserController {

    @Autowired
    AdminUserService adminUserService;

    /**
     * 会员管理，获取用户列表
     * @return
     */
    @RequestMapping("admin/user/list")
    public BaseRespVO userList(AdminUserBO userBO) {
        AdminUserVO adminUserVO = adminUserService.userList(userBO);
        return BaseRespVO.ok(adminUserVO);
    }
}
