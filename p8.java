import java.util.Scanner;

/**
 * pascaltriangle
 */
public class pascaltriangle {

    public static void main(String[] args) {
        
       
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int spaces = n;
        int stars = 1;

        for(int i = 0; i<n; i++){
            
            for(int j = 0; j<spaces; j++){
                System.out.print("   ");
                
            }
            
            int icj = 1;
            for(int j = 0; j<stars; j++){
                System.out.print(icj+"    ");
                int icjm1 = icj * (i-j) / (j + 1);
                icj = icjm1;
            }

            spaces--;
            stars++;
            System.out.println();
        }
    }
}