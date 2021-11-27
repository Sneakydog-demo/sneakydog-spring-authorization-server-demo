package dog.senaky.demo.springauthorizationserverdemo.usercontext;


import lombok.Getter;
import lombok.ToString;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

@Getter
@ToString
public class User implements RowMapper<User> {
    private String userId;
    private String username;
    private String password;

    public User() {
    }

    public User(String userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
    }

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new User(
                rs.getString("user_id"),
                rs.getString("user_name"),
                rs.getString("password")
        );
    }


}
