package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.CartaoResponse;
import br.com.conductor.pier.api.v2.model.EstagioCartaoUpdate;
import br.com.conductor.pier.api.v2.model.HistoricoImpressaoCartaoResponse;
import br.com.conductor.pier.api.v2.model.CartaoDetalheResponse;
import br.com.conductor.pier.api.v2.model.DadosCartaoImpressaoResponse;
import br.com.conductor.pier.api.v2.model.DadosCartaoResponse;
import br.com.conductor.pier.api.v2.model.LimiteDisponibilidadeResponse;
import br.com.conductor.pier.api.v2.model.LoteCartoesPrePagosResponse;
import br.com.conductor.pier.api.v2.model.PortadorResponse;
import br.com.conductor.pier.api.v2.model.VinculoCartoesResponse;
import br.com.conductor.pier.api.v2.model.CardMultiAppPersist;
import br.com.conductor.pier.api.v2.model.CartaoImpressaoResponse;
import br.com.conductor.pier.api.v2.model.CartaoMultiAppImpressaoResponse;
import br.com.conductor.pier.api.v2.model.PageCartaoResponse;
import br.com.conductor.pier.api.v2.model.PageLoteCartoesPrePagosResponse;
import br.com.conductor.pier.api.v2.model.ValidaCVVRequest;
import br.com.conductor.pier.api.v2.model.ValidaCartaoResponse;
import br.com.conductor.pier.api.v2.model.ValidaSenhaCartaoResponse;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class CardApi {
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
   * Make the update the password of a card
   * This operation has as an aim to allow the cardholder of a determined card can definite a password of your own choice
   * @param id Identification Code of the Card (id)
   * @param senha Password to register or update
   * @return String
   */
  public String  alterarAlterarSenha (Long id, String senha) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarAlterarSenha");
    }
    
    // verify the required parameter 'senha' is set
    if (senha == null) {
       throw new ApiException(400, "Missing the required parameter 'senha' when calling alterarAlterarSenha");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/alterar-senha".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
    headerParams.put("senha", ApiInvoker.parameterToString(senha));
    

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
        return (String) ApiInvoker.deserialize(response, "", String.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Update a card stage
   * This method allows to be updated the card stage for another informed resquest
   * @param id Identification Code of the Card (id)
   * @param update Identification Code of the Card Stage (stage)
   * @return CartaoResponse
   */
  public CartaoResponse  alterarEstagio (Long id, EstagioCartaoUpdate update) throws ApiException {
    Object postBody = update;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarEstagio");
    }
    
    // verify the required parameter 'update' is set
    if (update == null) {
       throw new ApiException(400, "Missing the required parameter 'update' when calling alterarEstagio");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/alterar-estagio".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (CartaoResponse) ApiInvoker.deserialize(response, "", CartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Perform the updating of the Status of Impression of the Card
   * This method allows that an application that makes the print of the cards can indicate  that a determined  idCard printed or in process of print. For this, it&#39;s necessary to inform the respective code of identification of the card (id) that want to have your determined id_status_ print attributed to him/her. By default, provisory cards must be alredy included in a file for printing by graphicwill have this request denied, if it is used
   * @param id Identification Code of the card (id)
   * @param idStatusImpressao Identification Code of the Printing Status (Id)
   * @return HistoricoImpressaoCartaoResponse
   */
  public HistoricoImpressaoCartaoResponse  alterarStatusImpressao (Long id, Long idStatusImpressao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarStatusImpressao");
    }
    
    // verify the required parameter 'idStatusImpressao' is set
    if (idStatusImpressao == null) {
       throw new ApiException(400, "Missing the required parameter 'idStatusImpressao' when calling alterarStatusImpressao");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/alterar-status-impressao".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id_status_impressao", idStatusImpressao));
    

    

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
        return (HistoricoImpressaoCartaoResponse) ApiInvoker.deserialize(response, "", HistoricoImpressaoCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Perform the attribuition of a pre-paid card to one person
   * This method allows that a pre-paid printed card and anonymous be attributed to a person, for this person can be able to be the mainly user
   * @param id Identification Code of the Card (id)
   * @param idPessoa Identification Code of the Person (id)
   * @return CartaoResponse
   */
  public CartaoResponse  atribuirPessoa (Long id, Long idPessoa) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling atribuirPessoa");
    }
    
    // verify the required parameter 'idPessoa' is set
    if (idPessoa == null) {
       throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling atribuirPessoa");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/atribuir-titular".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id_pessoa", idPessoa));
    

    

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
        return (CartaoResponse) ApiInvoker.deserialize(response, "", CartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Make the block of a determined card
   * This method allows the to make the block (temporary) or cancellation (definitive) of a determined card from its ID code. For this, It is necessary to inform what is the motive of this block, that it is to attribute a new StatusCard for the client, among other practices practiced by the issuer
   * @param id Identification Code of the Card (id)
   * @param idStatus Identification Code of the new card status
   * @param observacao Text informing an observation about the Lock
   * @return CartaoResponse
   */
  public CartaoResponse  bloquear (Long id, Long idStatus, String observacao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling bloquear");
    }
    
    // verify the required parameter 'idStatus' is set
    if (idStatus == null) {
       throw new ApiException(400, "Missing the required parameter 'idStatus' when calling bloquear");
    }
    
    // verify the required parameter 'observacao' is set
    if (observacao == null) {
       throw new ApiException(400, "Missing the required parameter 'observacao' when calling bloquear");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/bloquear".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id_status", idStatus));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "observacao", observacao));
    

    

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
        return (CartaoResponse) ApiInvoker.deserialize(response, "", CartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Accomplish the registerment of a password for the Card
   * This operation has as an aim to allow the cardholder a  de um determinado cart?o possa definir uma senha a sua escolha
   * @param id Identification Code of the Card (id)
   * @param senha Password to be registered or updated
   * @return String
   */
  public String  cadastrarAlterarSenha (Long id, String senha) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling cadastrarAlterarSenha");
    }
    
    // verify the required parameter 'senha' is set
    if (senha == null) {
       throw new ApiException(400, "Missing the required parameter 'senha' when calling cadastrarAlterarSenha");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/cadastrar-senha".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
    headerParams.put("senha", ApiInvoker.parameterToString(senha));
    

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
        return (String) ApiInvoker.deserialize(response, "", String.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Apply the cancellation of a determined Card
   * This method allows to apply the cancella of determined card from your ID code (id). For this, It is necessary to inform what is the motive of this block, that it is to attribute a new StatusCard for the client, among other practices practiced by the issuer
   * @param id Identification code of the card (id)
   * @param idStatus C?digo de Identifica??o do Novo Status Cart?o
   * @param observacao Text informed an observation about the cancellation
   * @return CartaoResponse
   */
  public CartaoResponse  cancelar (Long id, Long idStatus, String observacao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling cancelar");
    }
    
    // verify the required parameter 'idStatus' is set
    if (idStatus == null) {
       throw new ApiException(400, "Missing the required parameter 'idStatus' when calling cancelar");
    }
    
    // verify the required parameter 'observacao' is set
    if (observacao == null) {
       throw new ApiException(400, "Missing the required parameter 'observacao' when calling cancelar");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/cancelar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id_status", idStatus));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "observacao", observacao));
    

    

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
        return (CartaoResponse) ApiInvoker.deserialize(response, "", CartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Present the dates of a determine card
   * This method allows to update the basic information of a determined card from its ID code(id)
   * @param id Identification Code of the Card (id)
   * @return CartaoDetalheResponse
   */
  public CartaoDetalheResponse  consultar (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultar");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (CartaoDetalheResponse) ApiInvoker.deserialize(response, "", CartaoDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Search dates of print Card
   * This resource allows to  search the dates of a Card printed
   * @param id Identification Code of the Card (id)
   * @return DadosCartaoImpressaoResponse
   */
  public DadosCartaoImpressaoResponse  consultarCartaoImpressao (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarCartaoImpressao");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/consultar-dados-impressao".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (DadosCartaoImpressaoResponse) ApiInvoker.deserialize(response, "", DadosCartaoImpressaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Search Details of the Card
   * This method allows to be searched the necessary dates of a card to execute the services of authorization
   * @param id id
   * @return DadosCartaoResponse
   */
  public DadosCartaoResponse  consultarDadosReaisCartao (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarDadosReaisCartao");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/consultar-dados-reais".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (DadosCartaoResponse) ApiInvoker.deserialize(response, "", DadosCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Present the limits of the cardholder
   * This me thod allows to retrieve the limits configurated for the cardholder of a determined card, either it is the holder of the account or an additional,  starting from the identification code of the Card (id)
   * @param id Identification Code of the Card (id)
   * @return LimiteDisponibilidadeResponse
   */
  public LimiteDisponibilidadeResponse  consultarLimiteDisponibilidade (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarLimiteDisponibilidade");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/limites-disponibilidades".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
   * Allow retrieving a determined Lot of Pre-Paid Cards
   * This method allows retrieving the existent pre-paid cards in the base of the issuer through the ID of the Lot
   * @param id Identification Code of the Card Batch (id)
   * @return LoteCartoesPrePagosResponse
   */
  public LoteCartoesPrePagosResponse  consultarLotesCartoesPrePagos (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarLotesCartoesPrePagos");
    }
    

    // create path and map variables
    String path = "/api/cartoes/lotes-cartoes-pre-pagos/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (LoteCartoesPrePagosResponse) ApiInvoker.deserialize(response, "", LoteCartoesPrePagosResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Present the dates of the Cardholder
   * This method allows to retrieve the information of the cardholder of a determined Card from the identification code of the card (id)
   * @param id Identification Code of the Card (id)
   * @return PortadorResponse
   */
  public PortadorResponse  consultarPortador (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarPortador");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/portadores".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (PortadorResponse) ApiInvoker.deserialize(response, "", PortadorResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Register cards MultiApp
   * This feature allows the registration of cards MultiApp
   * @param cartaoMultiAppPersist cartaoMultiAppPersist
   * @return VinculoCartoesResponse
   */
  public VinculoCartoesResponse  criarCartoesMultiApp (CardMultiAppPersist cartaoMultiAppPersist) throws ApiException {
    Object postBody = cartaoMultiAppPersist;
    
    // verify the required parameter 'cartaoMultiAppPersist' is set
    if (cartaoMultiAppPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'cartaoMultiAppPersist' when calling criarCartoesMultiApp");
    }
    

    // create path and map variables
    String path = "/api/cartoes/gerar-cartoes-multiapp".replaceAll("\\{format\\}","json");

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
        return (VinculoCartoesResponse) ApiInvoker.deserialize(response, "", VinculoCartoesResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Make an unblock of a dtermined card
   * This method allows to be unblocked a determined card from its identification code (id)
   * @param id Identification  Code of the Card (id)
   * @return CartaoResponse
   */
  public CartaoResponse  desbloquear (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling desbloquear");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/desbloquear".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (CartaoResponse) ApiInvoker.deserialize(response, "", CartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Make the unblock of a blocked card by trying the incorrect password
   * This method allows to be unblocked a determined card that was blocked by trying the incorrect password, from its id code (id)
   * @param id Identification Code of the Card (id)
   * @return CartaoResponse
   */
  public CartaoResponse  desbloquearSenhaIncorreta (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling desbloquearSenhaIncorreta");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/desbloquear-senha-incorreta".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (CartaoResponse) ApiInvoker.deserialize(response, "", CartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Allow to create a new Lot of Pre-paid cards
   * This method has as an aim allow Issuers to create a determined quantity of pre-paid cards, not rated, which they ca be comercialized and then linked to a client who is going to purchase it. For this,  besides defining how many cards must be created, it will be possible to definite what is the Comercial Origin, the Product, the Type of the Card, the Image and the Address for delivering the Cards presents in the lot created. By default, all the cards will be associated to an idPersonal ficticious and they will recieve an unique IdAccount to each one of them. Then, the created Cards for this operation will follow the same processos of graphic print previously definite between the Issuer and Conductor
   * @param idOrigemComercial Identification Code of the Commerical Origin (id)
   * @param idProduto Identification Code of the Prdocut (id)
   * @param idTipoCartao Identification Code of the Card type (id)
   * @param idImagem Identification Code of the image (id)
   * @param idEndereco Identification code of the address (id)
   * @param quantidadeCartoes Number of existent cards in the Batch
   * @param identificadorExterno Number of exeternal identification (used by th issuer)
   * @return LoteCartoesPrePagosResponse
   */
  public LoteCartoesPrePagosResponse  gerarLotesCartoesPrePagos (Long idOrigemComercial, Long idProduto, Long idTipoCartao, Long idImagem, Long idEndereco, Integer quantidadeCartoes, String identificadorExterno) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/cartoes/lotes-cartoes-pre-pagos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idOrigemComercial", idOrigemComercial));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idProduto", idProduto));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoCartao", idTipoCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idImagem", idImagem));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEndereco", idEndereco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "quantidadeCartoes", quantidadeCartoes));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "identificadorExterno", identificadorExterno));
    

    

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
        return (LoteCartoesPrePagosResponse) ApiInvoker.deserialize(response, "", LoteCartoesPrePagosResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Create a new VIA of the Card
   * This operation has as an aim to allow the issuers or your clients can request a new VIA of the card that will be headed to printing and posting according to the standard demand already definite by the issuer. For this, It is necessary that the client has already a card and inform the identification code of it (idCard) so the client can be able to use this operation. So,  this functionability applies only to the physical generation cards
   * @param id Identification Code of the Card (id)
   * @return CartaoImpressaoResponse
   */
  public CartaoImpressaoResponse  gerarNovaVia (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling gerarNovaVia");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/gerar-nova-via".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (CartaoImpressaoResponse) ApiInvoker.deserialize(response, "", CartaoImpressaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Create a new VIA of multiple card
   * This resource generates a new VIA of multiple product (with 2 cards associated)
   * @param id Identification Code of the Card (id)
   * @return CartaoMultiAppImpressaoResponse
   */
  public CartaoMultiAppImpressaoResponse  gerarNovaViaCartaoMultiApp (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling gerarNovaViaCartaoMultiApp");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/gerar-nova-via-multiplo".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (CartaoMultiAppImpressaoResponse) ApiInvoker.deserialize(response, "", CartaoMultiAppImpressaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Add a fee of adjustment of the second VIA of the card
   * This resource allow to add the task of adjustment by the emission of the second re-print of the card
   * @param id Identification Code of the Card (id)
   * @return Object
   */
  public Object  lancarTarifaSegundaVia (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling lancarTarifaSegundaVia");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/lancar-tarifa-reemissao".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
   * List cards made by the Issuer
   * This method allows to list the existent cards in the base of the issuer
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param idStatusCartao Identification Code of the Card Status (id)
   * @param idEstagioCartao Identification Code of the Printing Stage of the Card (id)
   * @param idConta Identification Code of the account which one the card belongs (id)
   * @param idPessoa Identification Code of the Person which one the card belongs (id)
   * @param idProduto Identification Code of the Product which one the card belongs (id)
   * @param tipoPortador Show the type of the Cardholder, being: (&#39;T&#39;: Holder, &#39;A&#39;: Additional
   * @param numeroCartao Show the number of the card
   * @param nomeImpresso Show the printed name on the card
   * @param dataGeracao Show the date when the card was created
   * @param dataStatusCartao Show the date which the current idStatusCard of the card was applied, when there is
   * @param dataEstagioCartao Show the date which the current idStatusCard of the Card was applied, when there is
   * @param dataValidade Show the date of the card expiration in format yyyy-MM, When there is
   * @param dataImpressao Show the date which the card was printed, in case of Store printing, or the date which was included in the file for printing in graphic
   * @param arquivoImpressao Show the name of the file where the card was included for printing, when thre is
   * @param flagImpressaoOrigemComercial when it is activated, it indicates that the card was printed in the Commercial Origin
   * @param flagProvisorio When it is activated, it indicates that the card is provisory. By the way, it is a card for a temporary use when allows that the client transacts without having recieved a definitive card
   * @param codigoDesbloqueio Show a specific code to be used as a variable in the unlocking process of the card for the issuers who wants to use this functionality
   * @param sequencialCartao Sequel Number of the card
   * @param identificadorExterno External identification number
   * @return PageCartaoResponse
   */
  public PageCartaoResponse  listar (List<String> sort, Integer page, Integer limit, Long idStatusCartao, Long idEstagioCartao, Long idConta, Long idPessoa, Long idProduto, String tipoPortador, String numeroCartao, String nomeImpresso, String dataGeracao, String dataStatusCartao, String dataEstagioCartao, String dataValidade, String dataImpressao, String arquivoImpressao, Integer flagImpressaoOrigemComercial, Integer flagProvisorio, String codigoDesbloqueio, Integer sequencialCartao, Long identificadorExterno) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/cartoes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idStatusCartao", idStatusCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEstagioCartao", idEstagioCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idProduto", idProduto));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tipoPortador", tipoPortador));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroCartao", numeroCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeImpresso", nomeImpresso));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataGeracao", dataGeracao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataStatusCartao", dataStatusCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataEstagioCartao", dataEstagioCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataValidade", dataValidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataImpressao", dataImpressao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "arquivoImpressao", arquivoImpressao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagImpressaoOrigemComercial", flagImpressaoOrigemComercial));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagProvisorio", flagProvisorio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "codigoDesbloqueio", codigoDesbloqueio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sequencialCartao", sequencialCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "identificadorExterno", identificadorExterno));
    

    

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
        return (PageCartaoResponse) ApiInvoker.deserialize(response, "", PageCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Allow to list the Lots of Pre-Paid Card
   * This method allows to be listed the exitent pre-paid cards in the base of the issuer
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param idOrigemComercial Identification Code of the Commercial Origin (id)
   * @param idProduto Code of Identification of the Product (id)
   * @param idTipoCartao Identification Code of the Card Type (id)
   * @param idImagem Identification Code of the Image (id)
   * @param idEndereco Identification Code of the Address (id)
   * @param quantidadeCartoes Number of existing cards in the Batch
   * @param dataCadastro Date of register of the Batch of the non-nominal cards
   * @param usuarioCadastro Username that created the Batch
   * @param statusProcessamento Indicate the Status of the Batch Processing
   * @param identificadorExterno Number of the exeternal identification (used by the issuer)
   * @return PageLoteCartoesPrePagosResponse
   */
  public PageLoteCartoesPrePagosResponse  listarLotesCartoesPrePagos (List<String> sort, Integer page, Integer limit, Long idOrigemComercial, Long idProduto, Long idTipoCartao, Long idImagem, Long idEndereco, Integer quantidadeCartoes, String dataCadastro, String usuarioCadastro, Integer statusProcessamento, String identificadorExterno) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/cartoes/lotes-cartoes-pre-pagos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idOrigemComercial", idOrigemComercial));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idProduto", idProduto));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoCartao", idTipoCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idImagem", idImagem));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEndereco", idEndereco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "quantidadeCartoes", quantidadeCartoes));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataCadastro", dataCadastro));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "usuarioCadastro", usuarioCadastro));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "statusProcessamento", statusProcessamento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "identificadorExterno", identificadorExterno));
    

    

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
        return (PageLoteCartoesPrePagosResponse) ApiInvoker.deserialize(response, "", PageLoteCartoesPrePagosResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Do the reactivation of a determined card
   * This method allows the reactivation of a determined card from its identification code (id)
   * @param id Identification Code of the Card (id)
   * @return CartaoResponse
   */
  public CartaoResponse  reativar (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling reativar");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/reativar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (CartaoResponse) ApiInvoker.deserialize(response, "", CartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Validate CVV of the Card
   * This resource allows the validation of the cvv of the card
   * @param id Identification code of the card (id)
   * @param validaCVV validaCVV
   * @return String
   */
  public String  validarCVV (Long id, ValidaCVVRequest validaCVV) throws ApiException {
    Object postBody = validaCVV;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling validarCVV");
    }
    
    // verify the required parameter 'validaCVV' is set
    if (validaCVV == null) {
       throw new ApiException(400, "Missing the required parameter 'validaCVV' when calling validarCVV");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/validar-cvv".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (String) ApiInvoker.deserialize(response, "", String.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Allow to validate the printed dates in a flagged card
   * This operation has as an aim to allow that the Issuers validate the authenticity of a determined card starting from the sending of the dates  printed on it. The use of this method has many applications, being the mainly one of them the Positive Idetification of the Card for making transactions e-commerce or through the Attendance Eletronic Center (AEC), etc
   * @param numeroCartao Card Number to be validate
   * @param nomePortador Cardholder name
   * @param dataValidade Expiration date of the card in the format yyyy-MM
   * @param codigoSeguranca Security Code of the card with three numbers
   * @return ValidaCartaoResponse
   */
  public ValidaCartaoResponse  validarDadosImpressosBandeirado (String numeroCartao, String nomePortador, String dataValidade, String codigoSeguranca) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'numeroCartao' is set
    if (numeroCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'numeroCartao' when calling validarDadosImpressosBandeirado");
    }
    
    // verify the required parameter 'nomePortador' is set
    if (nomePortador == null) {
       throw new ApiException(400, "Missing the required parameter 'nomePortador' when calling validarDadosImpressosBandeirado");
    }
    
    // verify the required parameter 'dataValidade' is set
    if (dataValidade == null) {
       throw new ApiException(400, "Missing the required parameter 'dataValidade' when calling validarDadosImpressosBandeirado");
    }
    
    // verify the required parameter 'codigoSeguranca' is set
    if (codigoSeguranca == null) {
       throw new ApiException(400, "Missing the required parameter 'codigoSeguranca' when calling validarDadosImpressosBandeirado");
    }
    

    // create path and map variables
    String path = "/api/cartoes/validar-dados-impressos-bandeirados".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numero_cartao", numeroCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nome_portador", nomePortador));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "data_validade", dataValidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "codigo_seguranca", codigoSeguranca));
    

    

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
        return (ValidaCartaoResponse) ApiInvoker.deserialize(response, "", ValidaCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Allow to validate the printed dates of a non-flagged card
   * This operation has as an aim to allow the issuers validate the authenticity of a determined Card from de printed dates on it.The use of this methode has a lot of  application, such as  the Positive Identification of the Card to do transactions e-commerce or through Attendance Eletronic Center (URA), etc
   * @param numeroCartao Card number to be validate
   * @param nomePortador Name of the cardholder
   * @param dataValidade Expiration date of the card in the format yyyy-MM
   * @param codigoSeguranca Security Code of the card with three numbers
   * @return ValidaCartaoResponse
   */
  public ValidaCartaoResponse  validarDadosImpressosNaoBandeirado (String numeroCartao, String nomePortador, String dataValidade, String codigoSeguranca) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'numeroCartao' is set
    if (numeroCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'numeroCartao' when calling validarDadosImpressosNaoBandeirado");
    }
    
    // verify the required parameter 'nomePortador' is set
    if (nomePortador == null) {
       throw new ApiException(400, "Missing the required parameter 'nomePortador' when calling validarDadosImpressosNaoBandeirado");
    }
    
    // verify the required parameter 'dataValidade' is set
    if (dataValidade == null) {
       throw new ApiException(400, "Missing the required parameter 'dataValidade' when calling validarDadosImpressosNaoBandeirado");
    }
    
    // verify the required parameter 'codigoSeguranca' is set
    if (codigoSeguranca == null) {
       throw new ApiException(400, "Missing the required parameter 'codigoSeguranca' when calling validarDadosImpressosNaoBandeirado");
    }
    

    // create path and map variables
    String path = "/api/cartoes/validar-dados-impressos-nao-bandeirados".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numero_cartao", numeroCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nome_portador", nomePortador));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "data_validade", dataValidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "codigo_seguranca", codigoSeguranca));
    

    

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
        return (ValidaCartaoResponse) ApiInvoker.deserialize(response, "", ValidaCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Allow to validate a Card with the Mastercard Flag from de55
   * This operation has as an aim to allow the Issuers validate DE55 created from the reading of a EMV chip of a Mastercard Flg in order to verify its authenticity. The use of this method has many applications, being one of the main one the Positive Identification of the Card before the issuer do radom transactions, such as shopping and withdraw in debt in a current account, etc
   * @param numeroCartao Card number to be validate
   * @param criptograma Criptograma do cart?o no formato de55
   * @return ValidaCartaoResponse
   */
  public ValidaCartaoResponse  validarDe55CartaoMastercard (String numeroCartao, String criptograma) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'numeroCartao' is set
    if (numeroCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'numeroCartao' when calling validarDe55CartaoMastercard");
    }
    
    // verify the required parameter 'criptograma' is set
    if (criptograma == null) {
       throw new ApiException(400, "Missing the required parameter 'criptograma' when calling validarDe55CartaoMastercard");
    }
    

    // create path and map variables
    String path = "/api/cartoes/validar-de55-mastercard".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numero_cartao", numeroCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "criptograma", criptograma));
    

    

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
        return (ValidaCartaoResponse) ApiInvoker.deserialize(response, "", ValidaCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Allow validate the password of a Card
   * This operation has as an aim to allow validating that the password informed by the carrier of a determined card are right
   * @param id Identification Code of the Card (id)
   * @param senha Password to be validated
   * @return ValidaSenhaCartaoResponse
   */
  public ValidaSenhaCartaoResponse  validarSenha (Long id, String senha) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling validarSenha");
    }
    
    // verify the required parameter 'senha' is set
    if (senha == null) {
       throw new ApiException(400, "Missing the required parameter 'senha' when calling validarSenha");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/validar-senha".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
    headerParams.put("senha", ApiInvoker.parameterToString(senha));
    

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
        return (ValidaSenhaCartaoResponse) ApiInvoker.deserialize(response, "", ValidaSenhaCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Allow validate the Flagged Card through the targe
   * This operation has as an aim to permit that the issuers the authenticity of a determined Card by the reading magnetic targe. The use of this methode has a lot of  application, such as  the Positive Identification of the Card before allowing the cardholder do lots of transactions, such as shopping and withdraw in debt modality  in a current account, etc
   * @param numeroCartao Card Number to be validated
   * @param trilha1 Trail 1 of the card to be validate
   * @param trilha2 Trail 2 of the card to be validate
   * @return ValidaCartaoResponse
   */
  public ValidaCartaoResponse  validarTarja (String numeroCartao, String trilha1, String trilha2) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'numeroCartao' is set
    if (numeroCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'numeroCartao' when calling validarTarja");
    }
    
    // verify the required parameter 'trilha1' is set
    if (trilha1 == null) {
       throw new ApiException(400, "Missing the required parameter 'trilha1' when calling validarTarja");
    }
    
    // verify the required parameter 'trilha2' is set
    if (trilha2 == null) {
       throw new ApiException(400, "Missing the required parameter 'trilha2' when calling validarTarja");
    }
    

    // create path and map variables
    String path = "/api/cartoes/validar-tarja".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numero_cartao", numeroCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "trilha1", trilha1));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "trilha2", trilha2));
    

    

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
        return (ValidaCartaoResponse) ApiInvoker.deserialize(response, "", ValidaCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
