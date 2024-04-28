import java.util.*;

public class lessons_1_3_Sort {
    public static void main(String[] args) {
        List<Integer> numbersArrayList = new ArrayList<>(Arrays.asList(53, 223, 91, 1, 27));

        long startTimeArrayList = System.nanoTime();

        Collections.sort(numbersArrayList);

        long endTimeArrayList = System.nanoTime();

        double durationSecondsArrayList = (endTimeArrayList - startTimeArrayList) / 1e9;

        System.out.printf("Время сортировки (ArrayList): %.6f секунд%n", durationSecondsArrayList);

        System.out.println("Отсортированный список (ArrayList):");
        for (int num : numbersArrayList) {
            System.out.print(num + " ");
        }
        System.out.println();

        List<Integer> numbersLinkedList = new LinkedList<>(Arrays.asList(53, 223, 91, 1, 27));

        long startTimeLinkedList = System.nanoTime();

        Collections.sort(numbersLinkedList);

        long endTimeLinkedList = System.nanoTime();

        double durationSecondsLinkedList = (endTimeLinkedList - startTimeLinkedList) / 1e9;

        System.out.printf("Время сортировки (LinkedList): %.6f секунд%n", durationSecondsLinkedList);

        System.out.println("Отсортированный список (LinkedList):");
        for (int num : numbersLinkedList) {
            System.out.print(num + " ");
        }
    }
}
