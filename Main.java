import Abstract.IPlayerService;
import Adapters.MernisServiceAdapter;
import Business.GameSalesManager;
import Business.PlayerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;
import MernisServiceReference.TULKPSPublicSoap;
import jdk.swing.interop.SwingInterOpUtils;

import java.rmi.RemoteException;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args)  {
        Player player = new Player(1,"Brt","kn","480435806123",LocalDate.of(1994,3,8));
        Game game = new Game(1, "Terminator", 100);
        Campaign campaign = new Campaign(1,12,"Black Friday");

        IPlayerService playerService= new PlayerManager(new MernisServiceAdapter());
        playerService.add(player);



        GameSalesManager gameSaleManager = new GameSalesManager();
        gameSaleManager.sell(game,player,campaign);
    }
}
