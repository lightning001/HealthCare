package entity;
// Generated May 8, 2017 8:56:39 AM by Hibernate Tools 5.2.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Message generated by hbm2java
 */
public class Message implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7446764279549255670L;
	private int idMessage;
	private Doctor doctor;
	private Users users;
	private Date times;
	private String content;
	private Boolean isRecent;
	private Boolean isReply;
	private Boolean isRead;
	private Questionmessage questionmessage;
	private Set<Message> messagesForIdMessage = new HashSet<>(0);
	private Set<Message> messagesForIdReplyMessage = new HashSet<>(0);

	public Message() {
	}

	public Message(int idMessage, Date times) {
		this.idMessage = idMessage;
		this.times = times;
	}
	
	


	public Message(int idMessage, Doctor doctor, Users users, Date times, String content, Boolean isRecent,
			Boolean isReply, Boolean isRead) {
		super();
		this.idMessage = idMessage;
		this.doctor = doctor;
		this.users = users;
		this.times = times;
		this.content = content;
		this.isRecent = isRecent;
		this.isReply = isReply;
		this.isRead = isRead;
	}

	public Message(Doctor doctor, Users users, Date times, String content, Boolean isRecent, Boolean isReply,
			Boolean isRead) {
		super();
		this.doctor = doctor;
		this.users = users;
		this.times = times;
		this.content = content;
		this.isRecent = isRecent;
		this.isReply = isReply;
		this.isRead = isRead;
	}

	public Message(int idMessage, Doctor doctor, Users users, Date times, String content, Boolean isRecent,
			Boolean isReply, Boolean isRead, Questionmessage questionmessage, Set<Message> messagesForIdMessage,
			Set<Message> messagesForIdReplyMessage) {
		super();
		this.idMessage = idMessage;
		this.doctor = doctor;
		this.users = users;
		this.times = times;
		this.content = content;
		this.isRecent = isRecent;
		this.isReply = isReply;
		this.isRead = isRead;
		this.questionmessage = questionmessage;
		this.messagesForIdMessage = messagesForIdMessage;
		this.messagesForIdReplyMessage = messagesForIdReplyMessage;
	}

	public int getIdMessage() {
		return this.idMessage;
	}

	public void setIdMessage(int idMessage) {
		this.idMessage = idMessage;
	}

	public Doctor getDoctor() {
		return this.doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Date getTimes() {
		return this.times;
	}

	public void setTimes(Date times) {
		this.times = times;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Boolean getIsRecent() {
		return this.isRecent;
	}

	public void setIsRecent(Boolean isRecent) {
		this.isRecent = isRecent;
	}

	public Boolean getIsReply() {
		return this.isReply;
	}

	public void setIsReply(Boolean isReply) {
		this.isReply = isReply;
	}

	public Boolean getIsRead() {
		return this.isRead;
	}

	public void setIsRead(Boolean isRead) {
		this.isRead = isRead;
	}

	public Questionmessage getQuestionmessage() {
		return this.questionmessage;
	}

	public void setQuestionmessage(Questionmessage questionmessage) {
		this.questionmessage = questionmessage;
	}

	public Set<Message> getMessagesForIdMessage() {
		return messagesForIdMessage;
	}

	public void setMessagesForIdMessage(Set<Message> messagesForIdMessage) {
		this.messagesForIdMessage = messagesForIdMessage;
	}

	public Set<Message> getMessagesForIdReplyMessage() {
		return messagesForIdReplyMessage;
	}

	public void setMessagesForIdReplyMessage(Set<Message> messagesForIdReplyMessage) {
		this.messagesForIdReplyMessage = messagesForIdReplyMessage;
	}
	
}
