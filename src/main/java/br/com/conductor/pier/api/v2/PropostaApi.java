package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.PropostaResponse;
import br.com.conductor.pier.api.v2.model.StatusPropostaUpdate;
import br.com.conductor.pier.api.v2.model.PropostaParcialUpdate;
import br.com.conductor.pier.api.v2.model.DocumentoPropostaResponse;
import br.com.conductor.pier.api.v2.model.DocumentoPropostaPersist;
import br.com.conductor.pier.api.v2.model.PagePropostaResponse;
import br.com.conductor.pier.api.v2.model.PageDocumentoCreditoResponse;
import br.com.conductor.pier.api.v2.model.PageDocumentoPropostaResponse;
import br.com.conductor.pier.api.v2.model.PageStatusPropostaResponse;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class PropostaApi {
  String basePath = "http://localhost/";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  
  /**
   * Changes the status of a proposal
   * This service changes the status of a proposal
   * @param id Proposal Identification Code (id)
   * @param update update
   * @return PropostaResponse
   */
  public PropostaResponse  alterar (Long id, StatusPropostaUpdate update) throws ApiException {
    Object postBody = update;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterar");
    }
    
    // verify the required parameter 'update' is set
    if (update == null) {
       throw new ApiException(400, "Missing the required parameter 'update' when calling alterar");
    }
    

    // create path and map variables
    String path = "/api/propostas/{id}/alterar-status".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PropostaResponse) ApiInvoker.deserialize(response, "", PropostaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Partially updates a proposal.
   * This feature allows you to partially update a proposal.
   * @param id Propostal Identifier
   * @param propostaParcialUpdate propostaParcialUpdate
   * @return PropostaResponse
   */
  public PropostaResponse  alterarParcial (Long id, PropostaParcialUpdate propostaParcialUpdate) throws ApiException {
    Object postBody = propostaParcialUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarParcial");
    }
    
    // verify the required parameter 'propostaParcialUpdate' is set
    if (propostaParcialUpdate == null) {
       throw new ApiException(400, "Missing the required parameter 'propostaParcialUpdate' when calling alterarParcial");
    }
    

    // create path and map variables
    String path = "/api/propostas/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PATCH", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PropostaResponse) ApiInvoker.deserialize(response, "", PropostaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Search for a proposal by its identifier
   * This service searches for a proposal by its identifier
   * @param id Proposal Identification Code (id)
   * @return PropostaResponse
   */
  public PropostaResponse  consultar (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultar");
    }
    

    // create path and map variables
    String path = "/api/propostas/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PropostaResponse) ApiInvoker.deserialize(response, "", PropostaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Create a new document for a proposal
   * Create a new document for a specific proposal and send a image file related to this document 
   * @param persist persist
   * @return DocumentoPropostaResponse
   */
  public DocumentoPropostaResponse  enviarDocumentoProposta (DocumentoPropostaPersist persist) throws ApiException {
    Object postBody = persist;
    
    // verify the required parameter 'persist' is set
    if (persist == null) {
       throw new ApiException(400, "Missing the required parameter 'persist' when calling enviarDocumentoProposta");
    }
    

    // create path and map variables
    String path = "/api/documentos-propostas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (DocumentoPropostaResponse) ApiInvoker.deserialize(response, "", DocumentoPropostaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List all proposals
   * This service list all proposals
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param status Proposal status
   * @param idPessoaFisica idPhysicalPerson
   * @return PagePropostaResponse
   */
  public PagePropostaResponse  listar (List<String> sort, Integer page, Integer limit, Integer status, Long idPessoaFisica) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/propostas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "status", status));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idPessoaFisica", idPessoaFisica));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PagePropostaResponse) ApiInvoker.deserialize(response, "", PagePropostaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List all credit documents 
   * Lists all credit documents which are the types of documents for a proposal
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param id Identification code of the credit document(id)
   * @param descricao Description of the type for the credit document
   * @param tela Flag Screen
   * @param doc Flag Document
   * @param idAtividadeDeCredito Identification code of the AtividadeCredito(id)
   * @param obrigatorio Flag Obligatory
   * @return PageDocumentoCreditoResponse
   */
  public PageDocumentoCreditoResponse  listarDocumentosCredito (List<String> sort, Integer page, Integer limit, Long id, String descricao, Integer tela, Integer doc, Long idAtividadeDeCredito, Integer obrigatorio) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/documentos-creditos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tela", tela));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "doc", doc));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idAtividadeDeCredito", idAtividadeDeCredito));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "obrigatorio", obrigatorio));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PageDocumentoCreditoResponse) ApiInvoker.deserialize(response, "", PageDocumentoCreditoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List documents for a proposal
   * Lists the documents for a proposa
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param id Idenfitication code of the document proposal
   * @param idProposta Idenfitication code of the proposal
   * @param idDocumentosCredito Idenfitication code of the type of document
   * @param idStatusDocumentosCredito Idenfitication code of credit document status
   * @param idCondicoesDocumentosCredito Idenfitication code of credit credit condition
   * @param idTipoDocumentoCredito Idenfitication code of credit document type
   * @param idPessoaFisica Idenfitication code of person
   * @param idLogAtendimento Idenfitication code of log
   * @param responsavel Responsible
   * @param flagDocumentoDigitalizado Flag for digitalization of the document
   * @param documentoDigitalizado Name of the digital document
   * @param seqAnaliseCondicao Analytical Sequence code
   * @param observacao Note
   * @param dataStatus Status Date
   * @return PageDocumentoPropostaResponse
   */
  public PageDocumentoPropostaResponse  listarDocumentosProposta (List<String> sort, Integer page, Integer limit, Long id, Long idProposta, Long idDocumentosCredito, Long idStatusDocumentosCredito, Long idCondicoesDocumentosCredito, Long idTipoDocumentoCredito, Long idPessoaFisica, Long idLogAtendimento, String responsavel, Integer flagDocumentoDigitalizado, String documentoDigitalizado, Long seqAnaliseCondicao, String observacao, String dataStatus) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/documentos-propostas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idProposta", idProposta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idDocumentosCredito", idDocumentosCredito));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idStatusDocumentosCredito", idStatusDocumentosCredito));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idCondicoesDocumentosCredito", idCondicoesDocumentosCredito));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoDocumentoCredito", idTipoDocumentoCredito));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idPessoaFisica", idPessoaFisica));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idLogAtendimento", idLogAtendimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "responsavel", responsavel));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagDocumentoDigitalizado", flagDocumentoDigitalizado));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "documentoDigitalizado", documentoDigitalizado));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "seqAnaliseCondicao", seqAnaliseCondicao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "observacao", observacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataStatus", dataStatus));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PageDocumentoPropostaResponse) ApiInvoker.deserialize(response, "", PageDocumentoPropostaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lists all possible statuses in existing proposals
   * This service lists all possible statuses in existing proposals
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param status Proposal status
   * @param flagPermiteAlteracao Flag that allows you to change the status of the proposal
   * @return PageStatusPropostaResponse
   */
  public PageStatusPropostaResponse  listarStatusProposta (List<String> sort, Integer page, Integer limit, Integer status, Boolean flagPermiteAlteracao) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/status-propostas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "status", status));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagPermiteAlteracao", flagPermiteAlteracao));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PageStatusPropostaResponse) ApiInvoker.deserialize(response, "", PageStatusPropostaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
