package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.LoteCartaoUpdate;
import br.com.conductor.pier.api.v2.model.LoteCartaoResponse;
import br.com.conductor.pier.api.v2.model.PageCartaoLoteResponse;
import br.com.conductor.pier.api.v2.model.PageLoteCartaoResponse;
import br.com.conductor.pier.api.v2.model.LoteCartaoPersist;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class LoteApi {
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
   * Atualiza um lote de cart\u00E3o Noname
   * Este recurso permite Atualiza um lote de cart\u00E3o Noname
   * @param id id
   * @param loteCartaoUpdate loteCartaoUpdate
   * @return LoteCartaoResponse
   */
  public LoteCartaoResponse  atualizarLotesCartoes (Long id, LoteCartaoUpdate loteCartaoUpdate) throws ApiException {
    Object postBody = loteCartaoUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarLotesCartoes");
    }
    
    // verify the required parameter 'loteCartaoUpdate' is set
    if (loteCartaoUpdate == null) {
       throw new ApiException(400, "Missing the required parameter 'loteCartaoUpdate' when calling atualizarLotesCartoes");
    }
    

    // create path and map variables
    String path = "/api/lotes/cartoes/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
      String response = apiInvoker.invokeAPI(basePath, path, "PATCH", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (LoteCartaoResponse) ApiInvoker.deserialize(response, "", LoteCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Consulta um lote de cart\u00E3o Noname cadastrado
   * Este recurso permite Consulta um lote de cart\u00E3o Noname cadastrado
   * @param id id
   * @return LoteCartaoResponse
   */
  public LoteCartaoResponse  consultarLotesCartoes (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarLotesCartoes");
    }
    

    // create path and map variables
    String path = "/api/lotes/cartoes/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (LoteCartaoResponse) ApiInvoker.deserialize(response, "", LoteCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Remove um lote de cart\u00E3o Noname com status criado
   * Este recurso permite remover um lote de cart\u00E3o Noname com status criado
   * @param id id
   * @return Object
   */
  public Object  deletarLotesCartoes (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling deletarLotesCartoes");
    }
    

    // create path and map variables
    String path = "/api/lotes/cartoes/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
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
   * Lista os identificadores de lotes e cart\u00F5es
   * Este recurso permite listar os identificadores de lotes e de cart\u00F5es Noname cadastrados
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idCartao C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o
   * @param idLote C\u00F3digo de identifica\u00E7\u00E3o do lote
   * @param idCartaoPai C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o pai
   * @return PageCartaoLoteResponse
   */
  public PageCartaoLoteResponse  listarIdentificadoresCartoesLotes (List<String> sort, Integer page, Integer limit, Long idCartao, Long idLote, Long idCartaoPai) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/lotes/cartoes/identificadores".replaceAll("\\{format\\}","json");

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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idLote", idLote));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idCartaoPai", idCartaoPai));
    

    

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
        return (PageCartaoLoteResponse) ApiInvoker.deserialize(response, "", PageCartaoLoteResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista os lotes de cart\u00F5es Noname cadastrados
   * Este recurso permite lista os lotes de cart\u00F5es Noname cadastrados
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param qtdSolicitada Quantidade de cart\u00F5es a ser emitido
   * @param idProduto C\u00F3digo identificador do produto
   * @param idSolicitante C\u00F3digo identificador do solicitante
   * @param idOrigemComercial C\u00F3digo identificador da origem comercial
   * @param idPlastico C\u00F3digo identificador do tipo pl\u00E1stico associado ao produto
   * @param idImagem C\u00F3digo identificador do tipo pl\u00E1stico imagem
   * @param idContaDefault C\u00F3digo identificador da conta padr\u00E3o
   * @param flagMultiApp Lote de cart\u00F5es m\u00FAltiplos
   * @param dataAgendamento Data de agendamento do lote
   * @param tipoLote Tipo do lote agendado
   * @param statusLote Status do lote
   * @return PageLoteCartaoResponse
   */
  public PageLoteCartaoResponse  listarLotesCartoes (List<String> sort, Integer page, Integer limit, Integer qtdSolicitada, Long idProduto, Long idSolicitante, Long idOrigemComercial, Long idPlastico, Long idImagem, Long idContaDefault, Boolean flagMultiApp, String dataAgendamento, Integer tipoLote, Integer statusLote) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/lotes/cartoes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "qtdSolicitada", qtdSolicitada));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idProduto", idProduto));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idSolicitante", idSolicitante));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idOrigemComercial", idOrigemComercial));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idPlastico", idPlastico));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idImagem", idImagem));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idContaDefault", idContaDefault));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagMultiApp", flagMultiApp));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataAgendamento", dataAgendamento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tipoLote", tipoLote));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "statusLote", statusLote));
    

    

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
        return (PageLoteCartaoResponse) ApiInvoker.deserialize(response, "", PageLoteCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Cadastra um lote de cart\u00F5es Noname
   * Este recurso permite cadastra um lote de cart\u00F5es Noname
   * @param loteCartaoPersist loteCartaoPersist
   * @return LoteCartaoResponse
   */
  public LoteCartaoResponse  salvarLotesCartoes (LoteCartaoPersist loteCartaoPersist) throws ApiException {
    Object postBody = loteCartaoPersist;
    
    // verify the required parameter 'loteCartaoPersist' is set
    if (loteCartaoPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'loteCartaoPersist' when calling salvarLotesCartoes");
    }
    

    // create path and map variables
    String path = "/api/lotes/cartoes".replaceAll("\\{format\\}","json");

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
        return (LoteCartaoResponse) ApiInvoker.deserialize(response, "", LoteCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
