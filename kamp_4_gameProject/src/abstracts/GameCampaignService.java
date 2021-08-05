package abstracts;

import entities.GameCampaign;
import entities.GameInfo;

public interface GameCampaignService {
	void add(GameCampaign campaign,GameInfo gameInfo);
	
	void update(GameCampaign campaign,GameInfo gameInfo);
	
	void delete(GameCampaign campaign,GameInfo gameInfo);

}
