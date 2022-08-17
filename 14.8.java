class Record {
    String title;
    String author;
    int price ;
    int year;
    Record (String title, String  author, int price, int year ) {
        this.title=title;
        this.author=author;
        this.price=price;
        this.year=year;
    }
}

interface BookStore {
    double salePrice ();
    boolean sameAuthor (String author);
}

class Hardcover implements BookStore {
    Record r;
    int discount;
    String HANDCOVER = "Handcover";
    Hardcover (Record r,int discount){
        this.r=r;
        this.discount=discount;
    }
    double salePrice (){
        return  (this.r.price-(this.r.price*(this.discount/100F)));
    }
    boolean sameAuthor (String a){
        return  (this.r.author).equals(a);
    }
}

class SaleTable implements  BookStore {
    Record r;
    double discount;
    String SALETABLE = "SaleTable";
    SaleTable(Record r,double discount){
        this.r=r;
        this.discount=discount;
    }
    double salePrice (){
        return  (this.r.price-(this.r.price*(this.discount/100F)));
    }
    boolean sameAuthor (String a){
        return  (this.r.author).equals(a);
    }
}

class PaperBack implements  BookStore {
    Record r;
    String PAPERBACK = "PaperBack";

    PaperBack(Record r) {
        this.r = r;
    }
    double salePrice (){
        return 0.00;
    }
    boolean sameAuthor (String a){
        return  (this.r.author).equals(a);
    }
}