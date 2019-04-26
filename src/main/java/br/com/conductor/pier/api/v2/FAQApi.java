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
   * Adiciona uma nova FAQ
   * Adiciona uma nova FAQ
   * @param pergunta Conte\u00FAdo da pergunta
   * @param resposta Conte\u00FAdo da resposta
   * @param relevancia N\u00EDvel de relev\u00E2ncia da pergunta
   * @param plataforma Plataforma em que a FAQ se encaixa
   * @param categoria Categoria de assunto do qual a FAQ se trata
   * @param status Status descrevendo a situa\u00E7\u00E3o atual da FAQ
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
   * Alterar FAQ
   * Alterar FAQ
   * @param id Id
   * @param pergunta Conte\u00FAdo da pergunta
   * @param resposta Conte\u00FAdo da resposta
   * @param relevancia N\u00EDvel de relev\u00E2ncia da pergunta
   * @param plataforma Plataforma em que a FAQ se encaixa
   * @param categoria Categoria de assunto do qual a FAQ se trata
   * @param status Status descrevendo a situa\u00E7\u00E3o atual da FAQ
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
   * Consultar FAQ por id
   * Consulta os detalhes de uma determinada FAQ
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
   * Lista FAQs
   * Lista todas as FAQs
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idFaq C\u00F3digo de identifica\u00E7\u00E3o da FAQ (id)
   * @param pergunta Conte\u00FAdo da pergunta
   * @param resposta Conte\u00FAdo da resposta
   * @param relevancia N\u00EDvel de relev\u00E2ncia da pergunta
   * @param plataforma Plataforma em que a FAQ se encaixa
   * @param categoria Categoria de assunto do qual a FAQ se trata
   * @param status Status descrevendo a situa\u00E7\u00E3o atual da FAQ
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
