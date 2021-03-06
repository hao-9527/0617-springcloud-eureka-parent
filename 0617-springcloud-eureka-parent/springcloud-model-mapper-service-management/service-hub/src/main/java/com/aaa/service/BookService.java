package com.aaa.service;

import com.aaa.mapper.BookMapper;
import com.aaa.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * syh
 */
@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;

    /**
     * queryBooks
     *
     * @return
     */
    public List<Book> queryBooks() {
        if (null != bookMapper && !"".equals(bookMapper)) {
            return bookMapper.selectAll();
        }
        return null;
    }
}
