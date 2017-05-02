package demo.client.local;

import org.kie.appformer.formmodeler.rendering.client.view.FormView;
import java.util.List;
import java.util.ArrayList;
import demo.client.shared.BaseFormModel;
import demo.client.shared.Base;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import javax.inject.Named;
import org.gwtbootstrap3.client.ui.TextBox;
import javax.inject.Inject;
import org.jboss.errai.ui.shared.api.annotations.Bound;
import org.jboss.errai.ui.shared.api.annotations.DataField;

@Templated
@Named("BaseFormView")
public class BaseFormView extends FormView<Base, BaseFormModel> {

	@Inject
	@Bound(property = "base.name")
	@DataField
	private TextBox base_name;
	@Inject
	@Bound(property = "base.email")
	@DataField
	private TextBox base_email;
	@Inject
	@Bound(property = "base.twitter")
	@DataField
	private TextBox base_twitter;
	@Inject
	@Bound(property = "base.phone")
	@DataField
	private TextBox base_phone;
	@Inject
	@Bound(property = "base.yearsOfExperience")
	@DataField
	private TextBox base_yearsOfExperience;

	@Override
	protected void initForm() {
		validator.registerInput("base_name", base_name);
		validator.registerInput("base_email", base_email);
		validator.registerInput("base_twitter", base_twitter);
		validator.registerInput("base_phone", base_phone);
		validator.registerInput("base_yearsOfExperience",
				base_yearsOfExperience);
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
		base_name.setReadOnly(readOnly);
		base_email.setReadOnly(readOnly);
		base_twitter.setReadOnly(readOnly);
		base_phone.setReadOnly(readOnly);
		base_yearsOfExperience.setReadOnly(readOnly);
	}
}