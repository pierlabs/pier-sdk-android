package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.VinculoCartoesResponse;
import br.com.conductor.pier.api.v2.model.CardMultiAppPersist;
import br.com.conductor.pier.api.v2.model.ContaMultiAppResponse;
import br.com.conductor.pier.api.v2.model.CountMultiAppPersist;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class MultiAppApi {
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
   * Register cards MultiApp
   * This feature allows the registration of cards MultiApp
   * @param cartaoMultiAppPersist cartaoMultiAppPersist
   * @return VinculoCartoesResponse
   */
  public VinculoCartoesResponse  criarCartoesMultiApp (CardMultiAppPersist cartaoMultiAppPersist) throws ApiException {
    Object postBody = cartaoMultiAppPersist;
    
    // verify the required parameter 'cartaoMultiAppPersist' is set
    if (cartaoMultiAppPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'cartaoMultiAppPersist' when calling criarCartoesMultiApp");
    }
    

    // create path and map variables
    String path = "/api/cartoes/gerar-cartoes-multiapp".replaceAll("\\{format\\}","json");

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
        return (VinculoCartoesResponse) ApiInvoker.deserialize(response, "", VinculoCartoesResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Register accounts MultiApp
   * This feature allows you to register accounts MultiApp
   * @param contaMultiAppPersist contaMultiAppPersist
   * @return ContaMultiAppResponse
   */
  public ContaMultiAppResponse  criarContasMultiApp (CountMultiAppPersist contaMultiAppPersist) throws ApiException {
    Object postBody = contaMultiAppPersist;
    
    // verify the required parameter 'contaMultiAppPersist' is set
    if (contaMultiAppPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'contaMultiAppPersist' when calling criarContasMultiApp");
    }
    

    // create path and map variables
    String path = "/api/contas/cadastrar-conta-multiapp".replaceAll("\\{format\\}","json");

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
        return (ContaMultiAppResponse) ApiInvoker.deserialize(response, "", ContaMultiAppResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
