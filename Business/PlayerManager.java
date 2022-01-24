package Business;

import Abstract.IPlayerCheckService;
import Abstract.IPlayerService;
import Entities.Player;

public class PlayerManager implements IPlayerService {
    private IPlayerCheckService _playerCheckService ;

    public PlayerManager(IPlayerCheckService playerCheckService){
        this._playerCheckService = playerCheckService;
    }

    @Override
    public void add(Player player) {
        if(_playerCheckService.checkIfRealPerson(player)){
            System.out.println("Oyuncu eklendi " + player.getFirstName());
        }else{
            System.out.println("Gercek bilgilerinizle giris yapin.");
        }
    }

    @Override
    public void update(Player player) {
        System.out.println("Oyuncu guncellendi "+ player.getFirstName());
    }

    @Override
    public void delete(Player player) {
        System.out.println("oyuncu silindi. " + player.getFirstName());
    }
}
