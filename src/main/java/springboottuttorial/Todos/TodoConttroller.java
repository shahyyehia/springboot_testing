package springboottuttorial.Todos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping (value = "/api/v1/todos")

public class TodoConttroller {
    private List<Todo> data = Arrays.asList(new Todo(1,"first todo","i'll goto the gym"),
            new Todo(2,"Second todo","i'll goto the gym"),
            new Todo(3,"third todo","i'll goto the gym"),
            new Todo(4,"fourth todo","i'll goto the gym"));
    @GetMapping (value = "/")
    public List<Todo> List_todos(){
        return data;
    }
}
