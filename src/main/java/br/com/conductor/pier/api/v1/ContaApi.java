package br.com.conductor.pier.api.v1;

import br.com.conductor.pier.api.v1.invoker.ApiException;
import br.com.conductor.pier.api.v1.invoker.ApiInvoker;
import br.com.conductor.pier.api.v1.invoker.Pair;

import br.com.conductor.pier.api.v1.model.*;

import java.util.*;

import br.com.conductor.pier.api.v1.model.ConsultarContaResponse;
import br.com.conductor.pier.api.v1.model.ContaResponse;
import br.com.conductor.pier.api.v1.model.ConsultarExtratoContaResponse;
import br.com.conductor.pier.api.v1.model.ConsultarSaldoLimitesResponse;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;


public class ContaApi {
  String basePath = "https://localhost/";
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
   * Buscar contas
   * Consulte contas filtrando pelos campos id do emissor, n\u00C3\u00BAmero do cart\u00C3\u00A3o, nome ou CPF/CNPJ 
   * @param nome Nome
   * @param cpf CPF (opcional caso nao informe o n\u00C3\u00BAmero do cart\u00C3\u00A3o ou id da conta)
   * @param numeroCartao N\u00C3\u00BAmero do cart\u00C3\u00A3o (opcional caso n\u00C3\u00A3o informa o cpf ou id da conta)
   * @param idConta ID da Conta (opcional caso n\u00C3\u00A3o informe o n\u00C3\u00BAmero do cart\u00C3\u00A3o ou cpf)
   * @return ConsultarContaResponse
   */
  public ConsultarContaResponse  buscarContaUsingGET (String nome, String cpf, String numeroCartao, Long idConta) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/contas/buscar".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cpf", cpf));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroCartao", numeroCartao));
    
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
        return (ConsultarContaResponse) ApiInvoker.deserialize(response, "", ConsultarContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Retorna uma conta
   * Consulte informa\u00C3\u00A7\u00C3\u00B5es de uma determinada conta
   * @param idConta ID da Conta
   * @return ContaResponse
   */
  public ContaResponse  consultarContaUsingGET (Integer idConta) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling consultarContaUsingGET");
    }
    

    // create path and map variables
    String path = "/api/contas/{idConta}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idConta" + "\\}", apiInvoker.escapeString(idConta.toString()));

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
        return (ContaResponse) ApiInvoker.deserialize(response, "", ContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Retorna os extratos
   * Consulte os extratos de uma determinada conta
   * @param idConta ID da Conta
   * @param dataVencimento Data limite para o vencimento das transa\u00C3\u00A7\u00C3\u00B5es
   * @return ConsultarExtratoContaResponse
   */
  public ConsultarExtratoContaResponse  consultarExtratoFaturasUsingGET (Integer idConta, String dataVencimento) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling consultarExtratoFaturasUsingGET");
    }
    
    // verify the required parameter 'dataVencimento' is set
    if (dataVencimento == null) {
       throw new ApiException(400, "Missing the required parameter 'dataVencimento' when calling consultarExtratoFaturasUsingGET");
    }
    

    // create path and map variables
    String path = "/api/contas/{idConta}/faturas".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idConta" + "\\}", apiInvoker.escapeString(idConta.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataVencimento", dataVencimento));
    

    

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
        return (ConsultarExtratoContaResponse) ApiInvoker.deserialize(response, "", ConsultarExtratoContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Retorna o limite
   * Consulte os limites de uma determinada conta
   * @param idConta ID da Conta
   * @return ConsultarSaldoLimitesResponse
   */
  public ConsultarSaldoLimitesResponse  consultarSaldosLimitesUsingGET (Integer idConta) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling consultarSaldosLimitesUsingGET");
    }
    

    // create path and map variables
    String path = "/api/contas/{idConta}/limites".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idConta" + "\\}", apiInvoker.escapeString(idConta.toString()));

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
        return (ConsultarSaldoLimitesResponse) ApiInvoker.deserialize(response, "", ConsultarSaldoLimitesResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}

