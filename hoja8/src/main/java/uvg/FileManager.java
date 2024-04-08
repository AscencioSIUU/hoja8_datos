package uvg;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FileManager {
    public ArrayList<String> readTXTFile(String fileName) throws FileNotFoundException, IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(fileName)));

        String line;
        ArrayList<String> arrayList = new ArrayList<String>();

        while (( line = reader.readLine()) != null){
            arrayList.add(line.toString());
        } 

        reader.close();
        return arrayList;
        
    }

}

