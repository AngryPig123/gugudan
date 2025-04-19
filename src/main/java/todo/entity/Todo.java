package todo.entity;

import java.time.LocalDate;

/**
 * packageName    : todo.entity
 * fileName       : Todo
 * author         : AngryPig123
 * date           : 25. 4. 19.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 4. 19.        AngryPig123       최초 생성
 */
public class Todo {

    private Integer todoId;
    private String task;
    private LocalDate localDate;

    public Todo() {
    }

    public Todo(String task, LocalDate localDate) {
        this.task = task;
        this.localDate = localDate;
    }

    public void addTodoId(Integer todoId) {
        this.todoId = todoId;
    }

    public Integer getTodoId() {
        return todoId;
    }

    public String getTask() {
        return task;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

}
