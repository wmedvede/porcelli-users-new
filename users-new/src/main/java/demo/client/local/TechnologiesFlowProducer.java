package demo.client.local;

import demo.client.shared.Technologies;
import demo.client.shared.TechnologiesFormModel;
import demo.client.shared.TechnologiesRestService;
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
public class TechnologiesFlowProducer
		extends
			FlowProducer<Technologies, TechnologiesFormModel, TechnologiesFormView, TechnologiesListView, TechnologiesRestService> {

	@Override
	public TechnologiesFormModel modelToFormModel(Technologies model) {
		return new TechnologiesFormModel(model);
	}

	@Override
	public Technologies formModelToModel(TechnologiesFormModel formModel) {
		return formModel.getTechnologies();
	}

	@Override
	public Technologies newModel() {
		return new Technologies();
	}

	@Override
	public Class<Technologies> getModelType() {
		return Technologies.class;
	}

	@Override
	public Class<TechnologiesFormModel> getFormModelType() {
		return TechnologiesFormModel.class;
	}

	@Singleton
	@Produces
	public Class<Technologies> entityType() {
		return Technologies.class;
	}

	@Override
	@Produces
	@Singleton
	@ForEntity("demo.client.shared.Technologies")
	@Named("create")
	public AppFlow<Unit, Command<FormOperation, TechnologiesFormModel>> create() {
		return super.create();
	}

	@Override
	@Produces
	@Singleton
	@ForEntity("demo.client.shared.Technologies")
	@Named("crud")
	public AppFlow<Unit, Unit> crud() {
		return super.crud();
	}

	@Override
	@Produces
	@Singleton
	@ForEntity("demo.client.shared.Technologies")
	@Named("createAndReview")
	public AppFlow<Unit, Unit> createAndReview() {
		return super.createAndReview();
	}

	@Override
	@Produces
	@Singleton
	@ForEntity("demo.client.shared.Technologies")
	@Named("view")
	public AppFlow<Unit, Unit> view() {
		return super.view();
	}
}