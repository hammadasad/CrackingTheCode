package Chapter9Sorts;

/**
 * Created by admin on 2016-02-22.
 */
public class QuickSort {
    public int[] array = {7,2,1,8,6,3,5,4};

    public QuickSort() {

    }

    public int partitionArray(int startIndex, int endIndex) {
        int i,j, pivotPosition;
        j = startIndex;
        i = startIndex - 1;
        //Choosing pivot as the last element
        pivotPosition = endIndex;
        int pivot = array[pivotPosition];
        int temp;

        while(j < endIndex) {
            if(array[j] < pivot && (j != pivotPosition)) {
                i++;
                temp = array[j];
                try{
                    array[j] = array[i];
                } catch(ArrayIndexOutOfBoundsException e) {
                    //For debugging purposes -- Exit if out of bounds
                    System.out.println("StarIndex is : " + startIndex);
                    System.out.println("j index is: " + j + " and i index is: " + i);
                    System.exit(0);
                }
                array[i] = temp;
                j++;
            } else {
                j++;
            }
        }

        temp = array[i+1];
        array[i+1] = array[j];
        array[j] = temp;
        return i+1;
    }

    public void quickSort(int startIndex, int endIndex) {
        if(startIndex >= endIndex) {
            return;
        }
        int pivotIndex = partitionArray(startIndex,endIndex);
        quickSort(startIndex, pivotIndex - 1);
        quickSort(pivotIndex + 1, endIndex);
    }

    public void printArray() {
        for(int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QuickSort q = new QuickSort();
        q.printArray();
        System.out.println("------------------");
        q.quickSort(0,q.array.length-1);
        q.printArray();
    }
}
