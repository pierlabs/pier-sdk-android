package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.TransacaoOnUsResponse;
import br.com.conductor.pier.api.v2.model.CancelamentoTransacaoOnUsRequest;
import br.com.conductor.pier.api.v2.model.AutorizacaoOnUsRequest;
import br.com.conductor.pier.api.v2.model.DesfazimentoTransacaoOnURequest;
import br.com.conductor.pier.api.v2.model.TransacaoOnUsRequest;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;


public class AutorizacoesApi {
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
   * Cancela Transa\u00C3\u00A7\u00C3\u00A3o financeira
   * Este m\u00C3\u00A9todo permite que seja cancelada uma transa\u00C3\u00A7\u00C3\u00A3o.
   * @param cancelamentoRequest cancelamentoRequest
   * @return TransacaoOnUsResponse
   */
  public TransacaoOnUsResponse  cancelarUsingPOST (CancelamentoTransacaoOnUsRequest cancelamentoRequest) throws ApiException {
    Object postBody = cancelamentoRequest;
    
    // verify the required parameter 'cancelamentoRequest' is set
    if (cancelamentoRequest == null) {
       throw new ApiException(400, "Missing the required parameter 'cancelamentoRequest' when calling cancelarUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/cancelar-transacao".replaceAll("\\{format\\}","json");

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
        return (TransacaoOnUsResponse) ApiInvoker.deserialize(response, "", TransacaoOnUsResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Autoriza transa\u00C3\u00A7\u00C3\u00A3o financeira
   * Este m\u00C3\u00A9todo faz uma autoriza\u00C3\u00A7\u00C3\u00A3o de transa\u00C3\u00A7\u00C3\u00A3o financeira.
   * @param autorizacaoOnUsRequest autorizacaoOnUsRequest
   * @return TransacaoOnUsResponse
   */
  public TransacaoOnUsResponse  desfazerUsingPOST (AutorizacaoOnUsRequest autorizacaoOnUsRequest) throws ApiException {
    Object postBody = autorizacaoOnUsRequest;
    
    // verify the required parameter 'autorizacaoOnUsRequest' is set
    if (autorizacaoOnUsRequest == null) {
       throw new ApiException(400, "Missing the required parameter 'autorizacaoOnUsRequest' when calling desfazerUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/autorizar-transacao".replaceAll("\\{format\\}","json");

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
        return (TransacaoOnUsResponse) ApiInvoker.deserialize(response, "", TransacaoOnUsResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Desfazimento de Transa\u00C3\u00A7\u00C3\u00A3o
   * Este m\u00C3\u00A9todo permite que seja desfeita uma transa\u00C3\u00A7\u00C3\u00A3o.
   * @param desfazimentoRequest desfazimentoRequest
   * @return TransacaoOnUsResponse
   */
  public TransacaoOnUsResponse  desfazerUsingPOST1 (DesfazimentoTransacaoOnURequest desfazimentoRequest) throws ApiException {
    Object postBody = desfazimentoRequest;
    
    // verify the required parameter 'desfazimentoRequest' is set
    if (desfazimentoRequest == null) {
       throw new ApiException(400, "Missing the required parameter 'desfazimentoRequest' when calling desfazerUsingPOST1");
    }
    

    // create path and map variables
    String path = "/api/desfazer-transacao".replaceAll("\\{format\\}","json");

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
        return (TransacaoOnUsResponse) ApiInvoker.deserialize(response, "", TransacaoOnUsResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Simula Compra Parcelada
   * Este m\u00C3\u00A9todo permite que seja simulada uma compra parcelada.
   * @param transacoesRequest transacoesRequest
   * @return TransacaoOnUsResponse
   */
  public TransacaoOnUsResponse  simularUsingPOST (TransacaoOnUsRequest transacoesRequest) throws ApiException {
    Object postBody = transacoesRequest;
    
    // verify the required parameter 'transacoesRequest' is set
    if (transacoesRequest == null) {
       throw new ApiException(400, "Missing the required parameter 'transacoesRequest' when calling simularUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/simular-transacao".replaceAll("\\{format\\}","json");

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
        return (TransacaoOnUsResponse) ApiInvoker.deserialize(response, "", TransacaoOnUsResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}

