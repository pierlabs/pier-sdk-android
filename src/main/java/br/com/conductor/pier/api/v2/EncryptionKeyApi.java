package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.ChaveCriptografiaResponse;
import br.com.conductor.pier.api.v2.model.ChaveCriptografiaRequest;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class EncryptionKeyApi {
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
   * Decrypts the received content
   * This method performs the decryption of encrypted contents in the BouncyCastle pattern
   * @param chaveCriptografiaRequest chaveCriptografiaRequest
   * @return ChaveCriptografiaResponse
   */
  public ChaveCriptografiaResponse  descriptografar (ChaveCriptografiaRequest chaveCriptografiaRequest) throws ApiException {
    Object postBody = chaveCriptografiaRequest;
    
    // verify the required parameter 'chaveCriptografiaRequest' is set
    if (chaveCriptografiaRequest == null) {
       throw new ApiException(400, "Missing the required parameter 'chaveCriptografiaRequest' when calling descriptografar");
    }
    

    // create path and map variables
    String path = "/api/chaves-criptografia/descriptografar".replaceAll("\\{format\\}","json");

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
        return (ChaveCriptografiaResponse) ApiInvoker.deserialize(response, "", ChaveCriptografiaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
