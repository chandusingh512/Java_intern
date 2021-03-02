public class Policy
{
private int policyid;
private String policyName;
private String expiryDate;
private String launchDate;
private double premiumAmount;
private double coverageAmount;
private int minAgeOfOffering;
private int maxAgeOfOffering;

   
    public int getPolicyid() {
        return policyid;
    }

    public void setPolicyid(int policyid) {
        this.policyid = policyid;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(String launchDate) {
        this.launchDate = launchDate;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(double premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public double getCoverageAmount() {
        return coverageAmount;
    }

    public void setCoverageAmount(double coverageAmount) {
        this.coverageAmount = coverageAmount;
    }

    public int getMinAgeOfOffering() {
        return minAgeOfOffering;
    }

    public void setMinAgeOfOffering(int minAgeOfOffering) {
        this.minAgeOfOffering = minAgeOfOffering;
    }

    public int getMaxAgeOfOffering() {
        return maxAgeOfOffering;
    }

    public void setMaxAgeOfOffering(int maxAgeOfOffering) {
        this.maxAgeOfOffering = maxAgeOfOffering;
    }


}
