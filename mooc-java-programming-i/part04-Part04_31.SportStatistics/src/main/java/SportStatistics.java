
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        try (Scanner scanFile = new Scanner(Paths.get(file))){
            ArrayList<Match> matches = new ArrayList<>();
            while (scanFile.hasNextLine()){
                String row = scanFile.nextLine();
                String[] pieces = row.split(",");
                String homeTeam = pieces[0];
                String visitingTeam = pieces[1];
                int homeTeamScore = Integer.valueOf(pieces[2]);
                int visitingTeamScore = Integer.valueOf(pieces[3]);
                matches.add(new Match(homeTeam, visitingTeam, homeTeamScore, visitingTeamScore));
                
            }
            int count=0;
            int wins=0, losses=0;
            for (Match match:matches){
                String homeTeam = match.getHomeTeam();
                String visitingTeam = match.getVisitingTeam();
                if (team.equals(homeTeam)){
                    count+=1;
                    if (match.isWin()==true){
                        wins+=1;
                    } else {
                        losses+=1;
                    }
                } else if (team.equals(visitingTeam)){
                    count+=1;
                    if (match.isWin()==true){
                        losses+=1;
                    } else {
                        wins+=1;
                    }
                }
                
            }
            System.out.println("Games: "+count);
            System.out.println("Wins: "+wins);
            System.out.println("Losses: "+losses);
        } catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }

}
