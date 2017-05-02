package demo.client.local;

import demo.client.shared.Applicant;
import demo.client.shared.ApplicantFormModel;
import demo.client.shared.ApplicantRestService;
import org.kie.appformer.flow.api.Unit;
import java.util.Optional;
import org.kie.appformer.flow.api.Command;
import org.kie.appformer.flow.api.FormOperation;
import org.kie.appformer.formmodeler.rendering.client.flow.FlowProducer;
import org.jboss.errai.ioc.client.api.EntryPoint;
import javax.inject.Singleton;
import javax.enterprise.inject.Produces;
import org.kie.appformer.flow.api.AppFlow;
import org.kie.appformer.formmodeler.rendering.client.flow.ForEntity;
import javax.inject.Named;

@EntryPoint
public class ApplicantFlowProducer
		extends
			FlowProducer<Applicant, ApplicantFormModel, ApplicantFormView, ApplicantListView, ApplicantRestService> {

	@Override
	public ApplicantFormModel modelToFormModel(Applicant model) {
		return new ApplicantFormModel(model);
	}

	@Override
	public Applicant formModelToModel(ApplicantFormModel formModel) {
		return formModel.getApplicant();
	}

	@Override
	public Applicant newModel() {
		return new Applicant();
	}

	@Override
	public Class<Applicant> getModelType() {
		return Applicant.class;
	}

	@Override
	public Class<ApplicantFormModel> getFormModelType() {
		return ApplicantFormModel.class;
	}

	@Singleton
	@Produces
	public Class<Applicant> entityType() {
		return Applicant.class;
	}

	@Override
	@Produces
	@Singleton
	@ForEntity("demo.client.shared.Applicant")
	@Named("create")
	public AppFlow<Unit, Command<FormOperation, ApplicantFormModel>> create() {
		return super.create();
	}

	@Override
	@Produces
	@Singleton
	@ForEntity("demo.client.shared.Applicant")
	@Named("crud")
	public AppFlow<Unit, Unit> crud() {
		return super.crud();
	}

	@Override
	@Produces
	@Singleton
	@ForEntity("demo.client.shared.Applicant")
	@Named("createAndReview")
	public AppFlow<Unit, Unit> createAndReview() {
		return super.createAndReview();
	}

	@Override
	@Produces
	@Singleton
	@ForEntity("demo.client.shared.Applicant")
	@Named("view")
	public AppFlow<Unit, Unit> view() {
		return super.view();
	}
}