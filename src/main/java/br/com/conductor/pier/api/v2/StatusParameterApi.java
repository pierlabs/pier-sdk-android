package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.StatusContaResponse;
import br.com.conductor.pier.api.v2.model.EstagioCartaoResponse;
import br.com.conductor.pier.api.v2.model.StatusCartaoResponse;
import br.com.conductor.pier.api.v2.model.StatusImpressaoResponse;
import br.com.conductor.pier.api.v2.model.PageStatusContaResponse;
import br.com.conductor.pier.api.v2.model.PageEstagioCartaoResponse;
import br.com.conductor.pier.api.v2.model.PageTipoBoletoResponse;
import br.com.conductor.pier.api.v2.model.PageStatusCartaoResponse;
import br.com.conductor.pier.api.v2.model.PageStatusImpressaoResponse;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class StatusParameterApi {
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
   * List the dates of a determined Account Status
   * This method allows to retrieve the parameters of a determined Account Status using the identification code (id)
   * @param id Identification Code of the Account status (id)
   * @return StatusContaResponse
   */
  public StatusContaResponse  consultar (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultar");
    }
    

    // create path and map variables
    String path = "/api/status-contas/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (StatusContaResponse) ApiInvoker.deserialize(response, "", StatusContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Show the dates of a determined Level Card
   * This method allows to retrieve the parameters of a determined Level of delivery of the Card using the Id code (id)
   * @param id Identification Code of the Card Delivery Stage (id)
   * @return EstagioCartaoResponse
   */
  public EstagioCartaoResponse  consultarEstagioCartao (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarEstagioCartao");
    }
    

    // create path and map variables
    String path = "/api/estagios-cartoes/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (EstagioCartaoResponse) ApiInvoker.deserialize(response, "", EstagioCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the dates of a determined Card Status
   * this method allows to retrieve the parameters of a determined Card Status using the identification code (id)
   * @param id Identification Code of the Card delivery Stage (id)
   * @return StatusCartaoResponse
   */
  public StatusCartaoResponse  consultarStatusCartao (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarStatusCartao");
    }
    

    // create path and map variables
    String path = "/api/status-cartoes/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (StatusCartaoResponse) ApiInvoker.deserialize(response, "", StatusCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the dates of a determined Printing Status
   * This method allows to retrieve the parameters of a determined Status of the Printing of the Card using de identification code (id)
   * @param id Identification Code of the Printing Card Status (id)
   * @return StatusImpressaoResponse
   */
  public StatusImpressaoResponse  consultar_1 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultar_1");
    }
    

    // create path and map variables
    String path = "/api/status-impressoes/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (StatusImpressaoResponse) ApiInvoker.deserialize(response, "", StatusImpressaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the Account Status for the Issuer
   * This method allows to be listed the existing Account Status in the database of the Issuer
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param id Identification Code of the Account Status (id)
   * @param nome Name attributed to the Account Status
   * @param permiteAlterarVencimento Parameter that sets if the card status allows the resquest of updating of the expiration dates of the invoices, being: 0: Inactive and 1: Active
   * @param permiteAlterarLimite Parameter that sets if the card status allows update of limits of the card, being: 0: Inactive and 1: Active
   * @param permiteEmitirNovaViaCartao Parameter that sets if the card status allows to request a new card, being: 0: Inactive and 1: Active
   * @param permiteFazerTransferencia Parameter that sets if the card status allows to make Credit transfer to other accounts of the same issuer or other bank account, being: 0: Inactive and 1: Active
   * @param permiteReceberTransferencia Parameter that sets if the card status allows recieve Credit transfer from other account of the same issuer, being: 0: Inactive and 1: Active
   * @param permiteCriarAcordoCobranca Parameter that sets if the card status allows to have a debt collection agreement created for it, being: 0: Inactive and 1: Active
   * @param permiteAtribuirComoBloqueio Parameter that sets if the card status allows to be attributed to lock an account temporarily, being: 0: Inactive and 1: Active
   * @param permiteDesbloquear Parameter that sets if the card status allows to be unlocked, being: 0: Inactive and 1: Active
   * @param permiteAtribuirComoCancelamento Parameter that sets if the card status allows to be attributed to do the definitive cancellation of the account, being: 0: Inactive and 1: Active
   * @return PageStatusContaResponse
   */
  public PageStatusContaResponse  listar (List<String> sort, Integer page, Integer limit, Long id, String nome, Integer permiteAlterarVencimento, Integer permiteAlterarLimite, Integer permiteEmitirNovaViaCartao, Integer permiteFazerTransferencia, Integer permiteReceberTransferencia, Integer permiteCriarAcordoCobranca, Integer permiteAtribuirComoBloqueio, Integer permiteDesbloquear, Integer permiteAtribuirComoCancelamento) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/status-contas".replaceAll("\\{format\\}","json");

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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "permiteAlterarVencimento", permiteAlterarVencimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "permiteAlterarLimite", permiteAlterarLimite));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "permiteEmitirNovaViaCartao", permiteEmitirNovaViaCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "permiteFazerTransferencia", permiteFazerTransferencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "permiteReceberTransferencia", permiteReceberTransferencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "permiteCriarAcordoCobranca", permiteCriarAcordoCobranca));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "permiteAtribuirComoBloqueio", permiteAtribuirComoBloqueio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "permiteDesbloquear", permiteDesbloquear));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "permiteAtribuirComoCancelamento", permiteAtribuirComoCancelamento));
    

    

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
        return (PageStatusContaResponse) ApiInvoker.deserialize(response, "", PageStatusContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the options of Level of the Cards
   * This method allows to be listed the options of Level of delivery that can be attributed to the Cards
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param id Id of the Card Stage
   * @param nome Name of the Card Stage
   * @return PageEstagioCartaoResponse
   */
  public PageEstagioCartaoResponse  listarEstagiosCartoes (List<String> sort, Integer page, Integer limit, Long id, String nome) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/estagios-cartoes".replaceAll("\\{format\\}","json");

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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nome", nome));
    

    

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
        return (PageEstagioCartaoResponse) ApiInvoker.deserialize(response, "", PageEstagioCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List summarized CNAB statuses
   * Existing CNAB status list
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @return PageTipoBoletoResponse
   */
  public PageTipoBoletoResponse  listarStatusCNABSumarizados (List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/status-cnab-sumarizados".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
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
        return (PageTipoBoletoResponse) ApiInvoker.deserialize(response, "", PageTipoBoletoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the options of Card Status
   * This method allows to be listed the possibilities of Status that can be attributed to the Cards
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param id Identification Code of the Card Status (id)
   * @param nome Name attributed to the Status of the Card delivery
   * @param permiteDesbloquear Parameter that sets if the card status allows the reactivation of the card, being: 0: Inactive and 1: Active
   * @param permiteAtribuirComoBloqueio Parameter that sets if the card status allows the reactivation of the card, being: 0: Inactive and 1: Active
   * @param permiteAtribuirComoCancelamento Parameter that sets if the card status allows the reactivation of the card, being: 0: Inactive and 1: Active
   * @param cobrarTarifaAoEmitirNovaVia Parameter that sets if the card status allows the reactivation of the card, being: 0: Inactive and 1: Active
   * @return PageStatusCartaoResponse
   */
  public PageStatusCartaoResponse  listarStatusCartoes (List<String> sort, Integer page, Integer limit, Long id, String nome, Integer permiteDesbloquear, Integer permiteAtribuirComoBloqueio, Integer permiteAtribuirComoCancelamento, Integer cobrarTarifaAoEmitirNovaVia) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/status-cartoes".replaceAll("\\{format\\}","json");

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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "permiteDesbloquear", permiteDesbloquear));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "permiteAtribuirComoBloqueio", permiteAtribuirComoBloqueio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "permiteAtribuirComoCancelamento", permiteAtribuirComoCancelamento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cobrarTarifaAoEmitirNovaVia", cobrarTarifaAoEmitirNovaVia));
    

    

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
        return (PageStatusCartaoResponse) ApiInvoker.deserialize(response, "", PageStatusCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the options of Printing Status
   * This method allows to to be listed the options of Printing Status that can be attributed to the Cards
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param id Id of the Card Stage
   * @param nome Name of the Status Printing
   * @return PageStatusImpressaoResponse
   */
  public PageStatusImpressaoResponse  listar_2 (List<String> sort, Integer page, Integer limit, Long id, String nome) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/status-impressoes".replaceAll("\\{format\\}","json");

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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nome", nome));
    

    

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
        return (PageStatusImpressaoResponse) ApiInvoker.deserialize(response, "", PageStatusImpressaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
