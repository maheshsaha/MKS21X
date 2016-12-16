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
    public static void selectionSort(int[] data){//extra assignment statement, don't need to store value of the min
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
    /**Insertion sort of an int array. 
     *Upon completion, the elements of the array will be in increasing order.
     *@param data  the elements to be sorted.
     */
    public static void insertionSort(int[]data){
	for(int index = 1; index < data.length; index++){
	    for(int j = 0; j < data.length-1; j++){
		if (data[index] < data[j]){
		    int temp = data[j];
		    data[j] = data[index];
		    data[index] = temp;
		}
	    }
	}
    }
    /**Bubble sort of an int array. 
     *Upon completion, the elements of the array will be in increasing order.
     *@param data  the elements to be sorted.
     */
    public static void bubbleSort(int[]data){
    	for(int index = 0; index < data.length - 1; index++){
	    if(data[index]>data[index+1]){
		int temp = data[index];
		data[index] = data[index+1];
		data[index+1] = temp;
	    }
      	}
	int i = 1;
	while(i < data.length){
	    if (data[i-1]>data[i])
	        bubbleSort(data);
	    i++;
	}
    }

    //mr k
    public static void bubbleSorts(int[]data){
	boolean swapped = true;
	for(int end = data.length - 1; end > 0 && swapped; end --){
	    swapped = false;
	    for(int i = 0; i < end; i++){
		if(data[i]>data[i+1]){
		    int temp = data[i];
		    data[i] = data[i+1];
		    data[i+1] = temp;
		    swapped = true;
		}
	    }
	}
    }

    public static void main(String[]arg){
    	int []data = {9,8,7,6,5,4,3,2,1};
        bubbleSort(data);
    	for (int i = 0; i < data.length; i++){
    	    System.out.println(data[i]);
    	}
    }
}
