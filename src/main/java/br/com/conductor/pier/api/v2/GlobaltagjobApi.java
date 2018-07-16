package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.JobResponse;
import br.com.conductor.pier.api.v2.model.PageJobResponse;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;


public class GlobaltagjobApi {
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
   * {{{job_resource_ativar_job}}}
   * {{{job_resource_ativar_job_notes}}}
   * @param id {{{job_resource_ativar_job_param_id}}}
   * @return JobResponse
   */
  public JobResponse  ativarJobUsingPOST (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling ativarJobUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/jobs/{id}/ativar-job".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (JobResponse) ApiInvoker.deserialize(response, "", JobResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{job_resource_atualizar}}}
   * {{{job_resource_atualizar_notes}}}
   * @param id {{{job_resource_atualizar_param_id}}}
   * @param descricao {{{job_resource_atualizar_param_descricao}}}
   * @param cron {{{job_resource_atualizar_param_cron}}}
   * @param groovy groovy
   * @return JobResponse
   */
  public JobResponse  atualizarUsingPUT4 (Long id, String descricao, String cron, String groovy) throws ApiException {
    Object postBody = groovy;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarUsingPUT4");
    }
    
    // verify the required parameter 'descricao' is set
    if (descricao == null) {
       throw new ApiException(400, "Missing the required parameter 'descricao' when calling atualizarUsingPUT4");
    }
    
    // verify the required parameter 'cron' is set
    if (cron == null) {
       throw new ApiException(400, "Missing the required parameter 'cron' when calling atualizarUsingPUT4");
    }
    
    // verify the required parameter 'groovy' is set
    if (groovy == null) {
       throw new ApiException(400, "Missing the required parameter 'groovy' when calling atualizarUsingPUT4");
    }
    

    // create path and map variables
    String path = "/api/jobs/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cron", cron));
    

    

    String[] contentTypes = {
      "text/plain"
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
        return (JobResponse) ApiInvoker.deserialize(response, "", JobResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{job_resource_desativar_job}}}
   * {{{job_resource_desativar_job_notes}}}
   * @param id {{{job_resource_desativar_job_param_id}}}
   * @return JobResponse
   */
  public JobResponse  desativarJobUsingPOST (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling desativarJobUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/jobs/{id}/desativar-job".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (JobResponse) ApiInvoker.deserialize(response, "", JobResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{job_resource_listar}}}
   * {{{job_resource_listar_notes}}}
   * @param groovy {{{job_d_t_o_groovy_value}}}
   * @param descricao {{{job_d_t_o_descricao_value}}}
   * @param cron {{{job_d_t_o_cron_value}}}
   * @param status {{{job_d_t_o_status_value}}}
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @return PageJobResponse
   */
  public PageJobResponse  listarUsingGET31 (String groovy, String descricao, String cron, String status, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/jobs".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "groovy", groovy));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cron", cron));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "status", status));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    

    

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
        return (PageJobResponse) ApiInvoker.deserialize(response, "", PageJobResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{job_resource_salvar}}}
   * {{{job_resource_salvar_notes}}}
   * @param descricao {{{job_resource_salvar_param_descricao}}}
   * @param cron {{{job_resource_salvar_param_cron}}}
   * @param groovy groovy
   * @return JobResponse
   */
  public JobResponse  salvarUsingPOST17 (String descricao, String cron, String groovy) throws ApiException {
    Object postBody = groovy;
    
    // verify the required parameter 'descricao' is set
    if (descricao == null) {
       throw new ApiException(400, "Missing the required parameter 'descricao' when calling salvarUsingPOST17");
    }
    
    // verify the required parameter 'cron' is set
    if (cron == null) {
       throw new ApiException(400, "Missing the required parameter 'cron' when calling salvarUsingPOST17");
    }
    
    // verify the required parameter 'groovy' is set
    if (groovy == null) {
       throw new ApiException(400, "Missing the required parameter 'groovy' when calling salvarUsingPOST17");
    }
    

    // create path and map variables
    String path = "/api/jobs".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cron", cron));
    

    

    String[] contentTypes = {
      "text/plain"
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
        return (JobResponse) ApiInvoker.deserialize(response, "", JobResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}

