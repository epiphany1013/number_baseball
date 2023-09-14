import java.util.ArrayList;
import java.util.HashSet;

public class RandomGenerator {

    public StringBuffer computerNumber = new StringBuffer("###");
    public String resultString;

    RandomGenerator(){
        int i = 1;
        int lastIndex = computerNumber.length() - 1;
        ArrayList checkDuplication = new ArrayList();
//        while(this.computerNumber.length() != 3){
//        while(this.computerNumber.charAt(2) != '#'){
        while(!Character.isDigit(computerNumber.charAt(lastIndex))){
            int num =(int) (Math.random() * 9 + 1);
            System.out.println(num);
            System.out.println(this.computerNumber.charAt(i-1));
            System.out.println("iterator : " + i);
//           if((char) num != this.computerNumber.charAt(i-1)){
            if(!checkDuplication.contains(num)){
                this.computerNumber.delete(i-1, i);
                this.computerNumber.insert(i-1, num);
                i += 1;
                checkDuplication.add(num);
            }else{
                continue;
            }
        }

        resultString = computerNumber.toString();
        System.out.println(resultString);

    }
//    HashSet<Integer> numberSet = new HashSet<>();
//    RandomGenerator(){
//        while(this.numberSet.size() != 3) {
//            int num =(int) (Math.random() * 9 + 1);
//            this.numberSet.add(num);
//        }
//        System.out.println(numberSet);
//    }
}
