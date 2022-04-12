/*
// Curso Egg FullStack
 */
package implement;

import entity.PersonEntity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import service.OrchestaService;

/* * @author JulianCVidal
 */
public class OrchestaServiceImplement implements OrchestaService {

    ArrayList<PersonEntity> personsList = new ArrayList();

    //3. Se deben obtener los datos de "Giselle Marshall" e imprimirlos en pantalla
    @Override
    public void returnGiselleValues(ArrayList<PersonEntity> personsList) {
        System.out.println("\nObtener los datos de \"Giselle Marshall\" e imprimirlos en pantalla");
        personsList.stream().filter(person -> person.getName().equals("Giselle Marshall")).forEach(System.out::println);
        separador();
    }

    //4. Se deben obtener los datos para el correo "imperdiet.non@enim.org".
    @Override
    public void returnDataFromMail(ArrayList<PersonEntity> personsList) {
        System.out.println("\nObtener los datos para el correo \"imperdiet.non@enim.org");
        personsList.stream().filter(person -> person.getEmail().equals("imperdiet.non@enim.org")).forEach(System.out::println);
        separador();

    }

    //5. Se deben almacenar en una estructura de datos todos las ciudades para evitar repetidos e imprimir la cantidad.
    @Override
    public void countCities(ArrayList<PersonEntity> personsList) {

        System.out.println("\nAlmacenar en una estructura de datos todos las ciudades para evitar repetidos e imprimir la cantidad :");

        List<String> cityList = personsList.stream().map(person -> person.getCity()).collect(Collectors.toList());

        HashSet<String> cities = new HashSet();

        cities.addAll(cityList);

        System.out.println("The amount of cities is : " + cities.size() + ".");
        separador();

    }

    //6. Se deben contar todos los correos que posean en alguna parte de su dominio la palabra "elite"
    @Override
    public void countMailsWithElite(ArrayList<PersonEntity> personsList) {
        
        long count = personsList.stream().filter(person -> person.getEmail().contains("elit")).count();
        System.out.println("\n Los correos que posean en alguna parte de su dominio la palabra \"elite\" : " + count);
        separador();

    }

    //7. Se deben multiplicar por 3 todos los montos en la colección, e imprimir los mayores a 29000.
    @Override
    public void giveRaiseToEmployees(ArrayList<PersonEntity> personsList) {

        System.out.println("\nMultiplicar por 3 todos los montos en la colección, e imprimir los mayores a 29000:");
        personsList.forEach(person -> person.setAmount(person.getAmount() * 3));
        personsList.stream().filter(person -> person.getAmount() > 29000).forEach(System.out::println);
        separador();
    }

    //8. Calcular el promedio de todos los montos.
    @Override
    public void averageAmountEmployees(ArrayList<PersonEntity> personsList) {

        Double averageAmount = personsList.stream().mapToDouble(person -> person.getAmount()).average().getAsDouble();

        System.out.println("The average of employee's salary is " + averageAmount);
        separador();
    }

    //9. Obtener los datos de la persona con el monto menor.
    @Override
    public void obtainEmployeeDataWithLowestSalary(ArrayList<PersonEntity> personsList) {

        System.out.println("\nDatos de la persona con el monto menor:");
        personsList.stream().sorted((person1, person2) -> person2.getAmount().compareTo(person1.getAmount())).limit(1).forEach(System.out::println);
        separador();
    }

    //10. Obtener los datos de la persona con el monto mayor.
    @Override
    public void obtainEmployeeDataWitHighestSalary(ArrayList<PersonEntity> personsList) {

        System.out.println("\nDatos de la persona con el monto mayor:");
        personsList.stream().sorted((person1, person2) -> person1.getAmount().compareTo(person2.getAmount())).limit(1).forEach(System.out::println);
        separador();
    }

    public void separador() {

        System.out.println("\n-----------------------------------------------\n");

    }

}
