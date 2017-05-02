package demo.server;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;

@Stateless
@TransactionAttribute(javax.ejb.TransactionAttributeType.REQUIRES_NEW)
public class BaseEntityService extends org.kie.appformer.formmodeler.rendering.server.rest.BaseEntityService {
}