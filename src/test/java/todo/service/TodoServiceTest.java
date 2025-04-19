package todo.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import todo.common.exception.PastDueDateException;
import todo.entity.Todo;
import todo.repository.TodoRepository;

import java.time.LocalDate;

/**
 * packageName    : todo.service
 * fileName       : TodoServiceTest
 * author         : AngryPig123
 * date           : 25. 4. 19.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 4. 19.        AngryPig123       최초 생성
 */
class TodoServiceTest {

    private final TodoService todoService = new TodoService(new TodoRepository());

    @Test
    public void 할_일_등록_테스트_성공() {

        //  given
        Todo todo = new Todo("저녁 먹기", LocalDate.now().plusMonths(1));

        //  when
        Todo result = todoService.registerTodo(todo);

        //  then
        Assertions.assertNotNull(result);
        Assertions.assertEquals(todo.getTask(), result.getTask());
        Assertions.assertEquals(todo.getLocalDate(), result.getLocalDate());

    }

    @Test
    public void 할_일_등록_테스트_실패_일정_지남() {

        //  given
        Todo todo = new Todo("저녁 먹기", LocalDate.now().minusMonths(1));

        //  when
        PastDueDateException pastDueDateException = Assertions.assertThrows(
                PastDueDateException.class,
                () -> todoService.registerTodo(todo)
        );

        //  then
        Assertions.assertNotNull(pastDueDateException);
        Assertions.assertEquals("할 일 수행 날짜는 현재 날짜보다 크거나 같아야 합니다.", pastDueDateException.getMessage());

    }

}
