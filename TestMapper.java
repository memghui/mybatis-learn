package com.mybatis_mapper_menghui_homework05.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.mybatis_mapper_menghui_homework05.mapper.EmpMapper;
import com.mybatis_mapper_menghui_homework05.util.SqlSessionFactoryUtil;
import com.mybatis_mapper_menghui_homework05.vo.EmpVo;



/**
 * 需求：测试类
 * @author 孟辉
 * @version mh.1.1.0
 * @Date 2020年4月21日 下午8:46:05
 * 问题总结：
 */
public class TestMapper {
	/**
	 * 测试模糊查询获取包含对应信息的员工信息
	 * @throws Exception 
	 * 
	 */
	@Test
	public void testGetEmpByName() throws Exception{
		//开启会话
		SqlSession session = SqlSessionFactoryUtil.getSessionutil();
		//获取mapper代理获取接口的代理对象  参数是需要代理的接口
		EmpMapper empMapper = session.getMapper(EmpMapper.class);
		//调用empMapper模糊查询方法
		List<EmpVo> list = empMapper.getEmpByName("R");
		List<EmpVo> list1 = empMapper.getEmpByName("R");
		//输出
		System.out.println("第一次"+list);
		System.out.println("第二次"+list1);
		//关闭
		session.close();
	}
}
