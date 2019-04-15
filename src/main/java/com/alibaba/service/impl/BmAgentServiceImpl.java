package com.alibaba.service.impl;

import com.alibaba.dao.BmAgentDao;
import com.alibaba.entity.BmAgent;
import com.alibaba.service.BmAgentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BmAgentServiceImpl implements BmAgentService {
    @Autowired
    private BmAgentDao bmAgentDao;

    @Override
    public List<BmAgent> getAll() {
        /**设置分页规则
         * 参数说明
         * 第一个参数：当前第几页
         * 第二个参数：每页显示多少条
         */
        PageHelper.startPage(1,1);
        //去数据库查询
        List<BmAgent> list = bmAgentDao.selectBmAgent();
        //将数据交给插件处理
        PageInfo<BmAgent> info = new PageInfo<>(list);
        //获取分页之后的数据
        List<BmAgent> infoList = info.getList();
        for (BmAgent bmAgent:infoList) {
            System.out.println(bmAgent);
        }
        //获取总条数
        System.out.println(info.getTotal());
        return infoList;
    }
}
