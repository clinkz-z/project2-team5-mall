package com.team5.bean.VO.userVO;

import com.team5.bean.generatorBean.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminUserVO {
    private Long total;

    private List<AdminUserItem> items;
}
