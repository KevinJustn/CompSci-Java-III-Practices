// This program checks to see if an inputted matrix is a solution to a sudoku puzzle.

public class SudokuPuzzle { 
   public static void main (String args[]) { 
   int Err = 0;
      // Array Gathering: Enter matrix below - correct one listed
   int[] a = new int[]{1, 8, 4, 9, 6, 3, 7, 2, 5};
   int[] b = new int[]{5, 6, 2, 7, 4, 8, 3, 1, 9};
   int[] c = new int[]{3, 9, 7, 5, 1, 2, 8, 6, 4};
   int[] d = new int[]{2, 3, 9, 6, 5, 7, 1, 4, 8};
   int[] e = new int[]{7, 5, 6, 1, 8, 4, 2, 9, 3};
   int[] f = new int[]{4, 1, 8, 2, 3, 9, 6, 5, 7};
   int[] g = new int[]{9, 4, 1, 3, 7, 6, 5, 8, 2};
   int[] h = new int[]{6, 2, 3, 8, 9, 5, 4, 7, 1};
   int[] i = new int[]{8, 7, 5, 4, 2, 1, 9, 3, 6};
      // Array Gathering Complete
   for (int w=0;w<9;w++) { 
      if (a[w] == b[w] || b[w] == c[w] || c[w] == d[w] || d[w] == e[w] || e[w] == f[w] || f[w] == g[w] || g[w] == h[w] || h[w] == i[w] ||
          a[w] == c[w] || b[w] == d[w] || c[w] == e[w] || d[w] == f[w] || e[w] == g[w] || f[w] == h[w] || g[w] == i[w] || 
          a[w] == d[w] || b[w] == e[w] || c[w] == f[w] || d[w] == g[w] || e[w] == h[w] || f[w] == i[w] || 
          a[w] == e[w] || b[w] == f[w] || c[w] == g[w] || d[w] == h[w] || e[w] == i[w] || 
          a[w] == f[w] || b[w] == g[w] || c[w] == h[w] || d[w] == i[w] || 
          a[w] == g[w] || b[w] == h[w] || c[w] == i[w] || 
          a[w] == h[w] || b[w] == i[w] ||
          a[w] == i[w]) { 
         Err += 1;
         }
       if ((a[w] >9) || (a[w] <1) || (b[w] >9) || (b[w] <1) || (c[w] >9) || (c[w] <1) ||
           (d[w] >9) || (d[w] <1) || (e[w] >9) || (e[w] <1) || (f[w] >9) || (f[w] <1) ||
           (g[w] >9) || (g[w] <1) || (h[w] >9) || (h[w] <1) || (i[w] >9) || (i[w] <1)) {
         Err += 1;
         }     
   } // Testing Completed 
   if (Err == 0)
      System.out.print("TRUE");
   else
      System.out.print("FALSE");
   }
}