public class Book{
    private String author;
    private String title;
    private String ISBN;

    public Book(){
	author = "John Doe";
	title = "The Life of John Doe";
	ISBN = "1-234567-89-0";
    }

    public Book(String a, String t, String i){
	author = a;
	title = t;
	ISBN = i;
    }

    public String getAuthor(){
	return author;
    }

   public String getTitle(){
	return title;
    }

   public String getISBN(){
	return ISBN;
    }

    public void setAuthor(String a){
	author = a;
    }

    public void setTitle(String t){
	title = t;
    }

    public void setISBN(String i){
	ISBN = i;
    }

    public String toString(){
	return getTitle()+", "+getAuthor()+", "+getISBN();
    }

    // public static void main(String[]args){
    // 	Book b = new Book();
    // 	System.out.println(b);
    // 	Book c = new Book("Mahesh Saha","My Life","3-456789-23-0");
    // 	System.out.println(c);
    // }
}


