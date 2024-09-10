package GreedyAlgo;

import java.util.*;

public class ChocolaProblem {
    public static void main(String[] args) {
        Integer[] costVer = { 2, 1, 3, 1, 4 };  //Using interface bcz array.sort don't take lemada for premitive types
        Integer[] costHor = { 4, 1, 2 };

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());
        
        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;
        while (h < costHor.length && v < costVer.length) {
            if (costVer[v] <= costHor[h]) { // Horizontal
                cost += (costHor[h] * vp);
                h++;
                hp++;
            } else {
                cost += (costVer[v] * hp);
                v++;
                vp++;
            }
        }
        while (v < costVer.length) {
            cost += (costVer[v] * hp);
            v++;
            vp++;
        }
        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            h++;
            hp++;
        }
        System.out.println("minimum cost to cut choclate into pieces is : " + cost);
    }
}