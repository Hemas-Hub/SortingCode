/**
 * Created by hema on 4/6/16.
 */
public class BubbleSort{

    public static void main (String[] args){
        BubbleSort bSort = new BubbleSort();
        int[] input = new int[]{14,33,27,35,10};
        input = bSort.sort(input);
        for(int i=0;i<input.length;i++){
            System.out.print(input[i]+"\t");
        }
    }

    int[] sort (int[] array){
        for(int i=0;i<array.length;i++){
            boolean swapped = false;
            for(int j=0;j<array.length-1;j++){
                if(array[j] > array[j+1]){
                    int x = array[j];
                    array[j] = array[j+1];
                    array[j+1] = x;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return array;
    }
}