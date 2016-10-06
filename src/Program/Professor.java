/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

/**
 *
 * @author hment
 */
public class Professor {
        static boolean SquirrelHill = true;
        static boolean Downtown = true;
        static boolean ThePoint = true;
        static boolean CathedralofLearning = true;
        
        public String preference(String str){
            String result;
            switch(str){
                case "Squirrel Hill":
                    result = "did like "+str+"!";
                    break;
                case "The Cathedral of Learning":
                    result = "did like "+str+"!";
                    break;
                case "The Point":
                    result = "did like "+str+"!";
                    break;
                case "Downtown":
                    result ="did like "+str+"!";
                    break;
                case "leave":
                    result = "has left the city";
                    break;
                default:
                    result = "error! no suitable input!";
                            break;
            }
            return result;
        }
}
