package uvg;

import static org.junit.Assert.*;
import org.junit.Test;

public class VectorHeapTest {
     private VectorHeap<Integer> heap;
     @Test
     public void AddAndRemoveHeapTest(){
          heap.add(2); 
          heap.add(7); 
          heap.add(6); 

          assertEquals(Integer.valueOf(1), heap.getFirst());
          assertEquals(4, heap.size());
     }

     @Test
     public void ClearTest(){
          heap.add(2); 
          heap.add(7); 
          heap.add(6); 

          assertFalse("No debe estar vacío", heap.isEmpty());
          heap.clear();
          assertTrue("Debe de estar vacío", heap.isEmpty());
     }
}
