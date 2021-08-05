package abstracts;

import entities.GameCampaign;
import entities.GameInfo;
import entities.GameSell;

public interface IGameSellService {
	void sell(GameSell gameSell,GameInfo gameInfo,GameCampaign campaign);

}
