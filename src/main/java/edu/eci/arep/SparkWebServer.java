package edu.eci.arep;

import static spark.Spark.*;
import org.json.simple.JSONObject;

public class SparkWebServer {
    private static ConvertTemperature convertTemperature = new ConvertTemperature();

    /**
     * Metodo main del proyecto, el cual nos devuelve los diferentes resultados
     * dependiendo de la extension del get
     * @param args
     */
    public static void main(String[] args){
        JSONObject jsonObject = new JSONObject();
        port(getPort());

        /**
         * Metodo de tangente con respecto a "value"
         */
        get("/celcius", (req, res) -> {
            Double value = Double.valueOf(req.queryParams("value"));
            Double celciusValue = convertTemperature.farenheitToCelcius(value);
            jsonObject.put("operation", "Grados farenheit a grados celcius");
            jsonObject.put("input", value);
            jsonObject.put("output", celciusValue);
            return jsonObject.toJSONString();
        });

    }

    /**
     * Obtiene el puerto
     * @return puerto tipo int
     */
    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
