package com;

import java.util.Objects;

public class BookMethods {

    public static Object prepareBook() throws NullResponseException {
        Object book = getBook();
        if(Objects.isNull(book)){
            //customised message
            // throw new NullResponseException("A null result is returned");

            //default message
            throw new NullResponseException();

        } 

        return book;
    } 

    private static Object getBook(){
        return null;
    }
    
}


