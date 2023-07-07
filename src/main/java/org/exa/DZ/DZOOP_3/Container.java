package org.exa.DZ.DZOOP_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Container implements Comparable <Container>{
   private List<Box> list;
   private static int count=1;
   private String id;
   private final int weightContainer;
   private final int sizeBox;
   Container(int maxAmount, int maxWeight){
       this.id="Container № " + count++;
       Random ran =new Random();
        this.list =new ArrayList<>();
        for (int i=0; i<ran.nextInt(maxAmount); i++){
            list.add(new Box(maxWeight));
        }
        this.weightContainer=this.getWeightBox();
        this.sizeBox=list.size();
   }
    public int getSizeBox() {
        return sizeBox;
    }

    public int getWeightContainer() {
        return weightContainer;
    }
    private int getWeightBox(){
       int maxWeight=0;
       for (Box box: this.list) {
           maxWeight+=box.getWeight();
       }
       return maxWeight;
   }
    @Override
    public String toString() {
        return id+" "+"кол. ящиков "+sizeBox+" " ;
    }
    public int compareTo(Container o) {
       if (this.weightContainer == o.getWeightContainer()) {
           return 0;
       }else if (this.weightContainer < o.getWeightContainer()) {
           return -1;
       }else {
            return 1;
       }
    }
}
