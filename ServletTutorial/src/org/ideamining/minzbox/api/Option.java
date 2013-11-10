package org.ideamining.minzbox.api;

import java.util.Date;

/**
 * 
 * @author congnh
 * 
 */
public class Option {

	public static final int INFORMATION_BY_ALL = 0x00;
	public static final int INFORMATION_BY_CATEGORY = 0x01;
	public static final int INFORMATION_BY_TAG = 0x10;
	public static final int INFORMATION_BY_PUBDATE = 0x11;
	public static final int INFORMATION_BY_TIME_INTERVAL = 0x100;

	private int type;
	private Date publicDate;
	private Date startDate;
	private Date endDate;

	public Option() {
		type = INFORMATION_BY_ALL;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Date getPublicDate() {
		return publicDate;
	}

	public void setPublicDate(Date publicDate) {
		this.publicDate = publicDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
