package com.yaskim.todolist.domain.todo;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper; //mybatis 이전 버전- ibatis(원래 버전)

@Mapper  // xml 연결할 수 있다
public interface TodoRepository {
	
	public int save(Todo todo) throws Exception;
	public List<Todo> getTodoListOfIndex(Map<String, Object> map) throws Exception;
}
