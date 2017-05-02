package demo.client.local;

import org.kie.appformer.formmodeler.rendering.client.view.ListView;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import demo.client.shared.AddressFormModel;
import demo.client.local.AddressFormView;
import demo.client.shared.AddressRestService;
import java.util.List;
import java.util.ArrayList;
import org.uberfire.ext.widgets.table.client.ColumnMeta;
import com.google.gwt.user.cellview.client.TextColumn;
import java.lang.Override;
import demo.client.shared.Address;

@Templated
public class AddressListView extends ListView<Address, AddressFormModel> {

	@Override
	public String getListTitle() {
		return "Address";
	}

	@Override
	public String getFormTitle() {
		return "Address Form";
	}

	@Override
	protected String getFormId() {
		return "Address Form";
	}

	@Override
	public List<ColumnMeta<Address>> getCrudColumns() {
		List<ColumnMeta<Address>> columnMetas = new ArrayList<>();
		ColumnMeta<Address> street_columnMeta = new ColumnMeta<Address>(
				new TextColumn<Address>() {
					@Override
					public String getValue(Address model) {
						Object value = model.getStreet();
						if (value == null) {
							return "";
						}
						return String.valueOf(value);
					}
				}, "Street");
		columnMetas.add(street_columnMeta);
		ColumnMeta<Address> city_columnMeta = new ColumnMeta<Address>(
				new TextColumn<Address>() {
					@Override
					public String getValue(Address model) {
						Object value = model.getCity();
						if (value == null) {
							return "";
						}
						return String.valueOf(value);
					}
				}, "City");
		columnMetas.add(city_columnMeta);
		ColumnMeta<Address> state_columnMeta = new ColumnMeta<Address>(
				new TextColumn<Address>() {
					@Override
					public String getValue(Address model) {
						Object value = model.getState();
						if (value == null) {
							return "";
						}
						return String.valueOf(value);
					}
				}, "State");
		columnMetas.add(state_columnMeta);
		ColumnMeta<Address> zip_columnMeta = new ColumnMeta<Address>(
				new TextColumn<Address>() {
					@Override
					public String getValue(Address model) {
						Object value = model.getZip();
						if (value == null) {
							return "";
						}
						return String.valueOf(value);
					}
				}, "Zip Code");
		columnMetas.add(zip_columnMeta);
		ColumnMeta<Address> country_columnMeta = new ColumnMeta<Address>(
				new TextColumn<Address>() {
					@Override
					public String getValue(Address model) {
						Object value = model.getCountry();
						if (value == null) {
							return "";
						}
						return String.valueOf(value);
					}
				}, "Country");
		columnMetas.add(country_columnMeta);
		return columnMetas;
	}

	@Override
	public AddressFormModel createFormModel(Address address) {
		AddressFormModel formModel = new AddressFormModel();
		formModel.setAddress(address);
		return formModel;
	}

	public Address newModel() {
		return new Address();
	}
}