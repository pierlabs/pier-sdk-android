package br.com.conductor.pier.api.v1;

import br.com.conductor.pier.api.v1.invoker.ApiException;
import br.com.conductor.pier.api.v1.invoker.ApiInvoker;
import br.com.conductor.pier.api.v1.invoker.Pair;

import br.com.conductor.pier.api.v1.model.*;

import java.util.*;

import br.com.conductor.pier.api.v1.model.BodyAccessToken;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;


public class TokenApi {
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
   * /tokens/callback
   * 
   * @param bodyAccessToken bodyAccessToken
   * @return BodyAccessToken
   */
  public BodyAccessToken  callbackUsingPOST (BodyAccessToken bodyAccessToken) throws ApiException {
    Object postBody = bodyAccessToken;
    
    // verify the required parameter 'bodyAccessToken' is set
    if (bodyAccessToken == null) {
       throw new ApiException(400, "Missing the required parameter 'bodyAccessToken' when calling callbackUsingPOST");
    }
    

    // create path and map variables
    String path = "/v1/tokens/callback".replaceAll("\\{format\\}","json");

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
        return (BodyAccessToken) ApiInvoker.deserialize(response, "", BodyAccessToken.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * /tokens/validar
   * 
   * @param bodyAccessToken bodyAccessToken
   * @return Object
   */
  public Object  validarUsingPOST (BodyAccessToken bodyAccessToken) throws ApiException {
    Object postBody = bodyAccessToken;
    
    // verify the required parameter 'bodyAccessToken' is set
    if (bodyAccessToken == null) {
       throw new ApiException(400, "Missing the required parameter 'bodyAccessToken' when calling validarUsingPOST");
    }
    

    // create path and map variables
    String path = "/v1/tokens/validar".replaceAll("\\{format\\}","json");

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
        return (Object) ApiInvoker.deserialize(response, "", Object.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}

