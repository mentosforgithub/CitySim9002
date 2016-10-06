/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import Program.*;

import java.util.Random;

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
public class GeneratePlaceTest {
    @Mock
            Random mock_random = mock(Random.class);
    @Test
    public void GenerateVisitorCorrectly(){
        String[] s = {"The Cathedral of Learning","Squirrel Hill" ,"The Point", "Downtown","leave"};
        int length = s.length;
        
        when(mock_random.nextInt(length)).thenReturn(0);
        Assert.assertEquals(CitySim9002.GenerateVisitor(mock_random, s), "The Cathedral of Learning");//correctly worked
        Assert.assertNotEquals(CitySim9002.GenerateVisitor(mock_random, s), "leave");//sad path
    }
}
