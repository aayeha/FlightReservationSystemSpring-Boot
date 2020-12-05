package com.qunniox.airlines.entities;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="flight")
public class Flight {

	@Id
	private Integer flightNo;
	private String carrierName;
	private int seatCapacity;
	
	@Column(name = "available_seats")
	//@NotNull
	private Integer availableSeats;

	@Column(name ="srcAirport")
	private String srcAirport;

	@Column(name ="dstnAirport")
	private String dstnAirport;

	@Column(name = "departure_time")
//	@JsonFormat(pattern = "mm-dd-yyyy HH:mm:ss")
	private String deptDateTime;

	@Column(name = "arrival_time")
//	@JsonFormat(pattern = "mm-dd-yyyy HH:mm:ss")
	private String arrDateTime;
	

	/*
	 * @OneToOne(mappedBy = "flightObj", cascade = CascadeType.ALL) private
	 * ScheduledFlight sfObj;
	 */

	public Flight() {
	}

	/**
	 * @param flightNo
	 * @param carrierName
	 * @param flightModel
	 * @param seatCapacity
	 */
	public Flight(Integer flightNo, String carrierName, int seatCapacity, String srcAirport, String dstnAirport, String arrDateTime, String deptDateTime,Integer availableSeats) {
		super();
		this.flightNo = flightNo;
		this.carrierName = carrierName;
		this.availableSeats = availableSeats;
		this.srcAirport=srcAirport;
		this.dstnAirport = dstnAirport;
		this.arrDateTime= arrDateTime;
		this.deptDateTime = deptDateTime;
		this.seatCapacity = seatCapacity;
	}

	/**
	 * @return the flightNo
	 */
	public Integer getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(Integer flightNo) {
		this.flightNo = flightNo;
	}

	
	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}
	public Integer getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(Integer availableSeats) {
		this.availableSeats = availableSeats;
	}

	public String getSrcAirport() {
		return srcAirport;
	}

	public void setSrcAirport(String srcAirport) {
		this.srcAirport = srcAirport;
	}

	public String getDstnAirport() {
		return dstnAirport;
	}

	public void setDstnAirport(String dstnAirport) {
		this.dstnAirport = dstnAirport;
	}

	public String getDeptDateTime() {
		return deptDateTime;
	}

	public void setDeptDateTime(String deptDateTime) {
		this.deptDateTime = deptDateTime;
	}

	public String getArrDateTime() {
		return arrDateTime;
	}

	public void setArrDateTime(String arrDateTime) {
		this.arrDateTime = arrDateTime;
	}


	public int getSeatCapacity() {
		return seatCapacity;
	}


	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

	@Override
	public String toString() {
		return "Flight [flightNo=" + flightNo + ",carrierName=" + carrierName + ",seatCapacity=" + seatCapacity + ",srcAirport ="+srcAirport+",dstnAirport ="+dstnAirport+", arrDateTime ="+arrDateTime+",deptDateTime="+deptDateTime+",availableSeats ="+availableSeats+"]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carrierName == null) ? 0 : carrierName.hashCode());
		result = prime * result + ((flightNo == null) ? 0 : flightNo.hashCode());
		result = prime * result + seatCapacity;
		result = prime * result + ((availableSeats == null) ? 0 : availableSeats.hashCode());
		result = prime * result + ((arrDateTime == null) ? 0 : arrDateTime.hashCode());
		result = prime * result + ((deptDateTime == null) ? 0 : deptDateTime.hashCode());
		result = prime * result + ((dstnAirport == null) ? 0 : dstnAirport.hashCode());
		result = prime * result + ((srcAirport == null) ? 0 : srcAirport.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		if (carrierName == null) {
			if (other.carrierName != null)
				return false;
		} else if (!carrierName.equals(other.carrierName))
			return false;
		if (availableSeats == null) {
			if (other.availableSeats != null)
				return false;
		} else if (!availableSeats.equals(other.availableSeats))
			return false;
		if (arrDateTime == null) {
			if (other.arrDateTime != null)
				return false;
		} else if (!arrDateTime.equals(other.arrDateTime))
			return false;
		if (deptDateTime == null) {
			if (other.deptDateTime != null)
				return false;
		} else if (!deptDateTime.equals(other.deptDateTime))
			return false;
		if (dstnAirport == null) {
			if (other.dstnAirport != null)
				return false;
		} else if (!dstnAirport.equals(other.dstnAirport))
			return false;
		
		if (srcAirport == null) {
			if (other.srcAirport != null)
				return false;
		} else if (!srcAirport.equals(other.srcAirport))
			return false;
		if (flightNo == null) {
			if (other.flightNo != null)
				return false;
		} else if (!flightNo.equals(other.flightNo))
			return false;
		if (seatCapacity != other.seatCapacity)
			return false;
		return true;
	}

	

}
