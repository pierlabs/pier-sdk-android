package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.AjusteFinanceiroResponse;
import java.math.BigDecimal;
import br.com.conductor.pier.api.v2.model.PageAjusteResponse;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class AdjustmentFinancingApi {
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
   * Throw an adjust for the account informed
   * This resource insert an adjust for the accont of the informed ID
   * @param idTipoAjuste Identifier Code of the Adjustment Type
   * @param dataAjuste Date of the adjustment in the format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ
   * @param valorAjuste Value of the adjustment
   * @param idConta Identifier Code of the Account
   * @param login login
   * @param identificadorExterno Hexadecimal Code
   * @param idTransacaoOriginal Identifier of the original transaction (reversal)
   * @param idEstabelecimento Store identifier when payment is made in store
   * @return AjusteFinanceiroResponse
   */
  public AjusteFinanceiroResponse  ajustarConta (Long idTipoAjuste, String dataAjuste, BigDecimal valorAjuste, Long idConta, String login, String identificadorExterno, Long idTransacaoOriginal, Long idEstabelecimento) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idTipoAjuste' is set
    if (idTipoAjuste == null) {
       throw new ApiException(400, "Missing the required parameter 'idTipoAjuste' when calling ajustarConta");
    }
    
    // verify the required parameter 'dataAjuste' is set
    if (dataAjuste == null) {
       throw new ApiException(400, "Missing the required parameter 'dataAjuste' when calling ajustarConta");
    }
    
    // verify the required parameter 'valorAjuste' is set
    if (valorAjuste == null) {
       throw new ApiException(400, "Missing the required parameter 'valorAjuste' when calling ajustarConta");
    }
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling ajustarConta");
    }
    

    // create path and map variables
    String path = "/api/ajustes-financeiros".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoAjuste", idTipoAjuste));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataAjuste", dataAjuste));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "valorAjuste", valorAjuste));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "identificadorExterno", identificadorExterno));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTransacaoOriginal", idTransacaoOriginal));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEstabelecimento", idEstabelecimento));
    

    
    headerParams.put("login", ApiInvoker.parameterToString(login));
    

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
        return (AjusteFinanceiroResponse) ApiInvoker.deserialize(response, "", AjusteFinanceiroResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Present dates of a determined finacial adjustment
   * This method allows searching dates of a determined adjustment starting from its ID code (id)
   * @param id Identification Code of the adjustment (id)
   * @return AjusteFinanceiroResponse
   */
  public AjusteFinanceiroResponse  consultar (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultar");
    }
    

    // create path and map variables
    String path = "/api/ajustes-financeiros/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (AjusteFinanceiroResponse) ApiInvoker.deserialize(response, "", AjusteFinanceiroResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List of existent adjustments in the database of the issuer
   * This resource allows to list existent adjustments in the database of the issuer
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param idTipoAjuste Identifier Code of the Adjustment Type
   * @param dataAjuste Adjustment date in the format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ
   * @param valorAjuste Adjustment Value
   * @param identificadorExterno Hexadecimal Code
   * @param idConta Identifier Code of the Account
   * @return PageAjusteResponse
   */
  public PageAjusteResponse  listar (List<String> sort, Integer page, Integer limit, Long idTipoAjuste, String dataAjuste, BigDecimal valorAjuste, String identificadorExterno, Long idConta) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/ajustes-financeiros".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoAjuste", idTipoAjuste));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataAjuste", dataAjuste));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "valorAjuste", valorAjuste));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "identificadorExterno", identificadorExterno));
    
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
        return (PageAjusteResponse) ApiInvoker.deserialize(response, "", PageAjusteResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
