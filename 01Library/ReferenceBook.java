class ReferenceBook extends LibraryBook {
    String collection;

    public ReferenceBook(String a, String t, String i, String c, String col){
	super(a,t,i,c);
	collection = col;
    }
    /**
     * @return collection col number
     */
    public String getCol(){
	return collection;
    }

    /**
     * @param collectionNumber The col number of the book
     */
    public void setCol(String col){
	collection = col;
    }

    /**
     * @print Cannot check out reference book
     */    
    public void checkout(String patron, String due){
	System.out.println("Cannot check out reference book");
    }

    /**
     * @print Return impossible
     */    
    public void returned(){
	System.out.println("reference book could not have been checked out -- return impossible");
    }
    
    /**
     * @return Reference book non circulating
     */
    public String circulationStatus(){
        return "non-circulating reference book";
    }

    /**
     * @return Relevant info on book
     */    
    public String toString(){
	return super.toString() + ", "+ collection;
    }
}

    
						 
