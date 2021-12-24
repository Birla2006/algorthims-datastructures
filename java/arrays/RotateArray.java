package arrays;

public class RotateArray {

    void leftRotate(int arr[], int d, int n) {

        for (int i = 0; i < d; i++) {
            leftRotateByOne(arr, n);
        }
    }

    void leftRotateByOne(int arr[], int n) {
        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;
    }

    void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int inputArray[] = {1, 2, 3, 4, 5, 6, 7, 8};

        rotateArray.leftRotate(inputArray, 3, 8);
        rotateArray.printArray(inputArray,8);
    }
}
