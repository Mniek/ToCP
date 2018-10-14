/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToCS;

import static java.lang.Math.round;

/**
 *
 * @author Maciek
 */
public class Delta
{

   
    
    float obliczanie(float a,float b, float c)
    {
     
          
          
          if(a == 0)
          {
              if(b == 0 )
              {
                  if(c ==0)
                  {
                      System.out.println("Wszystko wynosi 0 tłoku");
                      return 0;
                  }
                  else
                  {
                      System.out.println("c wynosi: "+ c);
                      return c;
                  }
              }
              else
              {
                  float x = -b/(2*c);
                  System.out.println("Wynik wynosi: " + x);
                  return x;
              }
                         
          }
          else
          {
              double delta;
              delta =  Math.pow(b,2) - 4*a*c;
              if (delta <0)
              {
                  System.out.println("Brak miejsc zerowych");
              }
              else if(delta == 0)
              {
                  double xZero;
                  xZero = -b/2;

                  System.out.println("Miejscem zerowym jest: " +xZero);
              }
              else if(delta >0)
              {
                  double xJeden;
                  double xDwa;
                  xJeden = (-b - Math.sqrt(delta)) /(2*a);
                  xDwa = (-b + Math.sqrt(delta)) /(2*a);
                  System.out.println("Xjeden wynosi: " +round(xJeden) + " a xDwa: " + round(xDwa) );

              }
          }
          return 0;
    } 
}; 
     
    

