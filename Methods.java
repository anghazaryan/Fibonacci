public class Methods {
public static void main (String[] args){

           String vietnam = "Good morning Vietnam";
	       vietnam = vietnam.replaceAll("\\s", "");
	       System.out.println(vietnam);

	       int[] numbers = {1,2,3,4};
           multiply(numbers);

           int[] fibonacciNumbers = {1, 1, 2, 3, 5, 8, 13, 21};
           System.out.print("\n\n");
           for(int el : fibonacciSequence(21)){
           System.out.print(el + " ");
            }


}
public static void multiply (int [] someNumbersToMultiply){
	for (int number : someNumbersToMultiply){
        int multipliedNumber = number * 3;
        System.out.println(multipliedNumber);
    }
}

//  Write method to return array of numbers of Fibonacci sequence
//  sequenceFactory(5) -> [1, 1, 2, 3, 5]
//  sequenceFactory(8) -> [1, 1, 2, 3, 5, 8, 13, 21]

public static int[] fibonacciSequence(int num){
    int[] result = new int [num];
    result[0] = 1;
    result[1] = 1; 

    for (int i = 2; i < num; i++){
        
        result[i] = result[i - 1] + result[i - 2];
    }

    return result;

}


}
