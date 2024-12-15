package com.nhclassen.powerpack;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Powerpack {
   private static final Item[] availableItems = new Item[] {
           new Item("Bag of Apples", 5),
           new Item("Trail Mix", 3),
           new Item("Peanut Butter", 2),
           new Item("Bread", 1)
   };

   public static void packBag(Bag bag) throws OverPackingException {
      Arrays.sort(availableItems,Collections.reverseOrder(Comparator.comparingInt(Item::weight)));

      for (Item i : availableItems) {
         if (bag.addOne(i) < 0) {
            throw new OverPackingException(i.name());
         }
      }

      for (Item i : availableItems) {
         bag.addMultiple(i, bag.canHoldQty(i));
      }

   }
}