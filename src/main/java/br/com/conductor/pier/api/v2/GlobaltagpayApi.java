package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.CartaoPayAtualizarChaveResponse;
import br.com.conductor.pier.api.v2.model.CartaoPayUpdate;
import br.com.conductor.pier.api.v2.model.CartaoPayResponse;
import br.com.conductor.pier.api.v2.model.CartaoPayConfirmarChaveResponse;
import br.com.conductor.pier.api.v2.model.CartaoPayKeyUpdate;
import br.com.conductor.pier.api.v2.model.CartaoPayDetalheResponse;
import br.com.conductor.pier.api.v2.model.PageCartaoPayResponse;
import br.com.conductor.pier.api.v2.model.CartaoPayCadastroResponse;
import br.com.conductor.pier.api.v2.model.CartaoPayPersist;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class GlobaltagpayApi {
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
   * {{{cartao_pay_resource_atualizar_chave}}}
   * {{{cartao_pay_resource_atualizar_chave_notes}}}
   * @param deviceId {{{cartao_pay_resource_atualizar_chave_param_device_id}}}
   * @param id {{{cartao_pay_resource_atualizar_chave_param_id}}}
   * @return CartaoPayAtualizarChaveResponse
   */
  public CartaoPayAtualizarChaveResponse  atualizarChaveUsingPOST (String deviceId, Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'deviceId' is set
    if (deviceId == null) {
       throw new ApiException(400, "Missing the required parameter 'deviceId' when calling atualizarChaveUsingPOST");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarChaveUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/cartoes-tokenizados/{id}/atualizar-chave".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
    headerParams.put("device_id", ApiInvoker.parameterToString(deviceId));
    

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
        return (CartaoPayAtualizarChaveResponse) ApiInvoker.deserialize(response, "", CartaoPayAtualizarChaveResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{cartao_pay_resource_atualizar}}}
   * {{{cartao_pay_resource_atualizar_notes}}}
   * @param deviceId {{{cartao_pay_resource_atualizar_param_device_id}}}
   * @param id {{{cartao_pay_resource_atualizar_param_id}}}
   * @param update update
   * @return CartaoPayResponse
   */
  public CartaoPayResponse  atualizarUsingPUT1 (String deviceId, Long id, CartaoPayUpdate update) throws ApiException {
    Object postBody = update;
    
    // verify the required parameter 'deviceId' is set
    if (deviceId == null) {
       throw new ApiException(400, "Missing the required parameter 'deviceId' when calling atualizarUsingPUT1");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarUsingPUT1");
    }
    
    // verify the required parameter 'update' is set
    if (update == null) {
       throw new ApiException(400, "Missing the required parameter 'update' when calling atualizarUsingPUT1");
    }
    

    // create path and map variables
    String path = "/api/cartoes-tokenizados/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
    headerParams.put("device_id", ApiInvoker.parameterToString(deviceId));
    

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
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (CartaoPayResponse) ApiInvoker.deserialize(response, "", CartaoPayResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{cartao_pay_resource_confirma_atualizacao_chave}}}
   * {{{cartao_pay_resource_confirma_atualizacao_chave_notes}}}
   * @param deviceId {{{cartao_pay_resource_confirma_atualizacao_chave_param_device_id}}}
   * @param id {{{cartao_pay_resource_confirma_atualizacao_chave_param_id}}}
   * @param update update
   * @return CartaoPayConfirmarChaveResponse
   */
  public CartaoPayConfirmarChaveResponse  confirmaAtualizacaoChaveUsingPOST (String deviceId, Long id, CartaoPayKeyUpdate update) throws ApiException {
    Object postBody = update;
    
    // verify the required parameter 'deviceId' is set
    if (deviceId == null) {
       throw new ApiException(400, "Missing the required parameter 'deviceId' when calling confirmaAtualizacaoChaveUsingPOST");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling confirmaAtualizacaoChaveUsingPOST");
    }
    
    // verify the required parameter 'update' is set
    if (update == null) {
       throw new ApiException(400, "Missing the required parameter 'update' when calling confirmaAtualizacaoChaveUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/cartoes-tokenizados/{id}/confirmar-chave".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
    headerParams.put("device_id", ApiInvoker.parameterToString(deviceId));
    

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
        return (CartaoPayConfirmarChaveResponse) ApiInvoker.deserialize(response, "", CartaoPayConfirmarChaveResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{cartao_pay_resource_consultar}}}
   * {{{cartao_pay_resource_consultar_notes}}}
   * @param deviceId {{{cartao_pay_resource_consultar_param_device_id}}}
   * @param id {{{cartao_pay_resource_consultar_param_id}}}
   * @return CartaoPayDetalheResponse
   */
  public CartaoPayDetalheResponse  consultarUsingGET11 (String deviceId, Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'deviceId' is set
    if (deviceId == null) {
       throw new ApiException(400, "Missing the required parameter 'deviceId' when calling consultarUsingGET11");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET11");
    }
    

    // create path and map variables
    String path = "/api/cartoes-tokenizados/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
    headerParams.put("device_id", ApiInvoker.parameterToString(deviceId));
    

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
        return (CartaoPayDetalheResponse) ApiInvoker.deserialize(response, "", CartaoPayDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{enum_pay_resource_listar_codigos_resposta}}}
   * {{{enum_pay_resource_listar_codigos_resposta_notes}}}
   * @return List<Object>
   */
  public List<Object>  listarCodigosRespostaUsingGET () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/codigos-resposta".replaceAll("\\{format\\}","json");

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
   * {{{enum_pay_resource_listar_modos_entrada}}}
   * {{{enum_pay_resource_listar_modos_entrada_notes}}}
   * @return List<Object>
   */
  public List<Object>  listarModosEntradaUsingGET () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/modos-entrada".replaceAll("\\{format\\}","json");

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
   * {{{enum_pay_resource_listar_operacoes}}}
   * {{{enum_pay_resource_listar_operacoes_notes}}}
   * @return List<Object>
   */
  public List<Object>  listarOperacoesUsingGET () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/operacoes".replaceAll("\\{format\\}","json");

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
   * {{{enum_pay_resource_listar_tipos_terminais}}}
   * {{{enum_pay_resource_listar_tipos_terminais_notes}}}
   * @return List<Object>
   */
  public List<Object>  listarTiposTerminaisUsingGET () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/tipos-terminais".replaceAll("\\{format\\}","json");

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
   * {{{enum_pay_resource_listar_tipos_transacoes}}}
   * {{{enum_pay_resource_listar_tipos_transacoes_notes}}}
   * @return List<Object>
   */
  public List<Object>  listarTiposTransacoesUsingGET () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/tipos-transacoes".replaceAll("\\{format\\}","json");

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
   * {{{cartao_pay_resource_listar}}}
   * {{{cartao_pay_resource_listar_notes}}}
   * @param deviceId {{{cartao_pay_resource_listar_param_device_id}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param status {{{cartao_pay_request_status_value}}}
   * @param numeroCartao {{{cartao_pay_request_numero_cartao_value}}}
   * @return PageCartaoPayResponse
   */
  public PageCartaoPayResponse  listarUsingGET11 (String deviceId, List<String> sort, Integer page, Integer limit, String status, String numeroCartao) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/cartoes-tokenizados".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "status", status));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroCartao", numeroCartao));
    

    
    headerParams.put("device_id", ApiInvoker.parameterToString(deviceId));
    

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
        return (PageCartaoPayResponse) ApiInvoker.deserialize(response, "", PageCartaoPayResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{cartao_pay_resource_salvar}}}
   * {{{cartao_pay_resource_salvar_notes}}}
   * @param deviceId {{{cartao_pay_resource_salvar_param_device_id}}}
   * @param persist persist
   * @return CartaoPayCadastroResponse
   */
  public CartaoPayCadastroResponse  salvarUsingPOST6 (String deviceId, CartaoPayPersist persist) throws ApiException {
    Object postBody = persist;
    
    // verify the required parameter 'deviceId' is set
    if (deviceId == null) {
       throw new ApiException(400, "Missing the required parameter 'deviceId' when calling salvarUsingPOST6");
    }
    
    // verify the required parameter 'persist' is set
    if (persist == null) {
       throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarUsingPOST6");
    }
    

    // create path and map variables
    String path = "/api/cartoes-tokenizados".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
    headerParams.put("device_id", ApiInvoker.parameterToString(deviceId));
    

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
        return (CartaoPayCadastroResponse) ApiInvoker.deserialize(response, "", CartaoPayCadastroResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
