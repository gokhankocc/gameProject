package entities;

import entities.interfacesentities.GameCampaignEntitiy;

public class GameCampaign implements GameCampaignEntitiy{
	private String campaignName;
	private int discountRate;
	
	public GameCampaign() {
		
	}

	public GameCampaign(String campaignName, int discountRate) {
		super();
		this.campaignName = campaignName;
		this.discountRate = discountRate;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

}

