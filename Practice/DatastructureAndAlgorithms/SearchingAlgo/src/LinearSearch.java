public class LinearSearch {

    public static int LinearSearch(int[] arr, int num){
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == num)
                return i;
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = new int[] {7,5,2,3,5,6,7,11,22,43,77,55,23,12,5,6};
        int num = 55;
        System.out.println("Number "+ num + " is present at index "+LinearSearch(arr,num));
    }
}
