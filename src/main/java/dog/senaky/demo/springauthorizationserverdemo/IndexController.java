package dog.senaky.demo.springauthorizationserverdemo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping({"/", "/index", "/index.html", ""})
    public String index(){
        return "index";
    }
}
