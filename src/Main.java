import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {

        Battle battle = new Battle();

        // Team 1
        battle.addAlly(new Scraggy("Scraggy", 1));
        battle.addAlly(new Wailmer("Wailmer", 1));
        battle.addAlly(new Rhydon("Rhydon", 1));

        // Team 2
        battle.addFoe(new Vaporeon("Vaporeon", 1));
        battle.addFoe(new Nidorina("Nidorina", 1));
        battle.addFoe(new Nidoqueen("Nidoqueen", 1));

        battle.go();
    }
}