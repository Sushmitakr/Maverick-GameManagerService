package com.stackroute.maverick.domain;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;

public class GameSinglePlayerDetails {

	@Id
	private int gameSessionId;
	private int userId;
	private int gameId;
	private String gameName;
	private String gameImage;
	private String createdBy;
	private Date createdOn;
	private String gameType;
	private String gameDescription;
	private String gameRules;
	private int categoryId;

	private GameQuestionLevel questionLevels;
	private GameQuestionTime questionTime;
	private GameQuestionScore questionScore;
	private Topic topic;
	private List<Questions> questions;
	public int getGameSessionId() {
		return gameSessionId;
	}
	public void setGameSessionId(int gameSessionId) {
		this.gameSessionId = gameSessionId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getGameImage() {
		return gameImage;
	}
	public void setGameImage(String gameImage) {
		this.gameImage = gameImage;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public String getGameType() {
		return gameType;
	}
	public void setGameType(String gameType) {
		this.gameType = gameType;
	}
	public String getGameDescription() {
		return gameDescription;
	}
	public void setGameDescription(String gameDescription) {
		this.gameDescription = gameDescription;
	}
	public String getGameRules() {
		return gameRules;
	}
	public void setGameRules(String gameRules) {
		this.gameRules = gameRules;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public GameQuestionLevel getQuestionLevels() {
		return questionLevels;
	}
	public void setQuestionLevels(GameQuestionLevel questionLevels) {
		this.questionLevels = questionLevels;
	}
	public GameQuestionTime getQuestionTime() {
		return questionTime;
	}
	public void setQuestionTime(GameQuestionTime questionTime) {
		this.questionTime = questionTime;
	}
	public GameQuestionScore getQuestionScore() {
		return questionScore;
	}
	public void setQuestionScore(GameQuestionScore questionScore) {
		this.questionScore = questionScore;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	public List<Questions> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Questions> questions) {
		this.questions = questions;
	}
	@Override
	public String toString() {
		return "GameSinglePlayerDetails [gameSessionId=" + gameSessionId + ", userId=" + userId + ", gameId=" + gameId
				+ ", gameName=" + gameName + ", gameImage=" + gameImage + ", createdBy=" + createdBy + ", createdOn="
				+ createdOn + ", gameType=" + gameType + ", gameDescription=" + gameDescription + ", gameRules="
				+ gameRules + ", categoryId=" + categoryId + ", questionLevels=" + questionLevels + ", questionTime="
				+ questionTime + ", questionScore=" + questionScore + ", topic=" + topic + ", questions=" + questions
				+ "]";
	}
	
}
