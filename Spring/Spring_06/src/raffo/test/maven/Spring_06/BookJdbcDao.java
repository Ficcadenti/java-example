package raffo.test.maven.Spring_06;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.support.JdbcDaoSupport;


public class BookJdbcDao extends JdbcDaoSupport implements BookDao {

	//	private JdbcTemplate jdbcTemplate;

	//	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	//		this.jdbcTemplate = jdbcTemplate;
	//	}

	public void insert(Book book) {
		// TODO Auto-generated method stub
		SqlParameterSource parameters = new BeanPropertySqlParameterSource(book);

		getJdbcTemplate().update("insert into books (isbn, author, title) values (:isbn, :author, :title)",
				parameters ); 

	}

	public void update(Book book) {
		// TODO Auto-generated method stub
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		parameters.addValue("isbn", book.getIsbn());
		parameters.addValue("author", book.getAuthor());
		parameters.addValue("title", book.getTitle());

		getJdbcTemplate().update("update books set author = :author, title = :title where isbn = :isbn",
				parameters );

	}

	public void delete(String isbn) {
		// TODO Auto-generated method stub
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		parameters.addValue("isbn", isbn);
		getJdbcTemplate().update("delete from books where isbn = :isbn",
				parameters);

	}

	public Book findByISBN(String isbn) {
		//TODO Auto-generated method stub
		String sql = "select * from books where isbn = ?";
		Book book = (Book) getJdbcTemplate().queryForObject(
				sql, new Object[] { isbn },
				new BeanPropertyRowMapper<Book>(Book.class));
		return book;
//		
//		MapSqlParameterSource parameters = new MapSqlParameterSource();
//		parameters.addValue("isbn", isbn);
//		Book book = (Book) getJdbcTemplate().queryForList(
//				"select * from books where isbn = :isbn",
//				parameters,
//				new BeanPropertyRowMapper<Book>(Book.class)
//				);
//		return book;
		
		
	}

	public List<Book> findAllBooks() {
		// TODO Auto-generated method stub
		String sql = "select * from books";
		List<Book> books = (List<Book>) getJdbcTemplate().query(
				sql, new BeanPropertyRowMapper<Book>(Book.class));
		return books;
	}

	public int bookCount() {
		// TODO Auto-generated method stub
		String sql = "select count(1) from books";
		int rowCount = getJdbcTemplate().queryForObject(sql, Integer.class);
		return rowCount;
	}

}
