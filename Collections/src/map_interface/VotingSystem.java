package map_interface;

import java.util.*;
public class VotingSystem {
    // Stores votes with candidate names as keys
    private HashMap<String, Integer> votesMap = new HashMap<>();
    
    // Maintains insertion order of candidates as they first receive votes
    private LinkedHashMap<String, Integer> linkedVotesMap = new LinkedHashMap<>();

    // Adds a vote for a candidate, updating both maps accordingly
    public void castVote(String candidate) {
        votesMap.put(candidate, votesMap.getOrDefault(candidate, 0) + 1);

        if (!linkedVotesMap.containsKey(candidate)) {
            linkedVotesMap.put(candidate, 1);
        } else {
            linkedVotesMap.put(candidate, linkedVotesMap.get(candidate) + 1);
        }
    }

    // Displays votes in the order candidates first received votes
    public void displayVotesInOrder() {
        System.out.println("Votes by candidate arrival order:");
        for (Map.Entry<String, Integer> entry : linkedVotesMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Displays votes sorted alphabetically by candidate name
    public void displayVotesSorted() {
        TreeMap<String, Integer> sortedMap = new TreeMap<>(votesMap);
        System.out.println("Votes sorted by candidate name:");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    
    public static void main(String[] args) {
        VotingSystem voting = new VotingSystem();

        voting.castVote("Alice");
        voting.castVote("Bob");
        voting.castVote("Alice");
        voting.castVote("Charlie");
        voting.castVote("Bob");
        voting.castVote("Alice");

        voting.displayVotesInOrder();
        System.out.println();
        voting.displayVotesSorted();
    }
}
