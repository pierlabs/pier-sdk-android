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
   * Altera o status de uma proposta
   * Este servi\u00E7o altera o status de uma proposta
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da Proposta (id)
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
   * Altera parcialmente a proposta.
   * Este recurso permite alterar os campos de uma proposta.
   * @param id Indentificador da proposta.
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
   * Busca uma proposta pelo seu identificador
   * Este servi\u00E7o busca uma proposta pelo seu identificador
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da Proposta (id)
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
   * Cria\u00E7\u00E3o de documento proposta
   * Cria um documento proposta e envia o arquivo relacionado a ele para o armazenamento na nuvem
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
   * Lista todas as propostas
   * Este servi\u00E7o lista todas as propostas
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param status Status da proposta
   * @param idPessoaFisica Identificador da Pessoa Fisica
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
   * Lista Documento Cr\u00E9dito
   * Lista os documentos cr\u00E9dito que s\u00E3o os tipos de documentos proposta
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do documento cr\u00E9dito(id)
   * @param descricao Descri\u00E7\u00E3o do tipo de documento cr\u00E9dito
   * @param tela Sinaliza a flag tela 
   * @param doc Sinaliza a flag doc
   * @param idAtividadeDeCredito C\u00F3digo de identifica\u00E7\u00E3o da atividade de cr\u00E9dito
   * @param obrigatorio Sinaliza a flag obrigaroio
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
   * Lista Documentos proposta
   * Lista os documentos proposta filtrados
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do documento proposta(id)
   * @param idProposta C\u00F3digo de identifica\u00E7\u00E3o da proposta(id)
   * @param idDocumentosCredito C\u00F3digo de identifica\u00E7\u00E3o para o tipo do documento
   * @param idStatusDocumentosCredito C\u00F3digo de identifica\u00E7\u00E3o do Status do documento cr\u00E9dito
   * @param idCondicoesDocumentosCredito C\u00F3digo de identifica\u00E7\u00E3o da condi\u00E7\u00E3o do documento cr\u00E9dito
   * @param idTipoDocumentoCredito C\u00F3digo de identifica\u00E7\u00E3o do tipo do documento cr\u00E9dito
   * @param idPessoaFisica C\u00F3digo de identifica\u00E7\u00E3o da pessoa f\u00EDsica
   * @param idLogAtendimento C\u00F3digo de identifica\u00E7\u00E3o do Log de Atendimento
   * @param responsavel Respons\u00E1vel
   * @param flagDocumentoDigitalizado Indica se o documento ser\u00E1 digitalizado
   * @param documentoDigitalizado Nome do documento digitalizado
   * @param seqAnaliseCondicao C\u00F3digo de sequ\u00EAncia de analise de condi\u00E7\u00E3o
   * @param observacao Observa\u00E7\u00E3o
   * @param dataStatus Data de status
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
   * Lista todos os status poss\u00EDveis nas propostas existentes
   * Este servi\u00E7o lista todos os status poss\u00EDveis nas propostas existentes
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param status Status da proposta
   * @param flagPermiteAlteracao Flag que permite a altera\u00E7\u00E3o do status da proposta
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
