package dog.senaky.demo.springauthorizationserverdemo.configuration;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;


public class ApplicationProperties {
    private final Security security = new Security();

    @Data
    public static class Security {
        private Oauth2 oauth2;
        private List<String> excludeUrls = new ArrayList<>();

        @Data
        public static class Oauth2 {
            private String issuerUrl;

        }
    }
}
