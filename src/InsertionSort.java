/**
 * Created by hema on 4/6/16.
 */
public class InsertionSort {
    public static void main (String[] args){
        InsertionSort iSort = new InsertionSort();
        int[] input = new int[]{14,33,27,35,10,19,42,44};
        input = iSort.sort(input);
        for(int i=0;i<input.length;i++){
            System.out.print(input[i]+"\t");
        }
    }

    int[] sort(int[] array){
        for(int i=1;i<array.length;i++){
            for(int j=i;j>0;j--){
                if(array[j-1] > array[j]){
                    int x = array[j-1];
                    array[j-1] = array[j];
                    array[j] = x;
                }
            }
        }
        return array;
    }
}
