package com.dyb.controller;

import com.dyb.entity.Student;
import com.dyb.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/stu")
public class StuController {

    @Autowired
    private IStuService stuService;
    @RequestMapping("/list")
    public String getStuList(Model model){

        List<Student> list = stuService.list();
        model.addAttribute("list",list);
        return "list";
    }
    @RequestMapping("/delete")
    public String delete(Integer id){
        stuService.removeById(id);
        return "redirect:/stu/list";
    }
}
