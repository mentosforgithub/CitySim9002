 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import Domain.Validator;
import java.util.Random;

/**
 *
 * @author AsphaltPanthers
 */
public class CitySim9002 {
    public static String errorMessage = "Please enter one integer argument, seed";
    
    public static String getMessage(String str1, String str2){ //get messages of different visitors and their preferences
            String result;
            switch(str1){
                case "Student":
                    Student s = new Student();
                    result= s.preference(str2);
                    break;
                case "Professor":
                    Professor p = new Professor();
                    result = p.preference(str2);
                    break;
                case "BusinessPerson":
                    BusinessPerson bp =new BusinessPerson();
                    result = bp.preference(str2);
                    break;
                case "Blogger":
                    Blogger b = new Blogger();
                    result=b.preference(str2);
                    break;
                default:
                    result="error in getMessage method!";
            }
            return result;
        }
    
    public static String GenerateVisitor(Random r,String[] s){
        String result;
        int index = r.nextInt(s.length);
        result = s[index];
        return result;
    }
    public static String GeneratePlace(Random r,String[] s){
        String result;
        int index = r.nextInt(s.length);
        result = s[index];
        return result;
    }
    
    public static void main(String[] args) {
        if (new Validator().validateArguments(args)) {
            int seed;
            seed = Integer.parseInt(args[0]);
            Random random_visitors = new Random(seed);//create a random visitors number based on the entered seed
            Random random_places = new Random(seed);//create a random places number based on the entered seed
            Random random_iterations = new Random(seed);
            
            String[] visitors = {"Student","Professor","BusinessPerson","Blogger"};
            String[] places = {"The Cathedral of Learning","Squirrel Hill" ,"The Point", "Downtown","leave"};
            
            for(int a=1;a<=5;a++){
                String visitor = GenerateVisitor(random_visitors,visitors);
                 //String visitor = visitors[random_visitors.nextInt(visitors.length)];
                 int iteration = random_iterations.nextInt(Integer.SIZE-1);//to generate only positive integer,from stackoverflow
                 System.out.println("Visitor "+a+" is a "+visitor);
                 for(int i=1; i<=iteration;i++){     
                     String place = GeneratePlace(random_places,places);
                    //String place = places[random_places.nextInt(places.length)];//generate the random place
                    System.out.println("Visitor "+a+" is going to "+place);
                    String message1 = getMessage(visitor,place);
                    System.out.println("Visitor "+a+" "+message1);
                    if (place.equals("leave") || (i==iteration))
                    {
                        System.out.println("***");
                        break;
                    }
                }
           }
        }
        else {
            System.out.println(errorMessage);
        }
    }
}
