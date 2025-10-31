//WAP to find the sum of diagonal elements
public class Diagonal {
    public static void cross(int matrix[][]){
        //primary matrix
        int primary_diagonal=0;
        int seccondary_diagonal=0;
        for (int i=0;i<=matrix.length-1;i++){
            for (int j=0;j<=matrix.length-1;j++){
                if (matrix[i]==matrix[j]){
                    primary_diagonal = primary_diagonal + matrix[i][j];
                }
            }
        
            

            }
        for (int i=0;i<matrix.length;i++){
            
            seccondary_diagonal = seccondary_diagonal + matrix[i][matrix.length-1-i];
            
            
        }
        System.out.println("The Sum of elemnts across Primary Diagonal: "+primary_diagonal);
        System.out.println("The Sum of elemnts across Secondary Diagonal: "+seccondary_diagonal);
        System.out.print("The sum of diagonal elements of the matrix is: "+(primary_diagonal+seccondary_diagonal));
        
    }
    public static void main(String args[]){
      int matrix[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

      cross(matrix);
    }
}
