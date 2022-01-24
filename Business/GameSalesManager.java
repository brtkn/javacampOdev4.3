package Business;

import Abstract.IGameSalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class GameSalesManager implements IGameSalesService {
    @Override
    public void sell(Game game, Player player, Campaign campaign) {
        double priceAfterDiscount = game.getPriceOfGame() - (game.getPriceOfGame()* campaign.getDiscount()/100);

        System.out.println(player.getFirstName()+" "+ game.getNameOfGame()+ " oyunu icin yuzde " + campaign.getDiscount()+ " kadar indirim kazandı.");
        System.out.println("Odenecek ucret " + priceAfterDiscount );

    }
}
