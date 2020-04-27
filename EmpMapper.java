package com.mybatis_mapper_menghui_homework05.mapper;

import java.util.List;

import com.mybatis_mapper_menghui_homework05.vo.EmpVo;

/**
 * 需求：使用模糊查询获取包含对应信息的员工信息
 * 		探索一级缓存，编写代码演示一级缓存
 * @author 孟辉
 * @version mh.1.1.0
 * @Date 2020年4月21日 下午8:30:26
 * 问题总结：
 */
public interface EmpMapper {
	//模糊查询获取包含对应信息的员工信息
	public List<EmpVo> getEmpByName(String ename);
}
