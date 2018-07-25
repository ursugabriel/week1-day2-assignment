import java.util.Random;
import java.util.Scanner;

public class Assignments {

    public void countOccurrences(int arr[], int element){
        int count=0;
        for(int elem:arr){
            if(elem==element){
                count++;
            }
        }
        System.out.println(element +" appears "+ count+" times");
    }

    public void countOccurrences(String arr[], String element){
        int count=0;
        for(String elem:arr){
            if(elem==element){
                count++;
            }
        }
        System.out.println(element +" appears "+ count+" times");
    }

    public void readArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please set the number of elements for the array!");
        int arrayElemNo=scanner.nextInt();
        int array[]=new int[arrayElemNo];
        System.out.println("Please insert the array numbers!");
        String message ="The array is:";
        for(int i=0;i<arrayElemNo;i++){
            array[i]=scanner.nextInt();

            message+=" "+array[i];
        }
        System.out.println(message);
    }

    public void readMatrix(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set the number of rows!");
        int rows= scanner.nextInt();
        System.out.println("Set the number of collumns!");
        int collumns= scanner.nextInt();
        int array[][]=new int[rows][collumns];
        System.out.println("Insert the numbers");
        for(int i=0;i<rows;i++){
            for(int j=0;j<collumns;j++){
                array[i][j]=scanner.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<collumns;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void randomGenerate(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Set the number of rows!");
        int rows= scanner.nextInt();
        System.out.println("Set the number of collumns!");
        int collumns= scanner.nextInt();
        int array[][]=new int[rows][collumns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<collumns;j++){
                array[i][j]=random.nextInt(100);
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<collumns;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }

    public void matrixAddition(int matrix1[][],int matrix2[][]){
        //both matrixes must be the same size
        int newMatrix[][]=new int[matrix1.length][matrix1[0].length];
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[0].length;j++){
                newMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        for(int i=0;i<newMatrix.length;i++){
            for(int j=0;j<newMatrix[0].length;j++){
                System.out.print(newMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void matrixScalarMultiplication(int matrix[][],int scalar){
        int newMatrix[][]=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                newMatrix[i][j]=matrix[i][j]*scalar;
            }
        }
        for(int i=0;i<newMatrix.length;i++){
            for(int j=0;j<newMatrix[0].length;j++){
                System.out.print(newMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void matrixMultiplication(int matrix1[][],int matrix2[][]){
        int newMatrix[][]=new int[matrix1.length][matrix2[0].length];
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix2[0].length;j++){
                for(int k=0;k<matrix1[0].length;k++){
                    newMatrix[i][j]+=matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        for(int i=0;i<newMatrix.length;i++){
            for(int j=0;j<newMatrix[0].length;j++){
                System.out.print(newMatrix[i][j]+" ");
            }
            System.out.println();

        }

    }

    public void arraySearch(int n){
        Random random = new Random();
        boolean found=false;
        int arrayLength = random.nextInt((10-4)+1)+4;
        int array[]=new int[arrayLength];
        for(int i=0;i<arrayLength;i++){
            array[i]=random.nextInt(50);
        }
        System.out.println("The generated array is: ");
        for(int i:array){
            System.out.print(i+" ");
        }

        label:
        for(int j:array){
            if(j==n){
                found=true;
                break label;
            }
            else{
                found=false;
            }
        }
        System.out.println();
        if(found==false){
            System.out.println(n+" was not found in the array!");
        }
        else{
            System.out.println("Breaking out of label! The number was found!");
        }



    }

}
