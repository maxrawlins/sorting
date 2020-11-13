
package sorting;
import java.util.*;

public class Sorting {

    
    public static void main(String[] args) {
                 Scanner input = new Scanner(System.in);
        //System.out.println("how many numbers would you like to input:");
        int howManyNums;
        int numOfNums=0;
        boolean numCheck=false;
        while (numCheck==false){
            
        try {
            System.out.println("how many numbers would you like to input:");
            numOfNums = input.nextInt();
            numCheck=true;
        } catch (InputMismatchException e) {
            System.out.println("an error occurred: "+e+"\nplease enter an integer instead\n");
            input.next();
          
        }
        
        }
        howManyNums = numOfNums;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int EnteredNum;
        boolean numCheck2;
        for(int i=0;i<howManyNums;i++){
            numCheck2=false;
            while(numCheck2==false){
                try {
                    System.out.println("please enter number "+(i+1)+" of the list:");
                    EnteredNum=input.nextInt();
                    numbers.add(EnteredNum);
                    numCheck2=true;
                } catch (Exception e) {
                    System.out.println("please enter an integer");
                    input.next();
                }
            }
            
        }
     
        for (int k = 0;k<howManyNums;k++){
            for(int l = 0;l<howManyNums;l++){
                if(numbers.get(k)<numbers.get(l)){
                    Collections.swap(numbers, k, l);
                   

                }
            }      
        }
        int total=0;
        
        for (int z=0;z<howManyNums;z++){
            total = total + numbers.get(z);
        }
   
        Sorting numFunctions = new Sorting();
        double average = numFunctions.Average(total,howManyNums);
        System.out.println("\n\n\n"+numbers);
        System.out.println("the average is: "+average+"\nthe minimum is: "+numbers.get(0)+"\nthe maximum is: "+numbers.get(howManyNums-1));
    }
    
    public double Average(double total,double nums){
        double averageNum = total / nums;
        return averageNum;
    }
}
