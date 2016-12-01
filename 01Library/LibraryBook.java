abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
    private String callNumber;

    public LibraryBook(String a, String t, String i, String c){
	super(a,t,i);
	callNumber = c;
    }

    public String getCallNumber(){
	return callNumber;
    }

    public void setCallNumber(String c){
	callNumber = c;
    }

    abstract void checkout(String patron, String due);

    abstract void returned();
    
    abstract String circulationStatus();
    

    public int compareTo(LibraryBook o){
	if (callNumber.equals(o.getCallNumber()))
	    return 0;
	else if (callNumber.compareTo(o.getCallNumber())<0)
	    return -1;
	else
	    return 1;
    }

    public String toString(){
	return super.toString() + ", " + callNumber;
    }
}
