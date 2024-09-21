import java.util.*;

// TODO Write your Census class and main method here!
public class Census {
    public static void main(String[] args) { 
        System.out.println("Welcome to the Census!");
        System.out.println("Input the ages of the population and we will compute the average age.");
        Scanner age = new Scanner(System.in);
        ArrayList<Double> ageList = new ArrayList<Double>();
        boolean continueInput = true;

        while (continueInput) { //get ages
            System.out.print("Next person's age (negative to quit)? ");
            double num = age.nextDouble();

            
            if (num < 0) { //average the ages
                continueInput = false;

                double sumAge = 0;
                double averageAge = 0;
                for (int i = 0; i < ageList.size(); i++){
                    sumAge = sumAge + ageList.get(i);
                    averageAge = sumAge / ageList.size();
                }
                System.out.println("The average age is " + averageAge);
            }
            else {
                ageList.add(num); //loop getting the ages

            }
        }
    }
}