package todo.service;

import todo.common.exception.PastDueDateException;
import todo.entity.Todo;
import todo.repository.TodoRepository;

import java.time.LocalDate;
import java.util.List;

/**
 * packageName    : todo.service
 * fileName       : TodoService
 * author         : AngryPig123
 * date           : 25. 4. 19.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 4. 19.        AngryPig123       최초 생성
 */
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public Todo registerTodo(Todo todo) {

        // 도메인 규칙 : 할 일 수행 날짜는 현재 날짜보다 크거나 같아야 한다.
        LocalDate currentDate = LocalDate.now();
        LocalDate dueDate = todo.getLocalDate();
        if (dueDate.isBefore(currentDate)) {
            throw new PastDueDateException();
        }

        return todoRepository.save(todo);

    }

    public void completeTodo() {

    }

    public List<Todo> findAllTodos() {
        return null;
    }

}
