package OtherAlgorithms;

/**
 * Created by admin on 2016-02-22.
 */
public class BinarySearch {
    public int[] array = {2,6,13,21,36,47,63,81,97};
    public BinarySearch() {

    }

    public void binarySearch(int value, int beginIndex, int endIndex) {
        if(beginIndex > endIndex) {
            return;
        }
        int middleIndex = (beginIndex + endIndex)/2;
        if(array[middleIndex] == value) {
            System.out.println("Element exists");
            return;
        } else if(value > array[middleIndex]) {
            binarySearch(value, middleIndex + 1, endIndex);
        } else {
            binarySearch(value, beginIndex, middleIndex -1);
        }
    }

    public static void main(String[] args) {
        BinarySearch s = new BinarySearch();
        s.binarySearch(81, 0, s.array.length -1);
    }
}
