package greedy;

import java.util.Comparator;
import java.util.*;;
public class Knapsack {

    public static void main(String args[]) {

        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };

        int w = 50;

        double ratio[][] = new double[val.length][2];

        for(int i=0;i<val.length;i++){

            ratio[i][0]=i;
            ratio[i][1] = val[i]/(double)weight[i];

        }

        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));


        int capcity=w;
        int finalValue=0;


        for(int i=ratio.length-1;i>=0;i--){
            int idx = (int)ratio[i][0];

            if(capcity>=weight[idx]){
                finalValue+=val[idx];
                capcity-=weight[idx];
            }
            else{
                finalValue+=(capcity*ratio[i][1]);
                capcity=0;
                break;
            }


        }
        System.out.print(finalValue);
    }

}