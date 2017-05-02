package demo.client.local;

import org.kie.appformer.formmodeler.rendering.client.view.FormView;
import java.util.List;
import java.util.ArrayList;
import demo.client.shared.TechnologiesFormModel;
import demo.client.shared.Technologies;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import javax.inject.Named;
import org.gwtbootstrap3.client.ui.SimpleCheckBox;
import javax.inject.Inject;
import org.jboss.errai.ui.shared.api.annotations.Bound;
import org.jboss.errai.ui.shared.api.annotations.DataField;

@Templated
@Named("TechnologiesFormView")
public class TechnologiesFormView
		extends
			FormView<Technologies, TechnologiesFormModel> {

	@Inject
	@Bound(property = "technologies.hasJavaSkill")
	@DataField
	private SimpleCheckBox technologies_hasJavaSkill;
	@Inject
	@Bound(property = "technologies.hasJavaScriptSkill")
	@DataField
	private SimpleCheckBox technologies_hasJavaScriptSkill;
	@Inject
	@Bound(property = "technologies.hasDroolsSkill")
	@DataField
	private SimpleCheckBox technologies_hasDroolsSkill;
	@Inject
	@Bound(property = "technologies.hasJBPMSkill")
	@DataField
	private SimpleCheckBox technologies_hasJBPMSkill;
	@Inject
	@Bound(property = "technologies.hasAngularSkill")
	@DataField
	private SimpleCheckBox technologies_hasAngularSkill;
	@Inject
	@Bound(property = "technologies.hasHTMLCSSSkill")
	@DataField
	private SimpleCheckBox technologies_hasHTMLCSSSkill;

	@Override
	protected void initForm() {
		validator.registerInput("technologies_hasJavaSkill",
				technologies_hasJavaSkill);
		validator.registerInput("technologies_hasJavaScriptSkill",
				technologies_hasJavaScriptSkill);
		validator.registerInput("technologies_hasDroolsSkill",
				technologies_hasDroolsSkill);
		validator.registerInput("technologies_hasJBPMSkill",
				technologies_hasJBPMSkill);
		validator.registerInput("technologies_hasAngularSkill",
				technologies_hasAngularSkill);
		validator.registerInput("technologies_hasHTMLCSSSkill",
				technologies_hasHTMLCSSSkill);
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
		technologies_hasJavaSkill.setEnabled(!readOnly);
		technologies_hasJavaScriptSkill.setEnabled(!readOnly);
		technologies_hasDroolsSkill.setEnabled(!readOnly);
		technologies_hasJBPMSkill.setEnabled(!readOnly);
		technologies_hasAngularSkill.setEnabled(!readOnly);
		technologies_hasHTMLCSSSkill.setEnabled(!readOnly);
	}
}