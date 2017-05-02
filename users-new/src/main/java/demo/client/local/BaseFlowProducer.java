package demo.client.local;

import demo.client.shared.Base;
import demo.client.shared.BaseFormModel;
import demo.client.shared.BaseRestService;
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
public class BaseFlowProducer
		extends
			FlowProducer<Base, BaseFormModel, BaseFormView, BaseListView, BaseRestService> {

	@Override
	public BaseFormModel modelToFormModel(Base model) {
		return new BaseFormModel(model);
	}

	@Override
	public Base formModelToModel(BaseFormModel formModel) {
		return formModel.getBase();
	}

	@Override
	public Base newModel() {
		return new Base();
	}

	@Override
	public Class<Base> getModelType() {
		return Base.class;
	}

	@Override
	public Class<BaseFormModel> getFormModelType() {
		return BaseFormModel.class;
	}

	@Singleton
	@Produces
	public Class<Base> entityType() {
		return Base.class;
	}

	@Override
	@Produces
	@Singleton
	@ForEntity("demo.client.shared.Base")
	@Named("create")
	public AppFlow<Unit, Command<FormOperation, BaseFormModel>> create() {
		return super.create();
	}

	@Override
	@Produces
	@Singleton
	@ForEntity("demo.client.shared.Base")
	@Named("crud")
	public AppFlow<Unit, Unit> crud() {
		return super.crud();
	}

	@Override
	@Produces
	@Singleton
	@ForEntity("demo.client.shared.Base")
	@Named("createAndReview")
	public AppFlow<Unit, Unit> createAndReview() {
		return super.createAndReview();
	}

	@Override
	@Produces
	@Singleton
	@ForEntity("demo.client.shared.Base")
	@Named("view")
	public AppFlow<Unit, Unit> view() {
		return super.view();
	}
}