package Chapter9Sorts;

/**
 * Created by admin on 2016-02-21.
 */
public class MergeSort {
    public int[] array = {64, 21, 33, 70, 12, 85, 44, 3, 97, 24};

    public MergeSort() {

    }

    public void printArray() {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void sort() {
        mergeSort(array, 0, array.length-1);
    }

    public void mergeSort(int[] array, int lowerBound, int higherBound) {
        if(lowerBound >= higherBound) {
            return;
        } else {
            int mid = (lowerBound + higherBound)/2;
            mergeSort(array, lowerBound, mid);
            mergeSort(array, mid + 1, higherBound);
            merge(array, lowerBound, mid, higherBound);

        }
    }

    public void merge(int[] array, int lowerBound, int mid, int higherBound) {
        int[] workspace = new int[(higherBound-lowerBound) + 1];
        int left = lowerBound;
        int right = mid + 1;
        int i = 0;
        while(left <= mid && right <= higherBound) {
            if(array[left] < array[right]) {
                workspace[i++] = array[left++];
            } else {
                workspace[i++] = array[right++];
            }
        }

        if(left <= mid) {
            while(left <= mid) {
                workspace[i++] = array[left++];
            }
        }

        if(right <= higherBound) {
            while(right <= higherBound) {
                workspace[i++] = array[right++];
            }
        }

        for(int j = 0 ; j < workspace.length ; j++ ) {
            array[lowerBound + j] = workspace[j];
        }
    }

    public static void main(String[] args) {
        MergeSort m = new MergeSort();
        m.printArray();
        m.sort();
        System.out.println("-----------------------");
        m.printArray();
    }

}
