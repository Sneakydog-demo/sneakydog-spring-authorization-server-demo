package dog.senaky.demo.springauthorizationserverdemo.usercontext;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import static com.google.common.collect.ImmutableMap.of;


@Slf4j
@RequiredArgsConstructor
@Repository
public class UserRepository {
    private final NamedParameterJdbcTemplate jdbcTemplate;

    public User loadByUsername(String username) {
        try {
            String sql = "SELECT * FROM users WHERE user_name=:username";
            return jdbcTemplate.queryForObject(sql, of("username", username), new User());
        } catch (EmptyResultDataAccessException e) {
            throw new UsernameNotFoundException(username);
        }
    }

    public void saveOrUpdate(User user) {
        String sql = "INSERT INTO users (user_id, user_name, password)" +
                "  VALUES (:userId, :username, :password) " +
                "  ON DUPLICATE KEY UPDATE user_id=:userId, user_name=:username, password=:password";
        jdbcTemplate.update(sql, of(
                "userId", user.getUserId(),
                "username", user.getUsername(),
                "password", user.getPassword()
        ));
    }


}
