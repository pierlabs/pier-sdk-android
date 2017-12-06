package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.PlataformaMobileUpdate;
import br.com.conductor.pier.api.v2.model.PlataformaMobileResponse;
import br.com.conductor.pier.api.v2.model.PagePlataformaMobileResponse;
import br.com.conductor.pier.api.v2.model.PlataformaMobilePersist;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;


public class PlataformaMobileApi {
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
   * Atualiza Plataforma Mobile
   * Esse recurso permite atualizar plataforma mobile.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Plataforma (id).
   * @param update update
   * @return PlataformaMobileResponse
   */
  public PlataformaMobileResponse  atualizarUsingPUT1 (Long id, PlataformaMobileUpdate update) throws ApiException {
    Object postBody = update;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarUsingPUT1");
    }
    
    // verify the required parameter 'update' is set
    if (update == null) {
       throw new ApiException(400, "Missing the required parameter 'update' when calling atualizarUsingPUT1");
    }
    

    // create path and map variables
    String path = "/api/plataformas-mobile/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (PlataformaMobileResponse) ApiInvoker.deserialize(response, "", PlataformaMobileResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista as plataformas mobile cadastradas
   * Este m\u00C3\u00A9todo permite que sejam listadas as plataformas mobile existentes na base do PIER.
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param nome Nome da Plataforma Mobile
   * @return PagePlataformaMobileResponse
   */
  public PagePlataformaMobileResponse  listarUsingGET26 (List<String> sort, Integer page, Integer limit, String nome) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/plataformas-mobile".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nome", nome));
    

    

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
        return (PagePlataformaMobileResponse) ApiInvoker.deserialize(response, "", PagePlataformaMobileResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Cadastra Plataforma Mobile
   * Esse recurso permite cadastrar plataformas mobile.
   * @param persist persist
   * @return PlataformaMobileResponse
   */
  public PlataformaMobileResponse  salvarUsingPOST18 (PlataformaMobilePersist persist) throws ApiException {
    Object postBody = persist;
    
    // verify the required parameter 'persist' is set
    if (persist == null) {
       throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarUsingPOST18");
    }
    

    // create path and map variables
    String path = "/api/plataformas-mobile".replaceAll("\\{format\\}","json");

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
        return (PlataformaMobileResponse) ApiInvoker.deserialize(response, "", PlataformaMobileResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}

