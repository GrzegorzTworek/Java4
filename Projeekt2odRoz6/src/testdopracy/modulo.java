package testdopracy;

public class modulo {
    public static void main(String[] args) {
        int[] arr = {34, -6, 4, 11, 18, -7, 1};
        for (int  i = 0; i < arr.length; i++) {
            if (arr[1] % 2 == 0) {
                arr[i] = arr[i] % 4;
            } else if (arr[i] < 0) {
                arr[i] += arr[i];
            } else {
                arr[i] = i;
            }

            System.out.println(arr[i]);
        }


    }
}
