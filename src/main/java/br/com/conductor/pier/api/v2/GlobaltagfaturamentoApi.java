package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.TipoFaturamentoPersistValue;
import br.com.conductor.pier.api.v2.model.TipoFaturamentoResponse;
import br.com.conductor.pier.api.v2.model.TipoFaturamentoPorContaPersistValue;
import br.com.conductor.pier.api.v2.model.TipoFaturamentoPorContaResponse;
import br.com.conductor.pier.api.v2.model.PageTipoFaturamentoPorContaResponse;
import br.com.conductor.pier.api.v2.model.PageTipoFaturamentoResponse;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class GlobaltagfaturamentoApi {
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
   * {{{faturamento_resource_alterar_tipo_faturamento}}}
   * {{{faturamento_resource_alterar_tipo_faturamento_notes}}}
   * @param id {{{faturamento_resource_alterar_tipo_faturamento_param_id_tipo_faturamento}}}
   * @param tipoFaturamentoPersist tipoFaturamentoPersist
   * @return TipoFaturamentoResponse
   */
  public TipoFaturamentoResponse  alterarTipoFaturamentoUsingPUT (Long id, TipoFaturamentoPersistValue tipoFaturamentoPersist) throws ApiException {
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
   * {{{faturamento_resource_cadastrar_faturamento_por_conta}}}
   * {{{faturamento_resource_cadastrar_faturamento_por_conta_notes}}}
   * @param tipoFaturamentoPorContaPersist tipoFaturamentoPorContaPersist
   * @return TipoFaturamentoPorContaResponse
   */
  public TipoFaturamentoPorContaResponse  cadastrarFaturamentoPorContaUsingPOST (TipoFaturamentoPorContaPersistValue tipoFaturamentoPorContaPersist) throws ApiException {
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
   * {{{faturamento_resource_cadastrar_tipo_faturamento}}}
   * {{{faturamento_resource_cadastrar_tipo_faturamento_notes}}}
   * @param tipoFaturamentoPersist tipoFaturamentoPersist
   * @return TipoFaturamentoResponse
   */
  public TipoFaturamentoResponse  cadastrarTipoFaturamentoUsingPOST (TipoFaturamentoPersistValue tipoFaturamentoPersist) throws ApiException {
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
   * {{{faturamento_resource_consultar_tipo_faturamento}}}
   * {{{faturamento_resource_consultar_tipo_faturamento_notes}}}
   * @param id {{{faturamento_resource_consultar_tipo_faturamento_param_id_tipo_faturamento}}}
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
   * {{{faturamento_resource_desativar_faturamento_por_conta}}}
   * {{{faturamento_resource_desativar_faturamento_por_conta_notes}}}
   * @param id {{{faturamento_resource_desativar_faturamento_por_conta_param_id}}}
   * @return TipoFaturamentoPorContaResponse
   */
  public TipoFaturamentoPorContaResponse  desativarFaturamentoPorContaUsingPOST (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling desativarFaturamentoPorContaUsingPOST");
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
   * {{{faturamento_resource_desativar_tipo_faturamento}}}
   * {{{faturamento_resource_desativar_tipo_faturamento_notes}}}
   * @param id {{{faturamento_resource_desativar_tipo_faturamento_param_id_tipo_faturamento}}}
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
   * {{{faturamento_resource_listar_faturamento_por_conta}}}
   * {{{faturamento_resource_listar_faturamento_por_conta_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idTipoFaturamentoPorConta {{{tipo_faturamento_por_conta_request_id_tipo_faturamento_por_conta_value}}}
   * @param ativo {{{tipo_faturamento_por_conta_request_status_value}}}
   * @param idConta {{{tipo_faturamento_por_conta_request_id_conta_value}}}
   * @param idTipoFaturamento {{{tipo_faturamento_por_conta_request_id_tipo_faturamento_value}}}
   * @param dataHoraInclusao {{{tipo_faturamento_por_conta_request_data_hora_inclusao_value}}}
   * @param dataHoraCancelamento {{{tipo_faturamento_por_conta_request_data_hora_cancelamento_value}}}
   * @param modificadoPor {{{tipo_faturamento_por_conta_request_modificado_por_value}}}
   * @return PageTipoFaturamentoPorContaResponse
   */
  public PageTipoFaturamentoPorContaResponse  listarFaturamentoPorContaUsingGET (List<String> sort, Integer page, Integer limit, Long idTipoFaturamentoPorConta, Boolean ativo, Long idConta, Long idTipoFaturamento, String dataHoraInclusao, String dataHoraCancelamento, String modificadoPor) throws ApiException {
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
   * {{{faturamento_resource_listar_tipo_faturamento}}}
   * {{{faturamento_resource_listar_tipo_faturamento_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idTipoFaturamento {{{tipo_faturamento_request_id_tipo_faturamento_value}}}
   * @param descricao {{{tipo_faturamento_request_descricao_value}}}
   * @param flagApenasDemonstrativo {{{tipo_faturamento_request_flag_apenas_demonstrativo_value}}}
   * @param idConvenio {{{tipo_faturamento_request_id_convenio_value}}}
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
