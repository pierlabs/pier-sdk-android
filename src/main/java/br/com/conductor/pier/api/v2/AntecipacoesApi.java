package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.ParametroProdutoResponse;
import br.com.conductor.pier.api.v2.model.TaxaAntecipacaoRequest;
import br.com.conductor.pier.api.v2.model.AntecipacaoResponse;
import br.com.conductor.pier.api.v2.model.PageCompraResponse;
import br.com.conductor.pier.api.v2.model.AntecipacaoSimuladaResponse;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;


public class AntecipacoesApi {
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
   * Configura a Taxa de Antecipa\u00C3\u00A7\u00C3\u00A3o de um Produto
   * Este recurso permite configurar a Taxa de Antecipa\u00C3\u00A7\u00C3\u00A3o de um Produto, a partir do seu c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param id Id Produto
   * @param taxaAntecipacaoRequest taxaAntecipacaoRequest
   * @return ParametroProdutoResponse
   */
  public ParametroProdutoResponse  configurarTaxaAntecipacaoUsingPOST (Long id, TaxaAntecipacaoRequest taxaAntecipacaoRequest) throws ApiException {
    Object postBody = taxaAntecipacaoRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling configurarTaxaAntecipacaoUsingPOST");
    }
    
    // verify the required parameter 'taxaAntecipacaoRequest' is set
    if (taxaAntecipacaoRequest == null) {
       throw new ApiException(400, "Missing the required parameter 'taxaAntecipacaoRequest' when calling configurarTaxaAntecipacaoUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/produtos/{id}/configurar-taxa-antecipacao".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (ParametroProdutoResponse) ApiInvoker.deserialize(response, "", ParametroProdutoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Consulta a Taxa de Antecipa\u00C3\u00A7\u00C3\u00A3o de um Produto
   * Este recurso permite consultar a Taxa de Antecipa\u00C3\u00A7\u00C3\u00A3o de um Produto, a partir do seu c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param id Id Produto
   * @param tipoTransacao Tipo da Transa\u00C3\u00A7\u00C3\u00A3o (ON-US ou OFF-US)
   * @return ParametroProdutoResponse
   */
  public ParametroProdutoResponse  consultarTaxaAntecipacaoUsingGET (Long id, String tipoTransacao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTaxaAntecipacaoUsingGET");
    }
    
    // verify the required parameter 'tipoTransacao' is set
    if (tipoTransacao == null) {
       throw new ApiException(400, "Missing the required parameter 'tipoTransacao' when calling consultarTaxaAntecipacaoUsingGET");
    }
    

    // create path and map variables
    String path = "/api/produtos/{id}/consultar-taxa-antecipacao".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tipoTransacao", tipoTransacao));
    

    

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
        return (ParametroProdutoResponse) ApiInvoker.deserialize(response, "", ParametroProdutoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Faz a efetiva\u00C3\u00A7\u00C3\u00A3o da antecipa\u00C3\u00A7\u00C3\u00A3o
   * M\u00C3\u00A9todo responsavel pela efetiva\u00C3\u00A7\u00C3\u00A3o da antecipa\u00C3\u00A7\u00C3\u00A3o, cujo desconto \u00C3\u00A9 calculado baseado na data da \u00C3\u00BAltima parcela em aberto.
   * @param idConta C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do evento.
   * @param quantidadeParcelas Quantidade de parcelas para serem antecipadas.
   * @return AntecipacaoResponse
   */
  public AntecipacaoResponse  efetivarAntecipacaoUsingPOST (Long idConta, Long id, Long quantidadeParcelas) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling efetivarAntecipacaoUsingPOST");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling efetivarAntecipacaoUsingPOST");
    }
    
    // verify the required parameter 'quantidadeParcelas' is set
    if (quantidadeParcelas == null) {
       throw new ApiException(400, "Missing the required parameter 'quantidadeParcelas' when calling efetivarAntecipacaoUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/compras-antecipaveis/{id}/efetivar-antecipacao".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
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
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (AntecipacaoResponse) ApiInvoker.deserialize(response, "", AntecipacaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Listar compras com parcelas antecip\u00C3\u00A1veis
   * Lista as compras antecip\u00C3\u00A1veis de uma conta.
   * @param idConta C\u00C3\u00B3digo identificador da conta da Compra.
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param idCompra C\u00C3\u00B3digo identificador da Compra.
   * @param parcelada Indica se a compra \u00C3\u00A9 parcelada.
   * @param juros Indica se a compra \u00C3\u00A9 com ou sem juros.
   * @param tipoOrigemTransacao Indica se a compra \u00C3\u00A9 ON-US ou OFF-US
   * @return PageCompraResponse
   */
  public PageCompraResponse  listarUsingGET7 (Long idConta, List<String> sort, Integer page, Integer limit, Long idCompra, Boolean parcelada, Boolean juros, String tipoOrigemTransacao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling listarUsingGET7");
    }
    

    // create path and map variables
    String path = "/api/compras-antecipaveis".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idCompra", idCompra));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "parcelada", parcelada));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "juros", juros));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tipoOrigemTransacao", tipoOrigemTransacao));
    

    

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
        return (PageCompraResponse) ApiInvoker.deserialize(response, "", PageCompraResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Simular antecipa\u00C3\u00A7\u00C3\u00A3o de parcelas
   * Simula a antecipa\u00C3\u00A7\u00C3\u00A3o de parcelas de um evento, listando todos os planos de parcelamento dispon\u00C3\u00ADveis, cujo desconto \u00C3\u00A9 calculado baseado na data da \u00C3\u00BAltima parcela em aberto.
   * @param idConta C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do evento.
   * @return AntecipacaoSimuladaResponse
   */
  public AntecipacaoSimuladaResponse  simularAntecipacaoUsingGET (Long idConta, Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling simularAntecipacaoUsingGET");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling simularAntecipacaoUsingGET");
    }
    

    // create path and map variables
    String path = "/api/compras-antecipaveis/{id}/simular-antecipacao".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    

    

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
        return (AntecipacaoSimuladaResponse) ApiInvoker.deserialize(response, "", AntecipacaoSimuladaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}

