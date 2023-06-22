package org.kurupi.hackerank.furniture_factory;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FurnitureTest {
   
   @Test
   void
   thatFurnitureCopy_return_its_label() {
      
      Furniture chair = Furniture.CHAIR;
      
      assertThat( chair.label(), equalTo("Chair") );
   }
   
   @Test void
   thatFurnitureCopy_return_its_cost() {
      Furniture chour = Furniture.CHOUR;
      
      assertThat(chour.cost(), equalTo( 500.0f ));
   }
}
