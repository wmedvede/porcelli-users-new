package demo.server;

import demo.client.shared.Applicant;
import java.util.List;
import demo.client.shared.ApplicantRestService;
import javax.inject.Inject;
import javax.ejb.Stateless;
import org.kie.appformer.formmodeler.rendering.client.shared.query.QueryCriteria;

@Stateless
public class ApplicantRestServiceImpl implements ApplicantRestService {

	@Inject
	private ApplicantEntityService entityService;

	@Override
	public Applicant create(Applicant model) {
		return entityService.create(model);
	}

	public Applicant lookup(long id) {
		return entityService.lookup(Applicant.class, id);
	}

	@Override
	public List<Applicant> load() {
		return entityService.listAll(Applicant.class);
	}

	@Override
	public List<Applicant> load(int start, int end) {
		return entityService.list(Applicant.class, start, end);
	}

	@Override
	public Boolean update(Applicant model) {
		entityService.update(model);
		return true;
	}

	@Override
	public Boolean delete(Applicant model) {
		entityService.delete(model);
		return true;
	}

	@Override
	public List<Applicant> list(QueryCriteria criteria) {
		return entityService.list(Applicant.class, criteria);
	}
}