package MultithreadedMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {
    private List<Integer> listToSort;
    private ExecutorService executor;

    MergeSorter(List<Integer> listToSort, ExecutorService executor) {
        this.listToSort = listToSort;
        this.executor = executor;
    }

    @Override
    public List<Integer> call() throws Exception {
        //Logic of Merge Sort will come here. -> recursive algo.
        if (listToSort.size() <= 1) {
            return listToSort;
        }

        //Divide the list into 2 parts.
        List<Integer> firstPart = new ArrayList<>();
        List<Integer> secondPart = new ArrayList<>();
        int size = listToSort.size();

        for (int i = 0; i < size/2; i++) {
            firstPart.add(listToSort.get(i));
        }
        for (int i = size/2; i < size; i++) {
            secondPart.add(listToSort.get(i));
        }

        //Sort the firstPart & secondPart parallely in different threads.
        MergeSorter firstPartMergeSorter = new MergeSorter(firstPart, executor);
        MergeSorter secondPartMergeSorter = new MergeSorter(secondPart, executor);

        //ExecutorService executor = Executors.newCachedThreadPool();
        Future<List<Integer>> firstSortedPartFuture = executor.submit(firstPartMergeSorter);
        Future<List<Integer>> secondSortedPartFuture = executor.submit(secondPartMergeSorter);

        List<Integer> firstSortedPart = firstSortedPartFuture.get();
        List<Integer> secondSortedPart = secondSortedPartFuture.get();

        //Merge first and second sorted parts.
        int i = 0;
        int j = 0;
        List<Integer> sortedList = new ArrayList<>();
        while (i < firstSortedPart.size() && j < secondSortedPart.size()) {
            if (firstSortedPart.get(i) < secondSortedPart.get(j)) {
                sortedList.add(firstSortedPart.get(i));
                i++;
            } else {
                sortedList.add(secondSortedPart.get(j));
                j++;
            }
        }

        while (i < firstSortedPart.size()) {
            sortedList.add(firstSortedPart.get(i));
            i++;
        }

        while (j < secondSortedPart.size()) {
            sortedList.add(secondSortedPart.get(j));
            j++;
        }

        return sortedList;
    }
}
