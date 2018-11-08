package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.DadosBancariosContaResponse;
import br.com.conductor.pier.api.v2.model.DadosBancariosContaUpdate;
import br.com.conductor.pier.api.v2.model.CdtTipoContaBancaria;
import br.com.conductor.pier.api.v2.model.PageDadosBancariosContaResponse;
import br.com.conductor.pier.api.v2.model.DadosBancariosContaPersist;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class GlobaltagdadosbancarioscontaApi {
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
   * {{{dados_bancarios_conta_resource_alterar}}}
   * {{{dados_bancarios_conta_resource_alterar_notes}}}
   * @param id {{{dados_bancarios_conta_resource_alterar_param_id_dadosBancariosConta}}}
   * @param update update
   * @return DadosBancariosContaResponse
   */
  public DadosBancariosContaResponse  alterarUsingPUT4 (Long id, DadosBancariosContaUpdate update) throws ApiException {
    Object postBody = update;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT4");
    }
    
    // verify the required parameter 'update' is set
    if (update == null) {
       throw new ApiException(400, "Missing the required parameter 'update' when calling alterarUsingPUT4");
    }
    

    // create path and map variables
    String path = "/api/dados-bancarios-conta/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (DadosBancariosContaResponse) ApiInvoker.deserialize(response, "", DadosBancariosContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{dados_bancarios_conta_resource_consultar}}}
   * {{{dados_bancarios_conta_resource_consultar_notes}}}
   * @param id {{{dados_bancarios_conta_consultar_param_id}}}
   * @return DadosBancariosContaResponse
   */
  public DadosBancariosContaResponse  consultarUsingGET14 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET14");
    }
    

    // create path and map variables
    String path = "/api/dados-bancarios-conta/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (DadosBancariosContaResponse) ApiInvoker.deserialize(response, "", DadosBancariosContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{tipo_conta_bancaria_resource_consultar}}}
   * {{{tipo_conta_bancaria_resource_consultar_notes}}}
   * @param id {{{tipo_conta_bancaria_resource_consultar_param_id}}}
   * @return CdtTipoContaBancaria
   */
  public CdtTipoContaBancaria  consultarUsingGET40 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET40");
    }
    

    // create path and map variables
    String path = "/api/dados-bancarios-conta/tipos-contas-bancarias/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (CdtTipoContaBancaria) ApiInvoker.deserialize(response, "", CdtTipoContaBancaria.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{dados_bancarios_conta_resource_consultarPage}}}
   * {{{dados_bancarios_conta_resource_consultarPage_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param id {{{dados_bancarios_conta_request_id_value}}}
   * @param idConta {{{dados_bancarios_conta_request_idConta_value}}}
   * @param codigoBanco {{{dados_bancarios_conta_request_banco_value}}}
   * @param numeroAgencia {{{dados_bancarios_conta_request_agencia_value}}}
   * @param numeroContaCorrente {{{dados_bancarios_conta_request_contaCorrente_value}}}
   * @param idTipoContaBancaria {{{dados_bancarios_conta_request_IdTipoContaBancaria_value}}}
   * @return PageDadosBancariosContaResponse
   */
  public PageDadosBancariosContaResponse  listarUsingGET16 (List<String> sort, Integer page, Integer limit, Long id, Long idConta, Long codigoBanco, Long numeroAgencia, String numeroContaCorrente, Long idTipoContaBancaria) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/dados-bancarios-conta".replaceAll("\\{format\\}","json");

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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "codigoBanco", codigoBanco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroAgencia", numeroAgencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroContaCorrente", numeroContaCorrente));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoContaBancaria", idTipoContaBancaria));
    

    

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
        return (PageDadosBancariosContaResponse) ApiInvoker.deserialize(response, "", PageDadosBancariosContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{tipo_conta_bancaria_resource_listar}}}
   * {{{tipo_conta_bancaria_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param descricao {{{tipo_conta_bancaria_request_descricao_value}}}
   * @return CdtTipoContaBancaria
   */
  public CdtTipoContaBancaria  listarUsingGET49 (List<String> sort, Integer page, Integer limit, String descricao) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/dados-bancarios-conta/tipos-contas-bancarias".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "descricao", descricao));
    

    

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
        return (CdtTipoContaBancaria) ApiInvoker.deserialize(response, "", CdtTipoContaBancaria.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{dados_bancarios_conta_resource_salvar}}}
   * {{{dados_bancarios_conta_resource_salvar_notes}}}
   * @param dadosBancariosContaPersist dadosBancariosContaPersist
   * @return DadosBancariosContaResponse
   */
  public DadosBancariosContaResponse  salvarUsingPOST9 (DadosBancariosContaPersist dadosBancariosContaPersist) throws ApiException {
    Object postBody = dadosBancariosContaPersist;
    
    // verify the required parameter 'dadosBancariosContaPersist' is set
    if (dadosBancariosContaPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'dadosBancariosContaPersist' when calling salvarUsingPOST9");
    }
    

    // create path and map variables
    String path = "/api/dados-bancarios-conta".replaceAll("\\{format\\}","json");

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
        return (DadosBancariosContaResponse) ApiInvoker.deserialize(response, "", DadosBancariosContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
