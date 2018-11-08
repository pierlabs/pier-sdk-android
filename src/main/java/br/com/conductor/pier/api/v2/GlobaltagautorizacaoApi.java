package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.TransacaoOnUsResponse;
import br.com.conductor.pier.api.v2.model.TransacaoOnUsPorIdCartaoRequest;
import br.com.conductor.pier.api.v2.model.AutorizacaoOnUsRequest;
import br.com.conductor.pier.api.v2.model.CancelamentoTransacaoPorIdCartaoRequest;
import br.com.conductor.pier.api.v2.model.CancelamentoTransacaoOnUsRequest;
import br.com.conductor.pier.api.v2.model.TransacaoOnUsRequest;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class GlobaltagautorizacaoApi {
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
   * {{{transacao_on_us_resource_autorizar_por_conta}}}
   * {{{transacao_on_us_resource_autorizar_por_conta_notes}}}
   * @param id {{{transacao_on_us_resource_autorizar_por_conta_param_id_conta}}}
   * @param transacaoOnUsPorIdCartaoRequest transacaoOnUsPorIdCartaoRequest
   * @return TransacaoOnUsResponse
   */
  public TransacaoOnUsResponse  autorizarPorContaUsingPOST (Long id, TransacaoOnUsPorIdCartaoRequest transacaoOnUsPorIdCartaoRequest) throws ApiException {
    Object postBody = transacaoOnUsPorIdCartaoRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling autorizarPorContaUsingPOST");
    }
    
    // verify the required parameter 'transacaoOnUsPorIdCartaoRequest' is set
    if (transacaoOnUsPorIdCartaoRequest == null) {
       throw new ApiException(400, "Missing the required parameter 'transacaoOnUsPorIdCartaoRequest' when calling autorizarPorContaUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/autorizar-transacao".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
   * {{{transacao_on_us_resource_autorizar}}}
   * {{{transacao_on_us_resource_autorizar_notes}}}
   * @param autorizacaoOnUsRequest autorizacaoOnUsRequest
   * @return TransacaoOnUsResponse
   */
  public TransacaoOnUsResponse  autorizarUsingPOST (AutorizacaoOnUsRequest autorizacaoOnUsRequest) throws ApiException {
    Object postBody = autorizacaoOnUsRequest;
    
    // verify the required parameter 'autorizacaoOnUsRequest' is set
    if (autorizacaoOnUsRequest == null) {
       throw new ApiException(400, "Missing the required parameter 'autorizacaoOnUsRequest' when calling autorizarUsingPOST");
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
   * {{{transacao_on_us_resource_autorizar_por_idcartao}}}
   * {{{transacao_on_us_resource_autorizar_por_idcartao_notes}}}
   * @param id {{{transacao_on_us_resource_autorizar_por_idcartao_param_id_cartao}}}
   * @param transacaoOnUsPorIdCartaoRequest transacaoOnUsPorIdCartaoRequest
   * @return TransacaoOnUsResponse
   */
  public TransacaoOnUsResponse  autorizarUsingPOST1 (Long id, TransacaoOnUsPorIdCartaoRequest transacaoOnUsPorIdCartaoRequest) throws ApiException {
    Object postBody = transacaoOnUsPorIdCartaoRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling autorizarUsingPOST1");
    }
    
    // verify the required parameter 'transacaoOnUsPorIdCartaoRequest' is set
    if (transacaoOnUsPorIdCartaoRequest == null) {
       throw new ApiException(400, "Missing the required parameter 'transacaoOnUsPorIdCartaoRequest' when calling autorizarUsingPOST1");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/autorizar-transacao".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
   * {{{transacao_on_us_resource_cancelar_por_id_conta}}}
   * {{{transacao_on_us_resource_cancelar_por_id_conta_notes}}}
   * @param id {{{transacao_on_us_resource_cancelar_por_id_conta_param_id_conta}}}
   * @param cancelamentoRequest cancelamentoRequest
   * @return TransacaoOnUsResponse
   */
  public TransacaoOnUsResponse  cancelarPorIdContaUsingPOST (Long id, CancelamentoTransacaoPorIdCartaoRequest cancelamentoRequest) throws ApiException {
    Object postBody = cancelamentoRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling cancelarPorIdContaUsingPOST");
    }
    
    // verify the required parameter 'cancelamentoRequest' is set
    if (cancelamentoRequest == null) {
       throw new ApiException(400, "Missing the required parameter 'cancelamentoRequest' when calling cancelarPorIdContaUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/cancelar-transacao".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
   * {{{transacao_on_us_resource_cancelar}}}
   * {{{transacao_on_us_resource_cancelar_notes}}}
   * @param cancelamentoRequest cancelamentoRequest
   * @return TransacaoOnUsResponse
   */
  public TransacaoOnUsResponse  cancelarUsingPOST2 (CancelamentoTransacaoOnUsRequest cancelamentoRequest) throws ApiException {
    Object postBody = cancelamentoRequest;
    
    // verify the required parameter 'cancelamentoRequest' is set
    if (cancelamentoRequest == null) {
       throw new ApiException(400, "Missing the required parameter 'cancelamentoRequest' when calling cancelarUsingPOST2");
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
   * {{{transacao_on_us_resource_cancelar}}}
   * {{{transacao_on_us_resource_cancelar_notes}}}
   * @param id {{{transacao_on_us_resource_cancelar_param_id_cartao}}}
   * @param cancelamentoRequest cancelamentoRequest
   * @return TransacaoOnUsResponse
   */
  public TransacaoOnUsResponse  cancelarUsingPOST3 (Long id, CancelamentoTransacaoPorIdCartaoRequest cancelamentoRequest) throws ApiException {
    Object postBody = cancelamentoRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling cancelarUsingPOST3");
    }
    
    // verify the required parameter 'cancelamentoRequest' is set
    if (cancelamentoRequest == null) {
       throw new ApiException(400, "Missing the required parameter 'cancelamentoRequest' when calling cancelarUsingPOST3");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/cancelar-transacao".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
   * {{{enum_resource_listar_codigos_processamento_autorizacao}}}
   * {{{enum_resource_listar_codigos_processamento_autorizacao_notes}}}
   * @return List<Object>
   */
  public List<Object>  listarCodigosProcessamentoAutorizacaoUsingGET () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/consultar-codigos-processamento-autorizacao".replaceAll("\\{format\\}","json");

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
        return (List<Object>) ApiInvoker.deserialize(response, "array", Object.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{enum_resource_listar_tipos_eventos_transacoes}}}
   * {{{enum_resource_listar_tipos_eventos_transacoes_notes}}}
   * @return List<Object>
   */
  public List<Object>  listarTiposEventosTransacoesUsingGET () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/tipos-eventos-transacoes".replaceAll("\\{format\\}","json");

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
        return (List<Object>) ApiInvoker.deserialize(response, "array", Object.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{transacao_on_us_resource_simular}}}
   * {{{transacao_on_us_resource_simular_notes}}}
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
