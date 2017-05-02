package demo.client.shared;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Address implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(generator = "ADDRESS_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "ADDRESS_ID_GENERATOR", sequenceName = "ADDRESS_ID_SEQ")
	private java.lang.Long id;

	@org.kie.api.definition.type.Label(value = "Street")
	private java.lang.String street;

	@org.kie.api.definition.type.Label(value = "City")
	private java.lang.String city;

	@org.kie.api.definition.type.Label(value = "State")
	private java.lang.String state;

	@org.kie.api.definition.type.Label(value = "Zip Code")
	private java.lang.String zip;

	@org.kie.api.definition.type.Label(value = "Country")
	private java.lang.String country;

	public Address() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getStreet() {
		return this.street;
	}

	public void setStreet(java.lang.String street) {
		this.street = street;
	}

	public java.lang.String getCity() {
		return this.city;
	}

	public void setCity(java.lang.String city) {
		this.city = city;
	}

	public java.lang.String getState() {
		return this.state;
	}

	public void setState(java.lang.String state) {
		this.state = state;
	}

	public java.lang.String getZip() {
		return this.zip;
	}

	public void setZip(java.lang.String zip) {
		this.zip = zip;
	}

	public java.lang.String getCountry() {
		return this.country;
	}

	public void setCountry(java.lang.String country) {
		this.country = country;
	}

	public Address(java.lang.Long id, java.lang.String street,
			java.lang.String city, java.lang.String state,
			java.lang.String zip, java.lang.String country) {
		this.id = id;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}

}