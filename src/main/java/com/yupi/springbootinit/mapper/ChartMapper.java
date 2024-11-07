package com.yupi.springbootinit.mapper;

import com.yupi.springbootinit.model.entity.Chart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 10951
* @description 针对表【chart(图表信息表)】的数据库操作Mapper
* @createDate 2024-11-07 12:40:14
* @Entity com.yupi.springbootinit.model.entity.Chart
*/
@Mapper
public interface ChartMapper extends BaseMapper<Chart> {

}




