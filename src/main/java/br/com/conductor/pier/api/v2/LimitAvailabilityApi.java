package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.LimiteDisponibilidadeResponse;
import java.math.BigDecimal;
import br.com.conductor.pier.api.v2.model.SensibilizarSaldoGlobalUpdate;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class LimitAvailabilityApi {
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
   * Update the limits of the account
   * This resource allows to update the limits of a determdined account
   * @param idConta Identification Code of the Account
   * @param limiteGlobal Show the Credit limit value that the cardholder has
   * @param limiteCompra When it is used by the issuer, this field shows the limit credit value that the cardholder can use exclusively for national purchase
   * @param limiteParcelado When used by the issuer, this field shows the credit limit value that the cardholder has to make transactions of parceled purchase
   * @param limiteParcelas When it is used by the issuer, this field show the value of the credit limit that the cardholder can accumulate from the sum of the purchase parcels that were made in thos mode
   * @param limiteSaqueGlobal When it is used by the issuer, this field presents the value of the credit limit that the cardholder can use to make National Withdrawal Transactions
   * @param limiteSaquePeriodo When it is used by the issuer, this field shows the value of credit limit that the cardholder can use to make National Withdrawal Transactions inside of each billing cycle
   * @param limiteConsignado When it is used by the issuer, this field shows the credit margin value that can be charged in a consignate form (payroll discout) in the salary/expiration
   * @param limiteInternacionalCompra When it is used by the issuer, this field shows the value of the credit limit that the cardholder has to exclusively use in International Purchases
   * @param limiteInternacionalParcelado When it is used by the issuer, this field presents the credit limit value that the cardholder has to make International transactions of Parceled Purchase
   * @param limiteInternacionalParcelas When it is used by the issuer, this field show the value credit limit that the cardholder can accumulate using the sum of the parcels of the international purchases that are made in this modality
   * @param limiteInternacionalSaqueGlobal When it is used by the issuer, this field show the limit credit value that the cardholder can use to make International Withdrawal Transactions
   * @param limiteInternacionalSaquePeriodo When it is used by th issuer, this field presents the credit limit that the cardholder can use to makke Internation Withdrawal Transactions inside of each billing cycle
   * @param limiteMaximo Maximum value of the credit limit for transactions
   * @return LimiteDisponibilidadeResponse
   */
  public LimiteDisponibilidadeResponse  alterar (Long idConta, BigDecimal limiteGlobal, BigDecimal limiteCompra, BigDecimal limiteParcelado, BigDecimal limiteParcelas, BigDecimal limiteSaqueGlobal, BigDecimal limiteSaquePeriodo, BigDecimal limiteConsignado, BigDecimal limiteInternacionalCompra, BigDecimal limiteInternacionalParcelado, BigDecimal limiteInternacionalParcelas, BigDecimal limiteInternacionalSaqueGlobal, BigDecimal limiteInternacionalSaquePeriodo, BigDecimal limiteMaximo) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling alterar");
    }
    

    // create path and map variables
    String path = "/api/limites-disponibilidades".replaceAll("\\{format\\}","json");

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
   * Show the limits of the account
   * This method allows to retrieve the limits connfigurated for a determined account, using the identification code (id)
   * @param idConta Id Account
   * @return LimiteDisponibilidadeResponse
   */
  public LimiteDisponibilidadeResponse  consultar (Long idConta) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling consultar");
    }
    

    // create path and map variables
    String path = "/api/limites-disponibilidades".replaceAll("\\{format\\}","json");

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
   * Increments the global credit quantity of a account
   * This resource permits increment, to more or to less, the global credit quantity of a account
   * @param id Identification Code of the Account status (id)
   * @param sensibilizarSaldoGlobal sensibilizarSaldoGlobal
   * @return LimiteDisponibilidadeResponse
   */
  public LimiteDisponibilidadeResponse  sensibilizarSaldoDisponivelGlobal (Long id, SensibilizarSaldoGlobalUpdate sensibilizarSaldoGlobal) throws ApiException {
    Object postBody = sensibilizarSaldoGlobal;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling sensibilizarSaldoDisponivelGlobal");
    }
    
    // verify the required parameter 'sensibilizarSaldoGlobal' is set
    if (sensibilizarSaldoGlobal == null) {
       throw new ApiException(400, "Missing the required parameter 'sensibilizarSaldoGlobal' when calling sensibilizarSaldoDisponivelGlobal");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/limites-disponibilidades/sensibilizar-saldo-disponivel-global".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (LimiteDisponibilidadeResponse) ApiInvoker.deserialize(response, "", LimiteDisponibilidadeResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
