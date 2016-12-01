class CirculatingBook extends LibraryBook {
    String currentHolder;
    String dueDate;

    public CirculatingBook(String a, String t, String i, String c){
	super(a,t,i,c);
	currentHolder = null;
	dueDate = null;
    }
    
    /**
     * @return currentHolder
     */
    public String getCurrentHolder(){
	return currentHolder;
    }

    /**
     * @return dueDate
     */
    public String getDueDate(){
	return dueDate;
    }
    
    /**
     * @param currentHolder the person who took out the book
     */
    public void setCurrentHolder(String c){
	currentHolder = c;
    }

    /**
     * @param dueDate the due date of the book
     */
    public void setDueDate(String d){
	dueDate = d;
    }
    /**
     * Checks out a book
     * @param Patron Person checking out book
     * @param Date Due Date of the book
     */
    
     public void checkout(String p, String d){
	currentHolder = p;
	dueDate = d;
    }

    /**
     * Sets the current holder and dueDate to null
     */
    
    public void returned(){
	currentHolder = null;
	dueDate = null;
    }

    /**
     * Checks whether book is in circulation or not
     * @return Availabile if the book is not taken
     *         The current holder and due date, otherwise
     */
    
    public String circulationStatus(){
	if (currentHolder == null)
	    return "Book available on shelves";
	else
	    return "Current Holder: " + currentHolder + " Due Date: " + dueDate;
    }
    /**
     * @return Information relevant to the book's status
     */
    
    public String toString(){
	return super.toString() +", "+ circulationStatus();
    }

}
       
	  
