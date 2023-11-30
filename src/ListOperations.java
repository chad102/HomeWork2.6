import java.util.*;

public class ListOperations {
    List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

    public void printOddNums(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 != 0) {
                result.add(num);
            }
        }
        System.out.println(result);
    }

    public void printEvenNums(List<Integer> nums) {
        Set<Integer> resultWithoutDuplicates = new HashSet<>(nums);         /// с помощью множества избавимся от дублей
        List<Integer> result = new ArrayList<>(resultWithoutDuplicates);
        for (int i = 0; i < result.size(); i++) {          /// с помощью цикла удаляем нечетные числа
            if (result.get(i) % 2 != 0) {
                result.remove(i);
            }
        }
        Collections.sort(result);   /// сортировка по возрастанию
        System.out.println(result);
    }

    public void printUniqWords(List<String> text) {
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Set<String> resultWithoutDuplicates = new HashSet<>(strings);
        System.out.println(resultWithoutDuplicates);
    }

    public void duplicateCount(List<String> text) {
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Set<Integer> duplicates = new HashSet<>();
        for (String s : strings) {
            duplicates.add(Collections.frequency(strings, s));
        }
        System.out.println(duplicates);
    }
}
