package dog.senaky.demo.springauthorizationserverdemo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public final class DefaultController {

    @ResponseBody
    @GetMapping({"/", "/index", "/index.html", ""})
    public String index(){
        return "index";
    }

    @ResponseBody
    @GetMapping("/favicon.ico")
    public String faviconico(){
        return "favicon.ico";
    }

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }
}
