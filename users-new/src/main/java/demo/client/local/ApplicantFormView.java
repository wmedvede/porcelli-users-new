package demo.client.local;

import org.kie.appformer.formmodeler.rendering.client.view.FormView;
import java.util.List;
import java.util.ArrayList;
import demo.client.shared.ApplicantFormModel;
import demo.client.shared.Applicant;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import javax.inject.Named;
import org.kie.appformer.formmodeler.rendering.client.shared.fields.SubForm;
import demo.client.shared.Base;
import demo.client.shared.BaseFormModel;
import demo.client.local.BaseFormView;
import org.kie.appformer.formmodeler.rendering.client.shared.fields.SubFormModelAdapter;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import demo.client.shared.Address;
import demo.client.shared.AddressFormModel;
import demo.client.local.AddressFormView;
import demo.client.shared.Technologies;
import demo.client.shared.TechnologiesFormModel;
import demo.client.local.TechnologiesFormView;
import org.gwtbootstrap3.client.ui.TextArea;
import javax.inject.Inject;
import org.jboss.errai.ui.shared.api.annotations.Bound;

@Templated
@Named("ApplicantFormView")
public class ApplicantFormView extends FormView<Applicant, ApplicantFormModel> {

	@DataField
	private SubForm applicant_base = new SubForm(
			new Applicant_baseSubFormModelAdapter());
	@DataField
	private SubForm applicant_address = new SubForm(
			new Applicant_addressSubFormModelAdapter());
	@DataField
	private SubForm applicant_technologies = new SubForm(
			new Applicant_technologiesSubFormModelAdapter());
	@Inject
	@Bound(property = "applicant.notes")
	@DataField
	private TextArea applicant_notes;

	@Override
	protected void initForm() {
		validator.registerInput("applicant_base", applicant_base);
		updateNestedModels(true);
		validator.registerInput("applicant_address", applicant_address);
		validator.registerInput("applicant_technologies",
				applicant_technologies);
		validator.registerInput("applicant_notes", applicant_notes);
	}

	@Override
	public void beforeDisplay() {
	}

	@Override
	public boolean doExtraValidations() {
		boolean valid = true;
		if (!applicant_technologies.validate() && valid) {
			valid = false;
		}
		if (!applicant_address.validate() && valid) {
			valid = false;
		}
		if (!applicant_base.validate() && valid) {
			valid = false;
		}
		return valid;
	}

	public class Applicant_baseSubFormModelAdapter
			implements
				SubFormModelAdapter<Base, BaseFormModel> {
		@Override
		public Class<BaseFormView> getFormViewType() {
			return BaseFormView.class;
		}

		@Override
		public BaseFormModel getFormModelForModel(Base model) {
			return new BaseFormModel(model);
		}
	}

	@Override
	protected void updateNestedModels(boolean init) {
		demo.client.shared.Base base = getModel().getApplicant().getBase();
		if (base == null && init) {
			base = new demo.client.shared.Base();
			getModel().getApplicant().setBase(base);
		}
		applicant_base.setModel(base);
		demo.client.shared.Address address = getModel().getApplicant()
				.getAddress();
		if (address == null && init) {
			address = new demo.client.shared.Address();
			getModel().getApplicant().setAddress(address);
		}
		applicant_address.setModel(address);
		demo.client.shared.Technologies technologies = getModel()
				.getApplicant().getTechnologies();
		if (technologies == null && init) {
			technologies = new demo.client.shared.Technologies();
			getModel().getApplicant().setTechnologies(technologies);
		}
		applicant_technologies.setModel(technologies);
	}

	@Override
	public void setModel(ApplicantFormModel model) {
		super.setModel(model);
		updateNestedModels(false);
	}

	public class Applicant_addressSubFormModelAdapter
			implements
				SubFormModelAdapter<Address, AddressFormModel> {
		@Override
		public Class<AddressFormView> getFormViewType() {
			return AddressFormView.class;
		}

		@Override
		public AddressFormModel getFormModelForModel(Address model) {
			return new AddressFormModel(model);
		}
	}

	public class Applicant_technologiesSubFormModelAdapter
			implements
				SubFormModelAdapter<Technologies, TechnologiesFormModel> {
		@Override
		public Class<TechnologiesFormView> getFormViewType() {
			return TechnologiesFormView.class;
		}

		@Override
		public TechnologiesFormModel getFormModelForModel(Technologies model) {
			return new TechnologiesFormModel(model);
		}
	}

	@Override
	public void setReadOnly(boolean readOnly) {
		applicant_base.setReadOnly(readOnly);
		applicant_address.setReadOnly(readOnly);
		applicant_technologies.setReadOnly(readOnly);
		applicant_notes.setReadOnly(readOnly);
	}
}