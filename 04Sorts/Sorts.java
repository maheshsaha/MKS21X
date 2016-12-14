public class Sorts{
    /**EDIT THIS METHOD TO MATCH YOUR NAME 
     */
    public static String name(){
	return "09.Saha.Mahesh"; 
    }
    
    /**Selection sort of an int array. 
     *Upon completion, the elements of the array will be in increasing order.
     *@param data  the elements to be sorted.
     */
    public static void selectionSort(int[] data){
	int index = 0;
	while(index < data.length-1){
	    int min = data[index];
	    int tempmin = index;
	    for (int j = index+1; j < data.length; j++){
		if (min > data[j]){
		    min = data[j];
		    tempmin = j;
		}
	    }
	    int replace = data[index];
	    data[tempmin] = replace;
	    data[index] = min;
	    index++;
	}
    }
}
