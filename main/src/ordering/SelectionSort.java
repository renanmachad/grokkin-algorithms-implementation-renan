package ordering;


/**
 * This is a example of implementation of algorithm selection sort
 *
 * @see https://pt.wikipedia.org/wiki/Selection_sort
 */
public class SelectionSort {
    public static void main(String... args) {

        int[] notes = {156, 141, 35, 94, 88, 61, 111};

        System.out.println("Original list: ");
        printNotes(notes);
        System.out.println("Sorted list by higher values: ");

        printNotes(selectionSortHigh(notes));

        System.out.println("Sorted list by low values: ");
        printNotes(selectionSortLow(notes));
    }


    /**
     * Auxiliar method to print itens
     *
     * @param notes
     */
    private static void printNotes(int[] notes) {
        for (int i = 0; i < notes.length; i++) {
            System.out.println("Note: " + notes[i]);
        }
    }




    /**
     * In this function we search for the highest value in the list.
     * To apply this algorithm of sort, is
     * necessary read the inputted list find the highest value
     * and put in a new list to be returned.
     *
     * @param list
     * @return sortedList
     */
    private static int[] selectionSortHigh(int[] list) {
        // use sortHighest
        int[] sortedList = new int[list.length];

        for (int i = 0; i < list.length ; i++) {
            int highest = i;

            for (int j = i ; j < list.length; j++) {
                if (list[j] > list[highest]) {
                    highest = j;
                }
            }

            int temp = list[i];
            list[i] = list[highest];
            list[highest] = temp;

            sortedList[i] = list[i];
        }

        return sortedList;
    }


    /**
     * In this function we search for the lowest value in the list.
     * To apply this algorithm of sort, is
     * necessary read the inputted list find the lowest value
     * and put in a new list to be returned.
     *
     * @param list
     * @return sortedList
     */
    private static int[] selectionSortLow(int[] list) {
        // use sortLowest
        int[] sortedList = new int[list.length];

        for (int i = 0; i < list.length  ; i++) {

            int low = i;

            for( int j = i ; j < list.length; j ++){
                if(list[j] < list[low]){
                    low = j;
                }
            }

            int temp = list[i];
            list[i] = list[low];

            list[low] = temp;
            sortedList[i] = list[i];
        }

        return sortedList;

    }
}