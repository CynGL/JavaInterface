package Main;

import javax.swing.JOptionPane;


public class Biblioteca {

  
    public static void main(String[] args) {
        
       
        String n = JOptionPane.showInputDialog(null, " Digite seu nome");
        JOptionPane.showMessageDialog(null, "Meu nome é : "+ n);
 
        String x = JOptionPane.showInputDialog(null, " Digite seu peso");
        double kg = Double.parseDouble(x);
        String y = JOptionPane.showInputDialog(null, "Digite a sua altura");
        double m = Double.parseDouble(y);
       
          
        double resul = kg / (m  * m);
        
        
        if (resul <= 18.5){
            JOptionPane.showMessageDialog(null, "O IMC é : " + String.format("%.2f",  resul ));
            JOptionPane.showMessageDialog(null, "Abaixo do peso", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
        } else if (resul >= 18.5 && resul <= 24.9){
            JOptionPane.showMessageDialog(null, "O IMC é : " + String.format("%.2f",  resul ));
            JOptionPane.showMessageDialog(null, "Peso normal");
        } else if (resul >= 25.0 && resul <= 29.9){
            JOptionPane.showMessageDialog(null, "O IMC é : " + String.format("%.2f",  resul ));
            JOptionPane.showMessageDialog(null, "Sobre peso", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
        } else if (resul >= 30.0 && resul <= 34.9){
            JOptionPane.showMessageDialog(null, "O IMC é : " + String.format("%.2f",  resul ));
            JOptionPane.showMessageDialog(null, "Obesidade leve", "Aviso!",JOptionPane.WARNING_MESSAGE);
        }else if (resul >= 35.0 && resul <= 39.9){
            JOptionPane.showMessageDialog(null, "O IMC é : " + String.format("%.2f",  resul ));
            JOptionPane.showMessageDialog(null, "Obesidade moderada", "Atenção!", JOptionPane.WARNING_MESSAGE);
        } else if (resul >= 39.9){
            JOptionPane.showMessageDialog(null, "O IMC é : " + String.format("%.2f",  resul ));
            JOptionPane.showMessageDialog(null, "Obesidade mórbida", "Atenção!", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Dados inválidos", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }
    
}
