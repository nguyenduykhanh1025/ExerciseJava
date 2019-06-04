public class Array9 {

    public int binarySearch(int []arr, int start, int stop, int number){
        int mid = (start + stop) / 2;
        if(arr[mid] == number){
            return mid;
        }
        if(start == stop){
            return -1;
        }
        if(arr[mid] < number){
            return binarySearch(arr,mid + 1,stop,number);
        }
        else{
            return binarySearch(arr,start, mid - 1, number);
        }
    };

    public static void main(String []s){
        int arr[] = {2, 3, 4, 10, 40};
        int x = 11;
        System.out.println(new Array9().binarySearch(arr,0,4,10));
    }
}
