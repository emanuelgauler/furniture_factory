package org.kurupi.hackerank.furniture_factory;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.HashMap;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class PrivateUnitTest {
   private static FurnitureOrder furniture_factory;
   
   @BeforeAll static void
   instantiate() { furniture_factory = new FurnitureOrder(); }
   
   @Test
   void
   _08_orderedNothing() {
      assertThat( furniture_factory.getTotalOrderCost(), equalTo( 0.0f ) );
   }
   
   @Test void
   _09_placeOrders() {
      furniture_factory.addToOrder(Furniture.CHAIR, 10 );
      furniture_factory.addToOrder(Furniture.TABLE, 6 );
      furniture_factory.addToOrder(Furniture.COUCH, 5 );
      
      assertThat( furniture_factory.getTotalOrderCost(), equalTo(5000f ));
   }
   
   @Test void
   _10_validateFurnitureCostAndQuantity() {
      HashMap<Furniture, Integer> orderedFurniture = furniture_factory.getOrderedFurniture();
      
      assertThat( orderedFurniture.values().stream().mapToInt(Integer::intValue).sum()
              , equalTo(21 )
      );
      
      orderedFurniture.keySet().forEach(furniture -> {
         if ("Chair".equals(furniture.label())) {
            assertThat(furniture.cost(), equalTo(100.0f));
         }
         
         if ("Table".equals(furniture.label())) {
            assertThat(furniture.cost(), equalTo(250.0f));
         }
         
         if ("Couch".equals(furniture.label())) {
            assertThat(furniture.cost(), equalTo(500.0f ));
         }
      });
      
      assertThat(furniture_factory.getTypeCount(Furniture.CHAIR), equalTo(10));
      assertThat(furniture_factory.getTypeCost(Furniture.CHAIR), equalTo(1000.0f));
      
      assertThat(furniture_factory.getTypeCount(Furniture.TABLE), equalTo(6 ));
      assertThat(furniture_factory.getTypeCost(Furniture.TABLE), equalTo(1500.0f ));
      
      assertThat( furniture_factory.getTypeCount(Furniture.COUCH), equalTo(5) );
      
      assertThat( furniture_factory.getTypeCost(Furniture.COUCH), equalTo(2500.0f) );
      
      // Validates order size
      assertThat( furniture_factory.getTotalOrderQuantity(), equalTo(21) );
   }
}
