package exercises.lsn2;
import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList <>();
        numList.add(4);
        numList.add(8);
        numList.add(9);
        numList.add(2);
        numList.add(4);
        numList.add(3);
        numList.add(7);
        int answer = sumEven(numList);
        System.out.println(answer);
    }

    public static int sumEven(ArrayList<Integer> numList){
        int total = 0;
        for(int num : numList){
            if(num %2 == 0){
                total += num;
            }
        }
        return total;
    }
}
