package org.example.placeFlowers;

public class PlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int emptyPlot = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            //условие, когда садить
                //если i-ый - ноль
                    //trueLeft = (если i-ый эл-нт - начало массива или слева - 0)
                    //trueRight = (если i-ый эл-нт - конец массива или справа - 0)
                    //если trueLeft и trueRight
                        //canCountPlants++
                        //i++;
                //если (canCountPlants >= n) тру
            if(flowerbed[i] == 0) {
                boolean emptyPlotLeft = (i == 0 || flowerbed[i - 1] == 0);
                boolean emptyPlotRight = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);
                if (emptyPlotLeft && emptyPlotRight) {
                    emptyPlot++;
                    i++;
                }
            }
            if (emptyPlot >= n) {
                return true;
            }
        }
        return false;
    }
}
