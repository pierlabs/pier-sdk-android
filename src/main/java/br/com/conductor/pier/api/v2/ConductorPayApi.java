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

public class ConductorPayApi {
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
   * Atualiza a chave de gera\u00E7\u00E3o de transa\u00E7\u00E3o
   * Este m\u00E9todo permite atualizar a chave de gera\u00E7\u00E3o de transa\u00E7\u00E3o de um dispositivo a partir do seu identificador (id).
   * @param deviceId Device id criptografado
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o (id).
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
   * Atualiza os dados do cart\u00E3o
   * Este m\u00E9todo permite atualizar os dados do cart\u00E3o tokenizados de um dispositivo a partir do seu identificador (id).
   * @param deviceId Device id criptografado
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o (id).
   * @param update update
   * @return CartaoPayResponse
   */
  public CartaoPayResponse  atualizarUsingPUT (String deviceId, Long id, CartaoPayUpdate update) throws ApiException {
    Object postBody = update;
    
    // verify the required parameter 'deviceId' is set
    if (deviceId == null) {
       throw new ApiException(400, "Missing the required parameter 'deviceId' when calling atualizarUsingPUT");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarUsingPUT");
    }
    
    // verify the required parameter 'update' is set
    if (update == null) {
       throw new ApiException(400, "Missing the required parameter 'update' when calling atualizarUsingPUT");
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
   * Confirma a atualiza\u00E7\u00E3o da chave de transa\u00E7\u00E3o
   * Este met\u00F3do recebe confirma\u00E7\u00E3o de atualiza\u00E7\u00E3o de chave transa\u00E7\u00E3o.
   * @param deviceId Device id criptografado
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o (id).
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
   * Apresenta os dados de um determinado cart\u00E3o
   * Este m\u00E9todo permite consultar as informa\u00E7\u00F5es de um determinado cart\u00E3o a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id).
   * @param deviceId Device id criptografado
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o (id).
   * @return CartaoPayDetalheResponse
   */
  public CartaoPayDetalheResponse  consultarUsingGET8 (String deviceId, Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'deviceId' is set
    if (deviceId == null) {
       throw new ApiException(400, "Missing the required parameter 'deviceId' when calling consultarUsingGET8");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET8");
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
   * Lista os c\u00F3digos de resposta dos recursos de transa\u00E7\u00E3o e consulta de conta
   * Este m\u00E9todo retorna a lista dos c\u00F3digos de resposta das transa\u00E7\u00F5es e consulta de saque realizada no Pay.
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
   * Lista os modos entradas
   * Este recurso permite listar os modos de entrada para transa\u00E7\u00E3o
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
   * Lista as opera\u00E7\u00F5es
   * Este recurso permite listar as opera\u00E7\u00F5es disponiveis de transa\u00E7\u00E3o
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
   * Lista os tipos de terminais
   * Este m\u00E9todo retorna a lista dos tipos de terminais.
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
   * Lista os tipos de transa\u00E7\u00F5es
   * Este m\u00E9todo retorna a lista dos tipos de transa\u00E7\u00F5es realizadas no Pay.
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
   * Lista os cart\u00F5es cadastrados
   * Este m\u00E9todo permite listar os cart\u00F5es cadastrado em um dispositivo.
   * @param deviceId Device id criptografado
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param status Status do cart\u00E3o tokenizado
   * @param numeroCartao Numero do cart\u00E3o tokenizado
   * @return PageCartaoPayResponse
   */
  public PageCartaoPayResponse  listarUsingGET10 (String deviceId, List<String> sort, Integer page, Integer limit, String status, String numeroCartao) throws ApiException {
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
   * Cria\u00E7\u00E3o de cart\u00E3o
   * Este met\u00F3do permite a tokeniza\u00E7\u00E3o de um cart\u00E3o a partir dos seus dados impressos.
   * @param deviceId Device id criptografado
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
