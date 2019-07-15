package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.AvisoViagemResponse;
import br.com.conductor.pier.api.v2.model.PageAvisoViagemResponse;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class AvisoViagemApi {
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
   * Consultar um aviso viagem de acordo com o id passado
   * Este m\u00E9todo permite que seja consultado um aviso viagen existente na base do emissor
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Aviso Viagem (id)
   * @return AvisoViagemResponse
   */
  public AvisoViagemResponse  consultarAvisoViagem (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarAvisoViagem");
    }
    

    // create path and map variables
    String path = "/api/avisos-viagens/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (AvisoViagemResponse) ApiInvoker.deserialize(response, "", AvisoViagemResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Desabilitar um aviso viagem de acordo com o id passado
   * Este m\u00E9todo permite que seja desabilitado um aviso viagen existente na base do emissor
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Aviso Viagem (id)
   * @return AvisoViagemResponse
   */
  public AvisoViagemResponse  desabilitarAvisoViagem (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling desabilitarAvisoViagem");
    }
    

    // create path and map variables
    String path = "/api/avisos-viagens/{id}/desabilitar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (AvisoViagemResponse) ApiInvoker.deserialize(response, "", AvisoViagemResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Habilitar um aviso viagem de acordo com o id passado
   * Este m\u00E9todo permite que seja habilitado um aviso viagen existente na base do emissor
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Aviso Viagem (id)
   * @return AvisoViagemResponse
   */
  public AvisoViagemResponse  habilitarAvisoViagem (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling habilitarAvisoViagem");
    }
    

    // create path and map variables
    String path = "/api/avisos-viagens/{id}/habilitar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (AvisoViagemResponse) ApiInvoker.deserialize(response, "", AvisoViagemResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista os avisos viagens gerados pelo Emissor
   * Este m\u00E9todo permite que sejam listados os avisos viagens existentes na base do emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idCartao C\u00F3digo Identificador do cart\u00E3o na base (id)
   * @param codigoPais Codigo identificador do pa\u00EDs na base (id)
   * @param dataInicio Data inicio do aviso viagem
   * @param dataFim Data fim do aviso viagem
   * @param flagAtivo Identifica se o aviso viagem esta ativo ou n\u00E3o
   * @param paisDescricao Descri\u00E7\u00E3o do pa\u00EDs
   * @return PageAvisoViagemResponse
   */
  public PageAvisoViagemResponse  listarAvisosViagem (List<String> sort, Integer page, Integer limit, Long idCartao, String codigoPais, String dataInicio, String dataFim, Integer flagAtivo, String paisDescricao) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/avisos-viagens".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idCartao", idCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "codigoPais", codigoPais));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataInicio", dataInicio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataFim", dataFim));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagAtivo", flagAtivo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "paisDescricao", paisDescricao));
    

    

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
        return (PageAvisoViagemResponse) ApiInvoker.deserialize(response, "", PageAvisoViagemResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza o cadastro de um novo Aviso Viagem
   * Este m\u00E9todo permite que seja cadastrado um novo Aviso Viagem na base de dados do Emissor
   * @param idCartao C\u00F3digo Identificador do cart\u00E3o na base (id)
   * @param codigoPais Codigo identificador do pa\u00EDs na base (id)
   * @param dataInicio Data inicio do aviso viagem
   * @param dataFim Data fim do aviso viagem
   * @return AvisoViagemResponse
   */
  public AvisoViagemResponse  salvarAvisoViagem (Long idCartao, String codigoPais, String dataInicio, String dataFim) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idCartao' is set
    if (idCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'idCartao' when calling salvarAvisoViagem");
    }
    
    // verify the required parameter 'codigoPais' is set
    if (codigoPais == null) {
       throw new ApiException(400, "Missing the required parameter 'codigoPais' when calling salvarAvisoViagem");
    }
    
    // verify the required parameter 'dataInicio' is set
    if (dataInicio == null) {
       throw new ApiException(400, "Missing the required parameter 'dataInicio' when calling salvarAvisoViagem");
    }
    
    // verify the required parameter 'dataFim' is set
    if (dataFim == null) {
       throw new ApiException(400, "Missing the required parameter 'dataFim' when calling salvarAvisoViagem");
    }
    

    // create path and map variables
    String path = "/api/avisos-viagens".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idCartao", idCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "codigoPais", codigoPais));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataInicio", dataInicio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataFim", dataFim));
    

    

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
        return (AvisoViagemResponse) ApiInvoker.deserialize(response, "", AvisoViagemResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
