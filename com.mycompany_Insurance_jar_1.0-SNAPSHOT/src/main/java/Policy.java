
public class Policy 
{
    private int policyId;
    private String policyName;
    private String expiryDate;
    private String launchDate;
    private double policyPremium;
    private double coverage;
    private int minAgeOfOffering;
    private int maxAgeOfOffering;

    /**
     * @return the policyId
     */
    public int getPolicyId() {
        return policyId;
    }

    /**
     * @param policyId the policyId to set
     */
    public void setPolicyId(int policyId) {
        this.policyId = policyId;
    }

    /**
     * @return the policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * @param policyName the policyName to set
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * @return the expiryDate
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * @param expiryDate the expiryDate to set
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
     * @return the launchDate
     */
    public String getLaunchDate() {
        return launchDate;
    }

    /**
     * @param launchDate the launchDate to set
     */
    public void setLaunchDate(String launchDate) {
        this.launchDate = launchDate;
    }

    /**
     * @return the policyPremium
     */
    public double getPolicyPremium() {
        return policyPremium;
    }

    /**
     * @param policyPremium the policyPremium to set
     */
    public void setPolicyPremium(double policyPremium) {
        this.policyPremium = policyPremium;
    }

    /**
     * @return the coverage
     */
    public double getCoverage() {
        return coverage;
    }

    /**
     * @param coverage the coverage to set
     */
    public void setCoverage(double coverage) {
        this.coverage = coverage;
    }

    /**
     * @return the minAgeOfOffering
     */
    public int getMinAgeOfOffering() {
        return minAgeOfOffering;
    }

    /**
     * @param minAgeOfOffering the minAgeOfOffering to set
     */
    public void setMinAgeOfOffering(int minAgeOfOffering) {
        this.minAgeOfOffering = minAgeOfOffering;
    }

    /**
     * @return the maxAgeOfOffering
     */
    public int getMaxAgeOfOffering() {
        return maxAgeOfOffering;
    }

    /**
     * @param maxAgeOfOffering the maxAgeOfOffering to set
     */
    public void setMaxAgeOfOffering(int maxAgeOfOffering) {
        this.maxAgeOfOffering = maxAgeOfOffering;
    }
    
    
}
