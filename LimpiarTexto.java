/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatbot2;

/**
 *
 * @author andre
 */
public class LimpiarTexto {
    Main m = new Main();
    public void quitarCaracteresEspeciales(String frase)
    {   
        frase = m.tratarText();
        frase = frase.replace('á', 'a');
        frase = frase.replace('é', 'e');
        frase = frase.replace('í', 'i');
        frase = frase.replace('ó', 'o');
        frase = frase.replace('ú', 'u');
        frase = frase.replaceAll("[^a-zñ0-9]", " ");        
    }   
    private String quitarLetrasRepetidas(String palabra)
    {     
        if (palabra.length()==0) return "";
        palabra = palabra.trim();
        StringBuilder palabraNueva = new StringBuilder();     
        char letraLeida=' ';
        int contador=0;
        char arrayPalabra[] = palabra.toCharArray();
        for (int i=0;i<arrayPalabra.length;i++)
        {
            if ((letraLeida == arrayPalabra[i]) && (!Character.isDigit(letraLeida)))
            {
                contador++;
                if (contador<3)  //((contador==2) && ((letraLeida == 'r') || (letraLeida == 'c') || (letraLeida == 'l'))) 
                {
                    palabraNueva.append(arrayPalabra[i]);
                }
            } else {
                palabraNueva.append(arrayPalabra[i]);
                contador=1;
            }
            letraLeida = arrayPalabra[i];
        }
                return palabraNueva.toString();
    }
    
}
