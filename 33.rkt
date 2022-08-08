#lang profj/beginner
class BookStore {
Author author ;
String title;
double price;
int year;

BookStore (Author author, String title, double price, int year) {
this.author = author;
this.title = title;
this.price = price;
this.year = year;
}}

class Author {
String name;
String surname;       
int  year;

Author (String name,String surname, int year){
this.name = name;
this.surname = surname;    
this.year = year;
}}

class BookExamples {
Author a1 = new Author ("Daniel","Defoe", 1660);
Author a2 = new Author ("Joseph", "Conrad", 1857);
Author a3 = new Author ("Pat", "Conroy", 1945);
BookStore var1= new BookStore (this.a1,"Robinson Crusoe",15.50,1719);
BookStore var2= new BookStore (this.a2,"Heart of Darkness",12.80,1902);
BookStore var3= new BookStore (this.a3, "Beach Music", 9.50,1996);
BookExamples () {}
}