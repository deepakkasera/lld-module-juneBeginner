package MultithreadedMergeSort;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {
        List<Integer> list = List.of(5,1,3,2,7,8,4,6);

        ExecutorService executor = Executors.newCachedThreadPool();

        MergeSorter mergeSorter = new MergeSorter(list, executor) ;
        //List<Integer> sortedList = mergeSorter.call();
        Future<List<Integer>> futureSortedList = executor.submit(mergeSorter);

        List<Integer> sortedList = futureSortedList.get();

        System.out.println(sortedList);
    }
}
