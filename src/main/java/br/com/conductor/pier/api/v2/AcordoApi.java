package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.AcordoDetalheResponse;
import br.com.conductor.pier.api.v2.model.ParcelaAcordoResponse;
import br.com.conductor.pier.api.v2.model.BoletoParcelaAcordoResponse;
import br.com.conductor.pier.api.v2.model.PageAcordoResponse;
import br.com.conductor.pier.api.v2.model.PageAcordoParcelaResponse;
import br.com.conductor.pier.api.v2.model.AcordoQuebraResponse;
import br.com.conductor.pier.api.v2.model.PlanoParcelamentoAcordoResponse;
import br.com.conductor.pier.api.v2.model.PlanoParcelamentoAcordoRequest;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class AcordoApi {
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
   * Consulta os dados de um determinado acordo
   * Este m\u00E9todo permite consultar dados de um determinado acordo a partir de seu codigo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do acordo (id)
   * @return AcordoDetalheResponse
   */
  public AcordoDetalheResponse  consultar (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultar");
    }
    

    // create path and map variables
    String path = "/api/acordos/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (AcordoDetalheResponse) ApiInvoker.deserialize(response, "", AcordoDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Consulta uma parcela do acordo
   * Consulta uma parcela do acordo
   * @param id Identificador da parcela
   * @return ParcelaAcordoResponse
   */
  public ParcelaAcordoResponse  consultarPorId (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarPorId");
    }
    

    // create path and map variables
    String path = "/api/parcelas-acordos/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (ParcelaAcordoResponse) ApiInvoker.deserialize(response, "", ParcelaAcordoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Gerar boleto da parcela do acordo
   * Este recurso permite a gera\u00E7\u00E3o do boleto de uma parcela de um acordo
   * @param id Identificador da parcela
   * @return BoletoParcelaAcordoResponse
   */
  public BoletoParcelaAcordoResponse  gerarBoleto (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling gerarBoleto");
    }
    

    // create path and map variables
    String path = "/api/parcelas-acordos/{id}/boletos".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (BoletoParcelaAcordoResponse) ApiInvoker.deserialize(response, "", BoletoParcelaAcordoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista os acordos existentes na base
   * Este m\u00E9todo permite que sejam listados todos os acordos existentes na base do emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idConta C\u00F3digo Identificador da conta na base (id)
   * @param statusAcordo Status do acordo na base
   * @param dataAcordo Data do acordo
   * @param quantidadeParcelas Quantidade de parcelas
   * @return PageAcordoResponse
   */
  public PageAcordoResponse  listar (List<String> sort, Integer page, Integer limit, Long idConta, Long statusAcordo, String dataAcordo, Integer quantidadeParcelas) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/acordos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "statusAcordo", statusAcordo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataAcordo", dataAcordo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "quantidadeParcelas", quantidadeParcelas));
    

    

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
        return (PageAcordoResponse) ApiInvoker.deserialize(response, "", PageAcordoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Listar parcelas do acordo
   * Este recurso permite a listagem paginada das parcelas do acordo, podendo filtrar pelos atributos: id do acordo, nosso n\u00FAmero e n\u00FAmero da parcela
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idAcordo Identificador do acordo
   * @param nossoNumero Nosso n\u00FAmero do boleto
   * @param numeroParcela N\u00FAmero da parcela
   * @param dataVencimento Data vencimento da parcela do acordo
   * @return PageAcordoParcelaResponse
   */
  public PageAcordoParcelaResponse  listar_1 (List<String> sort, Integer page, Integer limit, Long idAcordo, String nossoNumero, Integer numeroParcela, String dataVencimento) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/parcelas-acordos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idAcordo", idAcordo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nossoNumero", nossoNumero));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroParcela", numeroParcela));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataVencimento", dataVencimento));
    

    

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
        return (PageAcordoParcelaResponse) ApiInvoker.deserialize(response, "", PageAcordoParcelaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Quebra o acordo pelo id informado
   * Este m\u00E9todo permite que um acordo seja quebrado a partir de um id de acordo informado
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do acordo
   * @return AcordoQuebraResponse
   */
  public AcordoQuebraResponse  quebrarAcordo (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling quebrarAcordo");
    }
    

    // create path and map variables
    String path = "/api/acordos/{id}/quebrar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (AcordoQuebraResponse) ApiInvoker.deserialize(response, "", AcordoQuebraResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza simula\u00E7\u00F5es de planos de parcelamento para acordos
   * Este recurso que permite realizar a simula\u00E7\u00E3o de planos de parcelamentos para abertura de acordos
   * @param request request
   * @return PlanoParcelamentoAcordoResponse
   */
  public PlanoParcelamentoAcordoResponse  simularPlanosParcelamentos (PlanoParcelamentoAcordoRequest request) throws ApiException {
    Object postBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
       throw new ApiException(400, "Missing the required parameter 'request' when calling simularPlanosParcelamentos");
    }
    

    // create path and map variables
    String path = "/api/acordos/planos-parcelamentos".replaceAll("\\{format\\}","json");

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
        return (PlanoParcelamentoAcordoResponse) ApiInvoker.deserialize(response, "", PlanoParcelamentoAcordoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
