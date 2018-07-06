package test.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import test.Books;


public class BookMapper implements RowMapper<Books> {
	
    
    public Books mapRow(ResultSet row, int i) throws SQLException {
        Books book = new Books();
        book.setId(row.getInt("id"));
        book.setTitle(row.getString("title"));
        book.setAuthor(row.getString("author_id"));
        book.setYear(row.getInt("year"));
        return book;
    }
}
