import java.util.Iterator;

public class superArrayIterator implements Iterator<String>{
    SuperArray data;
    int i;

    public superArray(SuperArray d){
	data = d;
	i = 0;
    }

    public boolean hasNext(){
	return i < data.size() && data.get(i+1) != null;
    }

    public String next(){
	return data.get(i++);
    }

    public void remove(){
	throw new UnsupportedOperationException;
    }

}
