package demo.client.local;

import org.kie.appformer.formmodeler.rendering.client.view.ListView;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import demo.client.shared.TechnologiesFormModel;
import demo.client.local.TechnologiesFormView;
import demo.client.shared.TechnologiesRestService;
import java.util.List;
import java.util.ArrayList;
import org.uberfire.ext.widgets.table.client.ColumnMeta;
import com.google.gwt.user.cellview.client.Column;
import org.uberfire.ext.widgets.table.client.CheckboxCellImpl;
import demo.client.shared.Technologies;

@Templated
public class TechnologiesListView
		extends
			ListView<Technologies, TechnologiesFormModel> {

	@Override
	public String getListTitle() {
		return "Technologies";
	}

	@Override
	public String getFormTitle() {
		return "Technologies Form";
	}

	@Override
	protected String getFormId() {
		return "Technologies Form";
	}

	@Override
	public List<ColumnMeta<Technologies>> getCrudColumns() {
		List<ColumnMeta<Technologies>> columnMetas = new ArrayList<>();
		CheckboxCellImpl hasJavaSkill_columnMeta_checkbox = new CheckboxCellImpl(
				true);
		ColumnMeta<Technologies> hasJavaSkill_columnMeta = new ColumnMeta<Technologies>(
				new Column<Technologies, Boolean>(
						hasJavaSkill_columnMeta_checkbox) {
					@Override
					public Boolean getValue(Technologies model) {
						Boolean value = model.isHasJavaSkill();
						if (value == null) {
							return Boolean.FALSE;
						}
						return value;
					}
				}, "Java?");
		columnMetas.add(hasJavaSkill_columnMeta);
		CheckboxCellImpl hasDroolsSkill_columnMeta_checkbox = new CheckboxCellImpl(
				true);
		ColumnMeta<Technologies> hasDroolsSkill_columnMeta = new ColumnMeta<Technologies>(
				new Column<Technologies, Boolean>(
						hasDroolsSkill_columnMeta_checkbox) {
					@Override
					public Boolean getValue(Technologies model) {
						Boolean value = model.isHasDroolsSkill();
						if (value == null) {
							return Boolean.FALSE;
						}
						return value;
					}
				}, "Drools?");
		columnMetas.add(hasDroolsSkill_columnMeta);
		CheckboxCellImpl hasJBPMSkill_columnMeta_checkbox = new CheckboxCellImpl(
				true);
		ColumnMeta<Technologies> hasJBPMSkill_columnMeta = new ColumnMeta<Technologies>(
				new Column<Technologies, Boolean>(
						hasJBPMSkill_columnMeta_checkbox) {
					@Override
					public Boolean getValue(Technologies model) {
						Boolean value = model.isHasJBPMSkill();
						if (value == null) {
							return Boolean.FALSE;
						}
						return value;
					}
				}, "jBPM?");
		columnMetas.add(hasJBPMSkill_columnMeta);
		CheckboxCellImpl hasJavaScriptSkill_columnMeta_checkbox = new CheckboxCellImpl(
				true);
		ColumnMeta<Technologies> hasJavaScriptSkill_columnMeta = new ColumnMeta<Technologies>(
				new Column<Technologies, Boolean>(
						hasJavaScriptSkill_columnMeta_checkbox) {
					@Override
					public Boolean getValue(Technologies model) {
						Boolean value = model.isHasJavaScriptSkill();
						if (value == null) {
							return Boolean.FALSE;
						}
						return value;
					}
				}, "JavaScript?");
		columnMetas.add(hasJavaScriptSkill_columnMeta);
		CheckboxCellImpl hasAngularSkill_columnMeta_checkbox = new CheckboxCellImpl(
				true);
		ColumnMeta<Technologies> hasAngularSkill_columnMeta = new ColumnMeta<Technologies>(
				new Column<Technologies, Boolean>(
						hasAngularSkill_columnMeta_checkbox) {
					@Override
					public Boolean getValue(Technologies model) {
						Boolean value = model.isHasAngularSkill();
						if (value == null) {
							return Boolean.FALSE;
						}
						return value;
					}
				}, "AngularJS?");
		columnMetas.add(hasAngularSkill_columnMeta);
		CheckboxCellImpl hasHTMLCSSSkill_columnMeta_checkbox = new CheckboxCellImpl(
				true);
		ColumnMeta<Technologies> hasHTMLCSSSkill_columnMeta = new ColumnMeta<Technologies>(
				new Column<Technologies, Boolean>(
						hasHTMLCSSSkill_columnMeta_checkbox) {
					@Override
					public Boolean getValue(Technologies model) {
						Boolean value = model.isHasHTMLCSSSkill();
						if (value == null) {
							return Boolean.FALSE;
						}
						return value;
					}
				}, "HTML/CSS?");
		columnMetas.add(hasHTMLCSSSkill_columnMeta);
		return columnMetas;
	}

	@Override
	public TechnologiesFormModel createFormModel(Technologies technologies) {
		TechnologiesFormModel formModel = new TechnologiesFormModel();
		formModel.setTechnologies(technologies);
		return formModel;
	}

	public Technologies newModel() {
		return new Technologies();
	}
}