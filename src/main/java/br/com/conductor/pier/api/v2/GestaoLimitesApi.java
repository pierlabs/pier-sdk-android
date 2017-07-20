package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.LimiteDisponibilidadeResponse;
import java.math.BigDecimal;
import br.com.conductor.pier.api.v2.model.PageHistoricoEventosResponse;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;


public class GestaoLimitesApi {
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
   * Realiza a altera\u00C3\u00A7\u00C3\u00A3o dos limites da conta
   * Esse recurso permite realizar a altera\u00C3\u00A7\u00C3\u00A3o dos Limites de uma determinada Conta.
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   * @param limiteGlobal Apresenta o valor do limite de cr\u00C3\u00A9dito que o portador do cart\u00C3\u00A3o possui.
   * @param limiteCompra Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para uso exclusivo em Compras Nacionais.
   * @param limiteParcelado Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para realizar transa\u00C3\u00A7\u00C3\u00B5es de compras parceladas.
   * @param limiteParcelas Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que portador pode acumular a partir da soma das parcelas das compras que forem realizadas nesta modalidade.
   * @param limiteSaqueGlobal Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Nacional.
   * @param limiteSaquePeriodo Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Nacional dentro de cada ciclo de faturamento.
   * @param limiteConsignado Quando utilizado pelo emissor, este campo apresenta o valor da margem de cr\u00C3\u00A9dito que ele poder\u00C3\u00A1 utilizar para ser cobrado de forma consignada (desconto em folha) em seu sal\u00C3\u00A1rio/vencimentos.
   * @param limiteInternacionalCompra Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para uso exclusivo em Compras Internacionais.
   * @param limiteInternacionalParcelado Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para realizar transa\u00C3\u00A7\u00C3\u00B5es Internacionais de Compras Parceladas.
   * @param limiteInternacionalParcelas Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que portador pode acumular a partir da soma das parcelas das compras internacionais que forem realizadas nesta modalidade.
   * @param limiteInternacionalSaqueGlobal Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Internacional.
   * @param limiteInternacionalSaquePeriodo Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Internacional dentro de cada ciclo de faturamento.
   * @param limiteMaximo Valor m\u00C3\u00A1ximo do limite de cr\u00C3\u00A9dito para realizar transa\u00C3\u00A7\u00C3\u00B5es.
   * @return LimiteDisponibilidadeResponse
   */
  public LimiteDisponibilidadeResponse  alterarLimiteUsingPUT (Long id, BigDecimal limiteGlobal, BigDecimal limiteCompra, BigDecimal limiteParcelado, BigDecimal limiteParcelas, BigDecimal limiteSaqueGlobal, BigDecimal limiteSaquePeriodo, BigDecimal limiteConsignado, BigDecimal limiteInternacionalCompra, BigDecimal limiteInternacionalParcelado, BigDecimal limiteInternacionalParcelas, BigDecimal limiteInternacionalSaqueGlobal, BigDecimal limiteInternacionalSaquePeriodo, BigDecimal limiteMaximo) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarLimiteUsingPUT");
    }
    
    // verify the required parameter 'limiteGlobal' is set
    if (limiteGlobal == null) {
       throw new ApiException(400, "Missing the required parameter 'limiteGlobal' when calling alterarLimiteUsingPUT");
    }
    
    // verify the required parameter 'limiteCompra' is set
    if (limiteCompra == null) {
       throw new ApiException(400, "Missing the required parameter 'limiteCompra' when calling alterarLimiteUsingPUT");
    }
    
    // verify the required parameter 'limiteParcelado' is set
    if (limiteParcelado == null) {
       throw new ApiException(400, "Missing the required parameter 'limiteParcelado' when calling alterarLimiteUsingPUT");
    }
    
    // verify the required parameter 'limiteParcelas' is set
    if (limiteParcelas == null) {
       throw new ApiException(400, "Missing the required parameter 'limiteParcelas' when calling alterarLimiteUsingPUT");
    }
    
    // verify the required parameter 'limiteSaqueGlobal' is set
    if (limiteSaqueGlobal == null) {
       throw new ApiException(400, "Missing the required parameter 'limiteSaqueGlobal' when calling alterarLimiteUsingPUT");
    }
    
    // verify the required parameter 'limiteSaquePeriodo' is set
    if (limiteSaquePeriodo == null) {
       throw new ApiException(400, "Missing the required parameter 'limiteSaquePeriodo' when calling alterarLimiteUsingPUT");
    }
    
    // verify the required parameter 'limiteConsignado' is set
    if (limiteConsignado == null) {
       throw new ApiException(400, "Missing the required parameter 'limiteConsignado' when calling alterarLimiteUsingPUT");
    }
    
    // verify the required parameter 'limiteInternacionalCompra' is set
    if (limiteInternacionalCompra == null) {
       throw new ApiException(400, "Missing the required parameter 'limiteInternacionalCompra' when calling alterarLimiteUsingPUT");
    }
    
    // verify the required parameter 'limiteInternacionalParcelado' is set
    if (limiteInternacionalParcelado == null) {
       throw new ApiException(400, "Missing the required parameter 'limiteInternacionalParcelado' when calling alterarLimiteUsingPUT");
    }
    
    // verify the required parameter 'limiteInternacionalParcelas' is set
    if (limiteInternacionalParcelas == null) {
       throw new ApiException(400, "Missing the required parameter 'limiteInternacionalParcelas' when calling alterarLimiteUsingPUT");
    }
    
    // verify the required parameter 'limiteInternacionalSaqueGlobal' is set
    if (limiteInternacionalSaqueGlobal == null) {
       throw new ApiException(400, "Missing the required parameter 'limiteInternacionalSaqueGlobal' when calling alterarLimiteUsingPUT");
    }
    
    // verify the required parameter 'limiteInternacionalSaquePeriodo' is set
    if (limiteInternacionalSaquePeriodo == null) {
       throw new ApiException(400, "Missing the required parameter 'limiteInternacionalSaquePeriodo' when calling alterarLimiteUsingPUT");
    }
    
    // verify the required parameter 'limiteMaximo' is set
    if (limiteMaximo == null) {
       throw new ApiException(400, "Missing the required parameter 'limiteMaximo' when calling alterarLimiteUsingPUT");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/alterar-limites".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteGlobal", limiteGlobal));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteCompra", limiteCompra));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteParcelado", limiteParcelado));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteParcelas", limiteParcelas));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteSaqueGlobal", limiteSaqueGlobal));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteSaquePeriodo", limiteSaquePeriodo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteConsignado", limiteConsignado));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteInternacionalCompra", limiteInternacionalCompra));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteInternacionalParcelado", limiteInternacionalParcelado));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteInternacionalParcelas", limiteInternacionalParcelas));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteInternacionalSaqueGlobal", limiteInternacionalSaqueGlobal));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteInternacionalSaquePeriodo", limiteInternacionalSaquePeriodo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteMaximo", limiteMaximo));
    

    

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
        return (LimiteDisponibilidadeResponse) ApiInvoker.deserialize(response, "", LimiteDisponibilidadeResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Apresenta os limites da conta
   * Este m\u00C3\u00A9todo permite consultar os Limites configurados para uma determinada Conta, a partir do c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   * @param id Id Conta
   * @return LimiteDisponibilidadeResponse
   */
  public LimiteDisponibilidadeResponse  consultarLimiteDisponibilidadeUsingGET1 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarLimiteDisponibilidadeUsingGET1");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/limites-disponibilidades".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (LimiteDisponibilidadeResponse) ApiInvoker.deserialize(response, "", LimiteDisponibilidadeResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista o hist\u00C3\u00B3rico de altera\u00C3\u00A7\u00C3\u00B5es de limites da conta
   * Este recurso consulta o hist\u00C3\u00B3rico com as altera\u00C3\u00A7\u00C3\u00B5es de limites da conta informada
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @return PageHistoricoEventosResponse
   */
  public PageHistoricoEventosResponse  listarHistoricoAlteracoesLimitesUsingGET (Long id, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarHistoricoAlteracoesLimitesUsingGET");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/historicos-alteracoes-limites".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (PageHistoricoEventosResponse) ApiInvoker.deserialize(response, "", PageHistoricoEventosResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}

