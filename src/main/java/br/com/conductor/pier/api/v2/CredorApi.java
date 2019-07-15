package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.CredorResponse;
import br.com.conductor.pier.api.v2.model.CredorUpdate;
import br.com.conductor.pier.api.v2.model.PageCredorResponse;
import br.com.conductor.pier.api.v2.model.CredorPersist;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class CredorApi {
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
   * Alterar credor
   * Permite a altera\u00E7\u00E3o de dados de um credor
   * @param id id
   * @param request request
   * @param login login
   * @return CredorResponse
   */
  public CredorResponse  alterarCredor (Long id, CredorUpdate request, String login) throws ApiException {
    Object postBody = request;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarCredor");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
       throw new ApiException(400, "Missing the required parameter 'request' when calling alterarCredor");
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
   * Consultar credor
   * Permite a consulta de um credor a partir de seu identificador
   * @param id id
   * @return CredorResponse
   */
  public CredorResponse  consultarCredor (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarCredor");
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
   * Listar credores
   * Permite listar, filtrar ou ordenar credores
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param id Identificador do credor
   * @param nomeCredor Nome do redor
   * @param banco Banco do credor
   * @param agencia Ag\u00EAncia do credor
   * @param digitoAgencia Digito da ag\u00EAncia
   * @param contaCorrente Conta corrente do credor
   * @param digitoContaCorrente Digito da conta corrente
   * @param credorBanco Flag de controle interno
   * @param idPessoaJuridica Identificador da pessoa jur\u00EDdica associada ao credor
   * @return PageCredorResponse
   */
  public PageCredorResponse  listarCredores (List<String> sort, Integer page, Integer limit, Long id, String nomeCredor, Integer banco, Integer agencia, String digitoAgencia, String contaCorrente, String digitoContaCorrente, Boolean credorBanco, Long idPessoaJuridica) throws ApiException {
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
        return (PageCredorResponse) ApiInvoker.deserialize(response, "", PageCredorResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Salvar credor
   * Permite a persist\u00EAncias de um novo credor
   * @param credorPersist credorPersist
   * @param login login
   * @return CredorResponse
   */
  public CredorResponse  salvarCredor (CredorPersist credorPersist, String login) throws ApiException {
    Object postBody = credorPersist;
    
    // verify the required parameter 'credorPersist' is set
    if (credorPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'credorPersist' when calling salvarCredor");
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
