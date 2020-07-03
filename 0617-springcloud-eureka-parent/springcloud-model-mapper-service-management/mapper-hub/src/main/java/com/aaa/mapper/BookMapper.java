package com.aaa.mapper;

import com.aaa.model.Book;

import java.util.List;

/**
 * syh
 */
public interface BookMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Book record);

    Book selectByPrimaryKey(Long id);

    List<Book> selectAll();

    int updateByPrimaryKey(Book record);
}