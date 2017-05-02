package demo.client.local;

import org.kie.appformer.formmodeler.rendering.client.view.ListView;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import demo.client.shared.ApplicantFormModel;
import demo.client.local.ApplicantFormView;
import demo.client.shared.ApplicantRestService;
import java.util.List;
import java.util.ArrayList;
import org.uberfire.ext.widgets.table.client.ColumnMeta;
import com.google.gwt.user.cellview.client.TextColumn;
import java.lang.Override;
import demo.client.shared.Applicant;

@Templated
public class ApplicantListView extends ListView<Applicant, ApplicantFormModel> {

	@Override
	public String getListTitle() {
		return "Applicant";
	}

	@Override
	public String getFormTitle() {
		return "Applicant Form";
	}

	@Override
	protected String getFormId() {
		return "Applicant Form";
	}

	@Override
	public List<ColumnMeta<Applicant>> getCrudColumns() {
		List<ColumnMeta<Applicant>> columnMetas = new ArrayList<>();
		ColumnMeta<Applicant> notes_columnMeta = new ColumnMeta<Applicant>(
				new TextColumn<Applicant>() {
					@Override
					public String getValue(Applicant model) {
						Object value = model.getNotes();
						if (value == null) {
							return "";
						}
						return String.valueOf(value);
					}
				}, "HR Notes");
		columnMetas.add(notes_columnMeta);
		return columnMetas;
	}

	@Override
	public ApplicantFormModel createFormModel(Applicant applicant) {
		ApplicantFormModel formModel = new ApplicantFormModel();
		formModel.setApplicant(applicant);
		return formModel;
	}

	public Applicant newModel() {
		return new Applicant();
	}
}