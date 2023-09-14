import java.util.Scanner;

public class NumberBaseBall {
    public static void main(String[] args) {
        char userChoice = '1';
        Scanner scan = new Scanner(System.in);
        while(userChoice != '2') {
            RandomGenerator computerNum = new RandomGenerator();
            UserNumberInput userNum = new UserNumberInput();
            Comparer compareComputer = new Comparer();
            while(true){
                if(compareComputer.compare(userNum, computerNum)){
                    System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                    userChoice= scan.next().charAt(0);
                    break;
                }else{
                    userNum = new UserNumberInput();
                }
            }
        }
        System.out.println("게임 종료");
    }
}
