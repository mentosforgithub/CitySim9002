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
    
    @Test
    public void GetMessageWorkswithDifferentPeople(){
        /**Because this is a unit testing,we don't care what will the preference function will return in this testing, so we give it a default message**/
        when(mock_s.preference(anyString())).thenReturn("did like Squirrel Hill!");
        when(mock_p.preference(anyString())).thenReturn("did like Squirrel Hill!");
        when(mock_bp.preference(anyString())).thenReturn("did not like Squirrel Hill.");
        when(mock_b.preference(anyString())).thenReturn("did not like Squirrel Hill.");
        
        CitySim9002.getMessage("Student", str2)
        Assert.assertEquals((CitySim9002.getMessage("Student", "Squirrel Hill")), );
        
    }
}
