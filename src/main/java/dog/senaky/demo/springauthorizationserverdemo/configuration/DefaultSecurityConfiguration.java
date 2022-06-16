package dog.senaky.demo.springauthorizationserverdemo.configuration;


import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;


@RequiredArgsConstructor
@EnableWebSecurity
class DefaultSecurityConfiguration {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    @Bean
    WebSecurityCustomizer webSecurityCustomizer() {
        return new WebSecurityCustomizer() {
            @Override
            public void customize(WebSecurity web) {
//                web.ignoring().antMatchers(properties.getSecurity().getExcludeUrls().toArray(new String[]{}));
            }
        };
    }

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests(authorizeRequests ->
                        authorizeRequests.antMatchers("/login2", "/login", "/favicon.ico").permitAll()
                                .anyRequest().authenticated()
                ).formLogin(fromlogin -> fromlogin.loginPage("/login").permitAll())
                .csrf(csrfToken -> csrfToken.csrfTokenRepository(new CookieCsrfTokenRepository()));
        return http.build();
    }


}
