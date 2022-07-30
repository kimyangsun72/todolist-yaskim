package com.yaskim.todolist.domain.todo;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper; //mybatis 이전 버전- ibatis(원래 버전)

@Mapper  // xml 연결할 수 있다
public interface TodoRepository {
	
	public int save(Todo todo) throws Exception;
	
	public List<Todo> getTodoList(Map<String, Object> map) throws Exception;

	public int updateTodoComplete(int Todo_code) throws Exception;
	public int updateTodoImportance(int Todo_code) throws Exception;
	public int updateTodoByTodoCode(Todo todo) throws Exception;
	public int remove(int todo_code) throws Exception;
	
}
