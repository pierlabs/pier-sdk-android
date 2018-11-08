package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.ArquivoDetalheResponse;
import br.com.conductor.pier.api.v2.model.IntegrarArquivoRequest;
import br.com.conductor.pier.api.v2.model.PageArquivoAUDResponse;
import br.com.conductor.pier.api.v2.model.PageStatusArquivoResponse;
import br.com.conductor.pier.api.v2.model.PageTipoArquivoResponse;
import br.com.conductor.pier.api.v2.model.PageArquivoResponse;
import br.com.conductor.pier.api.v2.model.ArquivoPersist;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class GlobaltagarquivoApi {
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
   * {{{arquivo_resource_consultar}}}
   * {{{arquivo_resource_consultar_notes}}}
   * @param id {{{arquivo_resource_consultar_param_id}}}
   * @return ArquivoDetalheResponse
   */
  public ArquivoDetalheResponse  consultarUsingGET4 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET4");
    }
    

    // create path and map variables
    String path = "/api/arquivos/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (ArquivoDetalheResponse) ApiInvoker.deserialize(response, "", ArquivoDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{arquivo_resource_integrar}}}
   * {{{arquivo_resource_integrar_notes}}}
   * @param integrarArquivoRequest integrarArquivoRequest
   * @return Object
   */
  public Object  integrarUsingPOST (IntegrarArquivoRequest integrarArquivoRequest) throws ApiException {
    Object postBody = integrarArquivoRequest;
    
    // verify the required parameter 'integrarArquivoRequest' is set
    if (integrarArquivoRequest == null) {
       throw new ApiException(400, "Missing the required parameter 'integrarArquivoRequest' when calling integrarUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/arquivos/integrar".replaceAll("\\{format\\}","json");

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
        return (Object) ApiInvoker.deserialize(response, "", Object.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{arquivo_a_u_d_resource_listar_por_numero_receita_federal}}}
   * {{{arquivo_a_u_d_resource_listar_por_numero_receita_federal_notes}}}
   * @param numeroReceitaFederal {{{arquivo_a_u_d_resource_listar_por_numero_receita_federal_param_numero_receita_federal}}}
   * @param page {{{pagable_page_value}}}
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @return PageArquivoAUDResponse
   */
  public PageArquivoAUDResponse  listarPorNumeroReceitaFederalUsingGET (String numeroReceitaFederal, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'numeroReceitaFederal' is set
    if (numeroReceitaFederal == null) {
       throw new ApiException(400, "Missing the required parameter 'numeroReceitaFederal' when calling listarPorNumeroReceitaFederalUsingGET");
    }
    

    // create path and map variables
    String path = "/api/arquivos-auditorias".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroReceitaFederal", numeroReceitaFederal));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    

    

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
        return (PageArquivoAUDResponse) ApiInvoker.deserialize(response, "", PageArquivoAUDResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{arquivo_resource_listar_status_arquivos}}}
   * {{{arquivo_resource_listar_status_arquivos_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param nome {{{status_arquivo_request_nome_value}}}
   * @param descricao {{{status_arquivo_request_descricao_value}}}
   * @return PageStatusArquivoResponse
   */
  public PageStatusArquivoResponse  listarStatusArquivosUsingGET (List<String> sort, Integer page, Integer limit, String nome, String descricao) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/status-arquivos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "descricao", descricao));
    

    

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
        return (PageStatusArquivoResponse) ApiInvoker.deserialize(response, "", PageStatusArquivoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{arquivo_resource_listar_tipos_arquivos}}}
   * {{{arquivo_resource_listar_tipos_arquivos_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param nome {{{tipo_arquivo_request_nome_value}}}
   * @param descricao {{{tipo_arquivo_request_descricao_value}}}
   * @return PageTipoArquivoResponse
   */
  public PageTipoArquivoResponse  listarTiposArquivosUsingGET (List<String> sort, Integer page, Integer limit, String nome, String descricao) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/tipos-arquivos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "descricao", descricao));
    

    

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
        return (PageTipoArquivoResponse) ApiInvoker.deserialize(response, "", PageTipoArquivoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{arquivo_a_u_d_resource_listar}}}
   * {{{arquivo_a_u_d_resource_listar_notes}}}
   * @param id {{{arquivo_a_u_d_resource_listar_param_id}}}
   * @param page {{{pagable_page_value}}}
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @return PageArquivoAUDResponse
   */
  public PageArquivoAUDResponse  listarUsingGET4 (Long id, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarUsingGET4");
    }
    

    // create path and map variables
    String path = "/api/arquivos/{id}/auditorias".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    

    

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
        return (PageArquivoAUDResponse) ApiInvoker.deserialize(response, "", PageArquivoAUDResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{arquivo_resource_listar}}}
   * {{{arquivo_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param nome {{{arquivo_request_nome_value}}}
   * @param idTipoArquivo {{{arquivo_request_id_tipo_arquivo_value}}}
   * @param idStatusArquivo {{{arquivo_request_id_status_arquivo_value}}}
   * @param extensao {{{arquivo_request_extensao_value}}}
   * @return PageArquivoResponse
   */
  public PageArquivoResponse  listarUsingGET5 (List<String> sort, Integer page, Integer limit, String nome, Long idTipoArquivo, Long idStatusArquivo, String extensao) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/arquivos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoArquivo", idTipoArquivo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idStatusArquivo", idStatusArquivo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "extensao", extensao));
    

    

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
        return (PageArquivoResponse) ApiInvoker.deserialize(response, "", PageArquivoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{arquivo_resource_salvar}}}
   * {{{arquivo_resource_salvar_notes}}}
   * @param arquivoPersist arquivoPersist
   * @return ArquivoDetalheResponse
   */
  public ArquivoDetalheResponse  salvarUsingPOST1 (ArquivoPersist arquivoPersist) throws ApiException {
    Object postBody = arquivoPersist;
    
    // verify the required parameter 'arquivoPersist' is set
    if (arquivoPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'arquivoPersist' when calling salvarUsingPOST1");
    }
    

    // create path and map variables
    String path = "/api/arquivos".replaceAll("\\{format\\}","json");

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
        return (ArquivoDetalheResponse) ApiInvoker.deserialize(response, "", ArquivoDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
