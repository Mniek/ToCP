/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoCP;

/**
 *
 * @author Maciek
 */
public class ukladRownan 
{
    
    float rozwiazanieUkladu(float a1, float b1, float a2, float b2, float y1, float y2)
    {
        if(a1!= a2)
        {
            
            float bb1= b1* a2;
            float yy1= y1*a2;
            
            
            float bb2 = b2 * a1;
            float yy2 = y2*a1;
            
            float b0 = bb1 - bb2;
            float y0 = yy1 - yy2;
            
            float summitB = y0/b0;
            float summitA = (y1-(b1*summitB))/a1;
            
            System.out.println("Wynikiem dla Xa jest: " + summitA + " a dla Yka: " + summitB);
            
        }
        
        if(a1 == a2)
        {
            
            
            float b0 = b1-b2;
            float y0 = y1 - y2;
            float summitB = y0/b0;   
            float summitA = (y1-(b1*summitB))/a1;
            
            System.out.println("Wynikiem dla Xa jest: " + summitA + " a dla Yka: " + summitB);
        }
        return 0;
    }
}
