package org.kurupi.hackerank.furniture_factory;

import java.util.HashMap;
import java.util.Map;

public class FurnitureOrder implements FurnitureOrderInterface {
   /**
    * TODO: Create a map of Furniture items to order quantities
    */
   private final HashMap<Furniture, Integer> order
           = new HashMap<>();
   /**
    * Initialize a new mapping of Furniture types to order quantities.
    */
   FurnitureOrder() {
      // TODO: Complete the constructor
      order.put( Furniture.CHAIR, 0 );
      order.put( Furniture.COUCH, 0 );
      order.put( Furniture.TABLE, 0 );
   }
   
   public void addToOrder(final Furniture type, final int furnitureCount) {
      // TODO: Complete the method
      order.put( type, order.get(type) + furnitureCount );
   }
   
   public HashMap<Furniture, Integer> getOrderedFurniture() {
      // TODO: Complete the method
      return null;
   }
   
   public float getTotalOrderCost() {
      // TODO: Complete the method
      return (float) order.entrySet().stream()
              .mapToDouble( e -> e.getValue()*e.getKey().cost() ).sum();
      //return -1.0f;
   }
   
   public int getTypeCount(Furniture type) {
      // TODO: Complete the method
     return order.get(type);
   }
   
   public float getTypeCost(Furniture type) {
      // TODO: Complete the method
      return type.cost() * order.get(type);
   }
   
   public int getTotalOrderQuantity() {
      // TODO: Complete the method
      return -1;
   }
}
