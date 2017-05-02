package demo.client.shared;

import org.kie.appformer.formmodeler.rendering.client.shared.FormModel;
import org.jboss.errai.common.client.api.annotations.Portable;
import org.jboss.errai.databinding.client.api.Bindable;
import javax.inject.Named;
import javax.validation.Valid;
import org.jboss.errai.common.client.api.annotations.MapsTo;

@Portable
@Bindable
@Named("BaseFormModel")
public class BaseFormModel extends FormModel<Base> {

	@Valid
	private Base base;

	public Base getBase() {
		return base;
	}

	public void setBase(Base base) {
		this.base = base;
	}

	@Override
	public Base getModel() {
		return base;
	}

	@Override
	public void initModel() {
		base = new Base();
	}

	public BaseFormModel() {
	}

	public BaseFormModel(@MapsTo("base") demo.client.shared.Base base) {
		this.base = base;
	}
}