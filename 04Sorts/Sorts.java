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
	    data[tempmin] = data[index];
	    data[index] = min;
	    index++;
	}
    }
    
    public static void insertionSort(int[]data){
	for(int index = 1; index < data.length; index++){
	    for(int j = 0; j < data.length-1; j++)
	    if (data[index] < data[j]){
		int temp = data[j];
		data[j] = data[index];
		data[index] = temp;
	    }
	}
    }
		   
    public static void main(String[]arg){
    	int []data = {3,1,2,3,6,54,7,4,2,8};
     insertionSort(data);
    	for (int i = 0; i < data.length; i++){
    	    System.out.println(data[i]);
    	}
    }
}
