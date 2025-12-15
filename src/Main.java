import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Problem 1: Number Adder ===");
        NumberAdder<Integer> intAdder = new NumberAdder<>();
        System.out.println("Integer: 5 + 10 = " + intAdder.add(5, 10));

        NumberAdder<Double> doubleAdder = new NumberAdder<>();
        System.out.println("Double: 3.14 + 2.86 = " + doubleAdder.add(3.14, 2.86));

        NumberAdder<Long> longAdder = new NumberAdder<>();
        System.out.println("Long: 100L + 200L = " + longAdder.add(100L, 200L));

        System.out.println("\n=== Problem 2: Bubble Sort ===");
        BubbleSorter<Integer> intSorter = new BubbleSorter<>();
        Integer[] intArray = {5, 2, 8, 1, 9};
        System.out.println("Before: " + Arrays.toString(intArray));
        intSorter.sort(intArray);
        System.out.println("After: " + Arrays.toString(intArray));

        BubbleSorter<Double> doubleSorter = new BubbleSorter<>();
        Double[] doubleArray = {3.14, 2.71, 1.41, 0.5};
        System.out.println("Before: " + Arrays.toString(doubleArray));
        doubleSorter.sort(doubleArray);
        System.out.println("After: " + Arrays.toString(doubleArray));

        BubbleSorter<String> stringSorter = new BubbleSorter<>();
        String[] stringArray = {"zebra", "apple", "mango", "banana"};
        System.out.println("Before: " + Arrays.toString(stringArray));
        stringSorter.sort(stringArray);
        System.out.println("After: " + Arrays.toString(stringArray));

        System.out.println("\n=== Problem 3: Fancy Bubble Sort ===");
        FancyBubbleSorter fancySorter = new FancyBubbleSorter();

        String[] fancyStrings = {"a", "abc", "ab"};
        System.out.println("Strings by length:");
        System.out.println("Before: " + Arrays.toString(fancyStrings));
        fancySorter.sortStrings(fancyStrings);
        System.out.println("After: " + Arrays.toString(fancyStrings));

        Integer[] fancyIntegers = {100, 203, 15};
        System.out.println("Integers by non-zero digits:");
        System.out.println("Before: " + Arrays.toString(fancyIntegers));
        fancySorter.sortIntegers(fancyIntegers);
        System.out.println("After: " + Arrays.toString(fancyIntegers));

        Double[] fancyDoubles = {1.23, 4.5, 3.14};
        System.out.println("Doubles by decimal value:");
        System.out.println("Before: " + Arrays.toString(fancyDoubles));
        fancySorter.sortDoubles(fancyDoubles);
        System.out.println("After: " + Arrays.toString(fancyDoubles));

        System.out.println("\n=== Problem 4: List Summer ===");
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Integer list: " + intList);
        System.out.println("Sum: " + ListSummer.sum(intList));

        List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.0);
        System.out.println("Double list: " + doubleList);
        System.out.println("Sum: " + ListSummer.sum(doubleList));

        List<Long> longList = Arrays.asList(100L, 200L, 300L);
        System.out.println("Long list: " + longList);
        System.out.println("Sum: " + ListSummer.sum(longList));

        List<Number> mixedList = new ArrayList<>();
        mixedList.add(10);
        mixedList.add(20.5);
        mixedList.add(30L);
        System.out.println("Mixed Number list: " + mixedList);
        System.out.println("Sum: " + ListSummer.sum(mixedList));
    }
}
