package com.whxh.service;

import com.github.pagehelper.PageHelper;
import com.whxh.entity.Emp;
import com.whxh.mapper.EmpMapper;
import com.whxh.util.Params;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public Emp SelOne(int id) {
        return empMapper.SelOne(id);
    }

    @Override
    public List<Emp> SelEmpAll(Params params) {
        if (params.getPageNum()==0){
            params.setPageNum(1);
    }
        PageHelper.startPage(params.getPageNum(),params.getPageSize());
        return empMapper.SelEmpAll(params);
    }

    @Override
    public int UpdateOne(Emp emp) {
        return empMapper.UpdateOne(emp);
    }

    @Override
    public int InsertOne(Emp emp) {
        return empMapper.InsertOne(emp);
    }

    @Override
    public int DeleteOne(int id) {
        return empMapper.DeleteOne(id);
    }
}
