import java.util.HashMap;
import java.util.Map;

public class Dice {
    static Map<Integer, Integer> dice = new HashMap<>();
    public static void main(String [] args){
        int freq;
        for (int i=1;i<=6;i++){
            dice.put(i, 0);
        }
        for (int i=1;i<=1000;i++){
            double randomNum = Math.random();
            if(randomNum>0.0 && randomNum<=1.0/6.0){
                freq = dice.get(1);
                freq++;
                dice.put(1, freq);
            } else if (randomNum>1.0/6.0 && randomNum<=2.0/6.0) {
                freq = dice.get(2);
                freq++;
                dice.put(2, freq);
            } else if (randomNum>2.0/6.0 && randomNum<=3.0/6.0) {
                freq = dice.get(3);
                freq++;
                dice.put(3, freq);
            } else if (randomNum>3.0/6.0 && randomNum<=4.0/6.0) {
                freq = dice.get(4);
                freq++;
                dice.put(4, freq);
            } else if (randomNum>4.0/6.0 && randomNum<=5.0/6.0) {
                freq = dice.get(5);
                freq++;
                dice.put(5, freq);
            } else if (randomNum>5.0/6.0) {
                freq = dice.get(6);
                freq++;
                dice.put(6, freq);
            }

        }
        System.out.println("FACE    \t\tFREQUENCY\t\tPERCENTAGE");
        System.out.println("------------------------------------------");
        for (int face : dice.keySet()){
            System.out.print(face+ "\t\t\t\t  " );
            System.out.print(dice.get(face)+"\t\t\t   ");
            System.out.printf("%.2f", dice.get(face)/10.0);
            System.out.println();
        }
        int totalFrequency = 0;
        double totalPercentage=0.00;
        for (int freq1: dice.values()){
            totalFrequency+=freq1;
            totalPercentage+=(freq1/10.0);
        }
        System.out.println("-------------------------------------------");
        System.out.print("\t\t\t\t "+totalFrequency+"\t\t\t  ");
        System.out.printf("%.2f\n",totalPercentage);
    }
}
