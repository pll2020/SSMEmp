package com.whxh.controller;

import com.github.pagehelper.PageInfo;
import com.whxh.entity.Emp;
import com.whxh.service.EmpService;
import com.whxh.util.Params;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmpController {
    @Autowired
    private EmpService empService;
    //查询一条
    @RequestMapping("/SelOne")
    public String SelOne(Model model,int id){
        Emp empone = empService.SelOne(id);
        model.addAttribute("empone",empone);
        return "UpdateOne";
    }
    //查询所有
    @RequestMapping("/SelEmpAll")
    public String selectempall(Model model, Params params){
        List<Emp> empList = empService.SelEmpAll(params);
        PageInfo<Emp> empPageInfo = new PageInfo<>(empList);
        model.addAttribute("empPageInfo",empPageInfo);
        model.addAttribute("empList",empList);
        model.addAttribute("params",params);
        return "SelectAll";
    }
    //添加一条信息
    @RequestMapping("/InsertOne")
    public String InsertOne(Model model,Emp emp) {
        empService.InsertOne(emp);
        return "redirect:/SelEmpAll";
    }
    //删除一条信息
    @RequestMapping("/DeleteOne")
    public String DeleteOne(int id) {
        empService.DeleteOne(id);
        return "redirect:/SelEmpAll";
    }
    //修改一条信息
    @RequestMapping("/UpdateOne")
    public String UpdateOne(Model model,Emp emp) {
        empService.UpdateOne(emp);
        return "redirect:/SelEmpAll";
    }
}
