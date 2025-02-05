import java.util.Arrays;
import java.util.Comparator;

public class fractinalknapsack {
    public static void FractionalKnapsack(){
        int val[]={6,10,12};
        int weight[]={10,20,30};
        int W=50;

        Double ratio[][]=new Double[val.length][2];
        for(int i=0;i<val.length;i++){
            ratio[i][0]=(double)i;
            ratio[i][1]=(double)val[i]/weight[i];
        }

        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        int capacity=W;
        double maxVal=0;
        for(int i=ratio.length-1;i>=0;i--){
            int idx=ratio[i][0].intValue();
            if(capacity>=weight[idx]){
                maxVal=maxVal+val[idx];
                capacity=capacity-weight[idx];
            }
            else{
                maxVal=maxVal+(ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }
        System.out.println("Final value:"+maxVal);
    }

    public static void main(String[] args) {

        FractionalKnapsack();
        System.out.println("Lokireddy Chakridhar Reddy-2022601278");
    }
}