package dog.senaky.demo.springauthorizationserverdemo.usercontext;


import dog.sneaky.demo.sharedkernel.oss.OssClient;
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
    private final OssClient ossClient;

    @SneakyThrows
    @PostMapping("/upload/file")
    public String upload(MultipartFile file){
        ossClient.putObject(file.getInputStream(), "test.jpg");
        return "ok";
    }
}
