import java.util.Iterator;
import java.util.NoSuchElementException;

public class superArrayIterator implements Iterator<String>{
    private SuperArray data;
    private int i;

    public superArrayIterator(SuperArray d){
	data = d;
	i = 0;
    }

    public boolean hasNext(){
	return i < data.size();
    }

    public String next(){
	if (hasNext())
	    return data.get(i++);
	else
	    throw new NoSuchElementException();
    }

    public void remove(){
	throw new UnsupportedOperationException();
    }

}
