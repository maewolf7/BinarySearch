import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args)throws FileNotFoundException {

        File file = new File("numbers.txt");
        Scanner scanner = new Scanner(file);
       
        //stores the integers read from file
        ArrayList<Integer> list = new ArrayList<>();

        //reads each int and adds it to the list
        while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                list.add(number);
            }

        int item = 198313119; //item we are searching for

        int low = 0;
        int high = list.size() - 1; 
        int count = 0; //counts the number of operations to find item

        while(low <= high){

            int mid = (low + high) / 2;
            int guess = list.get(mid);
            count ++;

            if (guess == item){
                //if guess is equal to item we found it! 
                System.out.println("item found at position: " + mid);
                System.out.println("operation count: " + count);
                return;
            }
            if(guess > item){
                //guess was too high
                high = mid - 1;
            }
            else{
                //guess was too low 
                low = mid + 1;
            }
           
        }
        //if item doesnt exist
        System.out.println("item not found");
        
    }//end main
}//end class