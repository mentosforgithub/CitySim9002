/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;
import Program.*;

import org.junit.Assert;
import org.junit.Test; 
/**
 *
 * @author hment
 */
public class PreferenceInClasses {
    
    Student test_S = new Student();
    Professor test_p = new Professor();
    BusinessPerson test_bp = new BusinessPerson();
    Blogger test_b = new Blogger();
    
    @Test
    public void StudentPreferenceIsCorrect(){
       Assert.assertEquals(test_S.preference("The Cathedral of Learning"), "did not like The Cathedral of Learning.");
       Assert.assertEquals(test_S.preference("Squirrel Hill"),"did like Squirrel Hill!");
       Assert.assertEquals(test_S.preference("The Point"),"did like The Point!");
       Assert.assertEquals(test_S.preference("Downtown"),"did like Downtown!");
    }
    
    @Test
    public void StudentEnterWrongPreferenceInput(){
        Assert.assertEquals(test_S.preference(""),"error! no suitable input!");
    }
    
    @Test
    public void ProfessorPreferenceIsCorrect(){
       Assert.assertEquals(test_p.preference("The Cathedral of Learning"), "did like The Cathedral of Learning!");
       Assert.assertEquals(test_p.preference("Squirrel Hill"),"did like Squirrel Hill!");
       Assert.assertEquals(test_p.preference("The Point"),"did like The Point!");
       Assert.assertEquals(test_p.preference("Downtown"),"did like Downtown!");
    }
    
    @Test
    public void ProfessorEnterWrongPreferenceInput(){
        Assert.assertEquals(test_p.preference("12345"),"error! no suitable input!");
    }
    
    @Test
    public void BusinessPersonPreferenceIsCorrect(){
       Assert.assertEquals(test_bp.preference("The Cathedral of Learning"), "did not like The Cathedral of Learning.");
       Assert.assertEquals(test_bp.preference("Squirrel Hill"),"did like Squirrel Hill!");
       Assert.assertEquals(test_bp.preference("The Point"),"did not like The Point.");
       Assert.assertEquals(test_bp.preference("Downtown"),"did like Downtown!");
    }
    
    @Test
    public void BusinessPersonEnterWrongPreferenceInput(){
        Assert.assertEquals(test_bp.preference("Meaningless Entry"),"error! no suitable input!");
    }
    
    @Test
    public void BloggerPreferenceIsCorrect(){
       Assert.assertEquals(test_b.preference("The Cathedral of Learning"), "did not like The Cathedral of Learning.");
       Assert.assertEquals(test_b.preference("Squirrel Hill"),"did not like Squirrel Hill.");
       Assert.assertEquals(test_b.preference("The Point"),"did not like The Point.");
       Assert.assertEquals(test_b.preference("Downtown"),"did not like Downtown.");
    }
    
    @Test
    public void BloggerEnterWrongPreferenceInput(){
        Assert.assertEquals(test_b.preference("NULL"),"error! no suitable input!");
    }
}
