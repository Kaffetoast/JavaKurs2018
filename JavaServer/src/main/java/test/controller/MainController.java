package test.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import test.Books;
import test.database.DataDAO;
import test.database.IDataDAO;


@Controller
public class MainController {

    @Autowired
    private IDataDAO dataDao;

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

//    @GetMapping("/")
//    public String welcome(Map<String, Object> model, String query1) {
//
//        model.put("time", new Date());
//        model.put("message", message);
//        return "welcome";
//    }

    @RequestMapping("/foo")
    public String foo(Map<String, Object> model) {
        String result = dataDao.booksFetch().toString();
        model.put("message", result);
        return "welcome";
    }
    
//    @GetMapping("/")
//    public String books(Map<String, Object> model, String query1) {
//		return "books";
//    }
    
    @PostMapping("/addbooks")
    public String insertBook(@ModelAttribute("books") Books books) {
    	dataDao.insertBook(books);
    	return "addbooks";
    }
    
    @GetMapping("/editbooks")
    public String editBook(Map<String, Object> model, String query1) {
		return "editbooks";
    	
    }
    
    @RequestMapping(value = "/editbooks/{id}") 
    public String editBook(Map<String, Object> model, @ModelAttribute("books") Books books, @PathVariable int id) {
    model.put("books", dataDao.getBookById(id));
    return "editbooks";
    
    }
    
    @PostMapping(value = "/savebook")
    public String saveBook(@ModelAttribute("Book")Books book) {
    	dataDao.editBook(book);
    	return "redirect:/books";
    }
    
    @GetMapping("/books")
    public String books(Map<String, Object> model, @RequestParam(name="search", required= false) String search, String query) {
    	
    	if (search == null) {
    		List<Books> books = dataDao.booksFetch();
    		model.put("books", books);
    		} else {
    			List<Books> books = dataDao.getSelectedBooks(search);
    			model.put("books", books);
    		}
    	return "books";
    }
    
    @RequestMapping(value="/deleteBook/{id}", method = RequestMethod.GET)
	public String deleteBook(@PathVariable int id) {
		dataDao.deleteBook(id);
		return "redirect:/books";
	}

}