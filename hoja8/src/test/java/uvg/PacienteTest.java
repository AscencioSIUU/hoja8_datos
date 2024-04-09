package uvg;

import static org.junit.Assert.*;


import org.junit.Test;

public class PacienteTest {
     @Test 
     public void CompareToTest(){
          Paciente paciente1 = new Paciente("Mario", "Apendisitis", 'E');
          Paciente paciente2 = new Paciente("Roberto", "covid-19", 'A');
          assertTrue(paciente1.compareTo(paciente2) < 0);
          assertTrue(paciente2.compareTo(paciente1) > 0);

     }
     @Test 
     public void ToStringTest(){
          Paciente paciente1 = new Paciente("Mario", "Apendisitis", 'E');
          String expected = "Mario, Apendisitis, E";
          assertEquals(expected, paciente.toString());
     }
}
