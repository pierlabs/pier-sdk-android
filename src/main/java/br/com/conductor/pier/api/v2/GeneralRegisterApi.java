package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.CampanhaResponse;
import br.com.conductor.pier.api.v2.model.CampaignUpdate;
import br.com.conductor.pier.api.v2.model.ConvenioPersist;
import br.com.conductor.pier.api.v2.model.ConvenioResponse;
import br.com.conductor.pier.api.v2.model.ControleVencimentoResponse;
import br.com.conductor.pier.api.v2.model.VencimentoUpdate;
import br.com.conductor.pier.api.v2.model.TipoOperacaoParcialUpdate;
import br.com.conductor.pier.api.v2.model.TipoOperacaoResponse;
import br.com.conductor.pier.api.v2.model.ConfiguracaoRegistroCobrancaPersist;
import br.com.conductor.pier.api.v2.model.ConfiguracaoRegistroCobrancaResponse;
import br.com.conductor.pier.api.v2.model.ConfiguracaoRotativoDetalheResponse;
import br.com.conductor.pier.api.v2.model.ConfiguracaoRotativoPersist;
import br.com.conductor.pier.api.v2.model.ParametroProdutoResponse;
import br.com.conductor.pier.api.v2.model.TaxaAntecipacaoRequest;
import br.com.conductor.pier.api.v2.model.AtendimentoClienteResponse;
import br.com.conductor.pier.api.v2.model.PageProdutoPacoteTarifaResponse;
import br.com.conductor.pier.api.v2.model.BancoResponse;
import br.com.conductor.pier.api.v2.model.ProdutoDetalhesResponse;
import br.com.conductor.pier.api.v2.model.TipoAjusteResponse;
import br.com.conductor.pier.api.v2.model.PageTipoBoletoResponse;
import br.com.conductor.pier.api.v2.model.TipoEnderecoResponse;
import br.com.conductor.pier.api.v2.model.TipoTelefoneResponse;
import br.com.conductor.pier.api.v2.model.PageAtendimentoClienteResponse;
import br.com.conductor.pier.api.v2.model.PageCampanhaResponse;
import br.com.conductor.pier.api.v2.model.PageConvenioResponse;
import java.math.BigDecimal;
import br.com.conductor.pier.api.v2.model.PageCampoCodificadoDescricaoResponse;
import br.com.conductor.pier.api.v2.model.PageFantasiaBasicaResponse;
import br.com.conductor.pier.api.v2.model.PageTipoCampanhaResponse;
import br.com.conductor.pier.api.v2.model.PageBancoResponse;
import br.com.conductor.pier.api.v2.model.PageConfiguracaoRotativoResponse;
import br.com.conductor.pier.api.v2.model.PagePortadorResponse;
import br.com.conductor.pier.api.v2.model.PageProdutoResponse;
import br.com.conductor.pier.api.v2.model.PagePromotorResponse;
import br.com.conductor.pier.api.v2.model.PageTipoAjusteResponse;
import br.com.conductor.pier.api.v2.model.PageTipoEnderecoResponse;
import br.com.conductor.pier.api.v2.model.PageTipoTelefoneResponse;
import br.com.conductor.pier.api.v2.model.PageControleVencimentoResponse;
import br.com.conductor.pier.api.v2.model.CampanhaPersist;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class GeneralRegisterApi {
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
   * Update Campaign
   * This method allows to be updated the dates of the campaign
   * @param id Identification Code of the campaign (id)
   * @param update update
   * @return CampanhaResponse
   */
  public CampanhaResponse  alterar (Long id, CampaignUpdate update) throws ApiException {
    Object postBody = update;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterar");
    }
    
    // verify the required parameter 'update' is set
    if (update == null) {
       throw new ApiException(400, "Missing the required parameter 'update' when calling alterar");
    }
    

    // create path and map variables
    String path = "/api/campanhas/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (CampanhaResponse) ApiInvoker.deserialize(response, "", CampanhaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Update a covenant
   * Update a covenant
   * @param id Id
   * @param convenioPersist convenioPersist
   * @return ConvenioResponse
   */
  public ConvenioResponse  alterarConvenio (Long id, ConvenioPersist convenioPersist) throws ApiException {
    Object postBody = convenioPersist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarConvenio");
    }
    
    // verify the required parameter 'convenioPersist' is set
    if (convenioPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'convenioPersist' when calling alterarConvenio");
    }
    

    // create path and map variables
    String path = "/api/convenios/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ConvenioResponse) ApiInvoker.deserialize(response, "", ConvenioResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * updates the provision for the cut from the due date
   * updates the provision for the cut from the due date
   * @param dataVencimento Expiration date
   * @param update update
   * @param login login
   * @return ControleVencimentoResponse
   */
  public ControleVencimentoResponse  alterarCorte (String dataVencimento, VencimentoUpdate update, String login) throws ApiException {
    Object postBody = update;
    
    // verify the required parameter 'dataVencimento' is set
    if (dataVencimento == null) {
       throw new ApiException(400, "Missing the required parameter 'dataVencimento' when calling alterarCorte");
    }
    
    // verify the required parameter 'update' is set
    if (update == null) {
       throw new ApiException(400, "Missing the required parameter 'update' when calling alterarCorte");
    }
    

    // create path and map variables
    String path = "/api/vencimentos/{dataVencimento}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "dataVencimento" + "\\}", apiInvoker.escapeString(dataVencimento.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
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
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ControleVencimentoResponse) ApiInvoker.deserialize(response, "", ControleVencimentoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Edits an operation type
   * Edits operation type fields that were passed through the request object
   * @param id Operation Type Id
   * @param tipoOperacaoParcialUpdate tipoOperacaoParcialUpdate
   * @return TipoOperacaoResponse
   */
  public TipoOperacaoResponse  alterarParcial (Long id, TipoOperacaoParcialUpdate tipoOperacaoParcialUpdate) throws ApiException {
    Object postBody = tipoOperacaoParcialUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarParcial");
    }
    
    // verify the required parameter 'tipoOperacaoParcialUpdate' is set
    if (tipoOperacaoParcialUpdate == null) {
       throw new ApiException(400, "Missing the required parameter 'tipoOperacaoParcialUpdate' when calling alterarParcial");
    }
    

    // create path and map variables
    String path = "/api/tipos-operacoes/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (TipoOperacaoResponse) ApiInvoker.deserialize(response, "", TipoOperacaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Update configuration for the register of collection
   * This method allows to update a configuration for the register of collection
   * @param id Identification Code of the Configuration (id)
   * @param configuracaoPersist configuracaoPersist
   * @return ConfiguracaoRegistroCobrancaResponse
   */
  public ConfiguracaoRegistroCobrancaResponse  alterar_1 (Long id, ConfiguracaoRegistroCobrancaPersist configuracaoPersist) throws ApiException {
    Object postBody = configuracaoPersist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterar_1");
    }
    
    // verify the required parameter 'configuracaoPersist' is set
    if (configuracaoPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'configuracaoPersist' when calling alterar_1");
    }
    

    // create path and map variables
    String path = "/api/configuracoes-registro-cobranca/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ConfiguracaoRegistroCobrancaResponse) ApiInvoker.deserialize(response, "", ConfiguracaoRegistroCobrancaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Alterar os dados de configura??o do rotativo de um produto
   * This method allows to be updated a configuration of the revolving for a determined product
   * @param id Identificatication Code of the configuration (id)
   * @param configuracaoRotativoPersist configuracaoRotativoPersist
   * @return ConfiguracaoRotativoDetalheResponse
   */
  public ConfiguracaoRotativoDetalheResponse  alterar_2 (Long id, ConfiguracaoRotativoPersist configuracaoRotativoPersist) throws ApiException {
    Object postBody = configuracaoRotativoPersist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterar_2");
    }
    
    // verify the required parameter 'configuracaoRotativoPersist' is set
    if (configuracaoRotativoPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'configuracaoRotativoPersist' when calling alterar_2");
    }
    

    // create path and map variables
    String path = "/api/configuracoes-rotativos/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ConfiguracaoRotativoDetalheResponse) ApiInvoker.deserialize(response, "", ConfiguracaoRotativoDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Insert configuration for the register of collection
   * This method allows to be created a new configuration for the register of collection
   * @param configuracaoPersist configuracaoPersist
   * @return ConfiguracaoRegistroCobrancaResponse
   */
  public ConfiguracaoRegistroCobrancaResponse  cadastrar (ConfiguracaoRegistroCobrancaPersist configuracaoPersist) throws ApiException {
    Object postBody = configuracaoPersist;
    
    // verify the required parameter 'configuracaoPersist' is set
    if (configuracaoPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'configuracaoPersist' when calling cadastrar");
    }
    

    // create path and map variables
    String path = "/api/configuracoes-registro-cobranca".replaceAll("\\{format\\}","json");

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
        return (ConfiguracaoRegistroCobrancaResponse) ApiInvoker.deserialize(response, "", ConfiguracaoRegistroCobrancaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Adds new covenant
   * Adds new covenant
   * @param convenioPersist convenioPersist
   * @return ConvenioResponse
   */
  public ConvenioResponse  cadastrarConvenio (ConvenioPersist convenioPersist) throws ApiException {
    Object postBody = convenioPersist;
    
    // verify the required parameter 'convenioPersist' is set
    if (convenioPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'convenioPersist' when calling cadastrarConvenio");
    }
    

    // create path and map variables
    String path = "/api/convenios".replaceAll("\\{format\\}","json");

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
        return (ConvenioResponse) ApiInvoker.deserialize(response, "", ConvenioResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Configurate the Antecipation taxe of a Product
   * this resource allows to configurate the Antecipation Taxe of a Product, using the identification code (id)
   * @param id Id Product
   * @param taxaAntecipacaoRequest taxaAntecipacaoRequest
   * @return ParametroProdutoResponse
   */
  public ParametroProdutoResponse  configurarTaxaAntecipacao (Long id, TaxaAntecipacaoRequest taxaAntecipacaoRequest) throws ApiException {
    Object postBody = taxaAntecipacaoRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling configurarTaxaAntecipacao");
    }
    
    // verify the required parameter 'taxaAntecipacaoRequest' is set
    if (taxaAntecipacaoRequest == null) {
       throw new ApiException(400, "Missing the required parameter 'taxaAntecipacaoRequest' when calling configurarTaxaAntecipacao");
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
   * Present the dates of a determined Attendance
   * This method allows searching the parameters of determined Attendance starting from your ID code (idAttendance)
   * @param id Identification Code of the Client Attedance (id)
   * @return AtendimentoClienteResponse
   */
  public AtendimentoClienteResponse  consultar (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultar");
    }
    

    // create path and map variables
    String path = "/api/atendimento-clientes/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (AtendimentoClienteResponse) ApiInvoker.deserialize(response, "", AtendimentoClienteResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Search Campaign
   * This method allows to be listed the dates of a determined existent campaign  in the base of the issuer. So, It&#39;s necessary to inform the respective code of identification (id)
   * @param id ID of the Campaign
   * @return CampanhaResponse
   */
  public CampanhaResponse  consultarCampanha (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarCampanha");
    }
    

    // create path and map variables
    String path = "/api/campanhas/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (CampanhaResponse) ApiInvoker.deserialize(response, "", CampanhaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Consult bank details of a particular agreement
   * Query bank details by agreement id
   * @param id Id
   * @return ConvenioResponse
   */
  public ConvenioResponse  consultarConvenio (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarConvenio");
    }
    

    // create path and map variables
    String path = "/api/convenios/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (ConvenioResponse) ApiInvoker.deserialize(response, "", ConvenioResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the product rate packages
   * This feature allows you to list the product rate packages
   * @param id Product identification code (id)
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @return PageProdutoPacoteTarifaResponse
   */
  public PageProdutoPacoteTarifaResponse  consultarProdutoPacoteTarifa (Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarProdutoPacoteTarifa");
    }
    

    // create path and map variables
    String path = "/api/produtos/{id}/pacotes-tarifas".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (PageProdutoPacoteTarifaResponse) ApiInvoker.deserialize(response, "", PageProdutoPacoteTarifaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Retrieve the Antecipation Taxe of a Product
   * this resource allows to retrieve the Antecipation Taxe of a Product, using the identification code (id)
   * @param id Id Product
   * @param tipoTransacao Transaction type (ON-US ou OFF-US)
   * @return ParametroProdutoResponse
   */
  public ParametroProdutoResponse  consultarTaxaAntecipacao (Long id, String tipoTransacao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTaxaAntecipacao");
    }
    
    // verify the required parameter 'tipoTransacao' is set
    if (tipoTransacao == null) {
       throw new ApiException(400, "Missing the required parameter 'tipoTransacao' when calling consultarTaxaAntecipacao");
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
   * Present the dates of a determined Bank
   * This method allows to search a determined Bank starting from your ID code
   * @param id Identification Code of the Bank (id)
   * @return BancoResponse
   */
  public BancoResponse  consultar_3 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultar_3");
    }
    

    // create path and map variables
    String path = "/api/bancos/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (BancoResponse) ApiInvoker.deserialize(response, "", BancoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Retrieve configuration for the register of collection
   * This method allows to find a configuration, for the register of collection
   * @param id Identification code of the configuration (id)
   * @return ConfiguracaoRegistroCobrancaResponse
   */
  public ConfiguracaoRegistroCobrancaResponse  consultar_4 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultar_4");
    }
    

    // create path and map variables
    String path = "/api/configuracoes-registro-cobranca/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (ConfiguracaoRegistroCobrancaResponse) ApiInvoker.deserialize(response, "", ConfiguracaoRegistroCobrancaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Show dates of a configuration of an specific revolving
   * This resource allows to retrieve configuration dates of a revolving installment by the id code (id)
   * @param id Identification Code of the revolving configuration (id)
   * @return ConfiguracaoRotativoDetalheResponse
   */
  public ConfiguracaoRotativoDetalheResponse  consultar_5 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultar_5");
    }
    

    // create path and map variables
    String path = "/api/configuracoes-rotativos/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (ConfiguracaoRotativoDetalheResponse) ApiInvoker.deserialize(response, "", ConfiguracaoRotativoDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Retrieve the dates of a determined Product
   * This method allows to retrieve a determined Product using the identification code (id)
   * @param id Identification Code of the Product (id)
   * @return ProdutoDetalhesResponse
   */
  public ProdutoDetalhesResponse  consultar_6 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultar_6");
    }
    

    // create path and map variables
    String path = "/api/produtos/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (ProdutoDetalhesResponse) ApiInvoker.deserialize(response, "", ProdutoDetalhesResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Query a Transaction Type
   * Query a Transaction Type
   * @param id Transation Type Id
   * @return TipoAjusteResponse
   */
  public TipoAjusteResponse  consultar_7 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultar_7");
    }
    

    // create path and map variables
    String path = "/api/tipos-ajustes/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (TipoAjusteResponse) ApiInvoker.deserialize(response, "", TipoAjusteResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the types of slips of the Issuer
   * this resource allows to be listed all the types of existing slips in the database of the Issuer
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param id Identifier Code of the Bank Slip
   * @param descricao Description of the bank slip type
   * @param banco Identifier Code of the Bank
   * @return PageTipoBoletoResponse
   */
  public PageTipoBoletoResponse  consultar_8 (List<String> sort, Integer page, Integer limit, Long id, String descricao, Long banco) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/tipos-boletos".replaceAll("\\{format\\}","json");

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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "banco", banco));
    

    

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
   * List the dates of a determined Type of Address
   * This method allows to retrieve a determined Type of Address using the identification code (id)
   * @param id Identification Code of the Address Type (id)
   * @return TipoEnderecoResponse
   */
  public TipoEnderecoResponse  consultar_9 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultar_9");
    }
    

    // create path and map variables
    String path = "/api/tipos-enderecos/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (TipoEnderecoResponse) ApiInvoker.deserialize(response, "", TipoEnderecoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the dates of a determined type of operation
   * This resource allows to retrieve dates of a determined type of operation using the idCard, idEstablishment and Processingcode
   * @param idCartao Identification Code of the Card (idCard)
   * @param idEstabelecimento Identification Code of the Merchant (idMerchant)
   * @param codigoProcessamento C?digo de processamento da opera??o
   * @return TipoOperacaoResponse
   */
  public TipoOperacaoResponse  consultar_10 (Long idCartao, Long idEstabelecimento, String codigoProcessamento) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idCartao' is set
    if (idCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'idCartao' when calling consultar_10");
    }
    
    // verify the required parameter 'idEstabelecimento' is set
    if (idEstabelecimento == null) {
       throw new ApiException(400, "Missing the required parameter 'idEstabelecimento' when calling consultar_10");
    }
    
    // verify the required parameter 'codigoProcessamento' is set
    if (codigoProcessamento == null) {
       throw new ApiException(400, "Missing the required parameter 'codigoProcessamento' when calling consultar_10");
    }
    

    // create path and map variables
    String path = "/api/tipos-operacoes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idCartao", idCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEstabelecimento", idEstabelecimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "codigoProcessamento", codigoProcessamento));
    

    

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
        return (TipoOperacaoResponse) ApiInvoker.deserialize(response, "", TipoOperacaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the dates of a determined Type of Telephone
   * This method allows to retrieve a determined Type of Telephone using the identification code (id)
   * @param id Identification Code of the Telephone Type (id)
   * @return TipoTelefoneResponse
   */
  public TipoTelefoneResponse  consultar_11 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultar_11");
    }
    

    // create path and map variables
    String path = "/api/tipos-telefones/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (TipoTelefoneResponse) ApiInvoker.deserialize(response, "", TipoTelefoneResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List all the attendances
   * This method allows to be listed the Attendance Register, regardlessof the Type
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param idTipoAtendimento Identification Code of the Type of Attendance (id)
   * @param idConta Identification Code of the account (id)
   * @param nomeAtendente Show the name of the Attendant that registered the Attendance
   * @param dataAtendimento Show the date that the Attendance was made
   * @return PageAtendimentoClienteResponse
   */
  public PageAtendimentoClienteResponse  listar (List<String> sort, Integer page, Integer limit, Long idTipoAtendimento, Long idConta, String nomeAtendente, String dataAtendimento) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/atendimento-clientes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoAtendimento", idTipoAtendimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeAtendente", nomeAtendente));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataAtendimento", dataAtendimento));
    

    

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
        return (PageAtendimentoClienteResponse) ApiInvoker.deserialize(response, "", PageAtendimentoClienteResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List Campaigns
   * List the Campaigns
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param idTipoCampanha Identification Code of the Type of campaign (id)
   * @return PageCampanhaResponse
   */
  public PageCampanhaResponse  listarCampanhas (List<String> sort, Integer page, Integer limit, Long idTipoCampanha) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/campanhas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoCampanha", idTipoCampanha));
    

    

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
        return (PageCampanhaResponse) ApiInvoker.deserialize(response, "", PageCampanhaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List bank details of existing agreements
   * List bank details of existing agreements
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param banco Bank Id
   * @param agencia Agency Number
   * @param contaCorrente Current Account
   * @param numeroConvenio Number Convenant
   * @return PageConvenioResponse
   */
  public PageConvenioResponse  listarConvenios (List<String> sort, Integer page, Integer limit, Long banco, Long agencia, String contaCorrente, BigDecimal numeroConvenio) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/convenios".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "banco", banco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "agencia", agencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "contaCorrente", contaCorrente));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroConvenio", numeroConvenio));
    

    

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
        return (PageConvenioResponse) ApiInvoker.deserialize(response, "", PageConvenioResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List Marital Status
   * This method allows to be listed the Marital Status in the database of the issuer
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @return PageCampoCodificadoDescricaoResponse
   */
  public PageCampoCodificadoDescricaoResponse  listarEstadosCivis (List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/estados-civis".replaceAll("\\{format\\}","json");

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
        return (PageCampoCodificadoDescricaoResponse) ApiInvoker.deserialize(response, "", PageCampoCodificadoDescricaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista the Basic Fantasies
   * List the Basic Fantasies
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @return PageFantasiaBasicaResponse
   */
  public PageFantasiaBasicaResponse  listarFantasiasBasicas (List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/fantasias-basicas".replaceAll("\\{format\\}","json");

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
        return (PageFantasiaBasicaResponse) ApiInvoker.deserialize(response, "", PageFantasiaBasicaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Listnationalities
   * This method allows to be listed the nationalities in the database of the issuer
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @return PageCampoCodificadoDescricaoResponse
   */
  public PageCampoCodificadoDescricaoResponse  listarNacionalidades (List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/nacionalidades".replaceAll("\\{format\\}","json");

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
        return (PageCampoCodificadoDescricaoResponse) ApiInvoker.deserialize(response, "", PageCampoCodificadoDescricaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List of the Occupations
   * This method allows to be listed the nature of the operations in the database of the issuer
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @return PageCampoCodificadoDescricaoResponse
   */
  public PageCampoCodificadoDescricaoResponse  listarNaturezasOcupacoes (List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/ocupacoes".replaceAll("\\{format\\}","json");

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
        return (PageCampoCodificadoDescricaoResponse) ApiInvoker.deserialize(response, "", PageCampoCodificadoDescricaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List of Parentage
   * This method allows to be listed  parentage in the database of the issuer
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @return PageCampoCodificadoDescricaoResponse
   */
  public PageCampoCodificadoDescricaoResponse  listarParentescos (List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/parentescos".replaceAll("\\{format\\}","json");

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
        return (PageCampoCodificadoDescricaoResponse) ApiInvoker.deserialize(response, "", PageCampoCodificadoDescricaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List  Occupations
   * This method allows to be listed the occupations in the database of the issuer
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @return PageCampoCodificadoDescricaoResponse
   */
  public PageCampoCodificadoDescricaoResponse  listarProfissoes (List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/profissoes".replaceAll("\\{format\\}","json");

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
        return (PageCampoCodificadoDescricaoResponse) ApiInvoker.deserialize(response, "", PageCampoCodificadoDescricaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List types of Campaigns
   * List the types of Campaigns
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @return PageTipoCampanhaResponse
   */
  public PageTipoCampanhaResponse  listarTiposCampanhas (List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/tipos-campanhas".replaceAll("\\{format\\}","json");

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
        return (PageTipoCampanhaResponse) ApiInvoker.deserialize(response, "", PageTipoCampanhaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List of the Banks created for the Issuer
   * This method allows to be listed the existent Banks in the database of the issuer
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @return PageBancoResponse
   */
  public PageBancoResponse  listar_12 (List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/bancos".replaceAll("\\{format\\}","json");

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
        return (PageBancoResponse) ApiInvoker.deserialize(response, "", PageBancoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List configurations for the register of collection
   * This method allows to list the configuration for the register of collection
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @return ConfiguracaoRegistroCobrancaResponse
   */
  public ConfiguracaoRegistroCobrancaResponse  listar_13 (List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/configuracoes-registro-cobranca".replaceAll("\\{format\\}","json");

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
        return (ConfiguracaoRegistroCobrancaResponse) ApiInvoker.deserialize(response, "", ConfiguracaoRegistroCobrancaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the revolving configuration
   * This resource allows to list the revolving configuration
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param idProduto Identification Code of the Product
   * @return PageConfiguracaoRotativoResponse
   */
  public PageConfiguracaoRotativoResponse  listar_14 (List<String> sort, Integer page, Integer limit, Long idProduto) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/configuracoes-rotativos".replaceAll("\\{format\\}","json");

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
        return (PageConfiguracaoRotativoResponse) ApiInvoker.deserialize(response, "", PageConfiguracaoRotativoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the existing Cardholders
   * This method allows to be listed the cardholders registered in the database of the issuer
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param idConta Identification Code of the Account (id)
   * @param idProduto Identification Code of the Product (id)
   * @param idPessoa Identification Code of the Perso (id)
   * @param idParentesco Identification Code of Kinship (id)
   * @param tipoPortador Show the type of Cardholder, being: (&#39;T&#39;: Holder, &#39;A&#39;: Additional)
   * @param nomeImpresso Show the name to be printed on the card
   * @param idTipoCartao Show the identification code of the type of the Card (id), that it will be used to create the cards of this cardholder, linked to a respective account through the fiel idAccount
   * @param flagAtivo When it is active, it indicates that the cardholder register is active, in issuers that do this type of management
   * @param dataCadastroPortador Show the date which the cardholder was registered, when there is this information
   * @param dataCancelamentoPortador Show the date which the cardholder that was canceled, when there is this information
   * @return PagePortadorResponse
   */
  public PagePortadorResponse  listar_15 (List<String> sort, Integer page, Integer limit, Long idConta, Long idProduto, Long idPessoa, Long idParentesco, String tipoPortador, String nomeImpresso, Long idTipoCartao, Integer flagAtivo, String dataCadastroPortador, String dataCancelamentoPortador) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/portadores".replaceAll("\\{format\\}","json");

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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idProduto", idProduto));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idParentesco", idParentesco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tipoPortador", tipoPortador));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeImpresso", nomeImpresso));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoCartao", idTipoCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagAtivo", flagAtivo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataCadastroPortador", dataCadastroPortador));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataCancelamentoPortador", dataCancelamentoPortador));
    

    

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
        return (PagePortadorResponse) ApiInvoker.deserialize(response, "", PagePortadorResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the Products of the Issuer
   * This method allows to be listed the existing Products in the database of the issuer
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param nome Description of the Product Name
   * @param status Represent the Status of the Product, where: (&#39;0&#39;: Inactive), (&#39;1&#39;: Active)
   * @param idFantasiaBasica Identification Code of the Basic Fantasy (id) which the product belongs
   * @return PageProdutoResponse
   */
  public PageProdutoResponse  listar_16 (List<String> sort, Integer page, Integer limit, String nome, Integer status, Long idFantasiaBasica) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/produtos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "status", status));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idFantasiaBasica", idFantasiaBasica));
    

    

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
        return (PageProdutoResponse) ApiInvoker.deserialize(response, "", PageProdutoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List promoters registered in the base of the issuer
   * This method allows to be listed the register of existing Promoters in the database of the issuer
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param id Identification Code of the Prosecutor (id)
   * @param nome Prosecutor Name
   * @param dataCadastro Inclusion date
   * @param idEstabelecimento Identification Code of the Establishment
   * @param idUsuario Identification Code of the user
   * @return PagePromotorResponse
   */
  public PagePromotorResponse  listar_17 (List<String> sort, Integer page, Integer limit, Long id, String nome, String dataCadastro, Long idEstabelecimento, Long idUsuario) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/promotores".replaceAll("\\{format\\}","json");

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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataCadastro", dataCadastro));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEstabelecimento", idEstabelecimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idUsuario", idUsuario));
    

    

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
        return (PagePromotorResponse) ApiInvoker.deserialize(response, "", PagePromotorResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the types of adjustments of the issuer
   * This resource allows to be listed the types of existing adjustments in the database of the issuer
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param id Identifier Code of type of adjust
   * @param descricao Description of the type of adjust
   * @param flagPagamentoLojista Identifies whether the payment was made in an establishment
   * @param flagSistema Identifies whether the ajust type was made by system
   * @return PageTipoAjusteResponse
   */
  public PageTipoAjusteResponse  listar_18 (List<String> sort, Integer page, Integer limit, Long id, String descricao, Boolean flagPagamentoLojista, Integer flagSistema) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/tipos-ajustes".replaceAll("\\{format\\}","json");

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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagPagamentoLojista", flagPagamentoLojista));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagSistema", flagSistema));
    

    

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
        return (PageTipoAjusteResponse) ApiInvoker.deserialize(response, "", PageTipoAjusteResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the options of Types of Addresses of the Issuer
   * This method allows to be listed the Types of existing Addresses in the database of the Issuer
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param id Identification Code of Type of the Address (id)
   * @param nome Name of Type of the Address
   * @return PageTipoEnderecoResponse
   */
  public PageTipoEnderecoResponse  listar_19 (List<String> sort, Integer page, Integer limit, Long id, String nome) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/tipos-enderecos".replaceAll("\\{format\\}","json");

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
        return (PageTipoEnderecoResponse) ApiInvoker.deserialize(response, "", PageTipoEnderecoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the Types of Telephones
   * This method allows to be listed the Types of Telephones in the database of the Issuer
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param id Identification Code of the Telephone Type (id)
   * @param nome Telephone type name
   * @return PageTipoTelefoneResponse
   */
  public PageTipoTelefoneResponse  listar_20 (List<String> sort, Integer page, Integer limit, Long id, String nome) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/tipos-telefones".replaceAll("\\{format\\}","json");

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
        return (PageTipoTelefoneResponse) ApiInvoker.deserialize(response, "", PageTipoTelefoneResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List Expiration
   * This resource allows to ve listed the expirations of the issuer
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param dataVencimento Indicates the date of expiration of the invoices
   * @param dataVencimentoFim finished Date for query
   * @return PageControleVencimentoResponse
   */
  public PageControleVencimentoResponse  listar_21 (List<String> sort, Integer page, Integer limit, String dataVencimento, String dataVencimentoFim) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/vencimentos".replaceAll("\\{format\\}","json");

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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataVencimentoFim", dataVencimentoFim));
    

    

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
        return (PageControleVencimentoResponse) ApiInvoker.deserialize(response, "", PageControleVencimentoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Create a new Attendance of Generic type for a new Account
   * This Method allows register a new generic attendances for a Account
   * @param idConta Identification Code of the Account which the Attendance is associated
   * @param conteudoAtendimento Attendance content
   * @param detalhesAtendimento Show the details launched by the system or by the Attendant during the attendance
   * @param nomeAtendente Apresenta o nome do Atendente que registrou o Atendimento
   * @param dataAtendimento Show the date and time which the attendance was made in the format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;
   * @param dataAgendamento When it is used, according to the Attendance type, show the date and time to processing or the date and time to return the attendance in the format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;
   * @param dataHoraInicioAtendimento Show the date and time which the attendance was begun, it serves to measure the performance of the Attendants in the format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;
   * @param dataHoraFimAtendimento Show the date and time which the attendance was finished. When it is used, it serves to measure the performance of the attendances in the format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;
   * @param flagFilaFraude Flag line fraud
   * @return AtendimentoClienteResponse
   */
  public AtendimentoClienteResponse  salvar (Long idConta, String conteudoAtendimento, String detalhesAtendimento, String nomeAtendente, String dataAtendimento, String dataAgendamento, String dataHoraInicioAtendimento, String dataHoraFimAtendimento, Integer flagFilaFraude) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/atendimento-clientes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "conteudoAtendimento", conteudoAtendimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "detalhesAtendimento", detalhesAtendimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeAtendente", nomeAtendente));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataAtendimento", dataAtendimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataAgendamento", dataAgendamento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataHoraInicioAtendimento", dataHoraInicioAtendimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataHoraFimAtendimento", dataHoraFimAtendimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagFilaFraude", flagFilaFraude));
    

    

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
        return (AtendimentoClienteResponse) ApiInvoker.deserialize(response, "", AtendimentoClienteResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Insert campaign
   * This method allows to be created a new campaign
   * @param campanhaPersist campanhaPersist
   * @return CampanhaResponse
   */
  public CampanhaResponse  salvar_22 (CampanhaPersist campanhaPersist) throws ApiException {
    Object postBody = campanhaPersist;
    
    // verify the required parameter 'campanhaPersist' is set
    if (campanhaPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'campanhaPersist' when calling salvar_22");
    }
    

    // create path and map variables
    String path = "/api/campanhas".replaceAll("\\{format\\}","json");

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
        return (CampanhaResponse) ApiInvoker.deserialize(response, "", CampanhaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Insert the configuration dates of a revolving of the product
   * This method allows to be registred a new configuration of the revolving for a determined product
   * @param configuracaoRotativoPersist configuracaoRotativoPersist
   * @return ConfiguracaoRotativoDetalheResponse
   */
  public ConfiguracaoRotativoDetalheResponse  salvar_23 (ConfiguracaoRotativoPersist configuracaoRotativoPersist) throws ApiException {
    Object postBody = configuracaoRotativoPersist;
    
    // verify the required parameter 'configuracaoRotativoPersist' is set
    if (configuracaoRotativoPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'configuracaoRotativoPersist' when calling salvar_23");
    }
    

    // create path and map variables
    String path = "/api/configuracoes-rotativos".replaceAll("\\{format\\}","json");

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
        return (ConfiguracaoRotativoDetalheResponse) ApiInvoker.deserialize(response, "", ConfiguracaoRotativoDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
