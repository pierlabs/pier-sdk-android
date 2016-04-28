package br.com.conductor.pier.api.v1;

import br.com.conductor.pier.api.v1.invoker.ApiException;
import br.com.conductor.pier.api.v1.invoker.ApiInvoker;
import br.com.conductor.pier.api.v1.invoker.Pair;

import br.com.conductor.pier.api.v1.model.*;

import java.util.*;

import br.com.conductor.pier.api.v1.model.CancelarCartaoResponse;
import br.com.conductor.pier.api.v1.model.ConsultarCartaoResponse;
import br.com.conductor.pier.api.v1.model.ConsultarExtratoContaResponse;
import br.com.conductor.pier.api.v1.model.ConsultarSaldoLimitesResponse;
import br.com.conductor.pier.api.v1.model.DesbloquearCartaoResponse;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;


public class CartaoApi {
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
   * /contas/{idConta}/cartoes/{idCartao}/cancelar
   * Cancelar um determinado cart\u00C3\u00A3o
   * @param idConta ID da Conta
   * @param idCartao ID do Cart\u00C3\u00A3o que deseja cancelar
   * @param motivo Motivo do cancelamento
   * @param observacao Alguma observa\u00C3\u00A7\u00C3\u00A3o para o cancelamento
   * @return CancelarCartaoResponse
   */
  public CancelarCartaoResponse  cancelarCartaoUsingPOST (Integer idConta, Integer idCartao, Integer motivo, String observacao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling cancelarCartaoUsingPOST");
    }
    
    // verify the required parameter 'idCartao' is set
    if (idCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'idCartao' when calling cancelarCartaoUsingPOST");
    }
    
    // verify the required parameter 'motivo' is set
    if (motivo == null) {
       throw new ApiException(400, "Missing the required parameter 'motivo' when calling cancelarCartaoUsingPOST");
    }
    
    // verify the required parameter 'observacao' is set
    if (observacao == null) {
       throw new ApiException(400, "Missing the required parameter 'observacao' when calling cancelarCartaoUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/v1/contas/{idConta}/cartoes/{idCartao}/cancelar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idConta" + "\\}", apiInvoker.escapeString(idConta.toString())).replaceAll("\\{" + "idCartao" + "\\}", apiInvoker.escapeString(idCartao.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "motivo", motivo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "observacao", observacao));
    

    

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
        return (CancelarCartaoResponse) ApiInvoker.deserialize(response, "", CancelarCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * /contas/{idConta}/cartoes/{idCartao}
   * Consultar as informa\u00C3\u00A7\u00C3\u00B5es de um determinado cart\u00C3\u00A3o de uma conta
   * @param idConta ID da Conta que pertence o cart\u00C3\u00A3o
   * @param idCartao ID do Cart\u00C3\u00A3o que deseja consultar
   * @param numeroCartao N\u00C3\u00BAmero do Cart\u00C3\u00A3o que deseja consultar (opcional)
   * @return ConsultarCartaoResponse
   */
  public ConsultarCartaoResponse  consultarCartaoUsingGET (Integer idConta, Integer idCartao, String numeroCartao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling consultarCartaoUsingGET");
    }
    
    // verify the required parameter 'idCartao' is set
    if (idCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'idCartao' when calling consultarCartaoUsingGET");
    }
    

    // create path and map variables
    String path = "/api/v1/contas/{idConta}/cartoes/{idCartao}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idConta" + "\\}", apiInvoker.escapeString(idConta.toString())).replaceAll("\\{" + "idCartao" + "\\}", apiInvoker.escapeString(idCartao.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
    headerParams.put("numeroCartao", ApiInvoker.parameterToString(numeroCartao));
    

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
        return (ConsultarCartaoResponse) ApiInvoker.deserialize(response, "", ConsultarCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * /contas/{idConta}/cartoes
   * Consultar todos os cart\u00C3\u00B5es de uma determinada conta
   * @param idConta ID da Conta
   * @return ConsultarCartaoResponse
   */
  public ConsultarCartaoResponse  consultarCartoesUsingGET (Integer idConta) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling consultarCartoesUsingGET");
    }
    

    // create path and map variables
    String path = "/api/v1/contas/{idConta}/cartoes".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idConta" + "\\}", apiInvoker.escapeString(idConta.toString()));

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
        return (ConsultarCartaoResponse) ApiInvoker.deserialize(response, "", ConsultarCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * /contas/{idConta}/cartoes/{idCartao}/faturas
   * Consulte os extratos/faturas do cart\u00C3\u00A3o de uma determinada conta
   * @param idConta ID da Conta
   * @param idCartao ID do Cart\u00C3\u00A3o que deseja consultar o extrato
   * @param dataVencimento Data limite para o vencimento das transa\u00C3\u00A7\u00C3\u00B5es
   * @return ConsultarExtratoContaResponse
   */
  public ConsultarExtratoContaResponse  consultarExtratoFaturasUsingGET (Integer idConta, Integer idCartao, String dataVencimento) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling consultarExtratoFaturasUsingGET");
    }
    
    // verify the required parameter 'idCartao' is set
    if (idCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'idCartao' when calling consultarExtratoFaturasUsingGET");
    }
    
    // verify the required parameter 'dataVencimento' is set
    if (dataVencimento == null) {
       throw new ApiException(400, "Missing the required parameter 'dataVencimento' when calling consultarExtratoFaturasUsingGET");
    }
    

    // create path and map variables
    String path = "/api/v1/contas/{idConta}/cartoes/{idCartao}/faturas".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idConta" + "\\}", apiInvoker.escapeString(idConta.toString())).replaceAll("\\{" + "idCartao" + "\\}", apiInvoker.escapeString(idCartao.toString()));

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
   * /contas/{idConta}/cartoes/{idCartao}/limites
   * Consulte os limites de um determinado cart\u00C3\u00A3o
   * @param idConta ID da Conta
   * @param idCartao ID do Cart\u00C3\u00A3o que deseja consultar o saldo/limite
   * @return ConsultarSaldoLimitesResponse
   */
  public ConsultarSaldoLimitesResponse  consultarSaldosLimitesUsingGET (Integer idConta, Integer idCartao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling consultarSaldosLimitesUsingGET");
    }
    
    // verify the required parameter 'idCartao' is set
    if (idCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'idCartao' when calling consultarSaldosLimitesUsingGET");
    }
    

    // create path and map variables
    String path = "/api/v1/contas/{idConta}/cartoes/{idCartao}/limites".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idConta" + "\\}", apiInvoker.escapeString(idConta.toString())).replaceAll("\\{" + "idCartao" + "\\}", apiInvoker.escapeString(idCartao.toString()));

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
  
  /**
   * /contas/{idConta}/cartoes/{idCartao}/desbloquear
   * Desbloquear cart\u00C3\u00A3o de uma determinada conta
   * @param idConta ID da Conta
   * @param idCartao ID do Cart\u00C3\u00A3o que deseja consultar o saldo/limite
   * @param codigoSegurancao C\u00C3\u00B3digo seguran\u00C3\u00A7a do cart\u00C3\u00A3o
   * @return DesbloquearCartaoResponse
   */
  public DesbloquearCartaoResponse  desbloquearCartaoUsingPOST (Integer idConta, Integer idCartao, String codigoSegurancao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling desbloquearCartaoUsingPOST");
    }
    
    // verify the required parameter 'idCartao' is set
    if (idCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'idCartao' when calling desbloquearCartaoUsingPOST");
    }
    
    // verify the required parameter 'codigoSegurancao' is set
    if (codigoSegurancao == null) {
       throw new ApiException(400, "Missing the required parameter 'codigoSegurancao' when calling desbloquearCartaoUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/v1/contas/{idConta}/cartoes/{idCartao}/desbloquear".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idConta" + "\\}", apiInvoker.escapeString(idConta.toString())).replaceAll("\\{" + "idCartao" + "\\}", apiInvoker.escapeString(idCartao.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
    headerParams.put("codigoSegurancao", ApiInvoker.parameterToString(codigoSegurancao));
    

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
        return (DesbloquearCartaoResponse) ApiInvoker.deserialize(response, "", DesbloquearCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}

