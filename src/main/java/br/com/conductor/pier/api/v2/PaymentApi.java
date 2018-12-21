package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.PageHistoricoPagamentoResponse;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class PaymentApi {
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
   * List the historic of payments
   * this resource allows to list all the payments made independently of its processing Status
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param idConta Identification Code of the Account
   * @param idPagamento Identification Code of the Payment
   * @param idEstabelecimento Identification Code of the Establishment where the payment was made, when it is the place of payment
   * @param idBanco Identification Code of the Bank Institution where the payment was made, when it is the place of payment
   * @param idCartao Identification Code of the Card
   * @param dataHoraPagamento Date and Time of the payment. When is made by a Bank Insitution, the time of the payment is displayed with the value zero
   * @param status Identification Code of the Payment Status
   * @return PageHistoricoPagamentoResponse
   */
  public PageHistoricoPagamentoResponse  listarPagamentos (List<String> sort, Integer page, Integer limit, Long idConta, Long idPagamento, Long idEstabelecimento, Long idBanco, Long idCartao, String dataHoraPagamento, Long status) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/pagamentos".replaceAll("\\{format\\}","json");

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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idPagamento", idPagamento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEstabelecimento", idEstabelecimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idBanco", idBanco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idCartao", idCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataHoraPagamento", dataHoraPagamento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "status", status));
    

    

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
        return (PageHistoricoPagamentoResponse) ApiInvoker.deserialize(response, "", PageHistoricoPagamentoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
