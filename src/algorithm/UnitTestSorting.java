package algorithm;

import org.testng.Assert;



public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArray =   {0, 1, 2, 4, 5, 6, 9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }


        //Now implement Unit test for the soring algorithm
        int[] unSortedArrayIns = {6, 9, 2, 5, 1, 0, 4};
        //apply unsorted array to selectionSort.
        sort.insertionSort(unSortedArrayIns);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArrayIns, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }

        //Now implement Unit test for the soring algorithm
        int[] unSortedArrayBub = {6, 9, 2, 5, 1, 0, 4};
        //apply unsorted array to selectionSort.
        sort.bubbleSort(unSortedArrayBub);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArrayBub, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }




    }
}
