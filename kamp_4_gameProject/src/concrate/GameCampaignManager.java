package concrate;

import abstracts.GameCampaignService;
import entities.GameCampaign;
import entities.GameInfo;

public class GameCampaignManager implements GameCampaignService{

	@Override
	public void add(GameCampaign campaign, GameInfo gameInfo) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName()+" kampanyas� eklendi...");
		
	}

	@Override
	public void update(GameCampaign campaign, GameInfo gameInfo) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName()+" kampanyas� g�ncellendi...");
	}

	@Override
	public void delete(GameCampaign campaign, GameInfo gameInfo) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName()+" kampanyas� silindi...");
	}

}
