import java.util.*;
class ArrayRowSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][] arr = new int [m][n];
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Matrix");
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Transpose: ");
        int [][] transpose = new int[n][m];
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                transpose[j][i] = arr[i][j];
               //System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                System.out.println(transpose[i][j]);
               //System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Row Sum: ");
        for(int i =0;i<m;i++){
            int rowSum =0;
            for(int j =0;j<n;j++){
                rowSum += arr[i][j]; 
                
            }
            System.out.println("Row sum of " + (i+1) + ": " + rowSum);   
        }

        System.out.println();
        System.out.println("Column Sum: ");
        for(int j =0;j<n;j++){
            int columnSum = 0;
            for (int i = 0; i < m; i++) {
                columnSum += arr[i][j];    
            }
            System.out.println("Column sum of " + (j+1) + ": " + columnSum);
        }
     
    }
}