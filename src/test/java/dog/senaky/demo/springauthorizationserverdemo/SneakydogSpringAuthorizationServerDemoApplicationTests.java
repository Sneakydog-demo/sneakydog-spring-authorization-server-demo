package dog.senaky.demo.springauthorizationserverdemo;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SneakydogSpringAuthorizationServerDemoApplicationTests {

//    @Autowired
//    private PasswordEncoder passwordEncoder;
//    @Autowired
//    private ObjectMapper objectMapper;
//    @Autowired
//    private RegisteredClientRepository registeredClientRepository;
//
//    @Test
//    void contextLoads() {
//
//        System.out.println(objectMapper);
//        System.out.println(passwordEncoder.encode("123456"));
//
//        RegisteredClient registeredClient = RegisteredClient.withId(UUID.randomUUID().toString())
//                .clientId("messaging-client")
//                .clientSecret("{noop}secret")
//                .clientAuthenticationMethod(ClientAuthenticationMethod.CLIENT_SECRET_BASIC)
//                .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
//                .authorizationGrantType(AuthorizationGrantType.REFRESH_TOKEN)
//                .authorizationGrantType(AuthorizationGrantType.CLIENT_CREDENTIALS)
//                .redirectUri("http://127.0.0.1:8080/login/oauth2/code/messaging-client-oidc")
//                .redirectUri("http://127.0.0.1:8080/authorized")
//                .scope(OidcScopes.OPENID)
//                .scope("message.read")
//                .scope("message.write")
//                .clientSettings(ClientSettings.builder().requireAuthorizationConsent(false).build())
//                .build();
//
//        registeredClientRepository.save(registeredClient);
//
//    }

}
