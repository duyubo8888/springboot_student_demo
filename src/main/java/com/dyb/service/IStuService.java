package com.dyb.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dyb.entity.Student;

import java.util.List;

public interface IStuService extends IService<Student> {
    List<Student> getStuList();
}
