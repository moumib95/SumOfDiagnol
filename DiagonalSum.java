package com.inmobi.battleship;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int rowCount, colCount;
    System.out.println("Enter the number of rows");
    rowCount = sc.nextInt();
    System.out.println("Enter the number of columns");
    colCount = sc.nextInt();
    int[][] mat = new int[rowCount][colCount];
    System.out.println("Enter the elements of matrix") ;
    for(int i = 0 ; i < rowCount; i++) {
      for(int j = 0; j < colCount; j++) {
        mat[i][j] = sc.nextInt();
      }
    }

    System.out.println("Entered Matrix is :" );

    for(int i = 0; i < rowCount; i++) {
      for(int j = 0; j < colCount; j++) {
        System.out.print(mat[i][j]+"\t");
      }
      System.out.println("");
    }

    int sum = 0;
    if (rowCount == colCount) {
      for (int i = 0; i < rowCount; i++) {
        for (int j = 0; j < colCount; j++) {
          if (i == j || (i + j) == rowCount - 1) {//this condition checks for first diagonal and second diagonal in square matrix
            sum = sum + mat[i][j];
          }
        }
      }
    } else {
      System.out.println("Given Matrix is not a square matrix. Calculating sum for primary diagonal of rectangular matrix");
      for (int i = 0; i < rowCount; i++) {
        for (int j = 0; j < colCount; j++) {
          if (i == j) {//this condition checks for first diagonal
            sum = sum + mat[i][j];
          }
        }
      }
    }

    System.out.print("SUM of DIAGONAL elements of the matrix = "+ sum) ;
  }
}
