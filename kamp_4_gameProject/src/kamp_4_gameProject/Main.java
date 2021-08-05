package kamp_4_gameProject;

import abstracts.GameCampaignService;
import abstracts.IGameSellService;
import abstracts.IGameService;
import adapters.GameServicesAdapters;
import concrate.GameCampaignManager;
import concrate.GameSellManager;
import concrate.GameServiceManager;
import entities.GameCampaign;
import entities.GameInfo;
import entities.GameSell;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IGameService gameService = new GameServiceManager(new GameServicesAdapters());
		GameInfo gameInfo = new GameInfo();
		gameInfo.setId(61);
		gameInfo.setNationality("54787495325");
		gameInfo.setFirstName("gokhan");
		gameInfo.setLastName("koc");
		gameInfo.setDateofBirth("2000");
		gameService.save(gameInfo);
		
		
		GameCampaignService campaignService= new GameCampaignManager();
		GameCampaign campaign = new GameCampaign();
		campaign.setCampaignName("sevgili");
		campaign.setDiscountRate(10);
		campaignService.add(campaign, gameInfo);
		
		
		IGameSellService gameSellService= new GameSellManager();
		GameSell gameSell = new GameSell();
		gameSell.setGameName("valorant");
		gameSell.setGamePrice(300);
		gameSell.setId(63);
		gameSellService.sell(gameSell, gameInfo, campaign);
	}

}
