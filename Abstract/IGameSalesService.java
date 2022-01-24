package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface IGameSalesService {
    void sell(Game game, Player player, Campaign campaign);
}
