def leftRotate(arr, d, n):
    for i in range(d):
        leftRotateByOne(arr, n)


def leftRotateByOne(arr, n):
    temp = arr[0];
    for i in range(n - 1):
        arr[i] = arr[i + 1]
    arr[n - 1] = temp


def printArray(arr, size):
    for i in range(size):
        print(arr[i], end=" ")


arr = [1, 2, 3, 4, 5, 6, 7, 8]
leftRotate(arr, 4, 8)
printArray(arr, 8)
