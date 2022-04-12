/*
// Curso Egg FullStack
 */

package implement;

import entity.PersonEntity;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/* * @author JulianCVidal
 */


public class FileService {
    
    
   
    final String ruta = "datos.csv";

    public String[] retornarArchivoString() {

        String[] archivoString;
        String dataTxt = "";
        String dataTxtNew = "";

        try {

            BufferedReader br = new BufferedReader(new FileReader(ruta));

            while ((dataTxt = br.readLine()) != null) {

                dataTxtNew += dataTxt + "\n";

            }

        } catch (IOException e) {

            System.out.println("Error");

        }
        
        dataTxtNew = dataTxtNew.replaceAll("\n", ",");
        archivoString = dataTxtNew.split(",");
        

        return archivoString;
    }

    public ArrayList<PersonEntity> clasificateAtributes(String[] archivoString){
         ArrayList<PersonEntity> personsList = new ArrayList();
         
      String[][] arrayDeArrays = new String[archivoString.length/4][4];
       int k = 0;
       
        for (int i = 0; i < archivoString.length/4; i++) {
            for (int j = 0; j < 4; j++) {
                
                arrayDeArrays[i][j] = archivoString[k];
                
                k++;
            }
        }
        int j =0 ;
        for (int i = 0; i < archivoString.length/4; i++) {
            
            PersonEntity newPerson = new PersonEntity();
            
                        newPerson.setName(arrayDeArrays[i][j]);
            
                        newPerson.setEmail(arrayDeArrays[i][j+1]);
                        
                        
                        newPerson.setCity(arrayDeArrays[i][j+2]);
                       
                        newPerson.setAmount(Integer.parseInt((arrayDeArrays[i][j+3])));
                   
                
                personsList.add(newPerson);
            }
        
        return personsList;
    }
}
