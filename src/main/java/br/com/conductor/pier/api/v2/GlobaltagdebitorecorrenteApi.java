package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.ContaDebitoRecorrentePersistValue;
import br.com.conductor.pier.api.v2.model.ContaDebitoRecorrenteResponse;
import br.com.conductor.pier.api.v2.model.PageContaDebitoRecorrenteResponse;
import br.com.conductor.pier.api.v2.model.PageTipoDebitoRecorrenteResponse;
import java.math.BigDecimal;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class GlobaltagdebitorecorrenteApi {
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
   * {{{conta_debito_recorrente_resource_aderir}}}
   * {{{conta_debito_recorrente_resource_aderir_notes}}}
   * @param contaDebitoRecorrentePersist contaDebitoRecorrentePersist
   * @return ContaDebitoRecorrenteResponse
   */
  public ContaDebitoRecorrenteResponse  aderirDebitoRecorrenteUsingPOST (ContaDebitoRecorrentePersistValue contaDebitoRecorrentePersist) throws ApiException {
    Object postBody = contaDebitoRecorrentePersist;
    
    // verify the required parameter 'contaDebitoRecorrentePersist' is set
    if (contaDebitoRecorrentePersist == null) {
       throw new ApiException(400, "Missing the required parameter 'contaDebitoRecorrentePersist' when calling aderirDebitoRecorrenteUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/debitos-recorrentes".replaceAll("\\{format\\}","json");

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
        return (ContaDebitoRecorrenteResponse) ApiInvoker.deserialize(response, "", ContaDebitoRecorrenteResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{conta_debito_recorrente_resource_cancelar}}}
   * {{{conta_debito_recorrente_resource_cancelar_notes}}}
   * @param id {{{conta_debito_recorrente_resource_cancelar_param_id_debito_recorrente}}}
   * @param contaDebitoRecorrentePersist contaDebitoRecorrentePersist
   * @return ContaDebitoRecorrenteResponse
   */
  public ContaDebitoRecorrenteResponse  cancelarDebitoRecorrenteUsingPOST (Long id, ContaDebitoRecorrentePersistValue contaDebitoRecorrentePersist) throws ApiException {
    Object postBody = contaDebitoRecorrentePersist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling cancelarDebitoRecorrenteUsingPOST");
    }
    
    // verify the required parameter 'contaDebitoRecorrentePersist' is set
    if (contaDebitoRecorrentePersist == null) {
       throw new ApiException(400, "Missing the required parameter 'contaDebitoRecorrentePersist' when calling cancelarDebitoRecorrenteUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/debitos-recorrentes/{id}/cancelar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (ContaDebitoRecorrenteResponse) ApiInvoker.deserialize(response, "", ContaDebitoRecorrenteResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{conta_debito_recorrente_resource_listar}}}
   * {{{conta_debito_recorrente_resource_listar_notes}}}
   * @param idConta {{{conta_debito_recorrente_resource_listar_param_id_conta}}}
   * @param idTipoDebitoRecorrente {{{conta_debito_recorrente_resource_listar_param_id_tipo_debito_recorrente}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param dataHoraInicio {{{conta_debito_recorrente_request_data_hora_inicio_value}}}
   * @param dataHoraFim {{{conta_debito_recorrente_request_data_hora_fim_value}}}
   * @param ativo {{{conta_debito_recorrente_request_ativo_value}}}
   * @param dataHoraUltimoPagamento {{{conta_debito_recorrente_request_data_hora_ultimo_pagamento_value}}}
   * @return PageContaDebitoRecorrenteResponse
   */
  public PageContaDebitoRecorrenteResponse  listarUsingGET18 (Long idConta, Long idTipoDebitoRecorrente, List<String> sort, Integer page, Integer limit, String dataHoraInicio, String dataHoraFim, Boolean ativo, String dataHoraUltimoPagamento) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling listarUsingGET18");
    }
    

    // create path and map variables
    String path = "/api/debitos-recorrentes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoDebitoRecorrente", idTipoDebitoRecorrente));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataHoraInicio", dataHoraInicio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataHoraFim", dataHoraFim));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "ativo", ativo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataHoraUltimoPagamento", dataHoraUltimoPagamento));
    

    

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
        return (PageContaDebitoRecorrenteResponse) ApiInvoker.deserialize(response, "", PageContaDebitoRecorrenteResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{tipo_debito_recorrente_resource_listar}}}
   * {{{tipo_debito_recorrente_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param id {{{tipo_debito_recorrente_request_id_value}}}
   * @param descricao {{{tipo_debito_recorrente_request_descricao_value}}}
   * @param valor {{{tipo_debito_recorrente_request_valor_value}}}
   * @param flagAtivo {{{tipo_debito_recorrente_request_flag_ativo_value}}}
   * @return PageTipoDebitoRecorrenteResponse
   */
  public PageTipoDebitoRecorrenteResponse  listarUsingGET56 (List<String> sort, Integer page, Integer limit, Long id, String descricao, BigDecimal valor, Boolean flagAtivo) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/tipos-debitos-recorrentes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "valor", valor));
    
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
        return (PageTipoDebitoRecorrenteResponse) ApiInvoker.deserialize(response, "", PageTipoDebitoRecorrenteResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
