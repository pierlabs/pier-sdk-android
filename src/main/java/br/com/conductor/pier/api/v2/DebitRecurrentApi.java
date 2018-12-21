package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.DebitAccountRecurrent;
import br.com.conductor.pier.api.v2.model.ContaDebitoRecorrenteResponse;
import br.com.conductor.pier.api.v2.model.PageContaDebitoRecorrenteResponse;
import br.com.conductor.pier.api.v2.model.PageTipoDebitoRecorrenteResponse;
import java.math.BigDecimal;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class DebitRecurrentApi {
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
   * Join to the recurrent debit
   * This method allows that a determined recurrent debit type be added to a determined account, in order for the same to be charged in the invoice of the client
   * @param contaDebitoRecorrentePersist contaDebitoRecorrentePersist
   * @return ContaDebitoRecorrenteResponse
   */
  public ContaDebitoRecorrenteResponse  aderirDebitoRecorrente (DebitAccountRecurrent contaDebitoRecorrentePersist) throws ApiException {
    Object postBody = contaDebitoRecorrentePersist;
    
    // verify the required parameter 'contaDebitoRecorrentePersist' is set
    if (contaDebitoRecorrentePersist == null) {
       throw new ApiException(400, "Missing the required parameter 'contaDebitoRecorrentePersist' when calling aderirDebitoRecorrente");
    }
    

    // create path and map variables
    String path = "/api/debitos-recorrentes".replaceAll("\\{format\\}","json");

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
        return (ContaDebitoRecorrenteResponse) ApiInvoker.deserialize(response, "", ContaDebitoRecorrenteResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Cancel recurrent debit
   * This method allows to calcel a recurrent debitt type of a determined account
   * @param id Indentification Code of the Recurrent Debit (id)
   * @param contaDebitoRecorrentePersist contaDebitoRecorrentePersist
   * @return ContaDebitoRecorrenteResponse
   */
  public ContaDebitoRecorrenteResponse  cancelarDebitoRecorrente (Long id, DebitAccountRecurrent contaDebitoRecorrentePersist) throws ApiException {
    Object postBody = contaDebitoRecorrentePersist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling cancelarDebitoRecorrente");
    }
    
    // verify the required parameter 'contaDebitoRecorrentePersist' is set
    if (contaDebitoRecorrentePersist == null) {
       throw new ApiException(400, "Missing the required parameter 'contaDebitoRecorrentePersist' when calling cancelarDebitoRecorrente");
    }
    

    // create path and map variables
    String path = "/api/debitos-recorrentes/{id}/cancelar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (ContaDebitoRecorrenteResponse) ApiInvoker.deserialize(response, "", ContaDebitoRecorrenteResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the debits recurrent of an account
   * The entity Recurrent Debit lead with the hired registers for a determined client (idAccount) where the collection it&#39;s continuos, consisting in a signature ou payment of monthly debts. it means that, hile the service keep working, the client must continue doing the payments. The determination of how long it will last it&#39;s done in contract. Most part of the time, it exists a minimum period and, in case of the service be cancelled or the payment was not done, the status of the Recurrent Debit will have the ActiveFlag with a false value. Thus, this method lists all the operations of the Recurrent Debits of a determined idAccount, it is active or not
   * @param idConta Identification Code of the Account (id)
   * @param idTipoDebitoRecorrente Identification Code of the type recurrent debit (id)
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param dataHoraInicio Date and local time the beginning of the recurrent debit yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ. Ex: 2000-10-31T01:30:00.000-05:00
   * @param dataHoraFim Date and local time the eding of the recurrent debit yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ. Ex: 2000-10-31T01:30:00.000-05:00
   * @param ativo Identify if the recurrent debit is active
   * @param dataHoraUltimoPagamento Date and local time the last effected payment yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ. Ex: 2000-10-31T01:30:00.000-05:00
   * @return PageContaDebitoRecorrenteResponse
   */
  public PageContaDebitoRecorrenteResponse  listar (Long idConta, Long idTipoDebitoRecorrente, List<String> sort, Integer page, Integer limit, String dataHoraInicio, String dataHoraFim, Boolean ativo, String dataHoraUltimoPagamento) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/debitos-recorrentes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoDebitoRecorrente", idTipoDebitoRecorrente));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataHoraInicio", dataHoraInicio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataHoraFim", dataHoraFim));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "ativo", ativo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataHoraUltimoPagamento", dataHoraUltimoPagamento));
    

    

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
        return (PageContaDebitoRecorrenteResponse) ApiInvoker.deserialize(response, "", PageContaDebitoRecorrenteResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the types of Recurring Debits
   * For the Issuers that use the entity Recurring Debits need previously to resquest to Conductor a register of which types they can be able to commercialize.  For this, this resource has as an aim to present all the Types of Recurring Debits that are registered for a determined Issuer, independently of its status
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param id Identification Code of the type of recurrent debit (id)
   * @param descricao Description of the type of recurrent debit
   * @param valor Value of the type of recurrent debit
   * @param flagAtivo Flag that identifies if the type of recurrent debit is active
   * @return PageTipoDebitoRecorrenteResponse
   */
  public PageTipoDebitoRecorrenteResponse  listar_1 (List<String> sort, Integer page, Integer limit, Long id, String descricao, BigDecimal valor, Boolean flagAtivo) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/tipos-debitos-recorrentes".replaceAll("\\{format\\}","json");

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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "valor", valor));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagAtivo", flagAtivo));
    

    

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
        return (PageTipoDebitoRecorrenteResponse) ApiInvoker.deserialize(response, "", PageTipoDebitoRecorrenteResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
