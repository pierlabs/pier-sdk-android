package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.FaqResponse;
import br.com.conductor.pier.api.v2.model.PageFaqResponse;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class FAQApi {
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
   * Create a new FAQ
   * Create a new FAQ
   * @param pergunta Content of the question
   * @param resposta Response Content
   * @param relevancia Relevance level of the question
   * @param plataforma Platform which the FAQ fits
   * @param categoria Category of the subject which the FAQ refers to
   * @param status Status describing the current situation of the FAQ
   * @return FaqResponse
   */
  public FaqResponse  adicionar (String pergunta, String resposta, Integer relevancia, String plataforma, String categoria, String status) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'pergunta' is set
    if (pergunta == null) {
       throw new ApiException(400, "Missing the required parameter 'pergunta' when calling adicionar");
    }
    
    // verify the required parameter 'resposta' is set
    if (resposta == null) {
       throw new ApiException(400, "Missing the required parameter 'resposta' when calling adicionar");
    }
    

    // create path and map variables
    String path = "/api/faqs".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "pergunta", pergunta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "resposta", resposta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "relevancia", relevancia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "plataforma", plataforma));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "categoria", categoria));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "status", status));
    

    

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
        return (FaqResponse) ApiInvoker.deserialize(response, "", FaqResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Update FAQ
   * Update FAQ
   * @param id Id
   * @param pergunta Content of the question
   * @param resposta Response Content
   * @param relevancia Relevance level of the question
   * @param plataforma Platform which the FAQ fits
   * @param categoria Category of the subject which the FAQ refers to
   * @param status Status describing the current situation of the FAQ
   * @return FaqResponse
   */
  public FaqResponse  alterar (Long id, String pergunta, String resposta, Integer relevancia, String plataforma, String categoria, String status) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterar");
    }
    
    // verify the required parameter 'pergunta' is set
    if (pergunta == null) {
       throw new ApiException(400, "Missing the required parameter 'pergunta' when calling alterar");
    }
    
    // verify the required parameter 'resposta' is set
    if (resposta == null) {
       throw new ApiException(400, "Missing the required parameter 'resposta' when calling alterar");
    }
    

    // create path and map variables
    String path = "/api/faqs/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "pergunta", pergunta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "resposta", resposta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "relevancia", relevancia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "plataforma", plataforma));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "categoria", categoria));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "status", status));
    

    

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
        return (FaqResponse) ApiInvoker.deserialize(response, "", FaqResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Retrieve FAQ using the id
   * Retrieve the details of a determined FAQ
   * @param id Id
   * @return FaqResponse
   */
  public FaqResponse  consultar (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultar");
    }
    

    // create path and map variables
    String path = "/api/faqs/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (FaqResponse) ApiInvoker.deserialize(response, "", FaqResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List FAQs
   * List all the FAQs
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param idFaq Identification Code of the FAQ (id)
   * @param pergunta Content of the question
   * @param resposta Content of the response
   * @param relevancia Level of relevance of the question
   * @param plataforma Plataform which the FAQ fits
   * @param categoria Category of subject which the FAQ refers to
   * @param status Status describing the current situation of the FAQ
   * @return PageFaqResponse
   */
  public PageFaqResponse  listar (List<String> sort, Integer page, Integer limit, Long idFaq, String pergunta, String resposta, Integer relevancia, String plataforma, String categoria, String status) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/faqs".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idFaq", idFaq));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "pergunta", pergunta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "resposta", resposta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "relevancia", relevancia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "plataforma", plataforma));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "categoria", categoria));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "status", status));
    

    

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
        return (PageFaqResponse) ApiInvoker.deserialize(response, "", PageFaqResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
