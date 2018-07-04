package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.AvisoViagemResponse;
import br.com.conductor.pier.api.v2.model.PageAvisoViagemResponse;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;


public class GlobaltagavisoviagemApi {
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
   * {{{aviso_viagem_resource_consultar}}}
   * {{{aviso_viagem_resource_consultar_notes}}}
   * @param id {{{aviso_viagem_resource_consultar_param_id}}}
   * @return AvisoViagemResponse
   */
  public AvisoViagemResponse  consultarUsingGET6 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET6");
    }
    

    // create path and map variables
    String path = "/api/avisos-viagens/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (AvisoViagemResponse) ApiInvoker.deserialize(response, "", AvisoViagemResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{aviso_viagem_resource_desabilitar}}}
   * {{{aviso_viagem_resource_desabilitar_notes}}}
   * @param id {{{aviso_viagem_resource_desabilitar_param_id}}}
   * @return AvisoViagemResponse
   */
  public AvisoViagemResponse  desabilitarUsingPOST (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling desabilitarUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/avisos-viagens/{id}/desabilitar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (AvisoViagemResponse) ApiInvoker.deserialize(response, "", AvisoViagemResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{aviso_viagem_resource_habilitar}}}
   * {{{aviso_viagem_resource_habilitar_notes}}}
   * @param id {{{aviso_viagem_resource_habilitar_param_id}}}
   * @return AvisoViagemResponse
   */
  public AvisoViagemResponse  habilitarUsingPOST (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling habilitarUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/avisos-viagens/{id}/habilitar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (AvisoViagemResponse) ApiInvoker.deserialize(response, "", AvisoViagemResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{aviso_viagem_resource_listar}}}
   * {{{aviso_viagem_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idCartao {{{aviso_viagem_request_id_cartao_value}}}
   * @param codigoPais {{{aviso_viagem_request_codigo_pais_value}}}
   * @param dataInicio {{{aviso_viagem_request_data_inicio_value}}}
   * @param dataFim {{{aviso_viagem_request_data_fim_value}}}
   * @param flagAtivo {{{aviso_viagem_request_flag_ativo_value}}}
   * @return PageAvisoViagemResponse
   */
  public PageAvisoViagemResponse  listarUsingGET8 (List<String> sort, Integer page, Integer limit, Long idCartao, String codigoPais, String dataInicio, String dataFim, Integer flagAtivo) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/avisos-viagens".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idCartao", idCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "codigoPais", codigoPais));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataInicio", dataInicio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataFim", dataFim));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagAtivo", flagAtivo));
    

    

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
        return (PageAvisoViagemResponse) ApiInvoker.deserialize(response, "", PageAvisoViagemResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{aviso_viagem_resource_salvar}}}
   * {{{aviso_viagem_resource_salvar_notes}}}
   * @param idCartao {{{aviso_viagem_persist_id_cartao_value}}}
   * @param codigoPais {{{aviso_viagem_persist_codigo_pais_value}}}
   * @param dataInicio {{{aviso_viagem_persist_data_inicio_value}}}
   * @param dataFim {{{aviso_viagem_persist_data_fim_value}}}
   * @return AvisoViagemResponse
   */
  public AvisoViagemResponse  salvarUsingPOST3 (Long idCartao, String codigoPais, String dataInicio, String dataFim) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idCartao' is set
    if (idCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'idCartao' when calling salvarUsingPOST3");
    }
    
    // verify the required parameter 'codigoPais' is set
    if (codigoPais == null) {
       throw new ApiException(400, "Missing the required parameter 'codigoPais' when calling salvarUsingPOST3");
    }
    
    // verify the required parameter 'dataInicio' is set
    if (dataInicio == null) {
       throw new ApiException(400, "Missing the required parameter 'dataInicio' when calling salvarUsingPOST3");
    }
    
    // verify the required parameter 'dataFim' is set
    if (dataFim == null) {
       throw new ApiException(400, "Missing the required parameter 'dataFim' when calling salvarUsingPOST3");
    }
    

    // create path and map variables
    String path = "/api/avisos-viagens".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idCartao", idCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "codigoPais", codigoPais));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataInicio", dataInicio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataFim", dataFim));
    

    

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
        return (AvisoViagemResponse) ApiInvoker.deserialize(response, "", AvisoViagemResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}

