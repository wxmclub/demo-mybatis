package com.wxmclub.demo.mybatis.pagehelper.service;

import com.github.pagehelper.PageInfo;
import com.wxmclub.demo.mybatis.pagehelper.dao.mapper.model.Doc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author AB053324 WangXiaoMing
 * @version 1.0
 * @date 2017-10-09
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class DocServiceTest {

    @Autowired
    private DocService docService;

    @Test
    public void test1() {
        PageInfo<Doc> pageInfo = docService.selectDocByPage1(1, 10);

        System.out.println(pageInfo.toString());

    }

}
