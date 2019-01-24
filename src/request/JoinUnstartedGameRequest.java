package request;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class JoinUnstartedGameRequest.
 */
public class JoinUnstartedGameRequest extends Request implements Serializable {

	/** The user id. */
	private String userId;
	
	/** The game ID. */
	private String gameID;
		
	/**
	 * Instantiates a new join unstarted game request.
	 *
	 * @param userId the user id
	 * @param gameId the game id
	 */
	public JoinUnstartedGameRequest(String userId, String gameId) {
		super("joinUnstartedGame");
		this.userId = userId;
		this.gameID = gameId;
		
	}

	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * Sets the user id.
	 *
	 * @param userId the new user id
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * Gets the game ID.
	 *
	 * @return the game ID
	 */
	public String getGameID() {
		return gameID;
	}

	/**
	 * Sets the game ID.
	 *
	 * @param gameID the new game ID
	 */
	public void setGameID(String gameID) {
		this.gameID = gameID;
	}
}
