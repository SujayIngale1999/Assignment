package com.example12.OneToOneRelationship;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "User_Table")
@Entity
public class UserDetails implements Serializable 
{
	/**
     * 
     */
	 private static final long serialVersionUID = -8017419482859508803L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long userID;
	    private String userName;
	    @Override
		public String toString() {
			return "UserDetails [userID=" + userID + ", userName=" + userName + ", address=" + address + "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(address, userID, userName);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			UserDetails other = (UserDetails) obj;
			return Objects.equals(address, other.address) && Objects.equals(userID, other.userID)
					&& Objects.equals(userName, other.userName);
		}
		public Long getUserID() {
			return userID;
		}
		public void setUserID(Long userID) {
			this.userID = userID;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		@OneToOne(cascade = CascadeType.ALL)
	    private Address address;
}
