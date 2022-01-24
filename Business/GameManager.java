package Business;

import Abstract.IGameService;
import Entities.Game;


public class GameManager implements IGameService{


    @Override
    public void add(Game game) {
        System.out.println(game.getNameOfGame() + " oyunu eklendi");
    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getNameOfGame()+ " oyunu silindi.");
    }
}
