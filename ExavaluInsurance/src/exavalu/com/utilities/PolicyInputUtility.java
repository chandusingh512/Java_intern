package exavalu.com.utilities;

import exavalu.com.beans.Policy;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class PolicyInputUtility {

    /**
     *
     * @return
     */
    public static Policy getPolicyInput() {
        Policy policy = new Policy();

        policy.setPolicyId(Integer.parseInt(JOptionPane.showInputDialog("Enter the id of the policy: ")));
        policy.setPolicyName(JOptionPane.showInputDialog("Enter the name of the polic: "));
        policy.setLaunchDate(JOptionPane.showInputDialog("Enter the launch date of policy"));
        policy.setExpiryDate(JOptionPane.showInputDialog("Enter the expiry date of policy: "));
        policy.setPolicyPremium(Integer.parseInt(JOptionPane.showInputDialog("Enter the premium of the policy: ")));
        policy.setCoverage(Integer.parseInt(JOptionPane.showInputDialog("Enter the coverage of the policy: ")));
        policy.setMinAgeOfOffering(Integer.parseInt(JOptionPane.showInputDialog("Enter the min age for the policy: ")));
        policy.setMaxAgeOfOffering(Integer.parseInt(JOptionPane.showInputDialog("Enter the max age for the policy: ")));

        return policy;
    }

}
