package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.AvisoViagemResponse;
import br.com.conductor.pier.api.v2.model.PageAvisoViagemResponse;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class TravelNotificationApi {
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
   * Search a travel notice according to the last ID
   * This method allows to be searched an existent travel notice in the base of the issuer
   * @param id Identification Code of travel notification (id)
   * @return AvisoViagemResponse
   */
  public AvisoViagemResponse  consultar (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultar");
    }
    

    // create path and map variables
    String path = "/api/avisos-viagens/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (AvisoViagemResponse) ApiInvoker.deserialize(response, "", AvisoViagemResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Disable a travel notice according to the last ID
   * This method allows to be disabled an existent travel notice in the base of the issuer
   * @param id Identification Code of the Travel Notification (id)
   * @return AvisoViagemResponse
   */
  public AvisoViagemResponse  desabilitar (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling desabilitar");
    }
    

    // create path and map variables
    String path = "/api/avisos-viagens/{id}/desabilitar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (AvisoViagemResponse) ApiInvoker.deserialize(response, "", AvisoViagemResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Habilitate a travel notice accordding to the last ID
   * This method allows to be habilitated an existent travel notice in the base of the issuer
   * @param id Identification Code of the Travel Notification (id)
   * @return AvisoViagemResponse
   */
  public AvisoViagemResponse  habilitar (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling habilitar");
    }
    

    // create path and map variables
    String path = "/api/avisos-viagens/{id}/habilitar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (AvisoViagemResponse) ApiInvoker.deserialize(response, "", AvisoViagemResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List of travel notices created by the Issuer
   * This method allows to be listed the existent travel notices in the base of the issuer
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param idCartao Identifier Code of the card in the base (id)
   * @param codigoPais Identifier Code of the country in the base (id)
   * @param dataInicio Beginning date of the travel notification
   * @param dataFim ]Ending Date of the travel notification
   * @param flagAtivo Identify if the travel notification is active or not
   * @return PageAvisoViagemResponse
   */
  public PageAvisoViagemResponse  listar (List<String> sort, Integer page, Integer limit, Long idCartao, String codigoPais, String dataInicio, String dataFim, Integer flagAtivo) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/avisos-viagens".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idCartao", idCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "codigoPais", codigoPais));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataInicio", dataInicio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataFim", dataFim));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagAtivo", flagAtivo));
    

    

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
        return (PageAvisoViagemResponse) ApiInvoker.deserialize(response, "", PageAvisoViagemResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Create the register of a new Travel Notice
   * This method allows to be created a new Travel Notice in the database of the issuer
   * @param idCartao Identifier Code of the card base (id)
   * @param codigoPais Identifier Code of the Country in the base (id)
   * @param dataInicio Beginning date of the travel notification
   * @param dataFim Travel Notification Ending date
   * @return AvisoViagemResponse
   */
  public AvisoViagemResponse  salvar (Long idCartao, String codigoPais, String dataInicio, String dataFim) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idCartao' is set
    if (idCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'idCartao' when calling salvar");
    }
    
    // verify the required parameter 'codigoPais' is set
    if (codigoPais == null) {
       throw new ApiException(400, "Missing the required parameter 'codigoPais' when calling salvar");
    }
    
    // verify the required parameter 'dataInicio' is set
    if (dataInicio == null) {
       throw new ApiException(400, "Missing the required parameter 'dataInicio' when calling salvar");
    }
    
    // verify the required parameter 'dataFim' is set
    if (dataFim == null) {
       throw new ApiException(400, "Missing the required parameter 'dataFim' when calling salvar");
    }
    

    // create path and map variables
    String path = "/api/avisos-viagens".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idCartao", idCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "codigoPais", codigoPais));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataInicio", dataInicio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataFim", dataFim));
    

    

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
        return (AvisoViagemResponse) ApiInvoker.deserialize(response, "", AvisoViagemResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
