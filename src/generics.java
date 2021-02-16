public class generics{
    public static void main(String[] args) {
        Football joe = new Football("Joe");
        Baseball mat = new Baseball("Mat");
        Soccer shlok = new Soccer("Shlok");

        Team<Football> Indians = new Team<>("Indians");
        Indians.addPlayer(joe);
        Team<Baseball> Cubs = new Team<>("Cubs");
        Cubs.addPlayer(mat);
        Team<Soccer> madrid = new Team<>("Madrid");
        madrid.addPlayer(shlok);
        Team<Soccer> chelsea = new Team<>("Chelsea");
        chelsea.addPlayer(shlok);
        Team<Soccer> manchester = new Team<>("Manchester United");
        manchester.addPlayer(shlok);

        madrid.matchResult(chelsea, 3, 4);
        madrid.matchResult(manchester, 4,2);
        chelsea.matchResult(chelsea, 2,4);
        manchester.matchResult(madrid,2,2);
        System.out.println(madrid.Ranking());
        System.out.println(manchester.Ranking());
        System.out.println(chelsea.Ranking());



        System.out.println(Indians.numPlayers());



    }

}