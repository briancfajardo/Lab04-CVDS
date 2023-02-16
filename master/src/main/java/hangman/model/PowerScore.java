package hangman.model;


public class PowerScore implements GameScore{
    
    /*
     * @pre Se inicia con 0 puntos
     * @pos La i-esima letra correcta se bonifica con 5 ** i y se penaliza con 8 puntos las incorrectas.
     *  El puntaje mínimo es 0, el máximo es 500
     * @param correctCount 
     * @param incorrectCount
     * @throws ScoreException 
     */

    public int calculateScore(int correctCount, int incorrectCount){
        int  score =  (int)(Math.pow(5, correctCount) - (incorrectCount * 8));

        if (score < 0){
            score = 0;
        }else if (score > 500){
            score = 500;
        }

        return score;
    }
}
