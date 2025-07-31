package map_interface;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Policy {
    String policyNumber;
    String policyholderName;
    LocalDate expiryDate;
    String coverageType;
    double premiumAmount;

    public Policy(String policyNumber, String policyholderName, String expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = LocalDate.parse(expiryDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    @Override
    public String toString() {
        return policyNumber + ", " + policyholderName + ", " + expiryDate + ", " + coverageType + ", " + premiumAmount;
    }
}

public class InsaurancePolicyManagementSystem {
    HashMap<String, Policy> hashMap = new HashMap<>();
    LinkedHashMap<String, Policy> linkedHashMap = new LinkedHashMap<>();
    TreeMap<LocalDate, HashMap<String, Policy>> treeMap = new TreeMap<>();

    // Add policy to all maps
    public void addPolicy(Policy p) {
        hashMap.put(p.policyNumber, p);
        linkedHashMap.put(p.policyNumber, p);

        if (!treeMap.containsKey(p.expiryDate)) {
            treeMap.put(p.expiryDate, new HashMap<>());
        }
        treeMap.get(p.expiryDate).put(p.policyNumber, p);
    }

    // Retrieve policy by number 
    public Policy getPolicyByNumber(String policyNumber) {
        return hashMap.get(policyNumber);
    }

    // List policies expiring in next 30 days 
    public void listPoliciesExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        SortedMap<LocalDate, HashMap<String, Policy>> subMap = treeMap.subMap(today, true, limit, true);

        System.out.println("Policies expiring in next 30 days:");
        for (HashMap<String, Policy> policiesOnDate : subMap.values()) {
            for (Policy p : policiesOnDate.values()) {
                System.out.println(p);
            }
        }
    }

    // List policies for a specific policyholder (iterate linkedHashMap for insertion order)
    public void listPoliciesForHolder(String holderName) {
        System.out.println("Policies for policyholder: " + holderName);
        for (Policy p : linkedHashMap.values()) {
            if (p.policyholderName.equalsIgnoreCase(holderName)) {
                System.out.println(p);
            }
        }
    }

    // Remove expired policies (expiryDate < today)
    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();

        ArrayList<String> expiredPolicyNumbers = new ArrayList<>();

        for (Map.Entry<String, Policy> entry : hashMap.entrySet()) {
            if (entry.getValue().expiryDate.isBefore(today)) {
                expiredPolicyNumbers.add(entry.getKey());
            }
        }

        for (String policyNumber : expiredPolicyNumbers) {
            Policy p = hashMap.get(policyNumber);
            hashMap.remove(policyNumber);
            linkedHashMap.remove(policyNumber);

            HashMap<String, Policy> policiesForDate = treeMap.get(p.expiryDate);
            if (policiesForDate != null) {
                policiesForDate.remove(policyNumber);
                if (policiesForDate.isEmpty()) {
                    treeMap.remove(p.expiryDate);
                }
            }
        }

        System.out.println("Expired policies removed.");
    }

    public static void main(String[] args) {
        InsaurancePolicyManagementSystem system = new InsaurancePolicyManagementSystem();

        system.addPolicy(new Policy("1", "Alice", "2025-08-05", "Health", 6000));
        system.addPolicy(new Policy("2", "Bob", "2025-07-30", "Auto", 3500));
        system.addPolicy(new Policy("3", "Carol", "2025-08-20", "Home", 4200));
        system.addPolicy(new Policy("4", "Alice", "2025-08-31", "Health", 3000));
        system.addPolicy(new Policy("5", "Dan", "2025-09-15", "Life", 4700));

        System.out.println("Get policy by number 3:");
        System.out.println(system.getPolicyByNumber("3"));

        System.out.println("List policies expiring soon:");
        system.listPoliciesExpiringSoon();

        System.out.println("List policies for Alice:");
        system.listPoliciesForHolder("Alice");

        System.out.println("Removing expired policies...");
        system.removeExpiredPolicies();

        System.out.println("All policies after removal:");
        for (Policy p : system.linkedHashMap.values()) {
            System.out.println(p);
        }
    }
}
