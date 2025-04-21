package org.example.CanPlaceFlowers;

public class PlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        int countsZero = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                countsZero++;
            } else {
                n = n - (countsZero - 1)/2;
                if (n <= 0) {
                    return true;
                }
                countsZero = 0;
            }
        }
        n = n - (countsZero + 1)/2;
        if (n <= 0) {
            return true;
        }
        return false;
    }
}
