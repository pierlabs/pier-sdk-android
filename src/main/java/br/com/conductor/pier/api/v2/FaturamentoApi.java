package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.TipoFaturamentoPersist;
import br.com.conductor.pier.api.v2.model.TipoFaturamentoResponse;
import br.com.conductor.pier.api.v2.model.TipoFaturamentoPorContaPersist;
import br.com.conductor.pier.api.v2.model.TipoFaturamentoPorContaResponse;
import br.com.conductor.pier.api.v2.model.PageTipoFaturamentoPorContaResponse;
import br.com.conductor.pier.api.v2.model.PageTipoFaturamentoResponse;

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
   * Alterar as configura\u00C3\u00A7\u00C3\u00B5es de um determinado tipo de faturamento
   * @param id Id
   * @param tipoFaturamentoPersist tipoFaturamentoPersist
   * @return TipoFaturamentoResponse
   */
  public TipoFaturamentoResponse  alterarTipoFaturamentoUsingPUT (Long id, TipoFaturamentoPersist tipoFaturamentoPersist) throws ApiException {
    Object postBody = tipoFaturamentoPersist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarTipoFaturamentoUsingPUT");
    }
    
    // verify the required parameter 'tipoFaturamentoPersist' is set
    if (tipoFaturamentoPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'tipoFaturamentoPersist' when calling alterarTipoFaturamentoUsingPUT");
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
   * Adiciona uma nova configura\u00C3\u00A7\u00C3\u00A3o de faturamento para uma conta
   * Este m\u00C3\u00A9todo permite adicionar uma nova configura\u00C3\u00A7\u00C3\u00A3o de tipo de faturamento para um conta espec\u00C3\u00ADfica.
   * @param tipoFaturamentoPorContaPersist tipoFaturamentoPorContaPersist
   * @return TipoFaturamentoPorContaResponse
   */
  public TipoFaturamentoPorContaResponse  cadastrarFaturamentoPorContaUsingPOST (TipoFaturamentoPorContaPersist tipoFaturamentoPorContaPersist) throws ApiException {
    Object postBody = tipoFaturamentoPorContaPersist;
    
    // verify the required parameter 'tipoFaturamentoPorContaPersist' is set
    if (tipoFaturamentoPorContaPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'tipoFaturamentoPorContaPersist' when calling cadastrarFaturamentoPorContaUsingPOST");
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
   * Adiciona uma nova configura\u00C3\u00A7\u00C3\u00A3o de tipo de faturamento
   * @param tipoFaturamentoPersist tipoFaturamentoPersist
   * @return TipoFaturamentoResponse
   */
  public TipoFaturamentoResponse  cadastrarTipoFaturamentoUsingPOST (TipoFaturamentoPersist tipoFaturamentoPersist) throws ApiException {
    Object postBody = tipoFaturamentoPersist;
    
    // verify the required parameter 'tipoFaturamentoPersist' is set
    if (tipoFaturamentoPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'tipoFaturamentoPersist' when calling cadastrarTipoFaturamentoUsingPOST");
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
  
  /**
   * Consultar Faturamento por id
   * Consulta os detalhes de uma determinada Faturamento
   * @param id Id
   * @return TipoFaturamentoResponse
   */
  public TipoFaturamentoResponse  consultarTipoFaturamentoUsingGET (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTipoFaturamentoUsingGET");
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
   * Desativar uma configura\u00C3\u00A7\u00C3\u00A3o de tipo de faturamento por conta atrav\u00C3\u00A9s do id
   * Desativa uma configura\u00C3\u00A7\u00C3\u00A3o de tipo de faturamento de uma determinada conta.
   * @param id Id
   * @param modificadoPor modificadoPor
   * @return TipoFaturamentoPorContaResponse
   */
  public TipoFaturamentoPorContaResponse  desativarFaturamentoPorContaUsingPOST (Long id, String modificadoPor) throws ApiException {
    Object postBody = modificadoPor;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling desativarFaturamentoPorContaUsingPOST");
    }
    
    // verify the required parameter 'modificadoPor' is set
    if (modificadoPor == null) {
       throw new ApiException(400, "Missing the required parameter 'modificadoPor' when calling desativarFaturamentoPorContaUsingPOST");
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
   * Desativar uma configura\u00C3\u00A7\u00C3\u00A3o de tipo de faturamento atrav\u00C3\u00A9s do id
   * Desativa uma configura\u00C3\u00A7\u00C3\u00A3o de tipo de faturamento.
   * @param id Id
   * @return TipoFaturamentoResponse
   */
  public TipoFaturamentoResponse  desativarTipoFaturamentoUsingPOST (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling desativarTipoFaturamentoUsingPOST");
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
   * Lista as configura\u00C3\u00A7\u00C3\u00B5es de tipos de faturamento por conta
   * Este m\u00C3\u00A9todo permite listar as configura\u00C3\u00A7\u00C3\u00B5es de tipos de faturamento registrados a uma conta.
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param idTipoFaturamentoPorConta C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo de faturamento por conta (id).
   * @param status Representa se a configura\u00C3\u00A7\u00C3\u00A3o est\u00C3\u00A1 ativada ou desativada para a conta.
   * @param idConta C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo de faturamento por conta (id).
   * @param idTipoFaturamento C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo de faturamento relacionada (id).
   * @param dataHoraInclusao Data da inclus\u00C3\u00A3o da configura\u00C3\u00A7\u00C3\u00A3o, deve ser informada no formato yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;.
   * @param dataHoraCancelamento Data do cancelamento da configura\u00C3\u00A7\u00C3\u00A3o, deve ser informada no formato yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;.
   * @param modificadoPor Identificador do respons\u00C3\u00A1vel pela modifica\u00C3\u00A7\u00C3\u00A3o do registro.
   * @return PageTipoFaturamentoPorContaResponse
   */
  public PageTipoFaturamentoPorContaResponse  listarFaturamentoPorContaUsingGET (List<String> sort, Integer page, Integer limit, Long idTipoFaturamentoPorConta, Boolean status, Long idConta, Long idTipoFaturamento, String dataHoraInclusao, String dataHoraCancelamento, String modificadoPor) throws ApiException {
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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "status", status));
    
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
   * Lista todas as configura\u00C3\u00A7\u00C3\u00B5es dos tipos de faturamento
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param idTipoFaturamento C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo de faturamento (id).
   * @param descricao Descri\u00C3\u00A7\u00C3\u00A3o do tipo de faturamento.
   * @param flagApenasDemonstrativo Flag que representa que o faturamento ser\u00C3\u00A1 apenas demonstrativo.
   * @param idConvenio C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do conv\u00C3\u00AAnio relacionado ao tipo de faturamento.
   * @return PageTipoFaturamentoResponse
   */
  public PageTipoFaturamentoResponse  listarTipoFaturamentoUsingGET (List<String> sort, Integer page, Integer limit, Long idTipoFaturamento, String descricao, Boolean flagApenasDemonstrativo, Long idConvenio) throws ApiException {
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
  
}
