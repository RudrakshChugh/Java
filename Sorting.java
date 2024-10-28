// BUBBLE SORT - LARGEST ELEMENT AT LAST
// ASCENDING ORDER 
public class Sorting {
    public static void PrintArray(int array[]){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        // Bubble sort
        for (int i=0; i<arr.length-1; i++){ // -1 beacuse last one will be automatically arranged
            for (int j=0;j<arr.length-i-1;j++){  // - i because everytime loop runs one element gets sorted
                if (arr[j]>arr[j+1]){
                    // SWAP
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }
        PrintArray(arr);


        // SELECTION SORT - SMALLEST ELEMENT IN THE FRONT
        int[] array = {5, 6, 8, 1, 2};
        for (int i=0; i<array.length-1; i++){
            int smallest = i;
            for(int j= i+1;j<array.length;j++){
                if ( array[smallest] > array[j]){
                    smallest = j;
                }
            }  
            int tempr = array[smallest];
            array[smallest] = array[i];
            array[i]=tempr;
        }
            for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();


        // INSERTION SORT - SORTING IN PARTS
        int[] array1 = {7,8,3,1,2};
        for (int i=1; i<array1.length; i++){
            int current = array1[i];
            int j = i-1; // LOOP WILL  ONLY RUN IN SORTED ELEMENTS 
            while (j>=0 && current < array[j]){
                array1[j+1] = array1[j];
                j--;                                                     //ERROR
            }
            array1[j+1] = current;  
        }
        PrintArray(array1);
    }
    
}
