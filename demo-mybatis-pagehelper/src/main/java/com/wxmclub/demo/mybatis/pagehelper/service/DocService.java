package com.wxmclub.demo.mybatis.pagehelper.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wxmclub.demo.mybatis.pagehelper.dao.mapper.model.Doc;
import com.wxmclub.demo.mybatis.pagehelper.dao.mapper.model.DocMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author AB053324 WangXiaoMing
 * @version 1.0
 * @date 2017-10-09
 */
@Service
public class DocService {

    @Autowired
    private DocMapper docMapper;

    public PageInfo<Doc> selectDocByPage1(int currentPage, int pageSize) {
        // PageHelper.startPage后面必须紧跟着要分页的查询方法，否则可能会有不必要的bug
        PageHelper.startPage(currentPage, pageSize);
        List<Doc> docs = docMapper.selectByPageAndSelections();
        return new PageInfo<>(docs);
    }

}
