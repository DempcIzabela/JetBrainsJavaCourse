
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); //min  inclus
        int b = scanner.nextInt(); //max seed inclus
        int n = scanner.nextInt(); //number of random numbers
        int k = scanner.nextInt(); //numbers from 0 to k exclus
        //int x;
        int[] x;
        int[] y;
        x = new int[n];
        y  = new int[b-a+1];
        int w=0;
        int z=0; //int y = 0;
        //int z = 0;

        for (int i =a; i<=b; i++){  //loop for seed
            Long l = Long.valueOf(i);
            Random random = new Random(l); //seed
            for(int j=0; j<n; j++){ //loop for random numb

                int intervalLength = k; //interval leg
                x[j] = random.nextInt(intervalLength);


                //x = random.nextInt(intervalLength);
                //if (x>y){       //check if it is max
                //  y = x;
                //}
            }

            y[i-a] = Arrays.stream(x)
                    .max()
                    .getAsInt();
            //if(y<z){
            //    z=y;
            //    w=i;
            //}
        }
        //  z = Arrays.stream(y)
        //        .min()
        //      .getAsInt();
        z=y[0];
        for(int m=1; m<(b-a+1);m++){
            if(y[m]<z){
                w=m+a;
                z=y[m];

            }
        }
        System.out.println(w);

        System.out.println(z);


        // write your code here
    }
}
