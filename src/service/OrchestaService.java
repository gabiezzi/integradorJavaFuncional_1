
package service;

import entity.PersonEntity;
import java.util.ArrayList;

public interface OrchestaService {
    
    public void returnGiselleValues(ArrayList<PersonEntity> personsList);
    public void returnDataFromMail(ArrayList<PersonEntity> personsList);
    public void countCities(ArrayList<PersonEntity> personsList);
    public void countMailsWithElite(ArrayList<PersonEntity> personsList);
    public void giveRaiseToEmployees(ArrayList<PersonEntity> personsList);
    public void averageAmountEmployees(ArrayList<PersonEntity> personsList);
    public void obtainEmployeeDataWithLowestSalary(ArrayList<PersonEntity> personsList);
    public void obtainEmployeeDataWitHighestSalary(ArrayList<PersonEntity> personsList);
    
             
     
}
