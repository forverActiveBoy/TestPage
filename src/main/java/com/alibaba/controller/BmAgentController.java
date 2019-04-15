package com.alibaba.controller;

import com.alibaba.entity.BmAgent;
import com.alibaba.service.BmAgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BmAgentController {
    @Autowired
    private BmAgentService bmAgentService;
    @RequestMapping("/selectAll")
    public @ResponseBody List<BmAgent> selectAll(){
        return bmAgentService.getAll();
    }
}
