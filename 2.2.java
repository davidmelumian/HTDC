class BookStore{
String author ;
String title;
double price;
int year;

BookStore (String author, String title, double price, int year) {
this.author = author;
this.title = title;
this.price = price;
this.year = year;
}}

class BookExamples {
BookStore var1= new BookStore ("Daniel Defoe","Robinson Crusoe",15.50,1719);
BookStore var2= new BookStore ("Joseph Conrad","Heart of Darkness",12.80,1902);
BookStore var3= new BookStore ("Pat Conroy", "Beach Music", 9.50,1996);
BookExamples () {}
}