package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.ConvenioPersist;
import br.com.conductor.pier.api.v2.model.ConvenioResponse;
import br.com.conductor.pier.api.v2.model.ControleVencimentoResponse;
import br.com.conductor.pier.api.v2.model.VencimentoUpdate;
import br.com.conductor.pier.api.v2.model.TipoOperacaoParcialUpdate;
import br.com.conductor.pier.api.v2.model.TipoOperacaoResponse;
import br.com.conductor.pier.api.v2.model.CampanhaUpdateValue;
import br.com.conductor.pier.api.v2.model.CampanhaResponse;
import br.com.conductor.pier.api.v2.model.ConfiguracaoRegistroCobrancaPersist;
import br.com.conductor.pier.api.v2.model.ConfiguracaoRegistroCobrancaResponse;
import br.com.conductor.pier.api.v2.model.ConfiguracaoRotativoDetalheResponse;
import br.com.conductor.pier.api.v2.model.ConfiguracaoRotativoPersist;
import br.com.conductor.pier.api.v2.model.ParametroProdutoResponse;
import br.com.conductor.pier.api.v2.model.TaxaAntecipacaoRequest;
import br.com.conductor.pier.api.v2.model.PageProdutoPacoteTarifaResponse;
import br.com.conductor.pier.api.v2.model.ProdutoDetalhesResponse;
import br.com.conductor.pier.api.v2.model.TipoAjusteResponse;
import br.com.conductor.pier.api.v2.model.PageTipoBoletoResponse;
import br.com.conductor.pier.api.v2.model.TipoEnderecoResponse;
import br.com.conductor.pier.api.v2.model.TipoTelefoneResponse;
import br.com.conductor.pier.api.v2.model.AtendimentoClienteResponse;
import br.com.conductor.pier.api.v2.model.BancoResponse;
import br.com.conductor.pier.api.v2.model.PageCampanhaResponse;
import br.com.conductor.pier.api.v2.model.PageConvenioResponse;
import java.math.BigDecimal;
import br.com.conductor.pier.api.v2.model.PageCampoCodificadoDescricaoResponse;
import br.com.conductor.pier.api.v2.model.PageFantasiaBasicaResponse;
import br.com.conductor.pier.api.v2.model.PageTipoCampanhaResponse;
import br.com.conductor.pier.api.v2.model.PageConfiguracaoRotativoResponse;
import br.com.conductor.pier.api.v2.model.PagePortadorResponse;
import br.com.conductor.pier.api.v2.model.PageProdutoResponse;
import br.com.conductor.pier.api.v2.model.PagePromotorResponse;
import br.com.conductor.pier.api.v2.model.PageTipoAjusteResponse;
import br.com.conductor.pier.api.v2.model.PageTipoEnderecoResponse;
import br.com.conductor.pier.api.v2.model.PageTipoTelefoneResponse;
import br.com.conductor.pier.api.v2.model.PageAtendimentoClienteResponse;
import br.com.conductor.pier.api.v2.model.PageControleVencimentoResponse;
import br.com.conductor.pier.api.v2.model.PageBancoResponse;
import br.com.conductor.pier.api.v2.model.CampanhaPersist;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class GlobaltagcadastrogeralApi {
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
   * {{{convenio_resource_alterar_value}}}
   * {{{convenio_resource_alterar_notes}}}
   * @param id Id
   * @param convenioPersist convenioPersist
   * @return ConvenioResponse
   */
  public ConvenioResponse  alterarConvenioUsingPUT (Long id, ConvenioPersist convenioPersist) throws ApiException {
    Object postBody = convenioPersist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarConvenioUsingPUT");
    }
    
    // verify the required parameter 'convenioPersist' is set
    if (convenioPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'convenioPersist' when calling alterarConvenioUsingPUT");
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
   * {{{vencimento_resource_alterar}}}
   * {{{vencimento_resource_alterar_notes}}}
   * @param dataVencimento {{{fatura_resource_consultar_fatura_param_data_vencimento}}}
   * @param update update
   * @param login login
   * @return ControleVencimentoResponse
   */
  public ControleVencimentoResponse  alterarCorteUsingPUT (String dataVencimento, VencimentoUpdate update, String login) throws ApiException {
    Object postBody = update;
    
    // verify the required parameter 'dataVencimento' is set
    if (dataVencimento == null) {
       throw new ApiException(400, "Missing the required parameter 'dataVencimento' when calling alterarCorteUsingPUT");
    }
    
    // verify the required parameter 'update' is set
    if (update == null) {
       throw new ApiException(400, "Missing the required parameter 'update' when calling alterarCorteUsingPUT");
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
   * {{{tipo_operacao_resource_alterar}}}
   * {{{tipo_operacao_resource_alterar_notes}}}
   * @param id {{{tipo_operacao_resource_alterar_param_id}}}
   * @param tipoOperacaoParcialUpdate tipoOperacaoParcialUpdate
   * @return TipoOperacaoResponse
   */
  public TipoOperacaoResponse  alterarParcialUsingPATCH1 (Long id, TipoOperacaoParcialUpdate tipoOperacaoParcialUpdate) throws ApiException {
    Object postBody = tipoOperacaoParcialUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarParcialUsingPATCH1");
    }
    
    // verify the required parameter 'tipoOperacaoParcialUpdate' is set
    if (tipoOperacaoParcialUpdate == null) {
       throw new ApiException(400, "Missing the required parameter 'tipoOperacaoParcialUpdate' when calling alterarParcialUsingPATCH1");
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
   * {{{campanha_resource_alterar}}}
   * {{{campanha_resource_alterar_notes}}}
   * @param id {{{campanha_resource_alterar_param_id}}}
   * @param update update
   * @return CampanhaResponse
   */
  public CampanhaResponse  alterarUsingPUT1 (Long id, CampanhaUpdateValue update) throws ApiException {
    Object postBody = update;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT1");
    }
    
    // verify the required parameter 'update' is set
    if (update == null) {
       throw new ApiException(400, "Missing the required parameter 'update' when calling alterarUsingPUT1");
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
   * {{{configuracao_registro_cobranca_resource_alterar}}}
   * {{{configuracao_registro_cobranca_resource_alterar_notes}}}
   * @param id {{{configuracao_registro_cobranca_resource_alterar_param_id}}}
   * @param configuracaoPersist configuracaoPersist
   * @return ConfiguracaoRegistroCobrancaResponse
   */
  public ConfiguracaoRegistroCobrancaResponse  alterarUsingPUT2 (Long id, ConfiguracaoRegistroCobrancaPersist configuracaoPersist) throws ApiException {
    Object postBody = configuracaoPersist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT2");
    }
    
    // verify the required parameter 'configuracaoPersist' is set
    if (configuracaoPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'configuracaoPersist' when calling alterarUsingPUT2");
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
   * {{{configuracao_rotativo_resource_alterar}}}
   * {{{configuracao_rotativo_resource_alterar_notes}}}
   * @param id {{{configuracao_rotativo_resource_alterar_param_id}}}
   * @param configuracaoRotativoPersist configuracaoRotativoPersist
   * @return ConfiguracaoRotativoDetalheResponse
   */
  public ConfiguracaoRotativoDetalheResponse  alterarUsingPUT3 (Long id, ConfiguracaoRotativoPersist configuracaoRotativoPersist) throws ApiException {
    Object postBody = configuracaoRotativoPersist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT3");
    }
    
    // verify the required parameter 'configuracaoRotativoPersist' is set
    if (configuracaoRotativoPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'configuracaoRotativoPersist' when calling alterarUsingPUT3");
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
   * {{{convenio_resource_cadastrar_value}}}
   * {{{convenio_resource_cadastrar_notes}}}
   * @param convenioPersist convenioPersist
   * @return ConvenioResponse
   */
  public ConvenioResponse  cadastrarConvenioUsingPOST (ConvenioPersist convenioPersist) throws ApiException {
    Object postBody = convenioPersist;
    
    // verify the required parameter 'convenioPersist' is set
    if (convenioPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'convenioPersist' when calling cadastrarConvenioUsingPOST");
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
   * {{{configuracao_registro_cobranca_resource_cadastrar}}}
   * {{{configuracao_registro_cobranca_resource_cadastrar_notes}}}
   * @param configuracaoPersist configuracaoPersist
   * @return ConfiguracaoRegistroCobrancaResponse
   */
  public ConfiguracaoRegistroCobrancaResponse  cadastrarUsingPOST3 (ConfiguracaoRegistroCobrancaPersist configuracaoPersist) throws ApiException {
    Object postBody = configuracaoPersist;
    
    // verify the required parameter 'configuracaoPersist' is set
    if (configuracaoPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'configuracaoPersist' when calling cadastrarUsingPOST3");
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
   * {{{produto_resource_configurar_taxa_antecipacao}}}
   * {{{produto_resource_configurar_taxa_antecipacao_notes}}}
   * @param id {{{produto_resource_configurar_taxa_antecipacao_param_id}}}
   * @param taxaAntecipacaoRequest taxaAntecipacaoRequest
   * @return ParametroProdutoResponse
   */
  public ParametroProdutoResponse  configurarTaxaAntecipacaoUsingPOST (Long id, TaxaAntecipacaoRequest taxaAntecipacaoRequest) throws ApiException {
    Object postBody = taxaAntecipacaoRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling configurarTaxaAntecipacaoUsingPOST");
    }
    
    // verify the required parameter 'taxaAntecipacaoRequest' is set
    if (taxaAntecipacaoRequest == null) {
       throw new ApiException(400, "Missing the required parameter 'taxaAntecipacaoRequest' when calling configurarTaxaAntecipacaoUsingPOST");
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
   * {{{campanha_resource_consultar_campanha}}}
   * {{{campanha_resource_consultar_campanha_notes}}}
   * @param id {{{campanha_resource_consultar_campanha_param_id_campanha}}}
   * @return CampanhaResponse
   */
  public CampanhaResponse  consultarCampanhaUsingGET (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarCampanhaUsingGET");
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
   * {{{convenio_resource_consultar_value}}}
   * {{{convenio_resource_consultar_notes}}}
   * @param id Id
   * @return ConvenioResponse
   */
  public ConvenioResponse  consultarConvenioUsingGET (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarConvenioUsingGET");
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
   * {{{produto_resource_listar_produto_pacote_tarifa}}}
   * {{{produto_resource_listar_produto_pacote_tarifa_notes}}}
   * @param id {{{produto_resource_listar_produto_pacote_tarifa_param_id_produto}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return PageProdutoPacoteTarifaResponse
   */
  public PageProdutoPacoteTarifaResponse  consultarProdutoPacoteTarifaUsingGET (Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarProdutoPacoteTarifaUsingGET");
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
   * {{{produto_resource_consultar_taxa_antecipacao}}}
   * {{{produto_resource_consultar_taxa_antecipacao_notes}}}
   * @param id {{{produto_resource_consultar_taxa_antecipacao_param_id}}}
   * @param tipoTransacao {{{produto_resource_consultar_taxa_antecipacao_param_tipo_transacao}}}
   * @return ParametroProdutoResponse
   */
  public ParametroProdutoResponse  consultarTaxaAntecipacaoUsingGET (Long id, String tipoTransacao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTaxaAntecipacaoUsingGET");
    }
    
    // verify the required parameter 'tipoTransacao' is set
    if (tipoTransacao == null) {
       throw new ApiException(400, "Missing the required parameter 'tipoTransacao' when calling consultarTaxaAntecipacaoUsingGET");
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
   * {{{configuracao_rotativo_resource_consultar}}}
   * {{{configuracao_rotativo_resource_consultar_notes}}}
   * @param id {{{configuracao_rotativo_resource_consultar_param_id}}}
   * @return ConfiguracaoRotativoDetalheResponse
   */
  public ConfiguracaoRotativoDetalheResponse  consultarUsingGET10 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET10");
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
   * {{{produto_resource_consultar}}}
   * {{{produto_resource_consultar_notes}}}
   * @param id {{{produto_resource_consultar_param_id}}}
   * @return ProdutoDetalhesResponse
   */
  public ProdutoDetalhesResponse  consultarUsingGET32 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET32");
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
   * {{{tipo_transacoes_ajuste_resource_consultar}}}
   * {{{tipo_transacoes_ajuste_resource_consultar_notes}}}
   * @param id {{{tipo_transacoes_ajuste_resource_consultar_param_id}}}
   * @return TipoAjusteResponse
   */
  public TipoAjusteResponse  consultarUsingGET41 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET41");
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
   * {{{tipo_boleto_resource_consultar}}}
   * {{{tipo_boleto_resource_consultar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param id {{{tipo_boleto_request_id_value}}}
   * @param descricao {{{tipo_boleto_request_descricao_value}}}
   * @param banco {{{tipo_boleto_request_banco_value}}}
   * @return PageTipoBoletoResponse
   */
  public PageTipoBoletoResponse  consultarUsingGET42 (List<String> sort, Integer page, Integer limit, Long id, String descricao, Long banco) throws ApiException {
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
   * {{{tipo_endereco_resource_consultar}}}
   * {{{tipo_endereco_resource_consultar_notes}}}
   * @param id {{{tipo_endereco_resource_consultar_param_id}}}
   * @return TipoEnderecoResponse
   */
  public TipoEnderecoResponse  consultarUsingGET44 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET44");
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
   * {{{tipo_operacao_resource_consultar}}}
   * {{{tipo_operacao_resource_consultar_notes}}}
   * @param idCartao {{{tipo_operacao_resource_consultar_param_id_cartao}}}
   * @param idEstabelecimento {{{tipo_operacao_resource_consultar_param_id_estabelecimento}}}
   * @param codigoProcessamento {{{tipo_operacao_resource_consultar_param_codigo_processamento}}}
   * @return TipoOperacaoResponse
   */
  public TipoOperacaoResponse  consultarUsingGET45 (Long idCartao, Long idEstabelecimento, String codigoProcessamento) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idCartao' is set
    if (idCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'idCartao' when calling consultarUsingGET45");
    }
    
    // verify the required parameter 'idEstabelecimento' is set
    if (idEstabelecimento == null) {
       throw new ApiException(400, "Missing the required parameter 'idEstabelecimento' when calling consultarUsingGET45");
    }
    
    // verify the required parameter 'codigoProcessamento' is set
    if (codigoProcessamento == null) {
       throw new ApiException(400, "Missing the required parameter 'codigoProcessamento' when calling consultarUsingGET45");
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
   * {{{tipo_telefone_resource_consultar}}}
   * {{{tipo_telefone_resource_consultar_notes}}}
   * @param id {{{tipo_telefone_resource_consultar_param_id}}}
   * @return TipoTelefoneResponse
   */
  public TipoTelefoneResponse  consultarUsingGET47 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET47");
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
   * {{{atendimento_cliente_resource_consultar}}}
   * {{{atendimento_cliente_resource_consultar_notes}}}
   * @param id {{{atendimento_cliente_resource_consultar_param_id_atendimento}}}
   * @return AtendimentoClienteResponse
   */
  public AtendimentoClienteResponse  consultarUsingGET5 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET5");
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
   * {{{banco_resource_consultar}}}
   * {{{banco_resource_consultar_notes}}}
   * @param id {{{banco_resource_consultar_param_id}}}
   * @return BancoResponse
   */
  public BancoResponse  consultarUsingGET7 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET7");
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
   * {{{configuracao_registro_cobranca_resource_consultar}}}
   * {{{configuracao_registro_cobranca_resource_consultar_notes}}}
   * @param id {{{configuracao_registro_cobranca_resource_consultar_param_id}}}
   * @return ConfiguracaoRegistroCobrancaResponse
   */
  public ConfiguracaoRegistroCobrancaResponse  consultarUsingGET9 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET9");
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
   * {{{campanha_resource_listar_campanhas}}}
   * {{{campanha_resource_listar_campanhas_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idTipoCampanha {{{campanha_request_id_tipo_campanha_value}}}
   * @return PageCampanhaResponse
   */
  public PageCampanhaResponse  listarCampanhasUsingGET (List<String> sort, Integer page, Integer limit, Long idTipoCampanha) throws ApiException {
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
   * {{{convenio_resource_listar_value}}}
   * {{{convenio_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param banco {{{convenio_request_banco_value}}}
   * @param agencia {{{convenio_request_agencia_value}}}
   * @param contaCorrente {{{convenio_request_conta_corrente_value}}}
   * @param numeroConvenio {{{convenio_request_numero_convenio_value}}}
   * @return PageConvenioResponse
   */
  public PageConvenioResponse  listarConveniosUsingGET (List<String> sort, Integer page, Integer limit, Long banco, Long agencia, String contaCorrente, BigDecimal numeroConvenio) throws ApiException {
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
   * {{{campo_codificado_resource_listar_estados_civis}}}
   * {{{campo_codificado_resource_listar_estados_civis_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return PageCampoCodificadoDescricaoResponse
   */
  public PageCampoCodificadoDescricaoResponse  listarEstadosCivisUsingGET (List<String> sort, Integer page, Integer limit) throws ApiException {
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
   * {{{fantasia_basica_resource_listar_fantasias_basicas}}}
   * {{{fantasia_basica_resource_listar_fantasias_basicas_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return PageFantasiaBasicaResponse
   */
  public PageFantasiaBasicaResponse  listarFantasiasBasicasUsingGET (List<String> sort, Integer page, Integer limit) throws ApiException {
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
   * {{{campo_codificado_resource_listar_nacionalidades}}}
   * {{{campo_codificado_resource_listar_nacionalidades_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return PageCampoCodificadoDescricaoResponse
   */
  public PageCampoCodificadoDescricaoResponse  listarNacionalidadesUsingGET (List<String> sort, Integer page, Integer limit) throws ApiException {
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
   * {{{campo_codificado_resource_listar_naturezas_ocupacoes}}}
   * {{{campo_codificado_resource_listar_naturezas_ocupacoes_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return PageCampoCodificadoDescricaoResponse
   */
  public PageCampoCodificadoDescricaoResponse  listarNaturezasOcupacoesUsingGET (List<String> sort, Integer page, Integer limit) throws ApiException {
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
   * {{{campo_codificado_resource_listar_parentescos}}}
   * {{{campo_codificado_resource_listar_parentescos_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return PageCampoCodificadoDescricaoResponse
   */
  public PageCampoCodificadoDescricaoResponse  listarParentescosUsingGET (List<String> sort, Integer page, Integer limit) throws ApiException {
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
   * {{{campo_codificado_resource_listar_profissoes}}}
   * {{{campo_codificado_resource_listar_profissoes_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return PageCampoCodificadoDescricaoResponse
   */
  public PageCampoCodificadoDescricaoResponse  listarProfissoesUsingGET (List<String> sort, Integer page, Integer limit) throws ApiException {
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
   * {{{tipo_campanha_resource_listar_tipos_campanhas}}}
   * {{{tipo_campanha_resource_listar_tipos_campanhas_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return PageTipoCampanhaResponse
   */
  public PageTipoCampanhaResponse  listarTiposCampanhasUsingGET (List<String> sort, Integer page, Integer limit) throws ApiException {
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
   * {{{configuracao_registro_cobranca_resource_listar}}}
   * {{{configuracao_registro_cobranca_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return ConfiguracaoRegistroCobrancaResponse
   */
  public ConfiguracaoRegistroCobrancaResponse  listarUsingGET11 (List<String> sort, Integer page, Integer limit) throws ApiException {
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
   * {{{configuracao_rotativo_resource_listar}}}
   * {{{configuracao_rotativo_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idProduto {{{configuracao_rotativo_request_id_produto_value}}}
   * @return PageConfiguracaoRotativoResponse
   */
  public PageConfiguracaoRotativoResponse  listarUsingGET12 (List<String> sort, Integer page, Integer limit, Long idProduto) throws ApiException {
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
   * {{{portador_resource_listar}}}
   * {{{portador_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idConta {{{portador_request_id_conta_value}}}
   * @param idProduto {{{portador_request_id_produto_value}}}
   * @param idPessoa {{{portador_request_id_pessoa_value}}}
   * @param idParentesco {{{portador_request_id_parentesco_value}}}
   * @param tipoPortador {{{portador_request_tipo_portador_value}}}
   * @param nomeImpresso {{{portador_request_nome_impresso_value}}}
   * @param idTipoCartao {{{portador_request_id_tipo_cartao_value}}}
   * @param flagAtivo {{{portador_request_flag_ativo_value}}}
   * @param dataCadastroPortador {{{portador_request_data_cadastro_portador_value}}}
   * @param dataCancelamentoPortador {{{portador_request_data_cancelamento_portador_value}}}
   * @return PagePortadorResponse
   */
  public PagePortadorResponse  listarUsingGET37 (List<String> sort, Integer page, Integer limit, Long idConta, Long idProduto, Long idPessoa, Long idParentesco, String tipoPortador, String nomeImpresso, Long idTipoCartao, Integer flagAtivo, String dataCadastroPortador, String dataCancelamentoPortador) throws ApiException {
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
   * {{{produto_resource_listar}}}
   * {{{produto_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param nome {{{produto_request_nome_value}}}
   * @param status {{{produto_request_status_value}}}
   * @param idFantasiaBasica {{{produto_request_id_fantasia_basica_value}}}
   * @return PageProdutoResponse
   */
  public PageProdutoResponse  listarUsingGET38 (List<String> sort, Integer page, Integer limit, String nome, Integer status, Long idFantasiaBasica) throws ApiException {
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
   * {{{promotor_resource_listar}}}
   * {{{promotor_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param id {{{promotor_request_id_value}}}
   * @param nome {{{promotor_request_nome_value}}}
   * @param dataCadastro {{{promotor_request_data_cadastro_value}}}
   * @param idEstabelecimento {{{promotor_request_id_estabelecimento_value}}}
   * @param idUsuario {{{promotor_request_id_usuario_value}}}
   * @return PagePromotorResponse
   */
  public PagePromotorResponse  listarUsingGET39 (List<String> sort, Integer page, Integer limit, Long id, String nome, String dataCadastro, Long idEstabelecimento, Long idUsuario) throws ApiException {
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
   * {{{tipo_ajuste_resource_consultar}}}
   * {{{tipo_ajuste_resource_consultar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param id {{{tipo_ajuste_request_id_value}}}
   * @param descricao {{{tipo_ajuste_request_descricao_value}}}
   * @param flagPagamentoLojista {{{tipo_ajuste_request_flag_pagamento_lojista_value}}}
   * @param flagSistema {{{tipo_ajuste_request_flag_sistema_value}}}
   * @return PageTipoAjusteResponse
   */
  public PageTipoAjusteResponse  listarUsingGET50 (List<String> sort, Integer page, Integer limit, Long id, String descricao, Boolean flagPagamentoLojista, Integer flagSistema) throws ApiException {
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
   * {{{tipo_endereco_resource_listar}}}
   * {{{tipo_endereco_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param id {{{tipo_endereco_request_id_value}}}
   * @param nome {{{tipo_endereco_request_nome_value}}}
   * @return PageTipoEnderecoResponse
   */
  public PageTipoEnderecoResponse  listarUsingGET53 (List<String> sort, Integer page, Integer limit, Long id, String nome) throws ApiException {
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
   * {{{tipo_telefone_resource_listar}}}
   * {{{tipo_telefone_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param id {{{tipo_telefone_request_id_value}}}
   * @param nome {{{tipo_telefone_request_nome_value}}}
   * @return PageTipoTelefoneResponse
   */
  public PageTipoTelefoneResponse  listarUsingGET55 (List<String> sort, Integer page, Integer limit, Long id, String nome) throws ApiException {
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
   * {{{atendimento_cliente_resource_listar}}}
   * {{{atendimento_cliente_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idTipoAtendimento {{{atendimento_cliente_request_id_tipo_atendimento_value}}}
   * @param idConta {{{atendimento_cliente_request_id_conta_value}}}
   * @param nomeAtendente {{{atendimento_cliente_request_nome_atendente_value}}}
   * @param dataAtendimento {{{atendimento_cliente_request_data_atendimento_value}}}
   * @return PageAtendimentoClienteResponse
   */
  public PageAtendimentoClienteResponse  listarUsingGET6 (List<String> sort, Integer page, Integer limit, Long idTipoAtendimento, Long idConta, String nomeAtendente, String dataAtendimento) throws ApiException {
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
   * {{{vencimento_resource_listar}}}
   * {{{vencimento_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param dataVencimento {{{controle_vencimento_request_data_vencimento_value}}}
   * @param dataVencimentoFim {{{calendario_fatura_request_data_fim_value}}}
   * @return PageControleVencimentoResponse
   */
  public PageControleVencimentoResponse  listarUsingGET61 (List<String> sort, Integer page, Integer limit, String dataVencimento, String dataVencimentoFim) throws ApiException {
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
   * {{{banco_resource_listar}}}
   * {{{banco_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return PageBancoResponse
   */
  public PageBancoResponse  listarUsingGET8 (List<String> sort, Integer page, Integer limit) throws ApiException {
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
   * {{{atendimento_cliente_resource_salvar}}}
   * {{{atendimento_cliente_resource_salvar_notes}}}
   * @param idConta {{{atendimento_cliente_persist_id_conta_value}}}
   * @param conteudoAtendimento {{{atendimento_cliente_persist_conteudo_atendimento_value}}}
   * @param detalhesAtendimento {{{atendimento_cliente_persist_detalhes_atendimento_value}}}
   * @param nomeAtendente {{{atendimento_cliente_persist_nome_atendente_value}}}
   * @param dataAtendimento {{{atendimento_cliente_persist_data_atendimento_value}}}
   * @param dataAgendamento {{{atendimento_cliente_persist_data_agendamento_value}}}
   * @param dataHoraInicioAtendimento {{{atendimento_cliente_persist_data_hora_inicio_atendimento_value}}}
   * @param dataHoraFimAtendimento {{{atendimento_cliente_persist_data_hora_fim_atendimento_value}}}
   * @param flagFilaFraude {{{atendimento_cliente_persist_flag_fila_fraude_value}}}
   * @return AtendimentoClienteResponse
   */
  public AtendimentoClienteResponse  salvarUsingPOST2 (Long idConta, String conteudoAtendimento, String detalhesAtendimento, String nomeAtendente, String dataAtendimento, String dataAgendamento, String dataHoraInicioAtendimento, String dataHoraFimAtendimento, Integer flagFilaFraude) throws ApiException {
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
   * {{{campanha_resource_salvar}}}
   * {{{campanha_resource_salvar_notes}}}
   * @param campanhaPersist campanhaPersist
   * @return CampanhaResponse
   */
  public CampanhaResponse  salvarUsingPOST4 (CampanhaPersist campanhaPersist) throws ApiException {
    Object postBody = campanhaPersist;
    
    // verify the required parameter 'campanhaPersist' is set
    if (campanhaPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'campanhaPersist' when calling salvarUsingPOST4");
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
   * {{{configuracao_rotativo_resource_salvar}}}
   * {{{configuracao_rotativo_resource_salvar_notes}}}
   * @param configuracaoRotativoPersist configuracaoRotativoPersist
   * @return ConfiguracaoRotativoDetalheResponse
   */
  public ConfiguracaoRotativoDetalheResponse  salvarUsingPOST5 (ConfiguracaoRotativoPersist configuracaoRotativoPersist) throws ApiException {
    Object postBody = configuracaoRotativoPersist;
    
    // verify the required parameter 'configuracaoRotativoPersist' is set
    if (configuracaoRotativoPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'configuracaoRotativoPersist' when calling salvarUsingPOST5");
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
