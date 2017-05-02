package demo.client.shared;

import org.kie.appformer.formmodeler.rendering.client.shared.AppFormerRestService;
import javax.ws.rs.Path;
import demo.client.shared.Base;
import java.util.List;

@Path("base")
public interface BaseRestService extends AppFormerRestService<Base> {
}