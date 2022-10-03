package com.company;

import java.util.Arrays;

/*Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
You may assume all four edges of the grid are all surrounded by water.

 */
public class NumberofIslands {
    int res = 0;
    public int numIslands(char[][] grid) {

        int[][] isl = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == '1' && isl[i][j] == 0){
                    res++;
                    isl = fill(isl, grid, i,j, grid[i][j]);
                }
            }
        }

        return res;
    }

    private int[][] fill(int[][] isl, char[][] grid, int i, int j, char col ){
        if (grid[i][j] != col) return isl;
        isl[i][j] = res;
        grid[i][j] = 'A';
        if (i-1>= 0 && grid[i-1][j] == '1') {

            isl = fill(isl, grid, i-1, j, col);

        }
        if (i+1 < grid.length && grid[i+1][j] == '1'){
            isl = fill( isl, grid, i+1, j, col);
        }
        if (j-1>= 0 && grid[i][j-1] == '1'){

            isl = fill( isl, grid, i, j-1, col);
        }
        if (j+1 < grid[0].length && grid[i][j+1] == '1'){

            isl = fill( isl, grid, i, j+1, col);
        }

        return isl;
    }
}
