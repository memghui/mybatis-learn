package com.mybatis_mapper_menghui_homework05.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 需求：工具类，建立会话工厂，开启会话
 * @author 孟辉
 * @version mh.1.1.0
 * @Date 2020年4月21日 下午8:22:10
 * 问题总结：
 */
public class SqlSessionFactoryUtil {
	/**
	 * 开启会话
	 * @return session
	 * @throws Exception 
	 */
	public static SqlSession getSessionutil() throws Exception{
		//获取配置文件
		String resource = "MybatisConfig.xml";
		//使用资源管理器读取文件信息
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory =
		new SqlSessionFactoryBuilder().build(inputStream);
		//使用会话工厂开启一个会话————进行操作
		SqlSession session = sqlSessionFactory.openSession();
		//返回session
		return session;
	}
}
