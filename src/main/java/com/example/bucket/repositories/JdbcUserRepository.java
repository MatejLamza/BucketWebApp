package com.example.bucket.repositories;

import com.example.bucket.domain.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class JdbcUserRepository implements UserRepository {

    private static final String TABLE_NAME = "user";
    private static final String GENERATED_KEY_COLUMN = "id";
    private static final String SELECT_ALL = "SELECT id, name, email, uaci, ects_points FROM student";


    private final JdbcTemplate jdbc;
    private final SimpleJdbcInsert studentInserter;

    public JdbcUserRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
        this.studentInserter = new SimpleJdbcInsert(jdbc)
                .withTableName(TABLE_NAME)
                .usingGeneratedKeyColumns(GENERATED_KEY_COLUMN);
    }

    @Override
    public Set<User> getAllUsers() {
        return Set.copyOf(jdbc.query(SELECT_ALL, this::mapRowToUser));
    }

    @Override
    public Optional<User> insertUser(User user) {
        try {
            Map<String, Object> values = new HashMap<>();
            values.put("name", user.getName());
            user.setId(studentInserter.executeAndReturnKey(values).longValue());
            return Optional.of(user);
        } catch (Exception e) {
            return Optional.empty();
        }
    }


    private User mapRowToUser(ResultSet rs, int rowNum) throws SQLException {
        return new User(
                rs.getString("name"),
                rs.getLong("id")
        );
    }
}
