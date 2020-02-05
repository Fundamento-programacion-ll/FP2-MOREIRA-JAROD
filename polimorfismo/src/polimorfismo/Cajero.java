/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import javax.swing.JOptionPane;
public class Cajero {

public static void main(String[] args) {
int saldo;
String fin;
fin="";
saldo= 5000;


do{
String opcion = JOptionPane.showInputDialog(null," ¿Que deseas realizar:" + " \n " + " 1= Incrementar su saldo " + " \n " + " 2= retirar del saldo" + " \n " + "3= Revisar tu Saldo");
int no;
no = Integer.parseInt(opcion);
switch(no) {
case 1:
String abonar = JOptionPane.showInputDialog(null,"¿Cua… quieres abonar?");
double mas;
mas = Integer.parseInt(abonar);
JOptionPane.showMessageDialog(null,"Tu saldo es= $"+(saldo+mas));
break;
case 2:
String restar = JOptionPane.showInputDialog(null,"¿Cua… quieres retirar?");
double res;
res = Integer.parseInt(restar);
JOptionPane.showMessageDialog(null,"Tu saldo es= $"+(saldo-res));
break;
case 3:
JOptionPane.showMessageDialog(null,"Tu saldo actual es= $"+ saldo);
break;
}
JOptionPane.showInputDialog("¿Deseas hacer otra operación?" + " \n " + " 1= si" + " \n " + " 2= no");
//fin = Integer.parseInt(decision);
}while (fin=="");
JOptionPane.showMessageDialog(null,"Gr... por hacer uso del cajero");
System.exit(0);
}
}