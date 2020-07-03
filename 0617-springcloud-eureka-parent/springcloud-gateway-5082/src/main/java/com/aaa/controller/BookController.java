package com.aaa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * syh
 */
@RestController
public class BookController {

    /**
     * syh
     * @return
     */
    @RequestMapping("/all")
    public List<String> selectAllString() {
        List<String> stringList = new ArrayList<>();
        String str = "123456789";
        stringList.add(str);
        return stringList;
    }
}
