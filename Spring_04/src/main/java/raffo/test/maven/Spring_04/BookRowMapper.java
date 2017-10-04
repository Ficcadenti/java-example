package raffo.test.maven.Spring_04;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BookRowMapper implements RowMapper<Book> {

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Book book= new Book();
		book.setIsbn(rs.getString("isbn"));
		book.setAuthor(rs.getString("author"));
		book.setTitle(rs.getString("title"));
		return book;
	}

}
