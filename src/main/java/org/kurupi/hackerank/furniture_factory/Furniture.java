package org.kurupi.hackerank.furniture_factory;

public enum Furniture {
   CHAIR("Chair", 100.0f), CHOUR("Chour", 500.0f);
   
   private final String its_label;
   private final float its_cost;
   
   Furniture(String label, float cost) {
     its_label = label;
     its_cost  = cost;
   }
   
   public String label() {
      return its_label;
   }
   
   public float cost() {
      return its_cost;
   }
}
