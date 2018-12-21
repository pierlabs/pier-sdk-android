package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.AjusteFinanceiroResponse;
import java.math.BigDecimal;
import br.com.conductor.pier.api.v2.model.AlterarProdutoRequest;
import br.com.conductor.pier.api.v2.model.ContaResponse;
import br.com.conductor.pier.api.v2.model.ContaPartialUpdate;
import br.com.conductor.pier.api.v2.model.AdesaoPagamentoSabadoResponse;
import br.com.conductor.pier.api.v2.model.BeneficioPagamentoAtrasoResponse;
import br.com.conductor.pier.api.v2.model.BoletoResponse;
import br.com.conductor.pier.api.v2.model.DividaClienteResponse;
import br.com.conductor.pier.api.v2.model.TransacoesCorrentesResponse;
import br.com.conductor.pier.api.v2.model.PageTaxasRefinanciamentoResponse;
import br.com.conductor.pier.api.v2.model.ContaDetalheResponse;
import br.com.conductor.pier.api.v2.model.TransferenciaDetalheResponse;
import br.com.conductor.pier.api.v2.model.ContaMultiAppResponse;
import br.com.conductor.pier.api.v2.model.CountMultiAppPersist;
import br.com.conductor.pier.api.v2.model.CartaoImpressaoResponse;
import br.com.conductor.pier.api.v2.model.CartaoEmbossingResponse;
import br.com.conductor.pier.api.v2.model.CartaoEmbossingRequest;
import br.com.conductor.pier.api.v2.model.CartaoImpressaoProvisorioResponse;
import br.com.conductor.pier.api.v2.model.PageContaResponse;
import br.com.conductor.pier.api.v2.model.PageHistoricoEventosResponse;
import br.com.conductor.pier.api.v2.model.PageHistoricoAssessoriaResponse;
import br.com.conductor.pier.api.v2.model.PageHistoricoAtrasoFaturaResponse;
import br.com.conductor.pier.api.v2.model.PageTransacaoNaoProcessadaResponse;
import br.com.conductor.pier.api.v2.model.PageTransacoesCorrentesResponse;
import br.com.conductor.pier.api.v2.model.PageTransacaoProcessadaNaoProcessadaResponse;
import br.com.conductor.pier.api.v2.model.PageTransferenciaResponse;
import br.com.conductor.pier.api.v2.model.ContaPersist;
import br.com.conductor.pier.api.v2.model.AdesaoServicoResponse;
import br.com.conductor.pier.api.v2.model.AdesaoServicoPersist;
import br.com.conductor.pier.api.v2.model.EmprestimoPessoalRequest;
import br.com.conductor.pier.api.v2.model.EmprestimoPessoalResponse;
import br.com.conductor.pier.api.v2.model.PageTransacaoResponse;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class AccountApi {
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
   * Launch an adjust for the account of the informed ID
   * This resource insert an adjust for the account of the informed ID
   * @param id Id Account
   * @param idTipoAjuste Identifier Code of the adjustment type
   * @param dataAjuste Date of the adjustment in the format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ
   * @param valorAjuste Value of the adjustment
   * @param login login
   * @param identificadorExterno Identifier External
   * @param idTransacaoOriginal Original transaction identifier
   * @param idEstabelecimento Store identifier when payment is made in store
   * @return AjusteFinanceiroResponse
   */
  public AjusteFinanceiroResponse  ajustarConta (Long id, Long idTipoAjuste, String dataAjuste, BigDecimal valorAjuste, String login, String identificadorExterno, Long idTransacaoOriginal, Long idEstabelecimento) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling ajustarConta");
    }
    
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
    

    // create path and map variables
    String path = "/api/contas/{id}/ajustes-financeiros".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
   * Update the product associated to the account
   * the resource allows to make some modification of the product associated to the account
   * @param id Identification Code of the Account (id)
   * @param request request
   * @return String
   */
  public String  alterarProduto (Long id, AlterarProdutoRequest request) throws ApiException {
    Object postBody = request;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarProduto");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
       throw new ApiException(400, "Missing the required parameter 'request' when calling alterarProduto");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/alterar-produto".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
   * Update the account of a Personal holder
   * This method allows to change the person of the account
   * @param id Identification Code of the Account (id)
   * @param idPessoa Identification Code of a Person (id)
   * @return ContaResponse
   */
  public ContaResponse  alterarTitular (Long id, Long idPessoa) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarTitular");
    }
    
    // verify the required parameter 'idPessoa' is set
    if (idPessoa == null) {
       throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling alterarTitular");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/alterar-titular".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ContaResponse) ApiInvoker.deserialize(response, "", ContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Update the expiration of the invoices
   * This resource allos to update the expiration for at most in 30 days after the current date  of a specific account on the PIER, respecting the parameter of intervalue among changments of the expiration informed by the Issuer
   * @param id Identification Code of the account (id)
   * @param novoDiaVencimento New day of expiration
   * @return ContaResponse
   */
  public ContaResponse  alterarVencimento (Long id, Integer novoDiaVencimento) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarVencimento");
    }
    
    // verify the required parameter 'novoDiaVencimento' is set
    if (novoDiaVencimento == null) {
       throw new ApiException(400, "Missing the required parameter 'novoDiaVencimento' when calling alterarVencimento");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/alterar-vencimento".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "novo_dia_vencimento", novoDiaVencimento));
    

    

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
        return (ContaResponse) ApiInvoker.deserialize(response, "", ContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Attribute Annuity
   * This resource allows to configurate what Annuity rule will be attributed for a determined account
   * @param id Identification code of the account (id)
   * @param idAnuidade Identifier of annuity
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param DDD DDD of the cell phone
   * @param celular Cell Phone Number
   * @param idOperadora Identifier of the Cell Phone Operator
   * @param idOrigemComercial Identifier of the Commercial Origin
   * @return Object
   */
  public Object  ativarAnuidade (Long id, Long idAnuidade, List<String> sort, Integer page, Integer limit, String DDD, String celular, Long idOperadora, Long idOrigemComercial) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling ativarAnuidade");
    }
    
    // verify the required parameter 'idAnuidade' is set
    if (idAnuidade == null) {
       throw new ApiException(400, "Missing the required parameter 'idAnuidade' when calling ativarAnuidade");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/atribuir-anuidade".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idAnuidade", idAnuidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "DDD", DDD));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "celular", celular));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idOperadora", idOperadora));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idOrigemComercial", idOrigemComercial));
    

    

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
   * Activate the sending service of invoice by email
   * This resource activates the sending service of invoice by email
   * @param id Identification Code of the Account (id)
   * @return Object
   */
  public Object  ativarEnvioFaturaEmail (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling ativarEnvioFaturaEmail");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/ativar-fatura-email".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
   * Performs partial account update
   * This feature allows you to perform partial account updating. This indicates that only the fields entered in the request will be updated, and the others will be ignored
   * @param id Account identification code (id)
   * @param contaPartialUpdate contaPartialUpdate
   * @return ContaResponse
   */
  public ContaResponse  atualizarParcial (Long id, ContaPartialUpdate contaPartialUpdate) throws ApiException {
    Object postBody = contaPartialUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarParcial");
    }
    
    // verify the required parameter 'contaPartialUpdate' is set
    if (contaPartialUpdate == null) {
       throw new ApiException(400, "Missing the required parameter 'contaPartialUpdate' when calling atualizarParcial");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
      String response = apiInvoker.invokeAPI(basePath, path, "PATCH", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ContaResponse) ApiInvoker.deserialize(response, "", ContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Block a determined account
   * This method allows to block a determined account using de id code (id)
   * @param id Identification Code of the Account (id)
   * @param idStatus Identification Code of the New Status Account
   * @return ContaResponse
   */
  public ContaResponse  bloquear (Long id, Long idStatus) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling bloquear");
    }
    
    // verify the required parameter 'idStatus' is set
    if (idStatus == null) {
       throw new ApiException(400, "Missing the required parameter 'idStatus' when calling bloquear");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/bloquear".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id_status", idStatus));
    

    

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
        return (ContaResponse) ApiInvoker.deserialize(response, "", ContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Registration payment enrollment on Saturday
   * This resource allows you to register a payment membership on Saturday
   * @param id Accout Id
   * @return AdesaoPagamentoSabadoResponse
   */
  public AdesaoPagamentoSabadoResponse  cadastrar (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling cadastrar");
    }
    

    // create path and map variables
    String path = "/api/adesoes-pagamentos-sabados".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    

    

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
        return (AdesaoPagamentoSabadoResponse) ApiInvoker.deserialize(response, "", AdesaoPagamentoSabadoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Do the cancellation of a determined account
   * This method allows to do the cancellation of a determined account using the ID code (id)
   * @param id Identification Code of the Account (id)
   * @param idStatus Idetification Code of the Account Status
   * @return ContaResponse
   */
  public ContaResponse  cancelar (Long id, Long idStatus) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling cancelar");
    }
    
    // verify the required parameter 'idStatus' is set
    if (idStatus == null) {
       throw new ApiException(400, "Missing the required parameter 'idStatus' when calling cancelar");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/cancelar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id_status", idStatus));
    

    

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
        return (ContaResponse) ApiInvoker.deserialize(response, "", ContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Find an adhesion of payment on saturday
   * This resource allows you to find an adhesion of payment on saturday
   * @param id Account id
   * @param dataVencimento Adhesion due date
   * @return AdesaoPagamentoSabadoResponse
   */
  public AdesaoPagamentoSabadoResponse  consultar (Long id, String dataVencimento) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultar");
    }
    
    // verify the required parameter 'dataVencimento' is set
    if (dataVencimento == null) {
       throw new ApiException(400, "Missing the required parameter 'dataVencimento' when calling consultar");
    }
    

    // create path and map variables
    String path = "/api/adesoes-pagamentos-sabados".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    
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
        return (AdesaoPagamentoSabadoResponse) ApiInvoker.deserialize(response, "", AdesaoPagamentoSabadoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Show the deadline for payment of the invoice in debt to recieve the benefit
   * This method allows to retrieve if the client has the right to the benefit of the late payment, at the store, until the Saturday subsequent the deadline, being isent of penalty, fees, extra percentual taxe for late payment and IOF
   * @param id Identification Code of the Account (id)
   * @return BeneficioPagamentoAtrasoResponse
   */
  public BeneficioPagamentoAtrasoResponse  consultarBeneficioPagamentoAtraso (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarBeneficioPagamentoAtraso");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/consultar-beneficio-pagamento-atraso".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (BeneficioPagamentoAtrasoResponse) ApiInvoker.deserialize(response, "", BeneficioPagamentoAtrasoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Retrieve the dates of a determined invoice slip
   * this resource retrieves an invoice slip
   * @param id Id Account
   * @return BoletoResponse
   */
  public BoletoResponse  consultarBoletoEmitido (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarBoletoEmitido");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/consultar-dados-pagamento-fatura".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (BoletoResponse) ApiInvoker.deserialize(response, "", BoletoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Retrieve the updated debt of the client
   * This resource retrieves the updated debt of the client
   * @param id Id Account
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param dataVencimento Date of expiration
   * @param idEscritorioCobranca Identification Code of the billing office
   * @return DividaClienteResponse
   */
  public DividaClienteResponse  consultarDividaAtualizadaCliente (Long id, List<String> sort, Integer page, Integer limit, String dataVencimento, Long idEscritorioCobranca) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarDividaAtualizadaCliente");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/recuperar-divida-atualizada".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataVencimento", dataVencimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEscritorioCobranca", idEscritorioCobranca));
    

    

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
        return (DividaClienteResponse) ApiInvoker.deserialize(response, "", DividaClienteResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Retrieves a processed transaction for an account.
   * This resource allows to retrieve the details of a processed transaction belonging to an account.
   * @param id Identification code of the Account (id).
   * @param idTransacao Identification code of the Transaction (id).
   * @return TransacoesCorrentesResponse
   */
  public TransacoesCorrentesResponse  consultarProcessada (Long id, Long idTransacao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarProcessada");
    }
    
    // verify the required parameter 'idTransacao' is set
    if (idTransacao == null) {
       throw new ApiException(400, "Missing the required parameter 'idTransacao' when calling consultarProcessada");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/transacoes-processadas/{idTransacao}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "idTransacao" + "\\}", apiInvoker.escapeString(idTransacao.toString()));

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
        return (TransacoesCorrentesResponse) ApiInvoker.deserialize(response, "", TransacoesCorrentesResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Allow to retrieve using the IDAccount fees and rates
   * This operation has as an aim to allow the Issuers retrieve the taxes and rates of the account. Esta opera??o tem como objetivo permitir que os Emissores consultem as taxas e tarifas da conta
   * @param id ID of the account to be retrieved
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @return PageTaxasRefinanciamentoResponse
   */
  public PageTaxasRefinanciamentoResponse  consultarTaxasTarifas (Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTaxasTarifas");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/consultar-taxas-tarifas".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (PageTaxasRefinanciamentoResponse) ApiInvoker.deserialize(response, "", PageTaxasRefinanciamentoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Displays data for a particular function type for accounts
   * This method allows you to query data from a particular function type for accounts from your identification code (id)
   * @param id Identification code of the function type for accounts (id)
   * @return String
   */
  public String  consultar_1 (Integer id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultar_1");
    }
    

    // create path and map variables
    String path = "/api/contas/tipos-funcoes/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
   * Show dates of a determined account
   * This method allows to retrieve dates of a determined account using the identification code (id)
   * @param id Identification Code of the Account (id)
   * @return ContaDetalheResponse
   */
  public ContaDetalheResponse  consultar_2 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultar_2");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (ContaDetalheResponse) ApiInvoker.deserialize(response, "", ContaDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Retrieve the details of a determined transfer
   * This method allowst to retrieve the details of a determined credit transfer made among accounts
   * @param id Identification Code of the Account (id)
   * @param idTransferencia Identification Code of the transfer (id_transfer)
   * @return TransferenciaDetalheResponse
   */
  public TransferenciaDetalheResponse  consultar_3 (Long id, Long idTransferencia) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultar_3");
    }
    
    // verify the required parameter 'idTransferencia' is set
    if (idTransferencia == null) {
       throw new ApiException(400, "Missing the required parameter 'idTransferencia' when calling consultar_3");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/transferencias-creditos-cartoes/{id_transferencia}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "id_transferencia" + "\\}", apiInvoker.escapeString(idTransferencia.toString()));

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
        return (TransferenciaDetalheResponse) ApiInvoker.deserialize(response, "", TransferenciaDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Register accounts MultiApp
   * This feature allows you to register accounts MultiApp
   * @param contaMultiAppPersist contaMultiAppPersist
   * @return ContaMultiAppResponse
   */
  public ContaMultiAppResponse  criarContasMultiApp (CountMultiAppPersist contaMultiAppPersist) throws ApiException {
    Object postBody = contaMultiAppPersist;
    
    // verify the required parameter 'contaMultiAppPersist' is set
    if (contaMultiAppPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'contaMultiAppPersist' when calling criarContasMultiApp");
    }
    

    // create path and map variables
    String path = "/api/contas/cadastrar-conta-multiapp".replaceAll("\\{format\\}","json");

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
        return (ContaMultiAppResponse) ApiInvoker.deserialize(response, "", ContaMultiAppResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Disable the service of sending the invoice by email
   * This resorurce desables the service of sending the invoice by email
   * @param id Identification Code of the Account (id)
   * @return Object
   */
  public Object  desativarEnvioFaturaEmail (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling desativarEnvioFaturaEmail");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/desativar-fatura-email".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
   * Create a slip of recharge
   * This resource creates a slip of recharge
   * @param id Id Account
   * @param valor Attribute that represents the value of the bank slip issued
   * @param dataVencimento Attribute that represents the expiration date of the bank slip
   * @return BoletoResponse
   */
  public BoletoResponse  gerarBoletoRecarga (Long id, BigDecimal valor, String dataVencimento) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling gerarBoletoRecarga");
    }
    
    // verify the required parameter 'valor' is set
    if (valor == null) {
       throw new ApiException(400, "Missing the required parameter 'valor' when calling gerarBoletoRecarga");
    }
    
    // verify the required parameter 'dataVencimento' is set
    if (dataVencimento == null) {
       throw new ApiException(400, "Missing the required parameter 'dataVencimento' when calling gerarBoletoRecarga");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/gerar-boleto-recarga".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "valor", valor));
    
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
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (BoletoResponse) ApiInvoker.deserialize(response, "", BoletoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Create a new card for printing
   * This resource allows to be created a new card for a determined cardholder that it is linked to the account. For this, it will be necessary inform the id code (id), the IdPersonal of the cardholder and the idPlastictype of the Card that must be created for printing. This functionability will be used to print the cards in stores, kiosks, offices, auto-service attendance, or other places that the Issuer chooses, but it is obligated to have Card Printer to make them, in local
   * @param id Identification Code of the Account (id)
   * @param idPessoa Identification Code of the person (id)
   * @param idTipoPlastico Identification Code of the TypePlastic (id)
   * @return CartaoImpressaoResponse
   */
  public CartaoImpressaoResponse  gerarCartao (Long id, Long idPessoa, Long idTipoPlastico) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling gerarCartao");
    }
    
    // verify the required parameter 'idPessoa' is set
    if (idPessoa == null) {
       throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling gerarCartao");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/pessoas/{id_pessoa}/gerar-cartao".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "id_pessoa" + "\\}", apiInvoker.escapeString(idPessoa.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id_tipo_plastico", idTipoPlastico));
    

    

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
   * Do the sending for the generation of a new card in graphic
   * This resource allows to be generate a new Card for a determined cardholder that it is linked to the account. For this, it&#39;ll be necesseary to inform the id code of the account (id), the idPersonal of the cardholder and the idPlasticType of the card that will be printed. This functionality will be used for the cad printing in graphic
   * @param id Identification Code of the Account (id)
   * @param cartaoEmbossingRequest cartaoEmbossingRequest
   * @return CartaoEmbossingResponse
   */
  public CartaoEmbossingResponse  gerarCartaoEmbossing (Long id, CartaoEmbossingRequest cartaoEmbossingRequest) throws ApiException {
    Object postBody = cartaoEmbossingRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling gerarCartaoEmbossing");
    }
    
    // verify the required parameter 'cartaoEmbossingRequest' is set
    if (cartaoEmbossingRequest == null) {
       throw new ApiException(400, "Missing the required parameter 'cartaoEmbossingRequest' when calling gerarCartaoEmbossing");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/gerar-cartao-grafica".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (CartaoEmbossingResponse) ApiInvoker.deserialize(response, "", CartaoEmbossingResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Create a provisory card
   * This resource allows to be created a provisory card to a determined cardholder which one it is linked to an account. For this, it will be necessary to inform the identification code of the account (id)
   * @param id Identification Code of the Account (id)
   * @return CartaoImpressaoProvisorioResponse
   */
  public CartaoImpressaoProvisorioResponse  gerarCartaoProvisorio (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling gerarCartaoProvisorio");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/gerar-cartao-provisorio".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (CartaoImpressaoProvisorioResponse) ApiInvoker.deserialize(response, "", CartaoImpressaoProvisorioResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Create a virtual card
   * This resource allows to be created a virtual card for a determined cardholder which one it is linked to an account. For this, it will be necessary to inform the identification code of the account (id). This functionability can be used to creat virtual cards through an App
   * @param id Identification Code of the Account (id)
   * @param dataValidade Expiration date
   * @return CartaoImpressaoResponse
   */
  public CartaoImpressaoResponse  gerarCartaoVirtual (Long id, String dataValidade) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling gerarCartaoVirtual");
    }
    
    // verify the required parameter 'dataValidade' is set
    if (dataValidade == null) {
       throw new ApiException(400, "Missing the required parameter 'dataValidade' when calling gerarCartaoVirtual");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/gerar-cartao-virtual".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataValidade", dataValidade));
    

    

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
   * List existent accounts in the database of the Issuer
   * This resource allows to list existent accounts in the database of the Issuer
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param idProduto Identification Code of the product which the account takes part (id)
   * @param idOrigemComercial Identification Code of Commercial Origin (id) that gave origin to the Account
   * @param idPessoa Identification Code of the Personal holder of the Account (id)
   * @param idStatusConta Identification Code of the Account Status
   * @param diaVencimento List the day of expiration
   * @param melhorDiaCompra List the best shopping day
   * @param dataStatusConta List the date that the current idStatusAccount atual was attributed for it
   * @param dataCadastro List the date that the card was created
   * @param dataUltimaAlteracaoVencimento List the date of the last update of the expiration
   * @param funcaoAtiva 
   * @return PageContaResponse
   */
  public PageContaResponse  listar (List<String> sort, Integer page, Integer limit, Long idProduto, Long idOrigemComercial, Long idPessoa, Long idStatusConta, Integer diaVencimento, Integer melhorDiaCompra, String dataStatusConta, String dataCadastro, String dataUltimaAlteracaoVencimento, String funcaoAtiva) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/contas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idProduto", idProduto));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idOrigemComercial", idOrigemComercial));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idStatusConta", idStatusConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "diaVencimento", diaVencimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "melhorDiaCompra", melhorDiaCompra));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataStatusConta", dataStatusConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataCadastro", dataCadastro));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataUltimaAlteracaoVencimento", dataUltimaAlteracaoVencimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "funcaoAtiva", funcaoAtiva));
    

    

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
        return (PageContaResponse) ApiInvoker.deserialize(response, "", PageContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the historic of updatings of the Account limit
   * This resource retrieves the historic with the updatings of the Account limit informed
   * @param id Identification Code of the Account (id)
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @return PageHistoricoEventosResponse
   */
  public PageHistoricoEventosResponse  listarHistoricoAlteracoesLimites (Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarHistoricoAlteracoesLimites");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/historicos-alteracoes-limites".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (PageHistoricoEventosResponse) ApiInvoker.deserialize(response, "", PageHistoricoEventosResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the historic of in/out  of advisories of collection
   * Allow to list all the register of in and out of the Account in files of integration with consulting collection firms through the idcode of the account(idAccount)
   * @param id Id Account
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @return PageHistoricoAssessoriaResponse
   */
  public PageHistoricoAssessoriaResponse  listarHistoricoAssessoria (Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarHistoricoAssessoria");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/historicos-assessorias-cobranca".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (PageHistoricoAssessoriaResponse) ApiInvoker.deserialize(response, "", PageHistoricoAssessoriaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the historic of late invoices
   * This resource lists the historic the late invoice payments
   * @param id Id Account
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @return PageHistoricoAtrasoFaturaResponse
   */
  public PageHistoricoAtrasoFaturaResponse  listarHistoricoAtrasosFaturas (Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarHistoricoAtrasosFaturas");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/historicos-faturas-atrasos".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (PageHistoricoAtrasoFaturaResponse) ApiInvoker.deserialize(response, "", PageHistoricoAtrasoFaturaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the transactions unprocessed of the account
   * This method allows to be listed all the transactions unprocessed of the Account
   * @param id Identification Code of the Account (id)
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param dataInicio Date of beginning of the bank statement retrievement in the format yyyy-MM-dd (Parameter ignored if the Ending date is not set)
   * @param dataFim Date of ending of the bank statement retrievement in the format yyyy-MM-dd  (Parameter ignored if the Beginning date is not set)
   * @return PageTransacaoNaoProcessadaResponse
   */
  public PageTransacaoNaoProcessadaResponse  listarNaoProcessadas (Long id, List<String> sort, Integer page, Integer limit, String dataInicio, String dataFim) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarNaoProcessadas");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/transacoes/listar-nao-processadas".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataInicio", dataInicio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataFim", dataFim));
    

    

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
        return (PageTransacaoNaoProcessadaResponse) ApiInvoker.deserialize(response, "", PageTransacaoNaoProcessadaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List of the transactions processed of the account
   * This method allows to be listed all the transactions processed of the account
   * @param id Identification code of the Account (id)
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param dataVencimento Date of expiration of the bank statement in the format yyyy-MM-dd
   * @param dataInicio Date of beginning of the bank statement retrievement in the format yyyy-MM-dd (Ignored when the parameter dateExpiration is used)
   * @param dataFim Date of Ending of the bank statement retrievement in the format yyyy-MM-dd (Ignored when the parameter dateExpiration is used)
   * @param idTipoTransacao Transaction Type
   * @param recuperaEncargos Add the interest transactions in the query
   * @return PageTransacoesCorrentesResponse
   */
  public PageTransacoesCorrentesResponse  listarProcessadas (Long id, List<String> sort, Integer page, Integer limit, String dataVencimento, String dataInicio, String dataFim, Long idTipoTransacao, Integer recuperaEncargos) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarProcessadas");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/transacoes/listar-processadas".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataVencimento", dataVencimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataInicio", dataInicio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataFim", dataFim));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoTransacao", idTipoTransacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "recuperaEncargos", recuperaEncargos));
    

    

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
        return (PageTransacoesCorrentesResponse) ApiInvoker.deserialize(response, "", PageTransacoesCorrentesResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista os tipos de fun\u00E7\u00F5es para contas do Emissor
   * This feature allows you to list the types of roles for the Issuer&#39;s accounts
   * @return String
   */
  public String  listar_4 () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/contas/tipos-funcoes".replaceAll("\\{format\\}","json");

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
   * Lists unprocessed and processed account transactions
   * This method allows all unprocessed and processed transactions in the Account to be listed
   * @param id Identification Code of the Account (id)
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param dataVencimento Date of expiration of the bank statement in the format yyyy-MM-dd
   * @param dataInicio Date of beginning of the bank statement retrievement in the format yyyy-MM-dd (Ignored when the parameter dateExpiration is used)
   * @param dataFim Date of Ending of the bank statement retrievement in the format yyyy-MM-dd (Ignored when the parameter dateExpiration is used)
   * @param idTipoTransacao Transaction Type
   * @param flagCredito Flag that indicates whether the transaction is credit
   * @param flagFaturado Flag indicating whether the transaction was billed
   * @param flagProcessada Flag indicating whether the transaction was processed
   * @param status Transaction Status
   * @param plano Transaction plan
   * @param codigoMCC MCC transaction code
   * @param grupoMCC Transaction MCC Group
   * @return PageTransacaoProcessadaNaoProcessadaResponse
   */
  public PageTransacaoProcessadaNaoProcessadaResponse  listar_5 (Long id, List<String> sort, Integer page, Integer limit, String dataVencimento, String dataInicio, String dataFim, Long idTipoTransacao, Boolean flagCredito, Boolean flagFaturado, Boolean flagProcessada, Integer status, Integer plano, Long codigoMCC, Long grupoMCC) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listar_5");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/transacoes".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataVencimento", dataVencimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataInicio", dataInicio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataFim", dataFim));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoTransacao", idTipoTransacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagCredito", flagCredito));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagFaturado", flagFaturado));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagProcessada", flagProcessada));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "status", status));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "plano", plano));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "codigoMCC", codigoMCC));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "grupoMCC", grupoMCC));
    

    

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
        return (PageTransacaoProcessadaNaoProcessadaResponse) ApiInvoker.deserialize(response, "", PageTransacaoProcessadaNaoProcessadaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the transfers made by the account
   * This method allows to be listed the transfers made by the existing account in the base of the issuer
   * @param id Identification Code of the Account (id)
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param idTransferencia Identification Code of the transfer (id)
   * @param idContaOrigem Identification Code of the account which the value will be debited for the transfer (id)
   * @param idContaDestino Identification Code of the account which the value wull be creditedfor the transfer (id)
   * @param valorTransferencia Value established to be transfered
   * @param dataTransferencia Date established to occur the transfer
   * @return PageTransferenciaResponse
   */
  public PageTransferenciaResponse  listar_6 (Long id, List<String> sort, Integer page, Integer limit, Long idTransferencia, Long idContaOrigem, Long idContaDestino, BigDecimal valorTransferencia, String dataTransferencia) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listar_6");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/transferencias-creditos-cartoes".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTransferencia", idTransferencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idContaOrigem", idContaOrigem));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idContaDestino", idContaDestino));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "valorTransferencia", valorTransferencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataTransferencia", dataTransferencia));
    

    

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
        return (PageTransferenciaResponse) ApiInvoker.deserialize(response, "", PageTransferenciaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Do the reactivation of the account
   * this resource allows to reactivate the accounts. For this, It&#39;s necessary to inform the idcode of the account (id)
   * @param id Id Account
   * @return Object
   */
  public Object  reativar (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling reativar");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/reativar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
   * Includes a new account
   * This resource includes a new account for an existing client
   * @param contaPersist contaPersist
   * @return ContaResponse
   */
  public ContaResponse  salvar (ContaPersist contaPersist) throws ApiException {
    Object postBody = contaPersist;
    
    // verify the required parameter 'contaPersist' is set
    if (contaPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'contaPersist' when calling salvar");
    }
    

    // create path and map variables
    String path = "/api/contas".replaceAll("\\{format\\}","json");

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
        return (ContaResponse) ApiInvoker.deserialize(response, "", ContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Make a registration of a new service adhesion
   * This feature allows you to register a new service subscription at the sender base
   * @param id Identify account
   * @param adesaoServicoPersist adesaoServicoPersist
   * @return AdesaoServicoResponse
   */
  public AdesaoServicoResponse  salvarAdesaoServicos (Long id, AdesaoServicoPersist adesaoServicoPersist) throws ApiException {
    Object postBody = adesaoServicoPersist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling salvarAdesaoServicos");
    }
    
    // verify the required parameter 'adesaoServicoPersist' is set
    if (adesaoServicoPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'adesaoServicoPersist' when calling salvarAdesaoServicos");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/adesoes-servicos".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (AdesaoServicoResponse) ApiInvoker.deserialize(response, "", AdesaoServicoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Simulate values of loans/financing
   * This operation can be used to simulate financial operations with the information given by the user. The created calculus must be considered only as a reference for real situations and not as official values
   * @param id Identification Code of the Account (id)
   * @param request request
   * @return EmprestimoPessoalResponse
   */
  public EmprestimoPessoalResponse  simularEmprestimoFinanciamento (Long id, EmprestimoPessoalRequest request) throws ApiException {
    Object postBody = request;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling simularEmprestimoFinanciamento");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
       throw new ApiException(400, "Missing the required parameter 'request' when calling simularEmprestimoFinanciamento");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/simular-emprestimos-financiamentos".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (EmprestimoPessoalResponse) ApiInvoker.deserialize(response, "", EmprestimoPessoalResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Allow to list a timeline of the event of the account
   * This operation has as an aim to allow a listing, in a timeline mode, of the events linked to a determined account. Transactions, invoice closing, payments, create cards and update the limit are exemples of the events contemplated for this funcionality. In this method, the operations are ordered in descending form
   * @param id Id Account
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @return PageTransacaoResponse
   */
  public PageTransacaoResponse  transacoes (Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling transacoes");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/timeline".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (PageTransacaoResponse) ApiInvoker.deserialize(response, "", PageTransacaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Make a credit transfer to another client of the same Issuer
   * This method allows that a cardholder can make credit transfer to another client of the same Issuer
   * @param id Identification Code of the cardholder client account that will be debited (id)
   * @param idContaDestino Identification Code of the cardholder client that will be credited (id)
   * @param valorTransferencia Value of the Transfer
   * @return TransferenciaDetalheResponse
   */
  public TransferenciaDetalheResponse  transferir (Long id, Long idContaDestino, BigDecimal valorTransferencia) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling transferir");
    }
    
    // verify the required parameter 'idContaDestino' is set
    if (idContaDestino == null) {
       throw new ApiException(400, "Missing the required parameter 'idContaDestino' when calling transferir");
    }
    
    // verify the required parameter 'valorTransferencia' is set
    if (valorTransferencia == null) {
       throw new ApiException(400, "Missing the required parameter 'valorTransferencia' when calling transferir");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/transferencias-creditos-cartoes".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id_conta_destino", idContaDestino));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "valor_transferencia", valorTransferencia));
    

    

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
        return (TransferenciaDetalheResponse) ApiInvoker.deserialize(response, "", TransferenciaDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
