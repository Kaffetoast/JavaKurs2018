package test.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import test.Books;
import test.Test;

import java.util.List;

@Transactional
@Repository
public class DataDAO implements IDataDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public DataDAO(){}

    @Override
    public List<Books> booksFetch(){
        String query = "SELECT * FROM books";
        return jdbcTemplate.query(query, new BookMapper());
    }
    
    @Override
    public void insertBook(Books book) {
    	jdbcTemplate.update("INSERT INTO books(author_id, title, year) VALUES(?,?,?)", book.getAuthor(), book.getTitle(), book.getYear());
    	
    }
    
    @Override
    public int editBook(Books book) {
    	String SQL = "UPDATE books SET author = ?, title = ?, year = ? WHERE id = ?";
    	return jdbcTemplate.update(SQL, book.getAuthor(), book.getTitle(), book.getYear());
    }
    
    @Override
    public int deleteBook(int id) {
    	String SQL = "DELTE FROM books WHERE id = "+id+	"";
		return jdbcTemplate.update(SQL);
    	
    }
    
    


}
