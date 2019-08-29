package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.MotivoFraudeUpdate;
import br.com.conductor.pier.api.v2.model.MotivoFraudeResponse;
import br.com.conductor.pier.api.v2.model.MotivoFraudePersist;
import br.com.conductor.pier.api.v2.model.PageMotivoFraudeResponse;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class FraudeApi {
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
   * Altera motivo fraude
   * Recurso altera\u00E7\u00F5es dos motivos fraude
   * @param id id
   * @param motivoFraudeUpdate motivoFraudeUpdate
   * @return MotivoFraudeResponse
   */
  public MotivoFraudeResponse  alterarMotivoFraude (Long id, MotivoFraudeUpdate motivoFraudeUpdate) throws ApiException {
    Object postBody = motivoFraudeUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarMotivoFraude");
    }
    
    // verify the required parameter 'motivoFraudeUpdate' is set
    if (motivoFraudeUpdate == null) {
       throw new ApiException(400, "Missing the required parameter 'motivoFraudeUpdate' when calling alterarMotivoFraude");
    }
    

    // create path and map variables
    String path = "/api/fraudes/motivos/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (MotivoFraudeResponse) ApiInvoker.deserialize(response, "", MotivoFraudeResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Cadastra motivo fraude
   * Recurso para cadastrar os motivos fraude
   * @param motivoFraudePersist motivoFraudePersist
   * @return MotivoFraudeResponse
   */
  public MotivoFraudeResponse  cadastrarMotivoFraude (MotivoFraudePersist motivoFraudePersist) throws ApiException {
    Object postBody = motivoFraudePersist;
    
    // verify the required parameter 'motivoFraudePersist' is set
    if (motivoFraudePersist == null) {
       throw new ApiException(400, "Missing the required parameter 'motivoFraudePersist' when calling cadastrarMotivoFraude");
    }
    

    // create path and map variables
    String path = "/api/fraudes/motivos".replaceAll("\\{format\\}","json");

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
        return (MotivoFraudeResponse) ApiInvoker.deserialize(response, "", MotivoFraudeResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Consulta motivo fraude
   * Recurso para consultar os motivos fraude
   * @param id id
   * @return MotivoFraudeResponse
   */
  public MotivoFraudeResponse  consultarMotivoFraude (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarMotivoFraude");
    }
    

    // create path and map variables
    String path = "/api/fraudes/motivos/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (MotivoFraudeResponse) ApiInvoker.deserialize(response, "", MotivoFraudeResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista motivo fraude
   * Recurso que lista os motivos fraude
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param descricao Descri\u00E7\u00E3o motivo fraude
   * @return PageMotivoFraudeResponse
   */
  public PageMotivoFraudeResponse  listarMotivoFraude (List<String> sort, Integer page, Integer limit, String descricao) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/fraudes/motivos".replaceAll("\\{format\\}","json");

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
        return (PageMotivoFraudeResponse) ApiInvoker.deserialize(response, "", PageMotivoFraudeResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
