package Chapter9;

public class Book {
    private String isbn, title;
    private int numOfPages;

    //public Book(){}

    public Book(String isbn, String title, int numOfPages) {
        this.isbn = isbn;
        this.title = title;
        this.numOfPages = numOfPages;
    }
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title == null ) throw new IllegalArgumentException("book title cannot be unknown");
        this.title = title;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        if (numOfPages <1) throw new IllegalArgumentException("number of pages cannot be less than 1");
        this.numOfPages = numOfPages;
    }

    public Book(){

    }


    public String determineType(int pages){

        String type = "No type";

        if (pages > 0 && pages <=15){

            type = "Article";
        }

        else if (pages > 15 && pages <= 50) {
            type = " Research Paper ";

        } else if (pages > 50)
        {
            type = "Book";

        }

        return type;
    }
}
