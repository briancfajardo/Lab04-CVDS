package hangman.model;

public class OriginalScore implements GameScore{

    /*
     * @pre Se inicia con 100 puntos
     * @pos No se bonifican las letras correctas y se penaliza con 10 puntos las incorrectas.
     *  El puntaje mínimo es 0
     * @param correctCount 
     * @param incorrectCount
     * @throws ScoreException 
     */

    public int calculateScore(int correctCount, int incorrectCount) throws ScoreException{
        if (correctCount < 0 || incorrectCount < 0) {
            throw new ScoreException(ScoreException.parametrosNegativos);
        }
        int score = 100 - (10* incorrectCount);

        if (score < 0){
            score = 0;
        }

        return score;
    }
}
