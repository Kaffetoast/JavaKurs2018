package test.database;

import org.springframework.jdbc.core.RowMapper;
import test.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TestRowMapper implements RowMapper<Test> {
    @Override
    public Test mapRow(ResultSet row, int i) throws SQLException {
        Test test = new Test();
        test.add("owner", row.getString("owner"));
        test.add("pet", row.getString("pet"));
        test.add("age", row.getString("age"));
        return test;
    }
}
