public class BinarySearch {
    public static int BinarySearch(int arr[], int left, int right, int num){
        while(left<=right){
            int mid = (left + right)/2;
            if(arr[mid] == num)
                return mid;
            if(arr[mid] > num)
                right = mid - 1;
            else if(arr[mid] < num)
                left = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
        int num = 6;
        System.out.println("Number "+ num + " is present at index "+BinarySearch(arr,0,arr.length-1,num));
    }
}
