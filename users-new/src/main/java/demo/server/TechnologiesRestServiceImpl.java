package demo.server;

import demo.client.shared.Technologies;
import java.util.List;
import demo.client.shared.TechnologiesRestService;
import javax.inject.Inject;
import javax.ejb.Stateless;
import org.kie.appformer.formmodeler.rendering.client.shared.query.QueryCriteria;

@Stateless
public class TechnologiesRestServiceImpl implements TechnologiesRestService {

	@Inject
	private TechnologiesEntityService entityService;

	@Override
	public Technologies create(Technologies model) {
		return entityService.create(model);
	}

	public Technologies lookup(long id) {
		return entityService.lookup(Technologies.class, id);
	}

	@Override
	public List<Technologies> load() {
		return entityService.listAll(Technologies.class);
	}

	@Override
	public List<Technologies> load(int start, int end) {
		return entityService.list(Technologies.class, start, end);
	}

	@Override
	public Boolean update(Technologies model) {
		entityService.update(model);
		return true;
	}

	@Override
	public Boolean delete(Technologies model) {
		entityService.delete(model);
		return true;
	}

	@Override
	public List<Technologies> list(QueryCriteria criteria) {
		return entityService.list(Technologies.class, criteria);
	}
}