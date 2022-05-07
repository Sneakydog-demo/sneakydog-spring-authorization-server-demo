package dog.senaky.demo.springauthorizationserverdemo.usercontext;


import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@Slf4j
@RequiredArgsConstructor
@RestController
public class UserProfileController {


    @SneakyThrows
    @PostMapping("/upload/file")
    public String upload(MultipartFile file){
        return "ok";
    }
}
