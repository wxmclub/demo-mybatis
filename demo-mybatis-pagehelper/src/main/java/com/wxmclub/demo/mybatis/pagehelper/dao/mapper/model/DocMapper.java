package com.wxmclub.demo.mybatis.pagehelper.dao.mapper.model;

import java.util.List;

/**
 * @author AB053324 WangXiaoMing
 * @version 1.0
 * @date 2017-10-09
 */
public interface DocMapper {

    List<Doc> selectByPageAndSelections();

}
