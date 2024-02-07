package br.com.ada.spring.todolist.domain;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/todo")
public class TodoController {

    private final TodoItemRepository todoItemRepository;

    public TodoController(TodoItemRepository todoItemRepository){
        this.todoItemRepository = todoItemRepository;
    }


   @GetMapping("/todo-item")
   public void inserirTodoItem() {
       ToDoItem todoItem = new ToDoItem();
       todoItem.setTitulo("Acordar");

       todoItemRepository.save(todoItem);

    }
}
