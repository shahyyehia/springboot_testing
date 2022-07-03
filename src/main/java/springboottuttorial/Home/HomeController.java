package springboottuttorial.Home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value="/Home")
public class HomeController {
    @GetMapping(value="/")
    public String greetings(){
        return "hi    " +
                "  welcome to this page";
    }
    @GetMapping(value="/{name}")
    public String greetings_with_name(@PathVariable String name){
        return String.format("hello %s welcome to this page",name);
    }
}
