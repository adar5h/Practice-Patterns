import java.util.Scanner;

public class ApniKakshaP11 {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int spaces = n;
        int stars = 1;
        int num = n;

        for(int i = 0; i<n; i++){

            for(int j = 0; j<spaces; j++){
                System.out.print("   ");
            }

            int cnum = num;

            for(int j = 0; j<stars; j++){
                
                if(i == 0 || j == (stars/2)){
                    System.out.print("0  ");
                }
                else{
                    System.out.print(cnum+"  ");           
                }

                if(j<stars/2){
                    cnum++;
                }else{
                    cnum--;
                }
            }

            spaces--;
            stars += 2;
            num--;
            System.out.println();
        }
    }
}