public class BubbleSortNaive {

    public static void main(String[] args) {

        int[] intList = {8, 2, 4, 1, 3, 0, 8, 9, 2, 5, 7, 3, 9};

        printList(intList);
        System.out.println();

        int length = intList.length;

        for (int j = 0; j < intList.length - 1; j++) {
            for (int i = 1; i < length; i++) {
                if (intList[i - 1] > intList[i]) {
                    int temp = intList[i];
                    intList[i] = intList[i - 1];
                    intList[i - 1] = temp;
                }
            }
            printList(intList);
            System.out.println();
        }
        printList(intList);

    }

    private static void printList(int[] intList) {
        System.out.print("[ ");
        for (int value : intList)
            System.out.print(value + " ");
        System.out.print("]");
    }
}
