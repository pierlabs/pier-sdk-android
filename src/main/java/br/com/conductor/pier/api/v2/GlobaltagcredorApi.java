package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.CredorResponse;
import br.com.conductor.pier.api.v2.model.CredorUpdate;
import br.com.conductor.pier.api.v2.model.CredorPersist;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class GlobaltagcredorApi {
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
   * {{{credor_resource_alterar_credor}}}
   * {{{credor_resource_alterar_credor_notes}}}
   * @param id id
   * @param request request
   * @param login login
   * @return CredorResponse
   */
  public CredorResponse  alterarUsingPUT4 (Long id, CredorUpdate request, String login) throws ApiException {
    Object postBody = request;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT4");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
       throw new ApiException(400, "Missing the required parameter 'request' when calling alterarUsingPUT4");
    }
    

    // create path and map variables
    String path = "/api/credores/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
    headerParams.put("login", ApiInvoker.parameterToString(login));
    

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
        return (CredorResponse) ApiInvoker.deserialize(response, "", CredorResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{credor_resource_consultar_credor}}}
   * {{{credor_resource_consultar_credor_notes}}}
   * @param id id
   * @return CredorResponse
   */
  public CredorResponse  consultarUsingGET14 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET14");
    }
    

    // create path and map variables
    String path = "/api/credores/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (CredorResponse) ApiInvoker.deserialize(response, "", CredorResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{credor_resource_listar_credor}}}
   * {{{credor_resource_listar_credor_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param id {{{credor_request_id_value}}}
   * @param nomeCredor {{{credor_request_nome_credor_value}}}
   * @param banco {{{credor_request_banco_value}}}
   * @param agencia {{{credor_request_agencia_value}}}
   * @param digitoAgencia {{{credor_request_digito_agencia_value}}}
   * @param contaCorrente {{{credor_request_conta_corrente_value}}}
   * @param digitoContaCorrente {{{credor_request_digito_conta_corrente_value}}}
   * @param credorBanco {{{credor_request_credor_banco_value}}}
   * @param idPessoaJuridica {{{credor_request_id_pessoa_juridica_value}}}
   * @return CredorResponse
   */
  public CredorResponse  listarCredorUsingGET (List<String> sort, Integer page, Integer limit, Long id, String nomeCredor, Integer banco, Integer agencia, String digitoAgencia, String contaCorrente, String digitoContaCorrente, Boolean credorBanco, Long idPessoaJuridica) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/credores".replaceAll("\\{format\\}","json");

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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeCredor", nomeCredor));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "banco", banco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "agencia", agencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "digitoAgencia", digitoAgencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "contaCorrente", contaCorrente));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "digitoContaCorrente", digitoContaCorrente));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "credorBanco", credorBanco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idPessoaJuridica", idPessoaJuridica));
    

    

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
        return (CredorResponse) ApiInvoker.deserialize(response, "", CredorResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{credor_resource_salvar_credor}}}
   * {{{credor_resource_salvar_credor_notes}}}
   * @param credorPersist credorPersist
   * @param login login
   * @return CredorResponse
   */
  public CredorResponse  salvarUsingPOST9 (CredorPersist credorPersist, String login) throws ApiException {
    Object postBody = credorPersist;
    
    // verify the required parameter 'credorPersist' is set
    if (credorPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'credorPersist' when calling salvarUsingPOST9");
    }
    

    // create path and map variables
    String path = "/api/credores".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
    headerParams.put("login", ApiInvoker.parameterToString(login));
    

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
        return (CredorResponse) ApiInvoker.deserialize(response, "", CredorResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
