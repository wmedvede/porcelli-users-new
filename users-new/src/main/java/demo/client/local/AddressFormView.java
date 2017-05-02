package demo.client.local;

import org.kie.appformer.formmodeler.rendering.client.view.FormView;
import java.util.List;
import java.util.ArrayList;
import demo.client.shared.AddressFormModel;
import demo.client.shared.Address;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import javax.inject.Named;
import org.gwtbootstrap3.client.ui.TextBox;
import javax.inject.Inject;
import org.jboss.errai.ui.shared.api.annotations.Bound;
import org.jboss.errai.ui.shared.api.annotations.DataField;

@Templated
@Named("AddressFormView")
public class AddressFormView extends FormView<Address, AddressFormModel> {

	@Inject
	@Bound(property = "address.street")
	@DataField
	private TextBox address_street;
	@Inject
	@Bound(property = "address.city")
	@DataField
	private TextBox address_city;
	@Inject
	@Bound(property = "address.zip")
	@DataField
	private TextBox address_zip;
	@Inject
	@Bound(property = "address.state")
	@DataField
	private TextBox address_state;
	@Inject
	@Bound(property = "address.country")
	@DataField
	private TextBox address_country;

	@Override
	protected void initForm() {
		validator.registerInput("address_street", address_street);
		validator.registerInput("address_city", address_city);
		validator.registerInput("address_zip", address_zip);
		validator.registerInput("address_state", address_state);
		validator.registerInput("address_country", address_country);
	}

	@Override
	public void beforeDisplay() {
	}

	@Override
	public boolean doExtraValidations() {
		boolean valid = true;
		return valid;
	}

	@Override
	public void setReadOnly(boolean readOnly) {
		address_street.setReadOnly(readOnly);
		address_city.setReadOnly(readOnly);
		address_zip.setReadOnly(readOnly);
		address_state.setReadOnly(readOnly);
		address_country.setReadOnly(readOnly);
	}
}