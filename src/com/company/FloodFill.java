package com.company;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) return image;
        int aldColor = image[sr][sc];
        image[sr][sc] = color;

            if (sr-1>= 0 && aldColor == image[sr-1][sc]) image = floodFill(image, sr-1, sc, color);
            if (sr+1 < image.length && aldColor == image[sr+1][sc]) image = floodFill(image, sr+1, sc, color);
            if (sc-1 >= 0 && aldColor == image[sr][sc-1]) image = floodFill(image, sr, sc-1, color);
            if (sc+1 < image[0].length && aldColor == image[sr][sc+1]) image = floodFill(image, sr, sc+1, color);


        return image;
    }
}
