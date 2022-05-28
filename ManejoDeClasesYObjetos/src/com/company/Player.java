package com.company;

/**
 * Represents a game player
 * @author Oscar Peñuela
 */
public class Player {
    /**
     * Represents the id player
     */
    private int idPlayer;
    /**
     * Represents the player name
     */
    private String name;
    /**
     * Represents the player nickname
     */
    public String nickname;
    /**
     * Represents the player score
     */
    public float score;
    /**
     * Represents the player level
     */
    protected int level;

    /**
     * Creates a player
     * @param idPlayer player id
     * @param name player name
     * @param nickname player nickname
     * @param score player score
     * @param level player level
     */
    public Player(int idPlayer, String name, String nickname, float score, int level) {
        this.idPlayer = idPlayer;
        this.name = name;
        this.nickname = nickname;
        this.score = score;
        this.level = level;
    }

    /**
     * Method to get the id player
     * @return returns de id player
     */
    public int getIdPlayer() {
        return idPlayer;
    }

    /**
     * Assigns the id player
     * @param idPlayer assigns id player
     */
    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }

    /**
     * Method to get the player name
     * @return returns the player´s name
     */
    public String getName() {
        return name;
    }

    /**
     * Assigns the player´s name
     * @param name assigns player´s name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method to get the nickname
     * @return returns the nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Assigns the player´s nickname
     * @param nickname assigns nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * Method to get the player´s score
     * @return returns the player´s score
     */
    public float getScore() {
        return score;
    }

    /**
     * Assigns the score
     * @param score assigns the score
     */
    public void setScore(float score) {
        this.score = score;
    }

    /**
     * Method to get the player level
     * @return returns player level
     */
    public int getLevel() {
        return level;
    }

    /**
     * Assigns the player level
     * @param level assigns player level
     */
    public void setLevel(int level) {
        this.level = level;
    }
}
