package uvg;

import static org.junit.Assert.*;
import org.junit.Test;

public class VectorHeapTest {
     public void testHeap(){
          VectorHeap<Paciente> heap = new VectorHeap<>();
          heap.add(new Paciente("Pepito", "fractura de craneo", 'E'));
          heap.add(new Paciente("Jaime", "retraso mental", 'D'));
          heap.add(new Paciente("Roberto", "deterioro de huesos", 'A'));
          heap.add(new Paciente("Pacheca", "gusanos", 'B'));
          
          
     }
}
