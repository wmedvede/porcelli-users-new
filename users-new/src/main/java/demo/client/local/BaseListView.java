package demo.client.local;

import org.kie.appformer.formmodeler.rendering.client.view.ListView;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import demo.client.shared.BaseFormModel;
import demo.client.local.BaseFormView;
import demo.client.shared.BaseRestService;
import java.util.List;
import java.util.ArrayList;
import org.uberfire.ext.widgets.table.client.ColumnMeta;
import com.google.gwt.user.cellview.client.TextColumn;
import java.lang.Override;
import demo.client.shared.Base;

@Templated
public class BaseListView extends ListView<Base, BaseFormModel> {

	@Override
	public String getListTitle() {
		return "Base";
	}

	@Override
	public String getFormTitle() {
		return "Base Form";
	}

	@Override
	protected String getFormId() {
		return "Base Form";
	}

	@Override
	public List<ColumnMeta<Base>> getCrudColumns() {
		List<ColumnMeta<Base>> columnMetas = new ArrayList<>();
		ColumnMeta<Base> name_columnMeta = new ColumnMeta<Base>(
				new TextColumn<Base>() {
					@Override
					public String getValue(Base model) {
						Object value = model.getName();
						if (value == null) {
							return "";
						}
						return String.valueOf(value);
					}
				}, "name");
		columnMetas.add(name_columnMeta);
		ColumnMeta<Base> email_columnMeta = new ColumnMeta<Base>(
				new TextColumn<Base>() {
					@Override
					public String getValue(Base model) {
						Object value = model.getEmail();
						if (value == null) {
							return "";
						}
						return String.valueOf(value);
					}
				}, "E-mail");
		columnMetas.add(email_columnMeta);
		ColumnMeta<Base> phone_columnMeta = new ColumnMeta<Base>(
				new TextColumn<Base>() {
					@Override
					public String getValue(Base model) {
						Object value = model.getPhone();
						if (value == null) {
							return "";
						}
						return String.valueOf(value);
					}
				}, "Phone");
		columnMetas.add(phone_columnMeta);
		ColumnMeta<Base> twitter_columnMeta = new ColumnMeta<Base>(
				new TextColumn<Base>() {
					@Override
					public String getValue(Base model) {
						Object value = model.getTwitter();
						if (value == null) {
							return "";
						}
						return String.valueOf(value);
					}
				}, "Twitter");
		columnMetas.add(twitter_columnMeta);
		ColumnMeta<Base> yearsOfExperience_columnMeta = new ColumnMeta<Base>(
				new TextColumn<Base>() {
					@Override
					public String getValue(Base model) {
						Object value = model.getYearsOfExperience();
						if (value == null) {
							return "";
						}
						return String.valueOf(value);
					}
				}, "yearsOfExperience");
		columnMetas.add(yearsOfExperience_columnMeta);
		return columnMetas;
	}

	@Override
	public BaseFormModel createFormModel(Base base) {
		BaseFormModel formModel = new BaseFormModel();
		formModel.setBase(base);
		return formModel;
	}

	public Base newModel() {
		return new Base();
	}
}