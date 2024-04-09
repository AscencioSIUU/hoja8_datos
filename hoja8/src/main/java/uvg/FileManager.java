package uvg;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FileManager {
    public ArrayList<Paciente> readTXTFile(String fileName) throws FileNotFoundException, IOException {
        ArrayList<Paciente> arrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(fileName)));

        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length == 3) {
                Paciente paciente = new Paciente(parts[0].trim(), parts[1].trim(), parts[2].trim().charAt(0));
                arrayList.add(paciente);
            }
        }
        
        reader.close();
        return arrayList;
    }
}
