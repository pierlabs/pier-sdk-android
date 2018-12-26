package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.PageStatusContestacaoResponse;
import br.com.conductor.pier.api.v2.model.PageTipoResolucaoContestacaoResponse;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class ContestaoApi {
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
   * Lista status das contesta\u00E7\u00F5es
   * Este recurso permite a listagem do status das contesta\u00E7\u00F5es
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idStatusContestacao Id status da contesta\u00E7\u00E3o
   * @param idStatusContestacaoOrigem Id status da contesta\u00E7\u00E3o origem
   * @param descricao Decri\u00E7\u00E3o da contesta\u00E7\u00E3o
   * @param flagPermiteAlteracao Flag de verifica\u00E7\u00E3o de permiss\u00E3o para altera\u00E7\u00E3o
   * @param flagSistema Flag do sistema
   * @return PageStatusContestacaoResponse
   */
  public PageStatusContestacaoResponse  listarStatusContestacao (List<String> sort, Integer page, Integer limit, Long idStatusContestacao, Long idStatusContestacaoOrigem, String descricao, Integer flagPermiteAlteracao, Integer flagSistema) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/status-contestacoes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idStatusContestacao", idStatusContestacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idStatusContestacaoOrigem", idStatusContestacaoOrigem));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagPermiteAlteracao", flagPermiteAlteracao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagSistema", flagSistema));
    

    

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
        return (PageStatusContestacaoResponse) ApiInvoker.deserialize(response, "", PageStatusContestacaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Listar tipo da contesta\u00E7\u00E3o
   * Este recurso permite a listagem dos tipos de contesta\u00E7\u00F5es
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idTipoResolucaoContestacao Id tipo da resolucao da contesta\u00E7\u00E3o
   * @param descricao Descri\u00E7\u00E3o do tipo de resolu\u00E7\u00E3o da contesta\u00E7\u00E3o
   * @return PageTipoResolucaoContestacaoResponse
   */
  public PageTipoResolucaoContestacaoResponse  listarTipoResolucaoContestacao (List<String> sort, Integer page, Integer limit, Long idTipoResolucaoContestacao, String descricao) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/tipos-resolucoes-contestacoes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoResolucaoContestacao", idTipoResolucaoContestacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "descricao", descricao));
    

    

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
        return (PageTipoResolucaoContestacaoResponse) ApiInvoker.deserialize(response, "", PageTipoResolucaoContestacaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
