package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.ParametroEmissorResponse;
import br.com.conductor.pier.api.v2.model.ParametrosProdutoResponse;
import br.com.conductor.pier.api.v2.model.PageParametroProdutoResponse;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class ParametroApi {
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
   * Consultar par\u00E2metro do emissor
   * Este m\u00E9todo consulta par\u00E2metro do emissor pelo seu c\u00F3digo
   * @param codigo C\u00F3digo para pesquisa
   * @return ParametroEmissorResponse
   */
  public ParametroEmissorResponse  consultarParametroEmissor (String codigo) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'codigo' is set
    if (codigo == null) {
       throw new ApiException(400, "Missing the required parameter 'codigo' when calling consultarParametroEmissor");
    }
    

    // create path and map variables
    String path = "/api/parametros-emissor/{codigo}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "codigo" + "\\}", apiInvoker.escapeString(codigo.toString()));

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
        return (ParametroEmissorResponse) ApiInvoker.deserialize(response, "", ParametroEmissorResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Consultar um par\u00E2metro de produto
   * Consulta um par\u00E2metro de produto
   * @param id id
   * @return ParametrosProdutoResponse
   */
  public ParametrosProdutoResponse  consultarParametrosProdutos (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarParametrosProdutos");
    }
    

    // create path and map variables
    String path = "/api/parametros-produto/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (ParametrosProdutoResponse) ApiInvoker.deserialize(response, "", ParametrosProdutoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Listar os par\u00E2metros de produtos
   * Lista os par\u00E2metros de produtos
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param id Identificador do par\u00E2metro de produto
   * @param codigo C\u00F3digo do par\u00E2metro do produto
   * @param tipo Tipo do par\u00E2metro de produto
   * @param idProduto Identificador do produto
   * @param descricao Descri\u00E7\u00E3o do par\u00E2metro de produto
   * @return PageParametroProdutoResponse
   */
  public PageParametroProdutoResponse  listarParametrosProdutos (List<String> sort, Integer page, Integer limit, Long id, String codigo, String tipo, Long idProduto, String descricao) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/parametros-produto".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "codigo", codigo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tipo", tipo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idProduto", idProduto));
    
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
        return (PageParametroProdutoResponse) ApiInvoker.deserialize(response, "", PageParametroProdutoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
