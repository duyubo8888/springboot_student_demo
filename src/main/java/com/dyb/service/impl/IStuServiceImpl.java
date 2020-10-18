package com.dyb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dyb.dao.StuMapper;
import com.dyb.entity.Student;
import com.dyb.service.IStuService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IStuServiceImpl extends ServiceImpl<StuMapper,Student> implements IStuService {
    @Override
    public List<Student> getStuList() {
        return null;
    }
}
