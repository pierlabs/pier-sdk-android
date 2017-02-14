package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.WebHook;
import br.com.conductor.pier.api.v2.model.PageWebHooks;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;


public class WebhooksApi {
  String basePath = "https://localhost/";
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
   * @param evento Evento a ser chamado pelo WebHook
   * @param metodo M\u00C3\u00A9todo que a ser chamado pelo WebHook
   * @param url URL que a ser consumida pelo WebHook
   * @return WebHook
   */
  public WebHook  alterarUsingPUT3 (Long id, String evento, String metodo, String url) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT3");
    }
    
    // verify the required parameter 'evento' is set
    if (evento == null) {
       throw new ApiException(400, "Missing the required parameter 'evento' when calling alterarUsingPUT3");
    }
    
    // verify the required parameter 'metodo' is set
    if (metodo == null) {
       throw new ApiException(400, "Missing the required parameter 'metodo' when calling alterarUsingPUT3");
    }
    
    // verify the required parameter 'url' is set
    if (url == null) {
       throw new ApiException(400, "Missing the required parameter 'url' when calling alterarUsingPUT3");
    }
    

    // create path and map variables
    String path = "/api/webhooks".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "evento", evento));
    
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
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (WebHook) ApiInvoker.deserialize(response, "", WebHook.class);
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
   * @return WebHook
   */
  public WebHook  consultarUsingGET10 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET10");
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
        return (WebHook) ApiInvoker.deserialize(response, "", WebHook.class);
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
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 100, Max = 100)
   * @param id Id do WebHook
   * @param evento Evento a ser chamado pelo WebHook
   * @param metodo M\u00C3\u00A9todo que a ser chamado pelo WebHook
   * @param url URL que a ser consumida pelo WebHook
   * @return PageWebHooks
   */
  public PageWebHooks  listarUsingGET11 (Integer page, Integer limit, Long id, String evento, String metodo, String url) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/webhooks".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "evento", evento));
    
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
        return (PageWebHooks) ApiInvoker.deserialize(response, "", PageWebHooks.class);
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
   * @param evento Evento a ser chamado pelo WebHook
   * @param metodo M\u00C3\u00A9todo que a ser chamado pelo WebHook
   * @param url URL que a ser consumida pelo WebHook
   * @return WebHook
   */
  public WebHook  salvarUsingPOST4 (String evento, String metodo, String url) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'evento' is set
    if (evento == null) {
       throw new ApiException(400, "Missing the required parameter 'evento' when calling salvarUsingPOST4");
    }
    
    // verify the required parameter 'metodo' is set
    if (metodo == null) {
       throw new ApiException(400, "Missing the required parameter 'metodo' when calling salvarUsingPOST4");
    }
    
    // verify the required parameter 'url' is set
    if (url == null) {
       throw new ApiException(400, "Missing the required parameter 'url' when calling salvarUsingPOST4");
    }
    

    // create path and map variables
    String path = "/api/webhooks".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "evento", evento));
    
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
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (WebHook) ApiInvoker.deserialize(response, "", WebHook.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}

