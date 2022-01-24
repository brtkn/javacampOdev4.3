package Adapters;

import Abstract.IPlayerCheckService;
import Entities.Player;
import MernisServiceReference.TULKPSPublicSoap;

public class MernisServiceAdapter implements IPlayerCheckService {
    @Override
    public boolean checkIfRealPerson(Player player) {
        TULKPSPublicSoap tulkpsPublicSoap = new TULKPSPublicSoap();
        try {
            return tulkpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()),player.getFirstName().toUpperCase(),player.getLastName().toUpperCase(),player.getBirthOfDate().getYear());
            //System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
