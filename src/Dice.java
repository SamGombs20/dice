import java.util.HashMap;
import java.util.Map;

public class Dice {
    //A map that maps each face of the dice to the corresponding frequency.
    static Map<Integer, Integer> dice = new HashMap<>();
    public static void main(String [] args){
        int freq;
        //Adding faces to the map with their corresponding frequencies of 0.
        for (int i=1;i<=6;i++){
            dice.put(i, 0);
        }
        //Rolling the dice 1000 times
        for (int i=1;i<=1000;i++){
            //Random number generation in each roll/iteration
            double randomNum = Math.random();
            //for face 1, the value of frequency is incremented for values [0,1/6)
            if(randomNum>=0.0 && randomNum<1.0/6.0){
                freq = dice.get(1);
                freq++;
                dice.put(1, freq);
            }
            //for face 2, the value of frequency is incremented for values [1/6,2/6)
            else if (randomNum>=1.0/6.0 && randomNum<2.0/6.0) {
                freq = dice.get(2);
                freq++;
                dice.put(2, freq);
            }
            //for face 3, the value of frequency is incremented for values [2/6,3/6)
            else if (randomNum>=2.0/6.0 && randomNum<3.0/6.0) {
                freq = dice.get(3);
                freq++;
                dice.put(3, freq);
            }
            //for face 4, the value of frequency is incremented for values [3/6,4/6)
            else if (randomNum>=3.0/6.0 && randomNum<4.0/6.0) {
                freq = dice.get(4);
                freq++;
                dice.put(4, freq);
            }
            //for face 5, the value of frequency is incremented for values [4/6,5/6)
            else if (randomNum>=4.0/6.0 && randomNum<5.0/6.0) {
                freq = dice.get(5);
                freq++;
                dice.put(5, freq);
            }
            //for face 6, the value of frequency is incremented for values [5/6,1)
            else if (randomNum>=5.0/6.0) {
                freq = dice.get(6);
                freq++;
                dice.put(6, freq);
            }

        }
        //Displaying of the data
        System.out.println("FACE    \t\tFREQUENCY\t\tPERCENTAGE");
        System.out.println("------------------------------------------");
        //Loops through key values,i.e, faces, in the dice map to retrieve their corresponding values, i.e, frequencies
        for (int face : dice.keySet()){
            System.out.print(face+ "\t\t\t\t  " );
            System.out.print(dice.get(face)+"\t\t\t   ");
            System.out.printf("%.2f", dice.get(face)/10.0);
            System.out.println();
        }
        int totalFrequency = 0;
        double totalPercentage=0.00;
        //Summing up the frequencies and percentages.
        for (int freq1: dice.values()){
            totalFrequency+=freq1;
            totalPercentage+=(freq1/10.0);
        }
        System.out.println("-------------------------------------------");
        System.out.print("\t\t\t\t "+totalFrequency+"\t\t\t  ");
        System.out.printf("%.2f\n",totalPercentage);
    }
}
