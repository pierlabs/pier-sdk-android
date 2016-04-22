package br.com.conductor.caas.api.v1;

import br.com.conductor.caas.api.v1.invoker.ApiException;
import br.com.conductor.caas.api.v1.invoker.ApiInvoker;
import br.com.conductor.caas.api.v1.invoker.Pair;

import br.com.conductor.caas.api.v1.model.*;

import java.util.*;

import br.com.conductor.caas.api.v1.model.ConsultarCartaoResponse;
import br.com.conductor.caas.api.v1.model.CancelarCartaoResponse;
import br.com.conductor.caas.api.v1.model.DesbloquearCartaoResponse;
import br.com.conductor.caas.api.v1.model.ConsultarExtratoContaResponse;
import br.com.conductor.caas.api.v1.model.ConsultarSaldoLimitesResponse;
import br.com.conductor.caas.api.v1.model.ContaResponse;


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
   * /contas/{idConta}/cartoes/{idCartao}
   * Consultar as informaÃ§Ãµes de um determinado cartÃ£o de uma conta
   * @param idEmissor ID do Emissor
   * @param numeroCartao NÃºmero do CartÃ£o que deseja consultar
   * @param idConta ID da Conta que pertence o cartÃ£o
   * @param idCartao ID do CartÃ£o que deseja consultar
   * @return ConsultarCartaoResponse
   */
  public ConsultarCartaoResponse  consultarCartaoUsingGET (Integer idEmissor, String numeroCartao, Integer idConta, Integer idCartao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idEmissor' is set
    if (idEmissor == null) {
       throw new ApiException(400, "Missing the required parameter 'idEmissor' when calling consultarCartaoUsingGET");
    }
    
    // verify the required parameter 'numeroCartao' is set
    if (numeroCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'numeroCartao' when calling consultarCartaoUsingGET");
    }
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling consultarCartaoUsingGET");
    }
    
    // verify the required parameter 'idCartao' is set
    if (idCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'idCartao' when calling consultarCartaoUsingGET");
    }
    

    // create path and map variables
    String path = "/api/v1/contas/{idConta}/cartoes/cartoes/{idCartao}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idConta" + "\\}", apiInvoker.escapeString(idConta.toString())).replaceAll("\\{" + "idCartao" + "\\}", apiInvoker.escapeString(idCartao.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
    headerParams.put("idEmissor", ApiInvoker.parameterToString(idEmissor));
    
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
   * /contas/{idConta}/cartoes/{idCartao}/cancelar
   * Cancelar um determinado cartÃ£o
   * @param idEmissor ID do Emissor
   * @param idConta ID da Conta
   * @param idCartao ID do CartÃ£o que deseja cancelar
   * @param motivo Motivo do cancelamento
   * @param observacao Alguma observaÃ§Ã£o para o cancelamento
   * @return CancelarCartaoResponse
   */
  public CancelarCartaoResponse  cancelarCartaoUsingPOST (Integer idEmissor, Integer idConta, Integer idCartao, Integer motivo, String observacao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idEmissor' is set
    if (idEmissor == null) {
       throw new ApiException(400, "Missing the required parameter 'idEmissor' when calling cancelarCartaoUsingPOST");
    }
    
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
    String path = "/api/v1/contas/{idConta}/cartoes/cartoes/{idCartao}/cancelar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idConta" + "\\}", apiInvoker.escapeString(idConta.toString())).replaceAll("\\{" + "idCartao" + "\\}", apiInvoker.escapeString(idCartao.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "motivo", motivo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "observacao", observacao));
    

    
    headerParams.put("idEmissor", ApiInvoker.parameterToString(idEmissor));
    

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
   * /contas/{idConta}/cartoes/{idCartao}/desbloquear
   * Desbloquear cartÃ£o de uma determinada conta
   * @param idEmissor ID do Emissor
   * @param idConta ID da Conta
   * @param idCartao ID do CartÃ£o que deseja consultar o saldo/limite
   * @param codigoSegurancao CÃ³digo seguranÃ§a do cartÃ£o
   * @return DesbloquearCartaoResponse
   */
  public DesbloquearCartaoResponse  desbloquearCartaoUsingPOST (Integer idEmissor, Integer idConta, Integer idCartao, String codigoSegurancao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idEmissor' is set
    if (idEmissor == null) {
       throw new ApiException(400, "Missing the required parameter 'idEmissor' when calling desbloquearCartaoUsingPOST");
    }
    
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
    String path = "/api/v1/contas/{idConta}/cartoes/cartoes/{idCartao}/desbloquear".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idConta" + "\\}", apiInvoker.escapeString(idConta.toString())).replaceAll("\\{" + "idCartao" + "\\}", apiInvoker.escapeString(idCartao.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
    headerParams.put("idEmissor", ApiInvoker.parameterToString(idEmissor));
    
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
  
  /**
   * /contas/{idConta}/cartoes/{idCartao}/faturas
   * Consulte os extratos/faturas do cartÃ£o de uma determinada conta
   * @param idEmissor ID do Emissor
   * @param idConta ID da Conta
   * @param idCartao ID do CartÃ£o que deseja consultar o extrato
   * @param dataVencimento Data limite para o vencimento das transaÃ§Ãµes
   * @return ConsultarExtratoContaResponse
   */
  public ConsultarExtratoContaResponse  consultarExtratoFaturasUsingGET (Integer idEmissor, Integer idConta, Integer idCartao, String dataVencimento) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idEmissor' is set
    if (idEmissor == null) {
       throw new ApiException(400, "Missing the required parameter 'idEmissor' when calling consultarExtratoFaturasUsingGET");
    }
    
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
    String path = "/api/v1/contas/{idConta}/cartoes/cartoes/{idCartao}/faturas".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idConta" + "\\}", apiInvoker.escapeString(idConta.toString())).replaceAll("\\{" + "idCartao" + "\\}", apiInvoker.escapeString(idCartao.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataVencimento", dataVencimento));
    

    
    headerParams.put("idEmissor", ApiInvoker.parameterToString(idEmissor));
    

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
   * /contas/{idConta}/cartoes/{idCartao}/saldos
   * Consulte o saldo do cartÃ£o de uma determinada conta
   * @param idEmissor ID do Emissor
   * @param idConta ID da Conta
   * @param idCartao ID do CartÃ£o que deseja consultar o saldo/limite
   * @return ConsultarSaldoLimitesResponse
   */
  public ConsultarSaldoLimitesResponse  consultarSaldosLimitesUsingGET (Integer idEmissor, Integer idConta, Integer idCartao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idEmissor' is set
    if (idEmissor == null) {
       throw new ApiException(400, "Missing the required parameter 'idEmissor' when calling consultarSaldosLimitesUsingGET");
    }
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling consultarSaldosLimitesUsingGET");
    }
    
    // verify the required parameter 'idCartao' is set
    if (idCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'idCartao' when calling consultarSaldosLimitesUsingGET");
    }
    

    // create path and map variables
    String path = "/api/v1/contas/{idConta}/cartoes/cartoes/{idCartao}/saldos".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idConta" + "\\}", apiInvoker.escapeString(idConta.toString())).replaceAll("\\{" + "idCartao" + "\\}", apiInvoker.escapeString(idCartao.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
    headerParams.put("idEmissor", ApiInvoker.parameterToString(idEmissor));
    

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
   * /contas/{idConta}
   * Consulte informaÃ§Ãµes de uma determinada conta
   * @param idEmissor ID do Emissor
   * @param idConta ID da Conta
   * @return ContaResponse
   */
  public ContaResponse  consultarContaUsingGET (Integer idEmissor, Integer idConta) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idEmissor' is set
    if (idEmissor == null) {
       throw new ApiException(400, "Missing the required parameter 'idEmissor' when calling consultarContaUsingGET");
    }
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling consultarContaUsingGET");
    }
    

    // create path and map variables
    String path = "/api/v1/contas/{idConta}/cartoes/{idConta}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idConta" + "\\}", apiInvoker.escapeString(idConta.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
    headerParams.put("idEmissor", ApiInvoker.parameterToString(idEmissor));
    

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
  
}

