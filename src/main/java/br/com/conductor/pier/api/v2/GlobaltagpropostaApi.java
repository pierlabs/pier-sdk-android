package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.PropostaResponse;
import br.com.conductor.pier.api.v2.model.PropostaParcialUpdate;
import br.com.conductor.pier.api.v2.model.StatusPropostaUpdate;
import br.com.conductor.pier.api.v2.model.DocumentoPropostaResponse;
import br.com.conductor.pier.api.v2.model.DocumentoPropostaPersist;
import br.com.conductor.pier.api.v2.model.PageDocumentoCreditoResponse;
import br.com.conductor.pier.api.v2.model.PageDocumentoPropostaResponse;
import br.com.conductor.pier.api.v2.model.PageStatusPropostaResponse;
import br.com.conductor.pier.api.v2.model.PagePropostaResponse;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class GlobaltagpropostaApi {
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
   * {{{proposta_resource_atualizar_parcial}}}
   * {{{proposta_resource_atualizar_parcial_notes}}}
   * @param id {{{proposta_resource_atualizar_parcial_param_id}}}
   * @param propostaParcialUpdate propostaParcialUpdate
   * @return PropostaResponse
   */
  public PropostaResponse  alterarParcialUsingPATCH (Long id, PropostaParcialUpdate propostaParcialUpdate) throws ApiException {
    Object postBody = propostaParcialUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarParcialUsingPATCH");
    }
    
    // verify the required parameter 'propostaParcialUpdate' is set
    if (propostaParcialUpdate == null) {
       throw new ApiException(400, "Missing the required parameter 'propostaParcialUpdate' when calling alterarParcialUsingPATCH");
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
   * {{{proposta_resource_alterar_status}}}
   * {{{proposta_resource_alterar_status_notes}}}
   * @param id {{{proposta_resource_alterar_status_param_id}}}
   * @param update update
   * @return PropostaResponse
   */
  public PropostaResponse  alterarUsingPOST (Long id, StatusPropostaUpdate update) throws ApiException {
    Object postBody = update;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPOST");
    }
    
    // verify the required parameter 'update' is set
    if (update == null) {
       throw new ApiException(400, "Missing the required parameter 'update' when calling alterarUsingPOST");
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
   * {{{proposta_resource_consultar}}}
   * {{{proposta_resource_consultar_notes}}}
   * @param id {{{proposta_resource_consultar_param_id}}}
   * @return PropostaResponse
   */
  public PropostaResponse  consultarUsingGET33 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET33");
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
   * {{{documento_proposta_resource_enviar}}}
   * {{{documento_proposta_resource_enviar_notes}}}
   * @param persist persist
   * @return DocumentoPropostaResponse
   */
  public DocumentoPropostaResponse  enviarDocumentoPropostaUsingPOST (DocumentoPropostaPersist persist) throws ApiException {
    Object postBody = persist;
    
    // verify the required parameter 'persist' is set
    if (persist == null) {
       throw new ApiException(400, "Missing the required parameter 'persist' when calling enviarDocumentoPropostaUsingPOST");
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
   * {{{documento_proposta_resource_listar_documentos_credito}}}
   * {{{documento_proposta_resource_listar_documentos_credito_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param id {{{documento_credito_request_id_value}}}
   * @param descricao {{{documento_credito_request_descricao_value}}}
   * @param tela {{{documento_credito_request_flag_tela_value}}}
   * @param doc {{{documento_credito_request_flag_doc_value}}}
   * @param idAtividadeDeCredito {{{documento_credito_request_id_atividade_credito_value}}}
   * @param obrigatorio {{{documento_credito_request_flag_obrigatorio_value}}}
   * @return PageDocumentoCreditoResponse
   */
  public PageDocumentoCreditoResponse  listarDocumentosCreditoUsingGET (List<String> sort, Integer page, Integer limit, Long id, String descricao, Integer tela, Integer doc, Long idAtividadeDeCredito, Integer obrigatorio) throws ApiException {
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
   * {{{documento_proposta_resource_listar}}}
   * {{{documento_proposta_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param id {{{documento_proposta_request_id_value}}}
   * @param idProposta {{{documento_proposta_request_id_proposta_value}}}
   * @param idDocumentosCredito {{{documento_proposta_request_id_tipo_documento_value}}}
   * @param idStatusDocumentosCredito {{{documento_proposta_request_id_status_documento_credito_value}}}
   * @param idCondicoesDocumentosCredito {{{documento_proposta_request_id_condicao_documento_credito_value}}}
   * @param idTipoDocumentoCredito {{{documento_proposta_request_id_tipo_documento_credito_value}}}
   * @param idPessoaFisica {{{documento_proposta_request_id_pessoa_fisica_value}}}
   * @param idLogAtendimento {{{documento_proposta_request_id_log_atendimento_value}}}
   * @param responsavel {{{documento_proposta_request_responsavel_value}}}
   * @param flagDocumentoDigitalizado {{{documento_proposta_request_flag_documento_digitalizado_value}}}
   * @param documentoDigitalizado {{{documento_proposta_request_documento_digitalizado_value}}}
   * @param seqAnaliseCondicao {{{documento_proposta_request_seq_analise_condicao_value}}}
   * @param observacao {{{documento_proposta_request_observacao_value}}}
   * @param dataStatus {{{documento_proposta_request_data_status_value}}}
   * @return PageDocumentoPropostaResponse
   */
  public PageDocumentoPropostaResponse  listarDocumentosPropostaUsingGET (List<String> sort, Integer page, Integer limit, Long id, Long idProposta, Long idDocumentosCredito, Long idStatusDocumentosCredito, Long idCondicoesDocumentosCredito, Long idTipoDocumentoCredito, Long idPessoaFisica, Long idLogAtendimento, String responsavel, Integer flagDocumentoDigitalizado, String documentoDigitalizado, Long seqAnaliseCondicao, String observacao, String dataStatus) throws ApiException {
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
   * {{{proposta_resource_listar_status}}}
   * {{{proposta_resource_listar_status_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param status {{{status_proposta_request_status_value}}}
   * @param flagPermiteAlteracao {{{status_proposta_request_flag_permite_alteracao_value}}}
   * @return PageStatusPropostaResponse
   */
  public PageStatusPropostaResponse  listarStatusPropostaUsingGET (List<String> sort, Integer page, Integer limit, Integer status, Boolean flagPermiteAlteracao) throws ApiException {
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
  
  /**
   * {{{proposta_resource_listar}}}
   * {{{proposta_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param status {{{proposta_request_status_value}}}
   * @param idPessoaFisica {{{proposta_request_idPessoaFisica_value}}}
   * @return PagePropostaResponse
   */
  public PagePropostaResponse  listarUsingGET40 (List<String> sort, Integer page, Integer limit, Integer status, Long idPessoaFisica) throws ApiException {
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
  
}
