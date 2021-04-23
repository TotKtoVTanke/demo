package om.viks.demo.mySOAPService;

import javax.jws.WebService;

@WebService(endpointInterface = "om.viks.demo.mySOAPService.GetDocument")
public class GetDocumentImpl implements GetDocument {
    @Override
    public String getDocumentInfo(String anyArgs, String args2) {
        return anyArgs + " checking " + args2;
    }

}
