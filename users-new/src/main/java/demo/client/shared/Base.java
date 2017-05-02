package demo.client.shared;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Base implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(generator = "BASE_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "BASE_ID_GENERATOR", sequenceName = "BASE_ID_SEQ")
	private java.lang.Long id;

	@org.kie.api.definition.type.Label(value = "name")
	private java.lang.String name;

	@org.kie.api.definition.type.Label(value = "E-mail")
	private java.lang.String email;

	@org.kie.api.definition.type.Label(value = "Phone")
	private java.lang.String phone;

	@org.kie.api.definition.type.Label(value = "Twitter")
	private java.lang.String twitter;

	private java.lang.String yearsOfExperience;

	public Base() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getEmail() {
		return this.email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public java.lang.String getPhone() {
		return this.phone;
	}

	public void setPhone(java.lang.String phone) {
		this.phone = phone;
	}

	public java.lang.String getTwitter() {
		return this.twitter;
	}

	public void setTwitter(java.lang.String twitter) {
		this.twitter = twitter;
	}

	public java.lang.String getYearsOfExperience() {
		return this.yearsOfExperience;
	}

	public void setYearsOfExperience(java.lang.String yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public Base(java.lang.Long id, java.lang.String name,
			java.lang.String email, java.lang.String phone,
			java.lang.String twitter, java.lang.String yearsOfExperience) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.twitter = twitter;
		this.yearsOfExperience = yearsOfExperience;
	}

}