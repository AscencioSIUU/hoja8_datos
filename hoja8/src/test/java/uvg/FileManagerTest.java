package uvg;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

public class FileManagerTest {

     @Test
     public void testReadTXTFile() throws IOException {
          FileManager manager = new FileManager();
          ArrayList<Paciente> pacientes = manager.readTXTFile("/pacientes.txt");
          assertEquals(3, pacientes.size());
  
          Paciente paciente1 = pacientes.get(0);
          assertEquals("María López", paciente1.getNombre());
          assertEquals("fractura de brazo", paciente1.getSintoma());
          assertEquals('B', paciente1.categoriaPrioridad());
        }

}
