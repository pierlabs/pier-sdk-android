package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.OperacaoBancariaParcialUpdate;
import br.com.conductor.pier.api.v2.model.OperacaoBancariaResponse;
import br.com.conductor.pier.api.v2.model.PageOperacaoBancariaResponse;
import br.com.conductor.pier.api.v2.model.TipoOperacaoBancariaResponse;
import br.com.conductor.pier.api.v2.model.PageTipoOperacaoBancariaResponse;
import br.com.conductor.pier.api.v2.model.OperacaoBancariaPersist;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class OperacoesBancariasApi {
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
   * Atualiza\u00E7\u00E3o parcial da opera\u00E7\u00E3o banc\u00E1ria
   * Este recurso permite atualizar parcialmente uma Operac\u00E3o Banc\u00E1ria
   * @param id Identificador da conta
   * @param idOperacaoBancaria Identificador da opera\u00E7\u00E3o banc\u00E1ria
   * @param parcialUpdate parcialUpdate
   * @return OperacaoBancariaResponse
   */
  public OperacaoBancariaResponse  atualizarParcialmenteOperacaoBancaria (Long id, Long idOperacaoBancaria, OperacaoBancariaParcialUpdate parcialUpdate) throws ApiException {
    Object postBody = parcialUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarParcialmenteOperacaoBancaria");
    }
    
    // verify the required parameter 'idOperacaoBancaria' is set
    if (idOperacaoBancaria == null) {
       throw new ApiException(400, "Missing the required parameter 'idOperacaoBancaria' when calling atualizarParcialmenteOperacaoBancaria");
    }
    
    // verify the required parameter 'parcialUpdate' is set
    if (parcialUpdate == null) {
       throw new ApiException(400, "Missing the required parameter 'parcialUpdate' when calling atualizarParcialmenteOperacaoBancaria");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/operacoes-bancarias/{idOperacaoBancaria}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "idOperacaoBancaria" + "\\}", apiInvoker.escapeString(idOperacaoBancaria.toString()));

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
      String response = apiInvoker.invokeAPI(basePath, path, "PATCH", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (OperacaoBancariaResponse) ApiInvoker.deserialize(response, "", OperacaoBancariaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Consulta de opera\u00E7\u00F5es banc\u00E1rias
   * Este m\u00E9todo permite consultar opera\u00E7\u00F5es banc\u00E1rias
   * @param id id
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idOperacao C\u00F3digo Identificador da opera\u00E7\u00E3o
   * @param dataGeracaoInicial Data de gera\u00E7\u00E3o inicial do registro
   * @param dataGeracaoFinal Data de gera\u00E7\u00E3o final do registro
   * @param idTipoOperacaoBancaria Identificador do tipo da opera\u00E7\u00E3o banc\u00E1ria
   * @param statusOperacao Status da opera\u00E7\u00E3o banc\u00E1ria
   * @return PageOperacaoBancariaResponse
   */
  public PageOperacaoBancariaResponse  consultarOperacaoBancaria (Long id, List<String> sort, Integer page, Integer limit, Long idOperacao, String dataGeracaoInicial, String dataGeracaoFinal, Long idTipoOperacaoBancaria, String statusOperacao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarOperacaoBancaria");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/operacoes-bancarias".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idOperacao", idOperacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataGeracaoInicial", dataGeracaoInicial));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataGeracaoFinal", dataGeracaoFinal));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoOperacaoBancaria", idTipoOperacaoBancaria));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "statusOperacao", statusOperacao));
    

    

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
        return (PageOperacaoBancariaResponse) ApiInvoker.deserialize(response, "", PageOperacaoBancariaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Busca um tipo de opera\u00E7\u00E3o banc\u00E1ria
   * Este recurso busca um tipo de opera\u00E7\u00E3o banc\u00E1ria
   * @param id Identificador do tipo de opera\u00E7\u00E3o banc\u00E1ria
   * @return TipoOperacaoBancariaResponse
   */
  public TipoOperacaoBancariaResponse  consultarTipoOperacaoBancaria (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTipoOperacaoBancaria");
    }
    

    // create path and map variables
    String path = "/api/tipos-operacoes-bancarias/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (TipoOperacaoBancariaResponse) ApiInvoker.deserialize(response, "", TipoOperacaoBancariaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista tipos de opera\u00E7\u00F5es banc\u00E1rias
   * Este recurso lista tipos de opera\u00E7\u00F5es banc\u00E1rias
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param descricao Descri\u00E7\u00E3o do tipo da opera\u00E7\u00E3o banc\u00E1ria
   * @param idTipoTemplate Identificador do template
   * @return PageTipoOperacaoBancariaResponse
   */
  public PageTipoOperacaoBancariaResponse  listarTiposOperacoesBancarias (List<String> sort, Integer page, Integer limit, String descricao, Long idTipoTemplate) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/tipos-operacoes-bancarias".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoTemplate", idTipoTemplate));
    

    

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
        return (PageTipoOperacaoBancariaResponse) ApiInvoker.deserialize(response, "", PageTipoOperacaoBancariaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Cadastra opera\u00E7\u00E3o banc\u00E1ria
   * Este recurso permite cadastrar uma opera\u00E7\u00E3o banc\u00E1ria
   * @param id Identificador da conta
   * @param persist persist
   * @return OperacaoBancariaResponse
   */
  public OperacaoBancariaResponse  salvarOperacaoBancaria (Long id, OperacaoBancariaPersist persist) throws ApiException {
    Object postBody = persist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling salvarOperacaoBancaria");
    }
    
    // verify the required parameter 'persist' is set
    if (persist == null) {
       throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarOperacaoBancaria");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/operacoes-bancarias".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (OperacaoBancariaResponse) ApiInvoker.deserialize(response, "", OperacaoBancariaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
