import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{   
    private String Name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;


    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println((player).getName() + " is already on the team.");
            return false;
        }else{
            members.add(player);
            System.out.println((player).getName() + " Has been added successfully");
            return true;
        }
    }

    public int numPlayers(){
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){

        String message;
        if(ourScore>theirScore){
            won++;
            message = " Won against ";
        }else if(ourScore<theirScore){
            lost++;
            message = "  lost against ";
        }else{
            tied++;
            message = " tied with ";
        }
        played++;
        if(opponent!= null){
            opponent.matchResult(null, theirScore, ourScore);
            System.out.println(this.getName() + message + opponent.getName());
        }
    }
    public int Ranking(){
        return(won*2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.Ranking()< team.Ranking()){
            return -1;
        }else if(this.Ranking()>team.Ranking()){
            return 1;
        }else{
            return 0;
        }
        
    }
}
