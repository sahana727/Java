public class Problemsbasics {

    public static void main(String[] args) {

        int[] value = {50,34,2,80,65,12,7,99};  

        int result = SmallestElement(value);  

        System.out.println("The second smallest element : " + result);
    }

    public static int SmallestElement(int[] arr) {
        
        int n = arr.length;

        int smallest = arr[0];

        int secondSmallest = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;  
                smallest = arr[i];  
            } 

            else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];  
            }
        }

        return secondSmallest;
    }
}