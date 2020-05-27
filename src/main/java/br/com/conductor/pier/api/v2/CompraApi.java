package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.EventoExternoCompraParcialUpdate;
import br.com.conductor.pier.api.v2.model.EventoExternoCompraResponse;
import br.com.conductor.pier.api.v2.model.EventoExternoCompraPersist;
import br.com.conductor.pier.api.v2.model.CdtEventoExternoCompra;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class CompraApi {
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
   * Atualizar eventos externos de compras
   * Atualiza um evento externos de compras
   * @param id Id do evento externo de compra a ser alterado
   * @param eventoExternoCompraParcialUpdate eventoExternoCompraParcialUpdate
   * @return EventoExternoCompraResponse
   */
  public EventoExternoCompraResponse  atualizarEventoCompra (Long id, EventoExternoCompraParcialUpdate eventoExternoCompraParcialUpdate) throws ApiException {
    Object postBody = eventoExternoCompraParcialUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarEventoCompra");
    }
    
    // verify the required parameter 'eventoExternoCompraParcialUpdate' is set
    if (eventoExternoCompraParcialUpdate == null) {
       throw new ApiException(400, "Missing the required parameter 'eventoExternoCompraParcialUpdate' when calling atualizarEventoCompra");
    }
    

    // create path and map variables
    String path = "/api/eventos-externos-compras/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (EventoExternoCompraResponse) ApiInvoker.deserialize(response, "", EventoExternoCompraResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * consultar
   * 
   * @param id id
   * @return Object
   */
  public Object  consultar (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultar");
    }
    

    // create path and map variables
    String path = "/api/eventos-externos-compras/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
   * Listar eventos externos de compras
   * Lista os eventos externos de compras
   * @param dataCompraInicial Data da compra inicial
   * @param dataCompraFinal Data da compra final
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param id C\u00F3digo do evento
   * @param idConta C\u00F3digo da conta
   * @param idCartao C\u00F3digo do cart\u00E3o
   * @param idOperacao C\u00F3digo do tipo de opera\u00E7\u00E3o
   * @param idEstabelecimento C\u00F3digo do estabelecimento
   * @param dataLocal M\u00EAs/dia autoriza\u00E7\u00E3o
   * @param dataEntradaCompra 
   * @return EventoExternoCompraResponse
   */
  public EventoExternoCompraResponse  listarEventoCompra (String dataCompraInicial, String dataCompraFinal, List<String> sort, Integer page, Integer limit, Long id, Long idConta, Long idCartao, Long idOperacao, Long idEstabelecimento, String dataLocal, String dataEntradaCompra) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'dataCompraInicial' is set
    if (dataCompraInicial == null) {
       throw new ApiException(400, "Missing the required parameter 'dataCompraInicial' when calling listarEventoCompra");
    }
    
    // verify the required parameter 'dataCompraFinal' is set
    if (dataCompraFinal == null) {
       throw new ApiException(400, "Missing the required parameter 'dataCompraFinal' when calling listarEventoCompra");
    }
    

    // create path and map variables
    String path = "/api/eventos-externos-compras".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataCompraInicial", dataCompraInicial));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataCompraFinal", dataCompraFinal));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idCartao", idCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idOperacao", idOperacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEstabelecimento", idEstabelecimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataLocal", dataLocal));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataEntradaCompra", dataEntradaCompra));
    

    

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
        return (EventoExternoCompraResponse) ApiInvoker.deserialize(response, "", EventoExternoCompraResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Salvar eventos externos de compras
   * Salva os eventos externos de compras
   * @param eventoExternoCompraPersist eventoExternoCompraPersist
   * @return CdtEventoExternoCompra
   */
  public CdtEventoExternoCompra  salvarEventoCompra (EventoExternoCompraPersist eventoExternoCompraPersist) throws ApiException {
    Object postBody = eventoExternoCompraPersist;
    
    // verify the required parameter 'eventoExternoCompraPersist' is set
    if (eventoExternoCompraPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'eventoExternoCompraPersist' when calling salvarEventoCompra");
    }
    

    // create path and map variables
    String path = "/api/eventos-externos-compras".replaceAll("\\{format\\}","json");

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
        return (CdtEventoExternoCompra) ApiInvoker.deserialize(response, "", CdtEventoExternoCompra.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
