/*
// Curso Egg FullStack
 */

package main;

import entity.PersonEntity;
import java.util.ArrayList;
import implement.FileService;
import implement.OrchestaServiceImplement;


//Se requiere: 
//1. Se debe crear la clase Persona con los atributos respectivos. (Debes leer el archivo y guardar cada registro en una lista de tipo Persona) 
// 2. nombre, correo, ciudad y monto. 
//3. Se deben obtener los datos de "Giselle Marshall" e imprimirlos en pantalla
//4. Se deben obtener los datos para el correo "imperdiet.non@enim.org".
//5. Se deben almacenar en una estructura de datos todos las ciudades para evitar repetidos e imprimir la cantidad.
//6. Se deben contar todos los correos que posean en alguna parte de su dominio la palabra "elite"
//7. Se deben multiplicar por 3 todos los montos en la colección, e imprimir los mayores a 29000.
//8. Calcular el promedio de todos los montos.
//9. Obtener los datos de la persona con el monto menor.
//10. Obtener los datos de la persona con el monto mayor.


public class MainIntegrator {

    public static void main(String[] args) {
        
        FileService newServicePerson = new FileService();
          
        
       ArrayList<PersonEntity> personsList =newServicePerson.clasificateAtributes(newServicePerson.retornarArchivoString());
       
       OrchestaServiceImplement newServiceOrchesta = new OrchestaServiceImplement();
       
       newServiceOrchesta.returnGiselleValues(personsList);
       newServiceOrchesta.returnDataFromMail(personsList);
       newServiceOrchesta.countCities(personsList);
       newServiceOrchesta.countMailsWithElite(personsList);
       newServiceOrchesta.giveRaiseToEmployees(personsList);
       newServiceOrchesta.averageAmountEmployees(personsList);
       newServiceOrchesta.obtainEmployeeDataWithLowestSalary(personsList);
       newServiceOrchesta.obtainEmployeeDataWitHighestSalary(personsList);
       
        
       
    }
    
    

}
