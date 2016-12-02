public class SuperArray{
    private String[] data;
    private int size;


    //0
    //constructor make an empty superArray should make size 0, 
    //but the data capacity 10.
    public SuperArray(){
	data = new String[10];
	size = 0;
    }

    public SuperArray(int capacity){
	data = new String[capacity];
	size = 0;
	if (capacity < 0)
	    throw new IllegalArgumentException("Negative input");
    }
    
    // get method
    public String get(int index){
	if (index < 0 || index >= size())
	    throw new IndexOutOfBoundsException("Index invalid");
	return data[index];
    }
    
    public int size(){
	return size;
    }


    //1
    /**add the value n to the next available slot in the superArray.
     *this will change the size. This function should always work
     *And will resize the SuperArray if needed.*/
    public boolean add(String n){
	if (data.length > size){
	    data[size] = n;
	    size += 1;
	}
	else{
	    grow();
	    data[size] = n;
	    size += 1;
	}
	return true;
    }


    //2
    /**Resize the data, by making a new array, then copying over elements, use this as your data.
     */


    private void grow(){
	String[]tempary = new String[data.length*2 + 1];
	for (int x = 0; x < size; x++){
	    tempary[x] = data[x];
	}
	data = tempary;
    }


    //3
    /**format the super array like this :   [ 1, 3, 6, 8, 23, 99, -4, 5] 
     *commas between... square bracket start/end and no comma at end.*/
    public String toString(){
	if (size() == 0)
	    return "[]";
	
	String x = "";
	for (int y = 0; y < size-1; y++){
	    x += data[y] + ", ";
	}
	x += data[size-1];
	return "["+x+"]";
    }
    
    //4
    /**format the super array like this :   [ 1, 8, 23, 99, -4, 5, _, _, _, _]   
     *(capacity is 10, but only 6 are used)
     *commas between... square bracket start/end and no comma at end.
     *unused slots should be printed as _ (underscores) */
    public String toStringDebug(){
	String x = "";
	for (int y = 0; y < data.length-1; y++) {
	    if (y >= size) {
		x += "_ , ";
	    }
	    else{
		x += data[y] + ", ";
	    }
	}
	if (data.length > size)
	    x += "_";
	else
	    x += data[size - 1];
	return "["+x+"]";
    }

    //Easy ones:
    public void clear(){
	size = 0;
    }

    public boolean isEmpty(){
	return size == 0;
    }

    public String set(int index, String element){
	if (index < 0 || index >= size())
	    throw new IndexOutOfBoundsException("Invalid index");
	String x = data[index];
	data[index] = element;
	return x;
    }
    
    //Harder ones
    public void add(int index, String element){
	if (data.length <= size)
	    grow();
	if (index < 0 || index > size())
	    throw new IndexOutOfBoundsException("Invalid index");
	if (data.length > size){
	    size += 1;
	    for (int x = size - 1; x > index; x--){
		data[x] = data[x-1];
	    }
	    data[index] = element;
	}
	
    }

    public String remove(int index){
	if (index < 0 || index >= size())
	    throw new IndexOutOfBoundsException("Invalid index");
	String x = data[index];
	if (size > index){
	    size--;
	    for (int y = index; y <= size-1; y++){
		data[y] = data[y+1];
	    }
	    return x;
	}
	else
	    return "";
    }

    public String[] toArray(){
	String[]tempary = new String[size];
	for(int x = 0; x < size; x++){
	    tempary[x] = data[x];
	}
	return tempary;
    }

    public int indexOf(String i){
	int num = -1;
	for(int x = 0; x < size; x++){
	    if (data[x] == i &&  num == -1)
		num = x;
	}
	return num;
    }

    public int lastIndexOf(String i){
	int num = -1;
	for(int x = size-1; x > -1; x--){
	    if(data[x] == i && num == -1)
		num = x;
	}
	return num;
    }

    //public static void main(String[]args){

    //  }	
}
	    
    
	
	    
	    
	
	
