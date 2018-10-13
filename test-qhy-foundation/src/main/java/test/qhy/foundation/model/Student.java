package test.qhy.foundation.model;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 919624660264515429L;
	private int id;
	private String usernamel;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsernamel() {
		return usernamel;
	}

	public void setUsernamel(String usernamel) {
		this.usernamel = usernamel;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", usernamel=" + usernamel + "]";
	}

}
