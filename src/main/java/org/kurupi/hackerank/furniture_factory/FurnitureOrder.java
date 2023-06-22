package org.kurupi.hackerank.furniture_factory;

import java.util.HashMap;

public class FurnitureOrder implements FurnitureOrderInterface {
   private final HashMap<Furniture, Integer> order
           = new HashMap<>();
   /**
    * Initialize a new mapping of Furniture types to order quantities.
    */
   FurnitureOrder() {
      order.put( Furniture.CHAIR, 0 );
      order.put( Furniture.COUCH, 0 );
      order.put( Furniture.TABLE, 0 );
   }
   
   public void addToOrder(final Furniture type, final int furnitureCount) {
      order.put( type, order.get(type) + furnitureCount );
   }
   
   public HashMap<Furniture, Integer> getOrderedFurniture() {
      // TODO: Complete the method
      return null;
   }
   
   public float getTotalOrderCost() {
      return (float) order.entrySet().stream()
              .mapToDouble( e -> e.getValue()*e.getKey().cost() ).sum();
   }
   
   public int getTypeCount(Furniture type) {
     return order.get(type);
   }
   
   public float getTypeCost(Furniture type) {
      return type.cost() * order.get(type);
   }
   
   public int getTotalOrderQuantity() {
      // TODO: Complete the method
      return -1;
   }
}
