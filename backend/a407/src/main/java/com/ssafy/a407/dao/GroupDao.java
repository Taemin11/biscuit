package com.ssafy.a407.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GroupDao {
	public int removeGroup(Map mem) throws Exception;
	public int updateGroup(Map mem) throws Exception;
}
