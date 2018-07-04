package test.database;

import test.Books;
import test.Test;

import java.util.List;

public interface IDataDAO {
	
	
    public List<Books> booksFetch();

	void insertBook(Books book);

	int editBook(Books book);

	int deleteBook(int id);

	

    
    
}
