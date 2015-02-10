package mainPackage;

import java.io.*;
import java.io.IOException;

public class Scoreboard 
{
    private int score;           // score for current game
    private int highscore;       // highest score over all
    private int pastScore;       // highest score from old games
    private String line;         // holds the lines of the highscore file
    private int oldScore;        // holds the score on the line of the highscore file
    String fileName = "highscore.txt";
    
    public Scoreboard()
    {
        score = 0;
    
        try {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        //running through past highscores 
        while ((line = bufferedReader.readLine()) != null)
        {
            oldScore = Integer.parseInt(bufferedReader.readLine());
            
        //picking out the highest score
            if (oldScore > pastScore)
            {
                pastScore = oldScore;
            }
        }
        
        pastScore = highscore;} catch(IOException exception) {    
        }
    }
    
    // adding 100 points to score
    public void increaseScore()
    {
        score += 100;
    }
    
    // returning score
    public int getScore()
    {
        return score;
    }
    
    // checking to see if the score from the current game is the new highscore
    public void checkHighscore()
    {
        if (score > highscore)
        {
            highscore = score;
            try {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.newLine();
            bufferedWriter.write(score);
            } catch(IOException exception){
            }
            
        }
    }
    
    // returning the highscore
    public int getHighscore()
    {
        return highscore;
    }
    
}