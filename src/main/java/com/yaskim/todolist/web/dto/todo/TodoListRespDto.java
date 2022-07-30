package com.yaskim.todolist.web.dto.todo;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Builder
@Data

public class TodoListRespDto {
	private int todoCode;
	private String todoContent;
	private int todoComplete;
	private boolean importanceFlag;
	private int totalCount;
	private int incompleteCount;
	private LocalDateTime crateDate;
	private LocalDateTime updateDate;

}
