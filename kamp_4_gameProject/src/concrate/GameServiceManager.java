package concrate;

import abstracts.GameCheckServices;
import abstracts.IGameService;
import entities.GameInfo;

public class GameServiceManager implements IGameService{
	
	private GameCheckServices gameservices;

	public GameServiceManager(GameCheckServices gameservices) {
		super();
		this.gameservices = gameservices;
	}

	@Override
	public void save(GameInfo gameInfo) {
		// TODO Auto-generated method stub
		if(gameservices.checkIfRealPerson(gameInfo)) {
			System.out.println("oyuncu bilgileri kaydedildi :"+gameInfo.getFirstName());
		}
		else {
			System.out.println("dogrulamada hata :" +gameInfo.getLastName());
		}
		
		
	}

	@Override
	public void update(GameInfo gameInfo) {
		// TODO Auto-generated method stub
		System.out.println("oyuncu bilgileri güncellendi "+gameInfo.getFirstName());
	}

	@Override
	public void delete(GameInfo gameInfo) {
		// TODO Auto-generated method stub
		System.out.println("oyuncu bilgileri silindi "+gameInfo.getFirstName());
	}

}
