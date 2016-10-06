/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import Program.*;

import org.mockito.*;//googled this import commands 
import org.mockito.Mock;  
import org.mockito.MockitoAnnotations;  
import org.mockito.ArgumentCaptor;  
import static org.mockito.Mockito.*;  

import org.junit.Assert;
import org.junit.Test;
/**
 *
 * @author hment
 */
public class GetMessageTest {
    @Mock
    Student mock_s = mock(Student.class);
    Professor mock_p = mock(Professor.class);
    BusinessPerson mock_bp = mock(BusinessPerson.class);
    Blogger mock_b = mock(Blogger.class);
  
    
    /***Since we are doing unit testing, the preference() method should be tested in another testing(PreferenceInClasses),
     * We shall test GetMessage with place equals to Squirrel Hill.
     */
    @Test
    public void GetMessageWorkswithDifferentPeople(){ 
        GetMessage test_g = new GetMessage(mock_s,mock_p,mock_bp,mock_b);
        
        //stubbing methods
        when(mock_s.preference("Squirrel Hill") ).thenReturn("did like Squirrel Hill!");
        when(mock_p.preference("Squirrel Hill") ).thenReturn("did like Squirrel Hill!");
        when(mock_bp.preference("Squirrel Hill") ).thenReturn("did like Squirrel Hill!");
        when(mock_b.preference("Squirrel Hill") ).thenReturn("did not like Squirrel Hill.");
        
        Assert.assertEquals(test_g.getMessage("Student", "Squirrel Hill"), "did like Squirrel Hill!");
        Assert.assertEquals(test_g.getMessage("Blogger", "Squirrel Hill"), "did not like Squirrel Hill.");
    }
    
    @Test
    public void GetMessageWrongInput(){
         GetMessage test_g = new GetMessage(mock_s,mock_p,mock_bp,mock_b);
         
         //stubbing methods
         when(mock_s.preference("")).thenReturn("error! no suitable input!");
         when(mock_p.preference("123")).thenReturn("error! no suitable input!");
          
          Assert.assertEquals(test_g.getMessage("Student", ""), "error! no suitable input!");
          Assert.assertEquals(test_g.getMessage("Professor", "123"), "error! no suitable input!");
    }
}
