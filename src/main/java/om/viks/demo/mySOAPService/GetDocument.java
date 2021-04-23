package om.viks.demo.mySOAPService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface GetDocument {
    @WebMethod String getDocumentInfo(String anyArgs, String arg2);

}
