class ReferenceBook extends LibraryBook {
    String collection;

    public ReferenceBook(String a, String t, String i, String c, String col){
	super(a,t,i,c);
	collection = col;
    }

    public String getCol(){
	return collection;
    }

    public void setCol(String col){
	collection = col;
    }

    public void checkout(String patron, String due){
	System.out.println("Cannot check out reference book");
    }
    
    public void returned(){
	System.out.println("reference book could not have been checked out -- return impossible");
    }

    public String circulationStatus(){
	System.out.println("non-circulating reference book");
    }

    public String toString(){
	return super.toString + ", " collection;
    }

    
						 
