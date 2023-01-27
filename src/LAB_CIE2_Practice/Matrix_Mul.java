package LAB_CIE2_Practice;

class matrix implements Runnable
    {
        int r,c;
        int arr[][];
        int matA[][] = {{1,2},{3,4}};
        int matB[][] = {{1,2},{3,4}};
        int matC[][] = new int[2][2];
        public void run()
        {
            for(int i =0;i<2;i++)
            {
                for(int j=0;j<2;j++)
                {
                    for(int k =0;k<2;k++)
                    {
                        matC[i][j] += matA[i][k] * matB[k][j];
                    }
                }
            }
            System.out.println("after multiplication");
            for(int i=0;i<2;i++)
            {
                for(int j=0;j<2;j++)
                {
                    System.out.print(matC[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
public class Matrix_Mul {
    public static void main(String args[])
    {
        matrix multiply = new matrix();
        
        Thread t = new Thread(multiply);

        t.start();
    }
}