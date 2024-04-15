class digit {
    public static void main(String args[])
    {
        int[][] matrix = new int[][] { { 1, 2, 3},{ 4, 5, 6 },{ 7, 8, 9 } };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    

    for (int i = 0; i<matrix.length ; i++)
     {
        for (int j = i; j < matrix.length; j++) 
        {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;

        }
    }
    for (int i = 0; i < 3; i++) // n is the number of rows
    {
        for (int j = i; j < 3; j++) // c is the number of columns
        {
            if (i != j) {
                // swapping elements of the first column with last column
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][3 - j - 1];
                matrix[i][3 - j - 1] = temp;
            }
        }
    }
    

    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
    
}
}

