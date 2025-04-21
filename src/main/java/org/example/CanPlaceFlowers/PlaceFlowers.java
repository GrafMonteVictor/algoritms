package org.example.CanPlaceFlowers;

public class PlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int startZero = 0, endZero = 0;
        if (n == 0) {
            return true;
        }
        int countsZero = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                if (countsZero == 0) {
                    startZero = i;
                } else {
                    endZero = i;
                }
                countsZero++;
            } else {
                if (startZero != 0 && flowerbed[startZero - 1] == 1
                        && endZero != flowerbed.length - 1 && flowerbed[endZero + 1] == 1 ) {
                    n = n - (countsZero - 1)/2;
                } else {
                    if (endZero - startZero > 0) {
                        if (countsZero % 2 == 0) {
                            n = n - (countsZero + 1)/2;
                        } else {
                            n = n - (countsZero - 1)/2;
                        }
                    }
                }
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
