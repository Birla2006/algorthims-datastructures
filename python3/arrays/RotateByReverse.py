def leftRotate(arr, d):
    reverseArray(arr, 0, d-1)
    reverseArray(arr, d, len(arr)-1)
    reverseArray(arr, 0, len(arr)-1)

def reverseArray(arr, start, end):
    while(start < end):
        temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp
        start+=1
        end=end-1

def printArray(arr):
    for i in range(0, len(arr)):
        print(arr[i])

arr = [1,2,3,4,5,6,7,8,9]
leftRotate(arr,4)
printArray(arr)

