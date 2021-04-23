
package om.viks.demo.generatedSrcFromWSDL;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the om.viks.demo.generatedSrcFromWSDL package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCovid19InfomationResponse_QNAME = new QName("http://www.yarcloud.ru/er76/", "GetCovid19InfomationResponse");
    private final static QName _GetPersonalDocumentsResponse_QNAME = new QName("http://www.yarcloud.ru/er76/", "GetPersonalDocumentsResponse");
    private final static QName _GetActualTypeSemdResponse_QNAME = new QName("http://www.yarcloud.ru/er76/", "GetActualTypeSemdResponse");
    private final static QName _GetIdentificatorsByMoResponse_QNAME = new QName("http://www.yarcloud.ru/er76/", "GetIdentificatorsByMoResponse");
    private final static QName _GetDocumentResponse_QNAME = new QName("http://www.yarcloud.ru/er76/", "GetDocumentResponse");
    private final static QName _GetPersonalBySnilsResponse_QNAME = new QName("http://www.yarcloud.ru/er76/", "GetPersonalBySnilsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: om.viks.demo.generatedSrcFromWSDL
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetActualTypeSemdRequest }
     * 
     */
    public GetActualTypeSemdRequest createGetActualTypeSemdRequest() {
        return new GetActualTypeSemdRequest();
    }

    /**
     * Create an instance of {@link GetCovid19InfomationRequest }
     * 
     */
    public GetCovid19InfomationRequest createGetCovid19InfomationRequest() {
        return new GetCovid19InfomationRequest();
    }

    /**
     * Create an instance of {@link GetDocumentRequest }
     * 
     */
    public GetDocumentRequest createGetDocumentRequest() {
        return new GetDocumentRequest();
    }

    /**
     * Create an instance of {@link GetIdentificatorsByMoRequest }
     * 
     */
    public GetIdentificatorsByMoRequest createGetIdentificatorsByMoRequest() {
        return new GetIdentificatorsByMoRequest();
    }

    /**
     * Create an instance of {@link GetPersonalBySnilsRequest }
     * 
     */
    public GetPersonalBySnilsRequest createGetPersonalBySnilsRequest() {
        return new GetPersonalBySnilsRequest();
    }

    /**
     * Create an instance of {@link GetPersonalDocumentsRequest }
     * 
     */
    public GetPersonalDocumentsRequest createGetPersonalDocumentsRequest() {
        return new GetPersonalDocumentsRequest();
    }

    /**
     * Create an instance of {@link GetCovid19InfomationResponse }
     * 
     */
    public GetCovid19InfomationResponse createGetCovid19InfomationResponse() {
        return new GetCovid19InfomationResponse();
    }

    /**
     * Create an instance of {@link GetPersonalDocumentsResponse }
     * 
     */
    public GetPersonalDocumentsResponse createGetPersonalDocumentsResponse() {
        return new GetPersonalDocumentsResponse();
    }

    /**
     * Create an instance of {@link GetActualTypeSemdResponse }
     * 
     */
    public GetActualTypeSemdResponse createGetActualTypeSemdResponse() {
        return new GetActualTypeSemdResponse();
    }

    /**
     * Create an instance of {@link GetIdentificatorsByMoResponse }
     * 
     */
    public GetIdentificatorsByMoResponse createGetIdentificatorsByMoResponse() {
        return new GetIdentificatorsByMoResponse();
    }

    /**
     * Create an instance of {@link GetDocumentResponse }
     * 
     */
    public GetDocumentResponse createGetDocumentResponse() {
        return new GetDocumentResponse();
    }

    /**
     * Create an instance of {@link GetPersonalBySnilsResponse }
     * 
     */
    public GetPersonalBySnilsResponse createGetPersonalBySnilsResponse() {
        return new GetPersonalBySnilsResponse();
    }

    /**
     * Create an instance of {@link ListStatusSnils }
     * 
     */
    public ListStatusSnils createListStatusSnils() {
        return new ListStatusSnils();
    }

    /**
     * Create an instance of {@link StatusSnils }
     * 
     */
    public StatusSnils createStatusSnils() {
        return new StatusSnils();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link ListDocuments }
     * 
     */
    public ListDocuments createListDocuments() {
        return new ListDocuments();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link ListTypeSemd }
     * 
     */
    public ListTypeSemd createListTypeSemd() {
        return new ListTypeSemd();
    }

    /**
     * Create an instance of {@link Semd }
     * 
     */
    public Semd createSemd() {
        return new Semd();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCovid19InfomationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCovid19InfomationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.yarcloud.ru/er76/", name = "GetCovid19InfomationResponse")
    public JAXBElement<GetCovid19InfomationResponse> createGetCovid19InfomationResponse(GetCovid19InfomationResponse value) {
        return new JAXBElement<GetCovid19InfomationResponse>(_GetCovid19InfomationResponse_QNAME, GetCovid19InfomationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonalDocumentsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersonalDocumentsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.yarcloud.ru/er76/", name = "GetPersonalDocumentsResponse")
    public JAXBElement<GetPersonalDocumentsResponse> createGetPersonalDocumentsResponse(GetPersonalDocumentsResponse value) {
        return new JAXBElement<GetPersonalDocumentsResponse>(_GetPersonalDocumentsResponse_QNAME, GetPersonalDocumentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActualTypeSemdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetActualTypeSemdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.yarcloud.ru/er76/", name = "GetActualTypeSemdResponse")
    public JAXBElement<GetActualTypeSemdResponse> createGetActualTypeSemdResponse(GetActualTypeSemdResponse value) {
        return new JAXBElement<GetActualTypeSemdResponse>(_GetActualTypeSemdResponse_QNAME, GetActualTypeSemdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdentificatorsByMoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetIdentificatorsByMoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.yarcloud.ru/er76/", name = "GetIdentificatorsByMoResponse")
    public JAXBElement<GetIdentificatorsByMoResponse> createGetIdentificatorsByMoResponse(GetIdentificatorsByMoResponse value) {
        return new JAXBElement<GetIdentificatorsByMoResponse>(_GetIdentificatorsByMoResponse_QNAME, GetIdentificatorsByMoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDocumentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.yarcloud.ru/er76/", name = "GetDocumentResponse")
    public JAXBElement<GetDocumentResponse> createGetDocumentResponse(GetDocumentResponse value) {
        return new JAXBElement<GetDocumentResponse>(_GetDocumentResponse_QNAME, GetDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonalBySnilsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersonalBySnilsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.yarcloud.ru/er76/", name = "GetPersonalBySnilsResponse")
    public JAXBElement<GetPersonalBySnilsResponse> createGetPersonalBySnilsResponse(GetPersonalBySnilsResponse value) {
        return new JAXBElement<GetPersonalBySnilsResponse>(_GetPersonalBySnilsResponse_QNAME, GetPersonalBySnilsResponse.class, null, value);
    }

}
