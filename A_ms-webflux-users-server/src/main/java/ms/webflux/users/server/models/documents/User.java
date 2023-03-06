package ms.webflux.users.server.models.documents;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="users")
public class User {

	public User(String name, String lastname, Date dateRegistry, String address, String email, String phone, Boolean service, Double lastMonthRate) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.dateRegistry = dateRegistry;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.service = service;
		this.lastMonthRate = lastMonthRate;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getDateRegistry() {
		return dateRegistry;
	}
	public void setDateRegistry(Date dateRegistry) {
		this.dateRegistry = dateRegistry;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Boolean getService() {
		return service;
	}
	public void setService(Boolean service) {
		this.service = service;
	}
	public Double getLastMonthRate() {
		return lastMonthRate;
	}
	public void setLastMonthRate(Double lastMonthRate) {
		this.lastMonthRate = lastMonthRate;
	}
	
	
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", lastname=" + lastname + ", dateRegistry=" + dateRegistry
				+ ", address=" + address + ", email=" + email + ", phone=" + phone + ", service=" + service
				+ ", lastMonthRate=" + lastMonthRate + "]";
	}




	@Id
	private String id;
	private String name;
	private String lastname;
	private Date dateRegistry;
	private String address;
	private String email;
	private String phone;
	private Boolean service;
	private Double lastMonthRate;
}
