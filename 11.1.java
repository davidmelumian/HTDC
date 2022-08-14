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
        }
        boolean currentBook (int year){
            return this.year==year;
        }
        boolean thisAuthor (String s){
            return  this.author.name.concat(this.author.surname).equals(s);}

        boolean sameAuthor (BookStore that){
            return this.author.name.concat(this.author.surname).equals(that.author.name.concat(that.author.surname));
        }
    }

        class Author {
            String name;
            String surname;
            int  year;

            Author (String name,String surname, int year){
                this.name = name;
                this.surname = surname;
                this.year = year;
            }}