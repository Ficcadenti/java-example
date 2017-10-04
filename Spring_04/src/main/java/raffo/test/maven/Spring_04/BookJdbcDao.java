package raffo.test.maven.Spring_04;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class BookJdbcDao implements BookDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insert(Book book) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("insert into books (isbn, author, title) values (?, ?, ?)",
				new Object[] { book.getIsbn(), book.getAuthor(), book.getTitle() }); 

	}

	public void update(Book book) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("update books set author = ?, title = ? where isbn = ?",
				new Object[] { book.getIsbn(), book.getAuthor(), book.getTitle() });

	}

	public void delete(String isbn) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("delete from books where isbn = ?", 
				new Object[] { isbn });

	}

	public Book findByISBN(String isbn) {
		// TODO Auto-generated method stub
		String sql = "select * from books where isbn = ?";
		Book book = (Book) jdbcTemplate.queryForObject(
				sql, new Object[] { isbn },
				new BookRowMapper());
		return book;
	}

	public List<Book> findAllBooks() {
		// TODO Auto-generated method stub
		String sql = "select * from books";
		List<Book> books = (List<Book>) jdbcTemplate.query(
				sql, new BookRowMapper());
		return books;
	}

	public int bookCount() {
		// TODO Auto-generated method stub
		String sql = "select count(1) from books";
		int rowCount = jdbcTemplate.queryForObject(sql, Integer.class);
		return rowCount;
	}

}
