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


public class GlobaltagfaqApi {
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
   * {{{faq_resource_adicionar}}}
   * {{{faq_resource_adicionar_notes}}}
   * @param pergunta {{{faq_persist_pergunta_value}}}
   * @param resposta {{{faq_persist_resposta_value}}}
   * @param relevancia {{{faq_persist_relevancia_value}}}
   * @param plataforma {{{faq_persist_plataforma_value}}}
   * @param categoria {{{faq_persist_categoria_value}}}
   * @param status {{{faq_persist_status_value}}}
   * @return FaqResponse
   */
  public FaqResponse  adicionarUsingPOST (String pergunta, String resposta, Integer relevancia, String plataforma, String categoria, String status) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'pergunta' is set
    if (pergunta == null) {
       throw new ApiException(400, "Missing the required parameter 'pergunta' when calling adicionarUsingPOST");
    }
    
    // verify the required parameter 'resposta' is set
    if (resposta == null) {
       throw new ApiException(400, "Missing the required parameter 'resposta' when calling adicionarUsingPOST");
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
   * {{{faq_resource_alterar}}}
   * {{{faq_resource_alterar_notes}}}
   * @param id {{{faq_resource_alterar_param_id_faq}}}
   * @param pergunta {{{faq_persist_pergunta_value}}}
   * @param resposta {{{faq_persist_resposta_value}}}
   * @param relevancia {{{faq_persist_relevancia_value}}}
   * @param plataforma {{{faq_persist_plataforma_value}}}
   * @param categoria {{{faq_persist_categoria_value}}}
   * @param status {{{faq_persist_status_value}}}
   * @return FaqResponse
   */
  public FaqResponse  alterarUsingPUT7 (Long id, String pergunta, String resposta, Integer relevancia, String plataforma, String categoria, String status) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT7");
    }
    
    // verify the required parameter 'pergunta' is set
    if (pergunta == null) {
       throw new ApiException(400, "Missing the required parameter 'pergunta' when calling alterarUsingPUT7");
    }
    
    // verify the required parameter 'resposta' is set
    if (resposta == null) {
       throw new ApiException(400, "Missing the required parameter 'resposta' when calling alterarUsingPUT7");
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
   * {{{faq_resource_consultar}}}
   * {{{faq_resource_consultar_notes}}}
   * @param id {{{faq_resource_consultar_param_id_faq}}}
   * @return FaqResponse
   */
  public FaqResponse  consultarUsingGET21 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET21");
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
   * {{{faq_resource_listar}}}
   * {{{faq_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idFaq {{{faq_request_id_faq_value}}}
   * @param pergunta {{{faq_request_pergunta_value}}}
   * @param resposta {{{faq_request_resposta_value}}}
   * @param relevancia {{{faq_request_relevancia_value}}}
   * @param plataforma {{{faq_request_plataforma_value}}}
   * @param categoria {{{faq_request_categoria_value}}}
   * @param status {{{faq_request_status_value}}}
   * @return PageFaqResponse
   */
  public PageFaqResponse  listarUsingGET26 (List<String> sort, Integer page, Integer limit, Long idFaq, String pergunta, String resposta, Integer relevancia, String plataforma, String categoria, String status) throws ApiException {
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

