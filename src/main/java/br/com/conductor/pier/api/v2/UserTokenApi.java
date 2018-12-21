package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.ControleTentativaCadastroResponse;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class UserTokenApi {
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
   * Increments attempts registration
   * Increases user registration attempts to 1
   * @param cpf CPF that will be used to increment the attempts
   * @return ControleTentativaCadastroResponse
   */
  public ControleTentativaCadastroResponse  incrementarTentativa (String cpf) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'cpf' is set
    if (cpf == null) {
       throw new ApiException(400, "Missing the required parameter 'cpf' when calling incrementarTentativa");
    }
    

    // create path and map variables
    String path = "/api/usuarios-tokens/incrementar-tentativas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cpf", cpf));
    

    

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
        return (ControleTentativaCadastroResponse) ApiInvoker.deserialize(response, "", ControleTentativaCadastroResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Check attempts registration
   * Verify user registration attempts
   * @param cpf CPF that will be used to consult the attempts
   * @return ControleTentativaCadastroResponse
   */
  public ControleTentativaCadastroResponse  verificarTentativa (String cpf) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'cpf' is set
    if (cpf == null) {
       throw new ApiException(400, "Missing the required parameter 'cpf' when calling verificarTentativa");
    }
    

    // create path and map variables
    String path = "/api/usuarios-tokens/verificar-tentativas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cpf", cpf));
    

    

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
        return (ControleTentativaCadastroResponse) ApiInvoker.deserialize(response, "", ControleTentativaCadastroResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
