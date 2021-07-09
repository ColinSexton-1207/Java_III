package val;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] list = {2, 9, 5, 4, 8, 1};

        printList(list);
        bubbleSort(list);
    }

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;
        int pass = 0;

        for(int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            pass++;
            for(int i = 0; i < list.length -k; i++) {
                if(list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true;
                }
            }
            System.out.print("Pass " + pass + ": ");
            printList(list);
        }
    }

    public static void printList(int[] list) {
        for (int j : list) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
