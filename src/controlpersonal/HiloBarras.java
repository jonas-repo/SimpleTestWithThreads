/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlpersonal;



/**
 *
 * @author Jonas
 */
public class HiloBarras extends Thread
{
    int opcion;
    public HiloBarras(int opcion)
    {
    this.opcion=opcion;
    }
    
    public void run()
    {
    if(opcion==1)
    {
     int x=0;
     
     while(x<=VentanaPrincipal.puntosEscalaEgo1)
     {
      try{
          VentanaResultadosEgo.barraIn.setString(String.valueOf(x));
          VentanaResultadosEgo.barraIn.setValue(x);
          Thread.sleep(70);
         x++;
      }catch(Exception err)
      {}
     }
    }//opcion 1
    
    if(opcion==2)
    {
     int x=0;
     while(x<=VentanaPrincipal.puntosEscalaEgo2)
     {
      try{
          VentanaResultadosEgo.barraMask.setString(String.valueOf(x));
          VentanaResultadosEgo.barraMask.setValue(x);
          Thread.sleep(80);
         x++;
      }catch(Exception err)
      {}
     }
    }//opcion 2
    
    if(opcion==3)
    {
     int x=0;
     while(x<=VentanaPrincipal.puntosEgoTotal)
     {
      try{
          VentanaResultadosEgo.barraEgo.setString(String.valueOf(x));
          VentanaResultadosEgo.barraEgo.setValue(x);
          Thread.sleep(90);
         x++;
      }catch(Exception err)
      {}
     }
    }//opcion 3
    
    }
    
    
}
