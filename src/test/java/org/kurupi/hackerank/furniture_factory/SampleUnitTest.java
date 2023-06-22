package org.kurupi.hackerank.furniture_factory;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@TestMethodOrder( MethodOrderer.MethodName.class )
public class SampleUnitTest {
   private static FurnitureOrderInterface furniture_factory;
   
   @BeforeAll
   static void
   instantiate() {
      furniture_factory = new FurnitureOrder();
   }
   
   @Test void
   _01_getChairCount() {
      assertThat( furniture_factory.getTypeCount( Furniture.CHAIR ), equalTo( 0 ) );
   }
   
   @Test void
   _02_orderFourChairs() {
      furniture_factory.addToOrder(Furniture.CHAIR, 4 );
      assertThat( furniture_factory.getTypeCount(Furniture.CHAIR), equalTo(4));
   }
   
   @Test void
   _03_orderThreeCouches() {
      furniture_factory.addToOrder(Furniture.COUCH, 3 );
      assertThat( furniture_factory.getTypeCount(Furniture.COUCH), equalTo(3));
   }
   
   @Test void
   _04_orderedChairsCost() {
      assertThat( furniture_factory.getTypeCost(Furniture.CHAIR), equalTo(400.0f));
   }
   
   @Test void
   _05_orderedTablesCost() {
      assertThat( furniture_factory.getTypeCost( Furniture.TABLE )
              , equalTo(0.0f));
   }
   
   @Test void
   _06_orderedCouchesCost() {
      assertThat( furniture_factory.getTypeCost( Furniture.COUCH )
              , equalTo(1500.0f));
   }
   
   @Test void
   _07_totalOrderCost() {
      furniture_factory.addToOrder( Furniture.TABLE, 6 );
      assertThat( furniture_factory.getTotalOrderCost()
              , equalTo( 3400.0f )
      );
   }
}
