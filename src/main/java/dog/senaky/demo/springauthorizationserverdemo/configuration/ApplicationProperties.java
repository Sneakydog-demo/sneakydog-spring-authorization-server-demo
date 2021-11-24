package dog.senaky.demo.springauthorizationserverdemo.configuration;


import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Getter
@Component
@ConfigurationProperties("application")
public class ApplicationProperties {

    private WebSecurity security = new WebSecurity();


    public String[] getIgnoringUrls(){
        return getSecurity().getIgnoringUrl().toArray(new String[]{});
    }

    @Getter
    public static class WebSecurity {
        private List<String> ignoringUrl = new ArrayList<>();
    }
}
