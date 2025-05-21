/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author minht
 */
public class Match {
    private String homeTeam;
    private String visitingTeam;
    private int homeTeamScore;
    private int visitingTeamScore;
    public Match (String homeTeam, String visitingTeam, int homeTeamScore, int visitingTeamScore){
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamScore = homeTeamScore;
        this.visitingTeamScore = visitingTeamScore;
    }
    public String getHomeTeam(){
        return this.homeTeam;
    }
    public String getVisitingTeam(){
        return this.visitingTeam;
    }
    public boolean isWin(){
        return (this.homeTeamScore>this.visitingTeamScore);
    }
}
