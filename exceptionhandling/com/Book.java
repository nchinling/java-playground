package com;

import java.util.Objects;

import com.exception.NullResponseException;

public class Book {
    public Object prepareBook() throws NullResponseException {
        Object book = getBook();
        if(Objects.isNull(book)){
            throw new NullResponseException();
        } 

        return book;
    } 

    private Object getBook(){
        return null;
    }
    
}

