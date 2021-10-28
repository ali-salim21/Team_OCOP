import java.util.Scanner;
//import java.util.ArrayList;

public class Team {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //ArrayList rate = new ArrayList();
        System.out.println("this means we are good to go.. \n\n");
        int T = 0;
        int[] N;
        int S = 0;

        System.out.print("Please enter the value of T: ");
        T = in.nextInt();

        /*do{
            System.out.print("Please enter the value of N: ");
            N = new int[in.nextInt()];
            //System.out.println(N.length);
        }while(N.length < 0 && N.length < 101);
        */

        while(T>0) {
            System.out.print("Please enter the value of N: ");
            N = new int[in.nextInt()];
            if(N.length>0 && N.length<101) {
                System.out.print("enter value of S: ");
                S = in.nextInt();
                for(int i = 0; i < N.length; i++){
                    N[i] = in.nextInt();
                }
                //Add the diffrence b/w Ai and S
                for(int n : N) {
                    System.out.println("this is block n");
                    System.out.println(n);                   
                    for(int m : N) {
                        System.out.println("this is block m");
                        System.out.println(m);
                        if(n-m <= S) {
                            System.out.println("this is hired");
                            System.out.println(n);
                            System.out.println(n-m);
                        }   
                    }
                }
            }             
            T--;
        }
        /* do{
            System.out.print("Please enter the value of S: ");
            S = in.nextInt();
        }while(S <= 1 && S <= 100);
        */
        in.close();
    }
}