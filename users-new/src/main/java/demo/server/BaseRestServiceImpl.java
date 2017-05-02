package demo.server;

import demo.client.shared.Base;
import java.util.List;
import demo.client.shared.BaseRestService;
import javax.inject.Inject;
import javax.ejb.Stateless;
import org.kie.appformer.formmodeler.rendering.client.shared.query.QueryCriteria;

@Stateless
public class BaseRestServiceImpl implements BaseRestService {

	@Inject
	private BaseEntityService entityService;

	@Override
	public Base create(Base model) {
		return entityService.create(model);
	}

	public Base lookup(long id) {
		return entityService.lookup(Base.class, id);
	}

	@Override
	public List<Base> load() {
		return entityService.listAll(Base.class);
	}

	@Override
	public List<Base> load(int start, int end) {
		return entityService.list(Base.class, start, end);
	}

	@Override
	public Boolean update(Base model) {
		entityService.update(model);
		return true;
	}

	@Override
	public Boolean delete(Base model) {
		entityService.delete(model);
		return true;
	}

	@Override
	public List<Base> list(QueryCriteria criteria) {
		return entityService.list(Base.class, criteria);
	}
}