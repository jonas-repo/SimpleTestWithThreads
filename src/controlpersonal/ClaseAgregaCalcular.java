/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlpersonal;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

/**
 *
 * @author Jonas
 */
public class ClaseAgregaCalcular 
{
    
    public void agregarButonGroup( ButtonGroup grupo, JRadioButton opc1,JRadioButton opc2,JRadioButton opc3,JRadioButton opc4,JRadioButton opc5)
    {
     grupo.add(opc1);
     grupo.add(opc2);
     grupo.add(opc3);
     grupo.add(opc4);
     grupo.add(opc5);
    }//metodo
    public int botonSeleccionado(JRadioButton opc1,JRadioButton opc2,JRadioButton opc3,JRadioButton opc4,JRadioButton opc5)
    {
     int punto=0;
     if(opc1.isSelected())
     {
     punto=1;
     }
     if(opc2.isSelected())
     {
     punto=2;
     }
     if(opc3.isSelected())
     {
     punto=3;
     }
     if(opc5.isSelected())
     {
     punto=4;
     }
     if(opc4.isSelected())
     {
     punto=5;
     }
     return punto;
    }//metodo
    
    public int calcularPuntos(int [] punto, int escala)
    {
     int total=0;
     if(escala==1)
     {
     total=punto[1]+punto[3]+punto[5]+punto[6]+punto[9]+punto[11]+punto[13]+punto[15]+punto[17]+punto[19];
     total=50-total;
     }
     else
     {
     total=punto[2]+punto[4]+punto[7]+punto[8]+punto[10]+punto[12]+punto[14]+punto[16]+punto[18]+punto[20];
     total=50-total;
     }
    
     return total;
    }//metodo
    
    
   
    
}//clase
