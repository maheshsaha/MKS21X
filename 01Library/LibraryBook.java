abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
    private String callNumber;

    public LibraryBook(String a, String t, String i, String c){
	super(a,t,i);
	callNumber = c;
    }
    /**
     * @return callNumber
     */
    public String getCallNumber(){
	return callNumber;
    }

    /**
     * @param callNumber Sets callNumber
     */
    public void setCallNumber(String c){
	callNumber = c;
    }

    abstract void checkout(String patron, String due);

    abstract void returned();
    
    abstract String circulationStatus();
    
    /**
     * Compares the callNumbers of two books
     * @param LibraryBook Object being compared too
     * @return 0 if callNumbers same
     * @return 1 if callNumber of calling book is greater than compared book
     * @return -1 if callNumber of calling book is less than compared book
     */
    public int compareTo(LibraryBook o){
	if (callNumber.equals(o.getCallNumber()))
	    return 0;
	else if (callNumber.compareTo(o.getCallNumber())<0)
	    return -1;
	else
	    return 1;
    }

    /**
     * @return Information on book
     */
    public String toString(){
	return super.toString() + ", " + callNumber;
    }

}
