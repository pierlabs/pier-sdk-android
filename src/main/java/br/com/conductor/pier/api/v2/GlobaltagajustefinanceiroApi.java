package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.AjusteFinanceiroResponse;
import java.math.BigDecimal;
import br.com.conductor.pier.api.v2.model.PageAjusteResponse;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;


public class GlobaltagajustefinanceiroApi {
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
   * {{{ajuste_financeiro_resource_ajustar_conta}}}
   * {{{ajuste_financeiro_resource_ajustar_conta_notes}}}
   * @param idTipoAjuste {{{ajuste_financeiro_persist_id_tipo_ajuste_value}}}
   * @param dataAjuste {{{ajuste_financeiro_persist_data_ajuste_value}}}
   * @param valorAjuste {{{ajuste_financeiro_persist_valor_ajuste_value}}}
   * @param idConta {{{ajuste_financeiro_persist_id_conta_value}}}
   * @param identificadorExterno {{{ajuste_financeiro_persist_identificador_externo_value}}}
   * @param idTransacaoOriginal {{{ajuste_persist_id_transacao_original}}}
   * @return AjusteFinanceiroResponse
   */
  public AjusteFinanceiroResponse  ajustarContaUsingPOST (Long idTipoAjuste, String dataAjuste, BigDecimal valorAjuste, Long idConta, String identificadorExterno, Long idTransacaoOriginal) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idTipoAjuste' is set
    if (idTipoAjuste == null) {
       throw new ApiException(400, "Missing the required parameter 'idTipoAjuste' when calling ajustarContaUsingPOST");
    }
    
    // verify the required parameter 'dataAjuste' is set
    if (dataAjuste == null) {
       throw new ApiException(400, "Missing the required parameter 'dataAjuste' when calling ajustarContaUsingPOST");
    }
    
    // verify the required parameter 'valorAjuste' is set
    if (valorAjuste == null) {
       throw new ApiException(400, "Missing the required parameter 'valorAjuste' when calling ajustarContaUsingPOST");
    }
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling ajustarContaUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/ajustes-financeiros".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoAjuste", idTipoAjuste));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataAjuste", dataAjuste));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "valorAjuste", valorAjuste));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "identificadorExterno", identificadorExterno));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTransacaoOriginal", idTransacaoOriginal));
    

    

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
        return (AjusteFinanceiroResponse) ApiInvoker.deserialize(response, "", AjusteFinanceiroResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{ajuste_financeiro_resource_consultar}}}
   * {{{ajuste_financeiro_resource_consultar_notes}}}
   * @param id {{{ajuste_financeiro_resource_consultar_param_id}}}
   * @return AjusteFinanceiroResponse
   */
  public AjusteFinanceiroResponse  consultarUsingGET3 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET3");
    }
    

    // create path and map variables
    String path = "/api/ajustes-financeiros/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (AjusteFinanceiroResponse) ApiInvoker.deserialize(response, "", AjusteFinanceiroResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{ajuste_financeiro_resource_listar}}}
   * {{{ajuste_financeiro_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idTipoAjuste {{{ajuste_request_id_tipo_ajuste_value}}}
   * @param dataAjuste {{{ajuste_request_data_ajuste_value}}}
   * @param valorAjuste {{{ajuste_request_valor_ajuste_value}}}
   * @param identificadorExterno {{{ajuste_request_identificador_externo_value}}}
   * @param idConta {{{ajuste_request_id_conta_value}}}
   * @return PageAjusteResponse
   */
  public PageAjusteResponse  listarUsingGET2 (List<String> sort, Integer page, Integer limit, Long idTipoAjuste, String dataAjuste, BigDecimal valorAjuste, String identificadorExterno, Long idConta) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/ajustes-financeiros".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoAjuste", idTipoAjuste));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataAjuste", dataAjuste));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "valorAjuste", valorAjuste));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "identificadorExterno", identificadorExterno));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    

    

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
        return (PageAjusteResponse) ApiInvoker.deserialize(response, "", PageAjusteResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}

