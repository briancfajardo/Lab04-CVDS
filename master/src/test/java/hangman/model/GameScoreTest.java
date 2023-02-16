package hangman.model;

import org.junit.Assert;
import org.junit.Test;


/*
 * Las clases que implementan la interfaz son:
 * OriginalScore, BonusScore y PowerScore
 * El mínimo puntaje es 0 y el máximo puntaje es 500
 */

public class GameScoreTest { 

    @Test
    public void validateCorrectScoreOriginal (){
        int score  = 0;
        try{
            OriginalScore origin = new OriginalScore();
            score = origin.calculateScore(5, 8);

        }catch(ScoreException e){
            
            System.out.println(e.getMessage());
        }
        Assert.assertEquals(20, score);
    }

    @Test
    public void validateIncorrectScoreOriginal (){
        int score  = 0;
        try{
            OriginalScore origin = new OriginalScore();
            score = origin.calculateScore(5, 8);
            
        }catch(ScoreException e){
            
            System.out.println(e.getMessage());
        }
        Assert.assertNotEquals(30, score);
    }

    @Test
    public void validateNegativeScoreOriginal (){
        int score  = 0;
        try{
            OriginalScore origin = new OriginalScore();
            score = origin.calculateScore(5, 20);
            
        }catch(ScoreException e){
            
            System.out.println(e.getMessage());
        }
        Assert.assertEquals(0, score);
    }

    @Test
    public void validateNegativeParametersOriginal (){
        try{
            OriginalScore origin = new OriginalScore();
            int score = origin.calculateScore(5, 20);
            
        }catch(ScoreException e){
            
            Assert.assertEquals(ScoreException.parametrosNegativos, e.getMessage());
        }
    }



    @Test
    public void validateCorrectScoreBonus (){
        int score  = 0;
        try{
            BonusScore origin = new BonusScore();
            score = origin.calculateScore(8, 4);

        }catch(ScoreException e){
            
            System.out.println(e.getMessage());
        }
        Assert.assertEquals(60, score);
    }

    @Test
    public void validateIncorrectScoreBonus (){
        int score  = 0;
        try{
            BonusScore origin = new BonusScore();
            score = origin.calculateScore(8, 2);
            
        }catch(ScoreException e){
            
            System.out.println(e.getMessage());
        }
        Assert.assertNotEquals(60, score);
    }

    @Test
    public void validateNegativeScoreBonus (){
        int score  = 0;
        try{
            BonusScore origin = new BonusScore();
            score = origin.calculateScore(5, 20);
            
        }catch(ScoreException e){
            
            System.out.println(e.getMessage());
        }
        Assert.assertEquals(0, score);
    }

    @Test
    public void validateNegativeParametersBonus (){
        try{
            BonusScore origin = new BonusScore();
            int score = origin.calculateScore(5, -20);
            
        }catch(ScoreException e){
            
            Assert.assertEquals(ScoreException.parametrosNegativos, e.getMessage());
        }
    }




    @Test
    public void validateCorrectMaximumScorePower (){
        int score  = 0;
        try{
            PowerScore origin = new PowerScore();
            score = origin.calculateScore(5, 3);

        }catch(ScoreException e){
            
            System.out.println(e.getMessage());
        }
        Assert.assertEquals(500, score);
    }

    @Test
    public void validateCorrectScorePower (){
        int score  = 0;
        try{
            PowerScore origin = new PowerScore();
            score = origin.calculateScore(2, 3);

        }catch(ScoreException e){
            
            System.out.println(e.getMessage());
        }
        Assert.assertEquals(1, score);
    }

    @Test
    public void validateIncorrectScorePower (){
        int score  = 0;
        try{
            PowerScore origin = new PowerScore();
            score = origin.calculateScore(2,3);
            
        }catch(ScoreException e){
            
            System.out.println(e.getMessage());
        }
        Assert.assertNotEquals(2, score);
    }

    @Test
    public void validateNegativeScorePower (){
        int score  = 0;
        try{
            PowerScore origin = new PowerScore();
            score = origin.calculateScore(2, 20);
            
        }catch(ScoreException e){
            
            System.out.println(e.getMessage());
        }
        Assert.assertEquals(0, score);
    }

    @Test
    public void validateNegativeParametersPower (){
        try{
            PowerScore origin = new PowerScore();
            int score = origin.calculateScore(5, -20);
            
        }catch(ScoreException e){
            
            Assert.assertEquals(ScoreException.parametrosNegativos, e.getMessage());
        }
    }

    
}
