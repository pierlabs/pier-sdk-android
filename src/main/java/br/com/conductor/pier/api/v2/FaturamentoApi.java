package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.TipoFaturamentoPersist;
import br.com.conductor.pier.api.v2.model.TipoFaturamentoResponse;
import br.com.conductor.pier.api.v2.model.TipoFaturamentoPorContaResponse;
import br.com.conductor.pier.api.v2.model.PageTipoFaturamentoPorContaResponse;
import br.com.conductor.pier.api.v2.model.PageTipoFaturamentoResponse;
import br.com.conductor.pier.api.v2.model.TipoFaturamentoPorContaPersist;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class FaturamentoApi {
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
   * Alterar Faturamento
   * Alterar as configura\u00E7\u00F5es de um determinado tipo de faturamento
   * @param id Id
   * @param tipoFaturamentoPersist tipoFaturamentoPersist
   * @return TipoFaturamentoResponse
   */
  public TipoFaturamentoResponse  alterarTipoFaturamento (Long id, TipoFaturamentoPersist tipoFaturamentoPersist) throws ApiException {
    Object postBody = tipoFaturamentoPersist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarTipoFaturamento");
    }
    
    // verify the required parameter 'tipoFaturamentoPersist' is set
    if (tipoFaturamentoPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'tipoFaturamentoPersist' when calling alterarTipoFaturamento");
    }
    

    // create path and map variables
    String path = "/api/tipos-faturamento/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (TipoFaturamentoResponse) ApiInvoker.deserialize(response, "", TipoFaturamentoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Consultar Faturamento por id
   * Consulta os detalhes de uma determinada Faturamento
   * @param id Id
   * @return TipoFaturamentoResponse
   */
  public TipoFaturamentoResponse  consultarTipoFaturamento (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTipoFaturamento");
    }
    

    // create path and map variables
    String path = "/api/tipos-faturamento/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (TipoFaturamentoResponse) ApiInvoker.deserialize(response, "", TipoFaturamentoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Desativar uma configura\u00E7\u00E3o de tipo de faturamento por conta atrav\u00E9s do id
   * Desativa uma configura\u00E7\u00E3o de tipo de faturamento de uma determinada conta
   * @param id Id
   * @return TipoFaturamentoPorContaResponse
   */
  public TipoFaturamentoPorContaResponse  desativarFaturamentoPorConta (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling desativarFaturamentoPorConta");
    }
    

    // create path and map variables
    String path = "/api/tipos-faturamento-conta/{id}/desativar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (TipoFaturamentoPorContaResponse) ApiInvoker.deserialize(response, "", TipoFaturamentoPorContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Desativar uma configura\u00E7\u00E3o de tipo de faturamento atrav\u00E9s do id
   * Desativa uma configura\u00E7\u00E3o de tipo de faturamento
   * @param id Id
   * @return TipoFaturamentoResponse
   */
  public TipoFaturamentoResponse  desativarTipoFaturamento (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling desativarTipoFaturamento");
    }
    

    // create path and map variables
    String path = "/api/tipos-faturamento/{id}/desativar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (TipoFaturamentoResponse) ApiInvoker.deserialize(response, "", TipoFaturamentoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista as configura\u00E7\u00F5es de tipos de faturamento por conta
   * Este m\u00E9todo permite listar as configura\u00E7\u00F5es de tipos de faturamento registrados a uma conta
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idTipoFaturamentoPorConta C\u00F3digo de identifica\u00E7\u00E3o do tipo de faturamento por conta (id)
   * @param ativo Representa se a configura\u00E7\u00E3o est\u00E1 ativada ou desativada para a conta
   * @param idConta C\u00F3digo de identifica\u00E7\u00E3o do tipo de faturamento por conta (id)
   * @param idTipoFaturamento C\u00F3digo de identifica\u00E7\u00E3o do tipo de faturamento relacionada (id)
   * @param dataHoraInclusao Data da inclus\u00E3o da configura\u00E7\u00E3o, deve ser informada no formato yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;
   * @param dataHoraCancelamento Data do cancelamento da configura\u00E7\u00E3o, deve ser informada no formato yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;
   * @param modificadoPor Identificador do respons\u00E1vel pela modifica\u00E7\u00E3o do registro
   * @return PageTipoFaturamentoPorContaResponse
   */
  public PageTipoFaturamentoPorContaResponse  listarFaturamentosPorConta (List<String> sort, Integer page, Integer limit, Long idTipoFaturamentoPorConta, Boolean ativo, Long idConta, Long idTipoFaturamento, String dataHoraInclusao, String dataHoraCancelamento, String modificadoPor) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/tipos-faturamento-conta".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoFaturamentoPorConta", idTipoFaturamentoPorConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "ativo", ativo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoFaturamento", idTipoFaturamento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataHoraInclusao", dataHoraInclusao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataHoraCancelamento", dataHoraCancelamento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "modificadoPor", modificadoPor));
    

    

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
        return (PageTipoFaturamentoPorContaResponse) ApiInvoker.deserialize(response, "", PageTipoFaturamentoPorContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista Tipos de Faturamento
   * Lista todas as configura\u00E7\u00F5es dos tipos de faturamento
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idTipoFaturamento C\u00F3digo de identifica\u00E7\u00E3o do tipo de faturamento (id)
   * @param descricao Descri\u00E7\u00E3o do tipo de faturamento
   * @param flagApenasDemonstrativo Flag que representa que o faturamento ser\u00E1 apenas demonstrativo
   * @param idConvenio C\u00F3digo de identifica\u00E7\u00E3o do conv\u00EAnio relacionado ao tipo de faturamento
   * @return PageTipoFaturamentoResponse
   */
  public PageTipoFaturamentoResponse  listarTiposFaturamentos (List<String> sort, Integer page, Integer limit, Long idTipoFaturamento, String descricao, Boolean flagApenasDemonstrativo, Long idConvenio) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/tipos-faturamento".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoFaturamento", idTipoFaturamento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagApenasDemonstrativo", flagApenasDemonstrativo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConvenio", idConvenio));
    

    

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
        return (PageTipoFaturamentoResponse) ApiInvoker.deserialize(response, "", PageTipoFaturamentoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Adiciona uma nova configura\u00E7\u00E3o de faturamento para uma conta
   * Este m\u00E9todo permite adicionar uma nova configura\u00E7\u00E3o de tipo de faturamento para um conta espec\u00EDfica
   * @param tipoFaturamentoPorContaPersist tipoFaturamentoPorContaPersist
   * @return TipoFaturamentoPorContaResponse
   */
  public TipoFaturamentoPorContaResponse  salvarFaturamentoPorConta (TipoFaturamentoPorContaPersist tipoFaturamentoPorContaPersist) throws ApiException {
    Object postBody = tipoFaturamentoPorContaPersist;
    
    // verify the required parameter 'tipoFaturamentoPorContaPersist' is set
    if (tipoFaturamentoPorContaPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'tipoFaturamentoPorContaPersist' when calling salvarFaturamentoPorConta");
    }
    

    // create path and map variables
    String path = "/api/tipos-faturamento-conta".replaceAll("\\{format\\}","json");

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
        return (TipoFaturamentoPorContaResponse) ApiInvoker.deserialize(response, "", TipoFaturamentoPorContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Adiciona um novo faturamento
   * Adiciona uma nova configura\u00E7\u00E3o de tipo de faturamento
   * @param tipoFaturamentoPersist tipoFaturamentoPersist
   * @return TipoFaturamentoResponse
   */
  public TipoFaturamentoResponse  salvarTipoFaturamento (TipoFaturamentoPersist tipoFaturamentoPersist) throws ApiException {
    Object postBody = tipoFaturamentoPersist;
    
    // verify the required parameter 'tipoFaturamentoPersist' is set
    if (tipoFaturamentoPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'tipoFaturamentoPersist' when calling salvarTipoFaturamento");
    }
    

    // create path and map variables
    String path = "/api/tipos-faturamento".replaceAll("\\{format\\}","json");

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
        return (TipoFaturamentoResponse) ApiInvoker.deserialize(response, "", TipoFaturamentoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
