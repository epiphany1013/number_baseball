public class Comparer {
    public boolean compare(UserNumberInput uNum, RandomGenerator rNum){
        int index = 0;
        int rIndex = 0;
        int strikeCnt = 0;
        int ballCnt = 0;
//        System.out.println("uNum : "+ uNum.userNumber);
//        System.out.println("RNum : "+ rNum.resultString);
        if((uNum.userNumber).equals(rNum.resultString)){
            System.out.println("3스트라이크");
            return true;
        }else{
            for(int i = 0; i < uNum.userNumber.length(); i++){
                for(int j = 0; j < rNum.resultString.length(); j++){
                    if(uNum.userNumber.charAt(index) == rNum.resultString.charAt(j) && index == j){
                        strikeCnt += 1;
                    }else if(uNum.userNumber.charAt(index) == rNum.resultString.charAt(j)){
                        ballCnt += 1;
                    }
                }
                index += 1;
            }
            System.out.println("strike : " + strikeCnt + " ball : " + ballCnt);
        }
        return false;
    }
}
