package com.kh.practice.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.kh.practice.model.Book;

public class BookController {

	// src/books.obj 파일에 저장
	public void fileSave(Book book) {
		
		
		try(FileOutputStream fos = new FileOutputStream("src/books.obj", true);
					ObjectOutputStream oos = new ObjectOutputStream(fos))	 {
			
			oos.writeObject(book);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
//		String fileName = "src/books.obj";
//		ObjectOutputStream oos = null;
//		
//		try {
//			oos = new ObjectOutputStream(new FileOutputStream(fileName, true));
//
//			oos.writeObject(book);
//			
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				oos.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}

	}

	// src/books.obj 파일에서 데이터 가져오기
	public List<Book> fileRead() {
		List<Book> books = new ArrayList<>();
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			 fis = new FileInputStream("src/books.obj");
						 
			 while(true) {
				 ois = new ObjectInputStream(fis);
				 books.add((Book)ois.readObject());
			 }
		} catch(EOFException e) {
			
		} 	catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} return books;
	
//			System.out.println(ois.readObject());
//			
//			while(true) {
//			try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/books.obj"))) {
//			Book b = (Book) ois.readObject();
//			books.add(b);
//			
//			
//		} catch (EOFException e) {
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} 
//		return books;
//
//	} 

}
}
