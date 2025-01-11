
    public class Misssing {

        public static void printTwoElements(int[] arr) {
            int n = arr.length;
            int missing = (n * (n + 1)) / 2;
            System.out.print("Repeating ");
    
            for (int i = 0; i < n; i++) {
                int absVal = Math.abs(arr[i]);
                if (arr[absVal - 1] > 0) {
                    arr[absVal - 1] = -arr[absVal - 1];
                    missing -= absVal; // subtract unique elements
                } else {
                    System.out.println(absVal);
                }
            }
    
            System.out.println("Missing " + missing);
        }
    
        public static void main(String[] args) {
            int[] arr = { 7, 3, 4, 5, 5, 6, 2 };
            printTwoElements(arr);
        }
    }

