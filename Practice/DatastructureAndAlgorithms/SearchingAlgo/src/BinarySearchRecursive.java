public class BinarySearchRecursive {

    public static int BinarySearchRecursive(int arr[], int left, int right, int num){
        if(left > right)
            return -1;
        int mid = (left + right)/2;
        if(arr[mid] > num)
            return BinarySearchRecursive(arr,left, mid -1, num);
        else if(arr[mid]< num)
            return BinarySearchRecursive(arr,mid+1, right, num);
        else
            return mid;
    }

    public static void main(String[] args){
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
        int num = 10;
        System.out.println("Number "+ num + " is present at index "+ BinarySearchRecursive(arr,0,arr.length-1,num));
    }
}
