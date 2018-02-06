package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.ArquivoDetalheResponse;
import br.com.conductor.pier.api.v2.model.IntegrarArquivoRequest;
import br.com.conductor.pier.api.v2.model.PageArquivoResponse;
import br.com.conductor.pier.api.v2.model.ArquivoPersist;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class ArquivoApi {
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
   * Consulta de arquivo no PIER Cloud
   * Este recurso permite consultar um determinado arquivo armazenado no PIER Cloud.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do arquivo
   * @return ArquivoDetalheResponse
   */
  public ArquivoDetalheResponse  consultarUsingGET2 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET2");
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
   * Integrar Arquivos
   * Este recurso foi desenvolvido para realizar a integra\u00C3\u00A7\u00C3\u00A3o de arquivos do PIER Cloud junto a reposit\u00C3\u00B3rios externos pr\u00C3\u00A9-configurado.
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
   * Listar arquivos do Pier Cloud
   * Este recurso permite a listagem de todos os arquivos dispon\u00C3\u00ADveis no Pier Cloud.
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param nome Nome do arquivo
   * @param idTipoArquivo Tipo do arquivo
   * @param idStatusArquivo Identificador do status do arquivo
   * @param extensao Extens\u00C3\u00A3o do arquivo
   * @return PageArquivoResponse
   */
  public PageArquivoResponse  listarUsingGET3 (List<String> sort, Integer page, Integer limit, String nome, Long idTipoArquivo, Long idStatusArquivo, String extensao) throws ApiException {
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
   * Permite armazenar arquivos no PIER Cloud
   * Este recurso permite o armazenamento de arquivos no PIER Cloud.
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
