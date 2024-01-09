package org.example.service;

import org.example.bean.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryService {
    List<Book> bookList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void showBooks(){
        if(bookList.isEmpty()){
            System.out.println("Kitab yoxdur");
        }else {
            for (int  i = 0 ; i < bookList.size();i++){
                System.out.println(bookList.get(i));
            }
        }
    }

    public void addBook(){
        System.out.println("Kitabin adini daxil edin : ");
        String ad = scanner.nextLine();
        System.out.println("Kitabin yazicisini daxil edin :");
        String yazici = scanner.nextLine();
        Book book = new Book(ad,yazici);
        bookList.add(book);
    }

    public void deleteBook(){
        System.out.println("Silmek istediyininiz kitabin adin daxil edin");
        String ad = scanner.nextLine();
        for(int i = 0;i < bookList.size();i++){
            if(bookList.get(i).getAd().equals(ad)){
                bookList.remove(i);
            }
        }

    }


}
