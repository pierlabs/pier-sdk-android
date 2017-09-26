package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.PagePlanoParcelamentoResponse;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;


public class FaturaApi {
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
   * Listar planos de parcelamento
   * Lista os planos de parcelamento da fatura de uma conta.
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   * @param dataVencimentoPadrao Indica a data de vencimento padr\u00C3\u00A3o das faturas
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @return PagePlanoParcelamentoResponse
   */
  public PagePlanoParcelamentoResponse  consultarLancamentosFuturosFaturaUsingGET1 (Long id, String dataVencimentoPadrao, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarLancamentosFuturosFaturaUsingGET1");
    }
    
    // verify the required parameter 'dataVencimentoPadrao' is set
    if (dataVencimentoPadrao == null) {
       throw new ApiException(400, "Missing the required parameter 'dataVencimentoPadrao' when calling consultarLancamentosFuturosFaturaUsingGET1");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/faturas/planos-parcelamento".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataVencimentoPadrao", dataVencimentoPadrao));
    

    

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
        return (PagePlanoParcelamentoResponse) ApiInvoker.deserialize(response, "", PagePlanoParcelamentoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}

