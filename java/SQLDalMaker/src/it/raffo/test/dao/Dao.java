package it.raffo.test.dao;

import com.sqldalmaker.DataStore;

import it.raffo.test.dto.Book;
import java.util.List;

/**
 * This class is created by SQL DAL Maker. Don't modify it manually.
 * SQL DAL Maker project web-site: http://sqldalmaker.sourceforge.net
 */
public class Dao {

	protected final DataStore ds;

	public Dao(DataStore ds) {
		this.ds = ds;
	}

	/**
	 * CRUD-Create. The table 'books'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int createBook(Book p) throws Exception {

		String sql = "INSERT INTO books (isbn, author, title) " 
				 + "VALUES (?, ?, ?)";

		return ds.execDML(sql, p.getIsbn(), p.getAuthor(), p.getTitle());
	}

	/**
	 * CRUD-Create. The table 'books'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int createBook(String isbn, String author, String title) throws Exception {

		String sql = "INSERT INTO books (isbn, author, title) " 
				 + "VALUES (?, ?, ?)";

		return ds.execDML(sql, isbn, author, title);
	}

	/**
	 * CRUD-Read. The table 'books'.
	 */
	public List<Book> readBookList() throws Exception {

		String sql = "SELECT * FROM books";

		return ds.queryDtoList(sql, new DataStore.RowHandler<Book>() {

			public Book handleRow(DataStore.RowData rd) throws Exception {
				Book obj = new Book();
				obj.setIsbn(rd.getValue(String.class, "isbn"));
				obj.setAuthor(rd.getValue(String.class, "author"));
				obj.setTitle(rd.getValue(String.class, "title"));
				return obj;
			}

		});
	}

	/**
	 * CRUD-Read. The table 'books'.
	 */
	public Book readBook(String isbn) throws Exception {

		String sql = "SELECT * FROM books WHERE isbn = ?";

		return ds.queryDto(sql, new DataStore.RowHandler<Book>() {

			public Book handleRow(DataStore.RowData rd) throws Exception {
				Book res = new Book();
				res.setIsbn(rd.getValue(String.class, "isbn"));
				res.setAuthor(rd.getValue(String.class, "author"));
				res.setTitle(rd.getValue(String.class, "title"));
				return res;
			}

		}, isbn);
	}

	/**
	 * CRUD-Update. The table 'books'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updateBook(Book p) throws Exception {

		String sql = "UPDATE books SET " 
				 + " author = ?, title = ? " 
				 + "WHERE isbn = ?";

		return ds.execDML(sql, p.getAuthor(), p.getTitle(), p.getIsbn());
	}

	/**
	 * CRUD-Update. The table 'books'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int updateBook(String author, String title, String isbn) throws Exception {

		String sql = "UPDATE books SET " 
				 + " author = ?, title = ? " 
				 + "WHERE isbn = ?";

		return ds.execDML(sql, author, title, isbn);
	}

	/**
	 * CRUD-Delete. The table 'books'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteBook(Book p) throws Exception {

		String sql = "DELETE FROM books WHERE isbn = ?";

		return ds.execDML(sql, p.getIsbn());
	}

	/**
	 * CRUD-Delete. The table 'books'.
	 * Returns the number of affected rows or -1 on error.
	 */
	public int deleteBook(String isbn) throws Exception {

		String sql = "DELETE FROM books WHERE isbn = ?";

		return ds.execDML(sql, isbn);
	}
}