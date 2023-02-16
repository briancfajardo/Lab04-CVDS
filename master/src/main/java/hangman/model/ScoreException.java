package hangman.model;

public class ScoreException extends Exception{

    public static String parametrosNegativos = "Los contadores no pueden ser negativos";

    public ScoreException(String mensaje) {
        super(mensaje);


    }

}
