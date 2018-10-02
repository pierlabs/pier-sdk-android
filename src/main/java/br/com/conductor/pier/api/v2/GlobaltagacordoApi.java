package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.AcordoDetalheResponse;
import br.com.conductor.pier.api.v2.model.PageAcordoResponse;
import br.com.conductor.pier.api.v2.model.AcordoQuebraResponse;
import br.com.conductor.pier.api.v2.model.PlanoParcelamentoAcordoRequestValue;
import br.com.conductor.pier.api.v2.model.PlanoParcelamentosAcordoResponseValue;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class GlobaltagacordoApi {
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
   * {{{acordo_resource_consultar}}}
   * {{{acordo_resource_consultar_notes}}}
   * @param id {{{acordo_resource_consultar_param_id}}}
   * @return AcordoDetalheResponse
   */
  public AcordoDetalheResponse  consultarUsingGET (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET");
    }
    

    // create path and map variables
    String path = "/api/acordos/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (AcordoDetalheResponse) ApiInvoker.deserialize(response, "", AcordoDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{acordo_resource_listar}}}
   * {{{acordo_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idConta {{{acordo_request_id_conta_value}}}
   * @param statusAcordo {{{acordo_request_status_acordo_value}}}
   * @param dataAcordo {{{acordo_request_data_acordo_value}}}
   * @param quantidadeParcelas {{{acordo_request_quantidade_parcelas_value}}}
   * @return PageAcordoResponse
   */
  public PageAcordoResponse  listarUsingGET (List<String> sort, Integer page, Integer limit, Long idConta, Long statusAcordo, String dataAcordo, Integer quantidadeParcelas) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/acordos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "statusAcordo", statusAcordo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataAcordo", dataAcordo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "quantidadeParcelas", quantidadeParcelas));
    

    

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
        return (PageAcordoResponse) ApiInvoker.deserialize(response, "", PageAcordoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{acordo_resource_quebrarAcordo}}}
   * {{{acordo_resource_quebrarAcordo_notes}}}
   * @param id {{{acordo_resource_quebrarAcordo_param_id}}}
   * @return AcordoQuebraResponse
   */
  public AcordoQuebraResponse  quebrarAcordoUsingPOST (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling quebrarAcordoUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/acordos/{id}/quebrar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (AcordoQuebraResponse) ApiInvoker.deserialize(response, "", AcordoQuebraResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{acordo_resource_simular_planos_parcelamentos_value}}}
   * {{{acordo_resource_simular_planos_parcelamentos_notes}}}
   * @param request request
   * @return PlanoParcelamentosAcordoResponseValue
   */
  public PlanoParcelamentosAcordoResponseValue  simularPlanosParcelamentosUsingPOST (PlanoParcelamentoAcordoRequestValue request) throws ApiException {
    Object postBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
       throw new ApiException(400, "Missing the required parameter 'request' when calling simularPlanosParcelamentosUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/acordos/planos-parcelamentos".replaceAll("\\{format\\}","json");

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
        return (PlanoParcelamentosAcordoResponseValue) ApiInvoker.deserialize(response, "", PlanoParcelamentosAcordoResponseValue.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
