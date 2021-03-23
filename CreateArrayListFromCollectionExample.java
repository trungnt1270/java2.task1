package task1;
import java.util.ArrayList;
import java.util.List;
public class CreateArrayListFromCollectionExample {
    public static void main(String[] args){
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(6);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);
        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);

        List<Integer> nextFiveNumbers = new ArrayList<>();
        nextFiveNumbers.add(13);
        nextFiveNumbers.add(17);
        nextFiveNumbers.add(19);
        nextFiveNumbers.add(23);
        nextFiveNumbers.add(29);

        firstTenPrimeNumbers.addAll(nextFiveNumbers);


        System.out.println(firstTenPrimeNumbers);
    }
}
