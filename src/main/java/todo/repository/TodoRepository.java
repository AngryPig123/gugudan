package todo.repository;

import todo.entity.Todo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * packageName    : todo.repository
 * fileName       : TodoRepository
 * author         : AngryPig123
 * date           : 25. 4. 19.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 4. 19.        AngryPig123       최초 생성
 */
public class TodoRepository {

    private final Map<Integer, Todo> todos = new HashMap<>();

    public Todo save(Todo todo) {
        if (isNew(todo)) {
            int maxId = todos.size();
            int todoId = maxId + 1;
            todo.addTodoId(todoId);
            todos.put(todoId, todo);
        } else {
            todos.put(todo.getTodoId(), todo);
        }
        return todo;
    }

    public List<Todo> findAll() {
        return null;
    }

    public Todo findByTodo(Todo todo) {
        return null;
    }

    public void update(Todo todo) {

    }

    public void delete(Todo todo) {

    }

    private boolean isNew(Todo todo) {
        return Objects.isNull(todo.getTodoId());
    }

}
