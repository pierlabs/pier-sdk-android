package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.WebHookResponse;
import br.com.conductor.pier.api.v2.model.PageWebHookResponse;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;


public class WebhookApi {
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
   * Alterar Webhook
   * Este m\u00C3\u00A9todo permite que seja modificado um webhooks j\u00C3\u00A1 cadastrado
   * @param id C\u00C3\u00B3digo identificador do Webhook
   * @param tipoEvento TipoEvento a ser chamado pelo WebHook
   * @param url URL que a ser consumida pelo WebHook
   * @param status Status
   * @return WebHookResponse
   */
  public WebHookResponse  alterarUsingPUT11 (Long id, String tipoEvento, String url, String status) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT11");
    }
    
    // verify the required parameter 'tipoEvento' is set
    if (tipoEvento == null) {
       throw new ApiException(400, "Missing the required parameter 'tipoEvento' when calling alterarUsingPUT11");
    }
    
    // verify the required parameter 'url' is set
    if (url == null) {
       throw new ApiException(400, "Missing the required parameter 'url' when calling alterarUsingPUT11");
    }
    

    // create path and map variables
    String path = "/api/webhooks/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "status", status));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tipoEvento", tipoEvento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "url", url));
    

    

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
        return (WebHookResponse) ApiInvoker.deserialize(response, "", WebHookResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Consultar Webhook
   * Este m\u00C3\u00A9todo permite que sejam consultado um webhook do emissor atrav\u00C3\u00A9s de um id especifico
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Webhook (id).
   * @return WebHookResponse
   */
  public WebHookResponse  consultarUsingGET28 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET28");
    }
    

    // create path and map variables
    String path = "/api/webhooks/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (WebHookResponse) ApiInvoker.deserialize(response, "", WebHookResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista os Webhooks
   * Este m\u00C3\u00A9todo permite que sejam listados os webhooks existentes
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param id Id do WebHook
   * @param tipoEvento TipoEvento a ser chamado pelo WebHook
   * @param metodo M\u00C3\u00A9todo que a ser chamado pelo WebHook
   * @param url URL que a ser consumida pelo WebHook
   * @return PageWebHookResponse
   */
  public PageWebHookResponse  listarUsingGET34 (List<String> sort, Integer page, Integer limit, Long id, String tipoEvento, String metodo, String url) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/webhooks".replaceAll("\\{format\\}","json");

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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tipoEvento", tipoEvento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "metodo", metodo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "url", url));
    

    

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
        return (PageWebHookResponse) ApiInvoker.deserialize(response, "", PageWebHookResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Salvar Webhook
   * Este m\u00C3\u00A9todo permite que seja adicionado um novo webhook
   * @param tipoEvento TipoEvento a ser chamado pelo WebHook
   * @param url URL que a ser consumida pelo WebHook
   * @return WebHookResponse
   */
  public WebHookResponse  salvarUsingPOST17 (String tipoEvento, String url) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'tipoEvento' is set
    if (tipoEvento == null) {
       throw new ApiException(400, "Missing the required parameter 'tipoEvento' when calling salvarUsingPOST17");
    }
    
    // verify the required parameter 'url' is set
    if (url == null) {
       throw new ApiException(400, "Missing the required parameter 'url' when calling salvarUsingPOST17");
    }
    

    // create path and map variables
    String path = "/api/webhooks".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tipoEvento", tipoEvento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "url", url));
    

    

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
        return (WebHookResponse) ApiInvoker.deserialize(response, "", WebHookResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}

