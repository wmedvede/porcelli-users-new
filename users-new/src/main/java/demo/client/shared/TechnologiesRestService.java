package demo.client.shared;

import org.kie.appformer.formmodeler.rendering.client.shared.AppFormerRestService;
import javax.ws.rs.Path;
import demo.client.shared.Technologies;
import java.util.List;

@Path("technologies")
public interface TechnologiesRestService
		extends
			AppFormerRestService<Technologies> {
}