package Chapter9Sorts;

/**
 * Bubble Sort O(n^2)
 * Created by admin on 2015-11-08.
 */
public class BubbleSort {

    public static void sort(int[] list) {
        if(list.length == 0 || list == null) { return; }
        for(int i = list.length - 1; i > 1; i-- ) {
             for(int j = 0; j < i; j++) {
                 if(list[j] > list[j + 1]) {
                     int temp = list[j];
                     list[j] = list[j + 1];
                     list[j + 1] = temp;
                 }
             }
        }
    }

    public static void printList(int[] list) {
        for(int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] list = {12,19,11,17,12,19,14,10,10,14};
        printList(list);
        sort(list);
        printList(list);
    }
}
