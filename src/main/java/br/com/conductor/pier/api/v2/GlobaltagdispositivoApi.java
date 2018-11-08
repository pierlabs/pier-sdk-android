package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.DispositivoResponse;
import br.com.conductor.pier.api.v2.model.PageDispositivoResponse;
import br.com.conductor.pier.api.v2.model.DispositivoPersistValue;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class GlobaltagdispositivoApi {
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
   * {{{dispositivo_resource_ativar}}}
   * {{{dispositivo_resource_ativar_notes}}}
   * @param id {{{dispositivo_resource_ativar_param_id}}}
   * @return DispositivoResponse
   */
  public DispositivoResponse  ativarUsingPOST (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling ativarUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/dispositivos/{id}/ativar-dispositivo".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (DispositivoResponse) ApiInvoker.deserialize(response, "", DispositivoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{dispositivo_resource_desativar}}}
   * {{{dispositivo_resource_desativar_notes}}}
   * @param id {{{dispositivo_resource_desativar_param_id}}}
   * @return DispositivoResponse
   */
  public DispositivoResponse  desativarUsingPOST (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling desativarUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/dispositivos/{id}/desativar-dispositivo".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (DispositivoResponse) ApiInvoker.deserialize(response, "", DispositivoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{dispositivo_resource_listar}}}
   * {{{dispositivo_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param token {{{dispositivo_request_token_value}}}
   * @param idUsuario {{{dispositivo_request_id_usuario_value}}}
   * @param idAplicacaoMobile {{{dispositivo_request_id_aplicacao_mobile_value}}}
   * @param dataCriacao {{{dispositivo_request_data_criacao_value}}}
   * @param dataDesativacao {{{dispositivo_request_data_desativacao_value}}}
   * @return PageDispositivoResponse
   */
  public PageDispositivoResponse  listarUsingGET17 (List<String> sort, Integer page, Integer limit, String token, Long idUsuario, Long idAplicacaoMobile, String dataCriacao, String dataDesativacao) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/dispositivos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "token", token));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idUsuario", idUsuario));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idAplicacaoMobile", idAplicacaoMobile));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataCriacao", dataCriacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataDesativacao", dataDesativacao));
    

    

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
        return (PageDispositivoResponse) ApiInvoker.deserialize(response, "", PageDispositivoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{dispositivo_resource_salvar}}}
   * {{{dispositivo_resource_salvar_notes}}}
   * @param persist persist
   * @return DispositivoResponse
   */
  public DispositivoResponse  salvarUsingPOST10 (DispositivoPersistValue persist) throws ApiException {
    Object postBody = persist;
    
    // verify the required parameter 'persist' is set
    if (persist == null) {
       throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarUsingPOST10");
    }
    

    // create path and map variables
    String path = "/api/dispositivos".replaceAll("\\{format\\}","json");

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
        return (DispositivoResponse) ApiInvoker.deserialize(response, "", DispositivoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
