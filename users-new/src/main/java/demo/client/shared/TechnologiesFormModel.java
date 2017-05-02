package demo.client.shared;

import org.kie.appformer.formmodeler.rendering.client.shared.FormModel;
import org.jboss.errai.common.client.api.annotations.Portable;
import org.jboss.errai.databinding.client.api.Bindable;
import javax.inject.Named;
import javax.validation.Valid;
import org.jboss.errai.common.client.api.annotations.MapsTo;

@Portable
@Bindable
@Named("TechnologiesFormModel")
public class TechnologiesFormModel extends FormModel<Technologies> {

	@Valid
	private Technologies technologies;

	public Technologies getTechnologies() {
		return technologies;
	}

	public void setTechnologies(Technologies technologies) {
		this.technologies = technologies;
	}

	@Override
	public Technologies getModel() {
		return technologies;
	}

	@Override
	public void initModel() {
		technologies = new Technologies();
	}

	public TechnologiesFormModel() {
	}

	public TechnologiesFormModel(
			@MapsTo("technologies") demo.client.shared.Technologies technologies) {
		this.technologies = technologies;
	}
}