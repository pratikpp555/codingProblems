import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] array){
        int size = array.length - 1;
        for(int i=0;i<size;i++){
            for(int j=0;j<size-i;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
           int[] array = new int[]{5,3,5,63,45,63,11,44};
           bubbleSort(array);
           Arrays.stream(array).forEach(
                   value -> System.out.println(value)
           );
           }
    }

