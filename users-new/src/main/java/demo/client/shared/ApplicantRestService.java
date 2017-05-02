package demo.client.shared;

import org.kie.appformer.formmodeler.rendering.client.shared.AppFormerRestService;
import javax.ws.rs.Path;
import demo.client.shared.Applicant;
import java.util.List;

@Path("applicant")
public interface ApplicantRestService extends AppFormerRestService<Applicant> {
}