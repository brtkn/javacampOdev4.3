package Entities;

public class Campaign {
    private int id;

    public Campaign(){

    }

    public Campaign(int id, double discount, String campaignName) {
        this.id = id;
        this.discount = discount;
        this.campaignName = campaignName;
    }

    private double discount;
    private String campaignName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }
}
