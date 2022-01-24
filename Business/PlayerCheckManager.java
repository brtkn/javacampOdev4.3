package Business;

import Abstract.IPlayerCheckService;
import Entities.Player;
import MernisServiceReference.TULKPSPublicSoap;

import java.util.Locale;

public class PlayerCheckManager implements IPlayerCheckService {


    @Override
    public boolean checkIfRealPerson(Player player) {
        return false;
    }
}
