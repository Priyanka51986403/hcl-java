import java.util.*;
public class State2
{ 
public static void main(String[] args)
{
Country countries= new Country();
countries.storeCountryNames("India");
countries.storeCountryNames("Pakistan");
countries.storeCountryNames("South Africa");
countries.storeCountryNames("Newzland");
countries.storeCountryNames("West Indians");
countries.storeCountryNames("England");
countries.storeCountryNames("Bangladesh");
System.out.println("Bangladesh : " +countries.retrieveCountry("Bangladesh"));
System.out.println("USA : " +countries.retrieveCountry("USA"));
}
}