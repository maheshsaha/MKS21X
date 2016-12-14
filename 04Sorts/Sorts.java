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
	int min = data[0];
	for (int i = 0; i < data.length-1; i++){
	    for (int j = 1; j < data.length; j++){
		if (data[i] > data[j]){
		    int temp = data[i];
		    data[i] = data[j];
		    data[j] = temp;
		}
	    }
	}
    }

    public static void main(String[]args){
	int[]a = {7,5,6,8,9};
	selectionSort(a);
        System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	System.out.println(a[3]);
	System.out.println(a[4]);
    }
}
