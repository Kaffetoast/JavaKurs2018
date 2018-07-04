package test.database;

import test.Books;
import test.Test;

import java.util.List;

public interface IDataDAO {
	
	
    public List<Books> booksFetch();

	public void insertBook(Books book);

	public int editBook(Books book);

	int deleteBook(int id);

	List<Books> getSelectedBooks(String search);

	Books getBookById(int id);

	

    
    
}
