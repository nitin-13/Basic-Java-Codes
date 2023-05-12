

import java.util.Scanner;

public class Player {
	
	private int playerId;
	private String playerName;
	private int iccRank;
	private int noOfMatchesPlayed;
	private int totalRunsScored;
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getIccRank() {
		return iccRank;
	}
	public void setIccRank(int iccRank) {
		this.iccRank = iccRank;
	}
	public int getNoOfMatchesPlayed() {
		return noOfMatchesPlayed;
	}
	public void setNoOfMatchesPlayed(int noOfMatchesPlayed) {
		this.noOfMatchesPlayed = noOfMatchesPlayed;
	}
	public int getTotalRunsScored() {
		return totalRunsScored;
	}
	public void setTotalRunsScored(int totalRunsScored) {
		this.totalRunsScored = totalRunsScored;
	}
	public Player(int playerId, String playerName, int iccRank, int noOfMatchesPlayed, int totalRunsScored) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.iccRank = iccRank;
		this.noOfMatchesPlayed = noOfMatchesPlayed;
		this.totalRunsScored = totalRunsScored;
	}

    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Player[] players = new Player[4];
		
		System.out.println("Enter the details of players: ");
		
		for(int i=0;i<players.length;i++) {
			
			System.out.println("Enter Player Id: ");
			int playerId = sc.nextInt();sc.nextLine();
			
			System.out.println("Enter Player Name: ");
			String playerName = sc.nextLine();
			
			System.out.println("Enter Player ICC Rank: ");
			int iccRank = sc.nextInt();
		
			System.out.println("Enter No. Of Matches Played: ");
			int noOfMatchesPlayed = sc.nextInt();
			
			System.out.println("Enter Total number of runs scored: ");
			int totalRunsScored = sc.nextInt();
			
			players[i] = new Player(playerId,playerName,iccRank,noOfMatchesPlayed,totalRunsScored);
		}
		
		
		System.out.println("Enter the target: ");
		int target = sc.nextInt();
		
		double[] avgRunRate = findAvgScore(players,target);
		
		for(int i=0;i<avgRunRate.length;i++) {
			
			if(avgRunRate[i] >= 80.0) {
				System.out.println("Grade A Player");
			}
			
			else if(avgRunRate[i] <= 79.0 && avgRunRate[i] >= 50) {
				System.out.println("Grade B Player");
			}
			
			else {
				System.out.println("Grade C Player");
			}
		}

	}
	
	public static double[] findAvgScore(Player[] players,int target) {
		
		int count = 0;
		
		for(int i=0;i<players.length;i++) {
			if(players[i].getNoOfMatchesPlayed() >= target) {
				count++;
			}
		}
		
		double avgRR = 0.0;
		
		double[] avgRRA = new double[count];
		
		for(int i=0;i<players.length;i++) {
			
			if(players[i].getNoOfMatchesPlayed() >= target) {
				
				avgRR = Double.valueOf(players[i].getTotalRunsScored()/players[i].getNoOfMatchesPlayed());
				avgRRA[i] = avgRR;
			}
			
			
		}
		
		return avgRRA;
	}
	
}