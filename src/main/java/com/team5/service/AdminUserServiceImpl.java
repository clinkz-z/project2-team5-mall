package com.team5.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.team5.bean.BO.userBO.AdminUserBO;
import com.team5.bean.VO.userVO.AdminUserItem;
import com.team5.bean.VO.userVO.AdminUserVO;
import com.team5.bean.generatorBean.User;
import com.team5.bean.generatorBean.UserExample;
import com.team5.mapper.AdminUserMapper;
import com.team5.mapper.generatorMapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminUserServiceImpl implements AdminUserService {
    @Autowired
    AdminUserMapper adminUserMapper;

    @Autowired
    UserMapper userMapper;
    /**
     * 会员管理，获取用户列表
     * 采用 generator 生成的 mapper 实现，然后转为自定义的数据类型
     * @return
     */
    public AdminUserVO userList(AdminUserBO userBO) {
        AdminUserVO adminUserVO = new AdminUserVO();

        PageHelper.startPage(userBO.getPage(), userBO.getLimit());
        UserExample userExample = new UserExample();
        userExample.setOrderByClause(userBO.getSort() + " " + userBO.getOrder());
        List<User> users = userMapper.selectByExample(userExample);
        PageInfo<User> pageInfo = new PageInfo<User>(users);
        long total = pageInfo.getTotal();

        List<AdminUserItem> iteams = new ArrayList<>();
        for (User user : users) {
            AdminUserItem userItem = new AdminUserItem(
                    user.getId(),
                    user.getUsername(),
                    user.getPassword(),
                    user.getGender(),
                    user.getBirthday(),
                    user.getLastLoginTime(),
                    user.getLastLoginIp(),
                    user.getUserLevel(),
                    user.getNickname(),
                    user.getMobile(),
                    user.getAvatar(),
                    user.getWeixinOpenid(),
                    user.getStatus(),
                    user.getDeleted()
            );
            iteams.add(userItem);
        }

        adminUserVO.setTotal(total);
        adminUserVO.setItems(iteams);

        return adminUserVO;
    }
}
