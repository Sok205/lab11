public class FancyBubbleSorter {

    public void sortStrings(String[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].length() > array[j + 1].length()) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void sortIntegers(Integer[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (countNonZeroDigits(array[j]) > countNonZeroDigits(array[j + 1])) {
                    Integer temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void sortDoubles(Double[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (getDecimalDigits(array[j]) > getDecimalDigits(array[j + 1])) {
                    Double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private int countNonZeroDigits(Integer num) {
        String str = String.valueOf(Math.abs(num));
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c != '0') {
                count++;
            }
        }
        return count;
    }

    private long getDecimalDigits(Double num) {
        String str = String.valueOf(Math.abs(num));
        str = str.replace(".", "");
        return Long.parseLong(str);
    }
}
