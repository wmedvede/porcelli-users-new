package demo.client.shared;

import org.kie.appformer.formmodeler.rendering.client.shared.FormModel;
import org.jboss.errai.common.client.api.annotations.Portable;
import org.jboss.errai.databinding.client.api.Bindable;
import javax.inject.Named;
import javax.validation.Valid;
import org.jboss.errai.common.client.api.annotations.MapsTo;

@Portable
@Bindable
@Named("ApplicantFormModel")
public class ApplicantFormModel extends FormModel<Applicant> {

	@Valid
	private Applicant applicant;

	public Applicant getApplicant() {
		return applicant;
	}

	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}

	@Override
	public Applicant getModel() {
		return applicant;
	}

	@Override
	public void initModel() {
		applicant = new Applicant();
	}

	public ApplicantFormModel() {
	}

	public ApplicantFormModel(
			@MapsTo("applicant") demo.client.shared.Applicant applicant) {
		this.applicant = applicant;
	}
}