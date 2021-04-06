package edu.eci.arep;

public class ConvertTemperature 
{
    /**
     * Convierte los grados farenheit en grados celcius
     * @param x Double
     * @return Resultado de la operacion de tipo Double
     */
    public double farenheitToCelcius( Double farenheit){
        double celciusValue = (farenheit-32)*(5/9);
        
        return celciusValue;
    }

}
