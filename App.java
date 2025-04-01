public class App {
    public static void main(String[] args) throws Exception {
        // define an array of integers
        Integer [] mainArray = {5,5,5,5,5,5};
        // initialize variable to capture smallest value
        int largest = Integer.MIN_VALUE;
        // initialize variable to track the second larges
        int secondLargest = Integer.MIN_VALUE;
        // loop through main array
        for (Integer i : mainArray) {
            // if this number is larger than the "largest"
            if (i > largest) {
                // then secondlargest equals current largest value.
                secondLargest = largest;
                // and now largest equals current number in array
                largest = i;
            }
            // if the current number is larger than second largest and smaller then the largest then
            else if (i > secondLargest && i < largest) {
                // then second largest is now the current number
                secondLargest = i;
            } 
        }
        // if the second larg is still holding the same value OR second largest is the same as largest then
        if (secondLargest == Integer.MIN_VALUE || secondLargest == largest) {
            System.out.println("There is no second largest value.");
        }
        else{
            System.out.println("The second largest is: " + secondLargest);
            System.out.println("The  largest is: " + largest);
        }   
    }
}
