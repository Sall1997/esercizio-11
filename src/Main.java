/*ESERCIZIO 11
(Prima parte)
Define a testing class with a main() method where you:
 -Create a not mutable List of strings called cityNames using asList()
    that you populate with 3 city names
 -Try to add a 4th city name at the end of the List
 -If you get an exception, try to understand why and eventually comment the faulty code
 -Try to change the 2nd item of the array,
    entering the value Tegucigalpa.
-print the content of cityNames

(Seconda parte)
Define a mutable empty List of strings called kingsOfRome
 -Insert the names of the 7 kings of Rome into the mutable list
 -Print the content of kingsOfRome
 -Convert kingsOfRome into an array called kingsOfRomeArray,
    using new String[0] to determine the type of the array
 -Change the value of the 7th king in kingsOfRomeArray with the value Lucius Tarquinius Supercar
Print the content of kingsOfRomeArray
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {

                             //prima parte

       String[] cityNames = new String[] {"Palermo", "Messina", "Agrigento"};

       List<String> cityNamesList = Arrays.asList(cityNames);

       //cityNamesList.add("Milano");

        cityNames[1] = "Tegucigalpa";

        System.out.println(cityNamesList);

//___________________________________________________________________________________

                                 //Seconda parte
        System.out.println();

        List<String> kingsOfRome = new ArrayList<>();

        kingsOfRome.add("Romolo");
        kingsOfRome.add("Numa Pompilio");
        kingsOfRome.add("Tullo Ostilio");
        kingsOfRome.add("Anco Marzio");
        kingsOfRome.add("Tarquinio Prisco");
        kingsOfRome.add("Servio Tullio");
        kingsOfRome.add("Tarquinio il Superbo");

        System.out.println(kingsOfRome);
        System.out.println();

        // conversione da List ad Array
        String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);

        kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";

        for (String s : kingsOfRomeArray) {

            System.out.println(s);
        }
    }
}