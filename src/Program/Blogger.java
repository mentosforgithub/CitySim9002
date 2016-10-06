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
public class Blogger {
        public String preference(String str){
            String result;
            switch(str){
                case "Squirrel Hill":
                    result = "did not like "+str+".";
                    break;
                case "The Cathedral of Learning":
                    result = "did not like "+str+".";
                    break;
                case "The Point":
                    result = "did not like "+str+".";
                    break;
                case "Downtown":
                    result = "did not like "+str+".";
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
