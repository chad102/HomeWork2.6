import java.util.*;

public class Main {
    public static void main(String[] args) {
        ListOperations test = new ListOperations();
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        test.printOddNums(nums);
        test.printEvenNums(nums);
        test.printUniqWords(strings);
        test.duplicateCount(strings);
    }
}