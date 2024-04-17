package com;

import java.util.logging.Logger;

public class BookMain {
    public static void main(String[] args) {
        Logger.getLogger("I am going to retrieve a book which returns null object");
        Logger.getLogger("A customised error will be thrown");

        try{

            Object book = BookMethods.prepareBook();
            Logger.getLogger("The book prepared is:" + book);

        }
        catch (NullResponseException ex){
            System.out.println("An error occurred: " + ex.getMessage());
           
        }
    }
    
}
