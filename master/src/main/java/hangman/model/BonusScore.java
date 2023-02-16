package hangman.model;

public class BonusScore implements GameScore{

    /*
     * @pre Se inicia con 0 puntos
     * @pos Se bonifican las letras correctas con 10 puntos y se penaliza con 5 puntos las incorrectas.
     *  El puntaje mínimo es 0
     * @param correctCount 
     * @param incorrectCount
       @throws ScoreException 
     */

    public int calculateScore(int correctCount, int incorrectCount){

        int score = (correctCount * 10) - (incorrectCount * 5);

        if (score < 0){
            score = 0;
        }

        return score;
    }
}
