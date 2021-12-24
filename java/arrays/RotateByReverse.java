package arrays;

public class RotateByReverse {

    void leftRotate(int arr[], int d, int n){
        reverseArray(arr, 0, d-1);
        reverseArray(arr, d, n-1);
        reverseArray(arr, 0, n-1);

    }

    void reverseArray(int arr[], int start, int end){

        int temp;
        while (start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    void printArray(int arr[], int size){
        for (int i = 0; i < size ; i++) {
            System.out.print( arr[i] + " ");
        }
    }

    public static void main(String[] args){
        RotateByReverse rotateByReverse = new RotateByReverse();
        int arr[] = {1,2,3,4,5,6,7,8};
        rotateByReverse.leftRotate(arr, 3, 8);
        rotateByReverse.printArray(arr,8);
    }
}
