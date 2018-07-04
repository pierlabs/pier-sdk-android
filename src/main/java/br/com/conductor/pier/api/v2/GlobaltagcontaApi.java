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
import br.com.conductor.pier.api.v2.model.BeneficioPagamentoAtrasoResponse;
import br.com.conductor.pier.api.v2.model.BoletoResponse;
import br.com.conductor.pier.api.v2.model.DividaClienteResponse;
import br.com.conductor.pier.api.v2.model.PageTaxasRefinanciamentoResponse;
import br.com.conductor.pier.api.v2.model.ContaDetalheResponse;
import br.com.conductor.pier.api.v2.model.TransferenciaDetalheResponse;
import br.com.conductor.pier.api.v2.model.CartaoEmbossingResponse;
import br.com.conductor.pier.api.v2.model.CartaoEmbossingRequest;
import br.com.conductor.pier.api.v2.model.CartaoImpressaoProvisorioResponse;
import br.com.conductor.pier.api.v2.model.CartaoImpressaoResponse;
import br.com.conductor.pier.api.v2.model.PageHistoricoEventosResponse;
import br.com.conductor.pier.api.v2.model.PageHistoricoAssessoriaResponse;
import br.com.conductor.pier.api.v2.model.PageHistoricoAtrasoFaturaResponse;
import br.com.conductor.pier.api.v2.model.PageTransacaoNaoProcessadaResponse;
import br.com.conductor.pier.api.v2.model.PageTransacoesCorrentesResponse;
import br.com.conductor.pier.api.v2.model.PageContaResponse;
import br.com.conductor.pier.api.v2.model.PageTransacaoProcessadaNaoProcessadaResponse;
import br.com.conductor.pier.api.v2.model.PageTransferenciaResponse;
import br.com.conductor.pier.api.v2.model.ContaPersistValue;
import br.com.conductor.pier.api.v2.model.EmprestimoPessoalRequest;
import br.com.conductor.pier.api.v2.model.EmprestimoPessoalResponse;
import br.com.conductor.pier.api.v2.model.PageTransacaoResponse;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;


public class GlobaltagcontaApi {
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
   * {{{conta_resource_ajustar_conta}}}
   * {{{conta_resource_ajustar_conta_notes}}}
   * @param id {{{conta_resource_ajustar_conta_param_id}}}
   * @param idTipoAjuste {{{ajuste_persist_id_tipo_ajuste_value}}}
   * @param dataAjuste {{{ajuste_persist_data_ajuste_value}}}
   * @param valorAjuste {{{ajuste_persist_valor_ajuste_value}}}
   * @param authorization Authorization
   * @param identificadorExterno {{{ajuste_persist_identificador_externo_value}}}
   * @param idTransacaoOriginal {{{ajuste_persist_id_transacao_original}}}
   * @return AjusteFinanceiroResponse
   */
  public AjusteFinanceiroResponse  ajustarContaUsingPOST1 (Long id, Long idTipoAjuste, String dataAjuste, BigDecimal valorAjuste, String authorization, String identificadorExterno, Long idTransacaoOriginal) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling ajustarContaUsingPOST1");
    }
    
    // verify the required parameter 'idTipoAjuste' is set
    if (idTipoAjuste == null) {
       throw new ApiException(400, "Missing the required parameter 'idTipoAjuste' when calling ajustarContaUsingPOST1");
    }
    
    // verify the required parameter 'dataAjuste' is set
    if (dataAjuste == null) {
       throw new ApiException(400, "Missing the required parameter 'dataAjuste' when calling ajustarContaUsingPOST1");
    }
    
    // verify the required parameter 'valorAjuste' is set
    if (valorAjuste == null) {
       throw new ApiException(400, "Missing the required parameter 'valorAjuste' when calling ajustarContaUsingPOST1");
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
    

    
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    

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
   * {{{conta_resource_alterar_produto}}}
   * {{{conta_resource_alterar_produto_notes}}}
   * @param id {{{conta_resource_alterar_produto_param_id}}}
   * @param request request
   * @param authorization Authorization
   * @return String
   */
  public String  alterarProdutoUsingPOST (Long id, AlterarProdutoRequest request, String authorization) throws ApiException {
    Object postBody = request;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarProdutoUsingPOST");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
       throw new ApiException(400, "Missing the required parameter 'request' when calling alterarProdutoUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/alterar-produto".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    

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
   * {{{conta_resource_alterar_titular}}}
   * {{{conta_resource_alterar_titular_notes}}}
   * @param id {{{conta_resource_alterar_titular_param_id_conta}}}
   * @param idPessoa {{{conta_resource_alterar_titular_param_id_pessoa}}}
   * @param authorization Authorization
   * @return ContaResponse
   */
  public ContaResponse  alterarTitularUsingPOST (Long id, Long idPessoa, String authorization) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarTitularUsingPOST");
    }
    
    // verify the required parameter 'idPessoa' is set
    if (idPessoa == null) {
       throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling alterarTitularUsingPOST");
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
    

    
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    

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
   * {{{conta_resource_alterar_vencimento}}}
   * {{{conta_resource_alterar_vencimento_notes}}}
   * @param id {{{conta_resource_alterar_vencimento_param_id}}}
   * @param novoDiaVencimento {{{conta_resource_alterar_vencimento_param_novo_dia_vencimento}}}
   * @param authorization Authorization
   * @return ContaResponse
   */
  public ContaResponse  alterarVencimentoUsingPUT (Long id, Integer novoDiaVencimento, String authorization) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarVencimentoUsingPUT");
    }
    
    // verify the required parameter 'novoDiaVencimento' is set
    if (novoDiaVencimento == null) {
       throw new ApiException(400, "Missing the required parameter 'novoDiaVencimento' when calling alterarVencimentoUsingPUT");
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
    

    
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    

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
   * {{{conta_resource_ativar_anuidade}}}
   * {{{conta_resource_ativar_anuidade_notes}}}
   * @param id {{{conta_resource_ativar_anuidade_param_id}}}
   * @param idAnuidade {{{anuidade_request_id_anuidade_value}}}
   * @param authorization Authorization
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param DDD {{{anuidade_request_d_d_d_value}}}
   * @param celular {{{anuidade_request_celular_value}}}
   * @param idOperadora {{{anuidade_request_id_operadora_value}}}
   * @param idOrigemComercial {{{anuidade_request_id_origem_comercial_value}}}
   * @return Object
   */
  public Object  ativarAnuidadeUsingPOST (Long id, Long idAnuidade, String authorization, List<String> sort, Integer page, Integer limit, String DDD, String celular, Long idOperadora, Long idOrigemComercial) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling ativarAnuidadeUsingPOST");
    }
    
    // verify the required parameter 'idAnuidade' is set
    if (idAnuidade == null) {
       throw new ApiException(400, "Missing the required parameter 'idAnuidade' when calling ativarAnuidadeUsingPOST");
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
    

    
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    

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
   * {{{conta_resource_ativar_envio_fatura_email}}}
   * {{{conta_resource_ativar_envio_fatura_email_notes}}}
   * @param id {{{conta_resource_ativar_envio_fatura_email_param_id}}}
   * @param authorization Authorization
   * @return Object
   */
  public Object  ativarEnvioFaturaEmailUsingPOST (Long id, String authorization) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling ativarEnvioFaturaEmailUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/ativar-fatura-email".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    

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
   * {{{conta_resource_bloquear}}}
   * {{{conta_resource_bloquear_notes}}}
   * @param id {{{conta_resource_bloquear_param_id}}}
   * @param idStatus {{{conta_resource_bloquear_param_id_status}}}
   * @param authorization Authorization
   * @return ContaResponse
   */
  public ContaResponse  bloquearUsingPOST1 (Long id, Long idStatus, String authorization) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling bloquearUsingPOST1");
    }
    
    // verify the required parameter 'idStatus' is set
    if (idStatus == null) {
       throw new ApiException(400, "Missing the required parameter 'idStatus' when calling bloquearUsingPOST1");
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
    

    
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    

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
   * {{{conta_resource_cancelar}}}
   * {{{conta_resource_cancelar_notes}}}
   * @param id {{{conta_resource_cancelar_param_id}}}
   * @param idStatus {{{conta_resource_cancelar_param_id_status}}}
   * @param authorization Authorization
   * @return ContaResponse
   */
  public ContaResponse  cancelarUsingPOST1 (Long id, Long idStatus, String authorization) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling cancelarUsingPOST1");
    }
    
    // verify the required parameter 'idStatus' is set
    if (idStatus == null) {
       throw new ApiException(400, "Missing the required parameter 'idStatus' when calling cancelarUsingPOST1");
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
    

    
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    

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
   * {{{conta_resource_consultar_beneficio_pagamento_atraso}}}
   * {{{conta_resource_consultar_beneficio_pagamento_atraso_notes}}}
   * @param id {{{conta_resource_consultar_beneficio_pagamento_atraso_param_id}}}
   * @param authorization Authorization
   * @return BeneficioPagamentoAtrasoResponse
   */
  public BeneficioPagamentoAtrasoResponse  consultarBeneficioPagamentoAtrasoUsingGET (Long id, String authorization) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarBeneficioPagamentoAtrasoUsingGET");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/consultar-beneficio-pagamento-atraso".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    

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
   * {{{conta_resource_consultar_boleto_emitido}}}
   * {{{conta_resource_consultar_boleto_emitido_notes}}}
   * @param id {{{conta_resource_consultar_boleto_emitido_param_id}}}
   * @param authorization Authorization
   * @return BoletoResponse
   */
  public BoletoResponse  consultarBoletoEmitidoUsingGET (Long id, String authorization) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarBoletoEmitidoUsingGET");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/consultar-dados-pagamento-fatura".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    

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
   * {{{conta_resource_consultar_divida_atualizada_cliente}}}
   * {{{conta_resource_consultar_divida_atualizada_cliente_notes}}}
   * @param id {{{conta_resource_consultar_divida_atualizada_cliente_param_id}}}
   * @param authorization Authorization
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param dataVencimento {{{divida_cliente_request_data_vencimento_value}}}
   * @param idEscritorioCobranca {{{divida_cliente_request_id_escritorio_cobranca_value}}}
   * @return DividaClienteResponse
   */
  public DividaClienteResponse  consultarDividaAtualizadaClienteUsingGET (Long id, String authorization, List<String> sort, Integer page, Integer limit, String dataVencimento, Long idEscritorioCobranca) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarDividaAtualizadaClienteUsingGET");
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
    

    
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    

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
   * {{{conta_resource_consultar_taxas_tarifas}}}
   * {{{conta_resource_consultar_taxas_tarifas_notes}}}
   * @param id {{{conta_resource_consultar_taxas_tarifas_param_id_conta}}}
   * @param authorization Authorization
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return PageTaxasRefinanciamentoResponse
   */
  public PageTaxasRefinanciamentoResponse  consultarTaxasTarifasUsingGET (Long id, String authorization, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTaxasTarifasUsingGET");
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
    

    
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    

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
   * {{{conta_resource_consultar}}}
   * {{{conta_resource_consultar_notes}}}
   * @param id {{{conta_resource_consultar_param_id}}}
   * @param authorization Authorization
   * @return ContaDetalheResponse
   */
  public ContaDetalheResponse  consultarUsingGET13 (Long id, String authorization) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET13");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    

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
   * {{{transferencia_resource_consultar}}}
   * {{{transferencia_resource_consultar_notes}}}
   * @param id {{{transferencia_resource_consultar_param_id_conta}}}
   * @param idTransferencia {{{transferencia_resource_consultar_param_id_transferencia}}}
   * @return TransferenciaDetalheResponse
   */
  public TransferenciaDetalheResponse  consultarUsingGET48 (Long id, Long idTransferencia) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET48");
    }
    
    // verify the required parameter 'idTransferencia' is set
    if (idTransferencia == null) {
       throw new ApiException(400, "Missing the required parameter 'idTransferencia' when calling consultarUsingGET48");
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
   * {{{conta_resource_desativar_envio_fatura_email}}}
   * {{{conta_resource_desativar_envio_fatura_email_notes}}}
   * @param id {{{conta_resource_desativar_envio_fatura_email_param_id}}}
   * @param authorization Authorization
   * @return Object
   */
  public Object  desativarEnvioFaturaEmailUsingPOST (Long id, String authorization) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling desativarEnvioFaturaEmailUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/desativar-fatura-email".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    

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
   * {{{conta_resource_gerar_boleto_recarga}}}
   * {{{conta_resource_gerar_boleto_recarga_notes}}}
   * @param id {{{conta_resource_gerar_boleto_recarga_param_id}}}
   * @param valor {{{boleto_recarga_request_valor_value}}}
   * @param dataVencimento {{{boleto_recarga_request_data_vencimento_value}}}
   * @param authorization Authorization
   * @return BoletoResponse
   */
  public BoletoResponse  gerarBoletoRecargaUsingPOST (Long id, BigDecimal valor, String dataVencimento, String authorization) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling gerarBoletoRecargaUsingPOST");
    }
    
    // verify the required parameter 'valor' is set
    if (valor == null) {
       throw new ApiException(400, "Missing the required parameter 'valor' when calling gerarBoletoRecargaUsingPOST");
    }
    
    // verify the required parameter 'dataVencimento' is set
    if (dataVencimento == null) {
       throw new ApiException(400, "Missing the required parameter 'dataVencimento' when calling gerarBoletoRecargaUsingPOST");
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
    

    
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    

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
   * {{{conta_resource_gerar_cartao_embossing}}}
   * {{{conta_resource_gerar_cartao_embossing_notes}}}
   * @param id {{{conta_resource_gerar_cartao_embossing_param_id}}}
   * @param cartaoEmbossingRequest cartaoEmbossingRequest
   * @param authorization Authorization
   * @return CartaoEmbossingResponse
   */
  public CartaoEmbossingResponse  gerarCartaoEmbossingUsingPOST (Long id, CartaoEmbossingRequest cartaoEmbossingRequest, String authorization) throws ApiException {
    Object postBody = cartaoEmbossingRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling gerarCartaoEmbossingUsingPOST");
    }
    
    // verify the required parameter 'cartaoEmbossingRequest' is set
    if (cartaoEmbossingRequest == null) {
       throw new ApiException(400, "Missing the required parameter 'cartaoEmbossingRequest' when calling gerarCartaoEmbossingUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/gerar-cartao-grafica".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    

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
   * {{{conta_resource_gerar_cartao_provisorio}}}
   * {{{conta_resource_gerar_cartao_provisorio_notes}}}
   * @param id {{{conta_resource_gerar_cartao_provisorio_param_id_conta}}}
   * @param authorization Authorization
   * @return CartaoImpressaoProvisorioResponse
   */
  public CartaoImpressaoProvisorioResponse  gerarCartaoProvisorioUsingPOST (Long id, String authorization) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling gerarCartaoProvisorioUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/gerar-cartao-provisorio".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    

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
   * {{{conta_resource_gerar_cartao}}}
   * {{{conta_resource_gerar_cartao_notes}}}
   * @param id {{{conta_resource_gerar_cartao_param_id}}}
   * @param idPessoa {{{conta_resource_gerar_cartao_param_id_pessoa}}}
   * @param authorization Authorization
   * @param idTipoPlastico {{{conta_resource_gerar_cartao_param_id_tipo_plastico}}}
   * @return CartaoImpressaoResponse
   */
  public CartaoImpressaoResponse  gerarCartaoUsingPOST (Long id, Long idPessoa, String authorization, Long idTipoPlastico) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling gerarCartaoUsingPOST");
    }
    
    // verify the required parameter 'idPessoa' is set
    if (idPessoa == null) {
       throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling gerarCartaoUsingPOST");
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
    

    
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    

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
   * {{{conta_resource_gerar_cartao_virtual}}}
   * {{{conta_resource_gerar_cartao_virtual_notes}}}
   * @param id {{{conta_resource_gerar_cartao_virtual_param_id}}}
   * @param dataValidade {{{conta_resource_gerar_cartao_virtual_param_data_validade}}}
   * @param authorization Authorization
   * @return CartaoImpressaoResponse
   */
  public CartaoImpressaoResponse  gerarCartaoVirtualUsingPOST (Long id, String dataValidade, String authorization) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling gerarCartaoVirtualUsingPOST");
    }
    
    // verify the required parameter 'dataValidade' is set
    if (dataValidade == null) {
       throw new ApiException(400, "Missing the required parameter 'dataValidade' when calling gerarCartaoVirtualUsingPOST");
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
    

    
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    

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
   * {{{conta_resource_listar_historico_alteracoes_limites}}}
   * {{{conta_resource_listar_historico_alteracoes_limites_notes}}}
   * @param id {{{conta_resource_listar_historico_alteracoes_limites_param_id}}}
   * @param authorization Authorization
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return PageHistoricoEventosResponse
   */
  public PageHistoricoEventosResponse  listarHistoricoAlteracoesLimitesUsingGET (Long id, String authorization, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarHistoricoAlteracoesLimitesUsingGET");
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
    

    
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    

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
   * {{{conta_resource_listar_historico_assessoria}}}
   * {{{conta_resource_listar_historico_assessoria_notes}}}
   * @param id {{{conta_resource_listar_historico_assessoria_param_id}}}
   * @param authorization Authorization
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return PageHistoricoAssessoriaResponse
   */
  public PageHistoricoAssessoriaResponse  listarHistoricoAssessoriaUsingGET (Long id, String authorization, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarHistoricoAssessoriaUsingGET");
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
    

    
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    

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
   * {{{conta_resource_listar_historico_atrasos_faturas}}}
   * {{{conta_resource_listar_historico_atrasos_faturas_notes}}}
   * @param id {{{conta_resource_listar_historico_atrasos_faturas_param_id}}}
   * @param authorization Authorization
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return PageHistoricoAtrasoFaturaResponse
   */
  public PageHistoricoAtrasoFaturaResponse  listarHistoricoAtrasosFaturasUsingGET (Long id, String authorization, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarHistoricoAtrasosFaturasUsingGET");
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
    

    
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    

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
   * {{{transacoes_correntes_resource_listar_nao_processadas}}}
   * {{{transacoes_correntes_resource_listar_nao_processadas_notes}}}
   * @param id {{{transacoes_correntes_resource_listar_nao_processadas_param_id}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param dataInicio {{{transacoes_nao_processadas_request_data_inicio_value}}}
   * @param dataFim {{{transacoes_nao_processadas_request_data_fim_value}}}
   * @return PageTransacaoNaoProcessadaResponse
   */
  public PageTransacaoNaoProcessadaResponse  listarNaoProcessadasUsingGET (Long id, List<String> sort, Integer page, Integer limit, String dataInicio, String dataFim) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarNaoProcessadasUsingGET");
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
   * {{{transacoes_correntes_resource_listar_processadas}}}
   * {{{transacoes_correntes_resource_listar_processadas_notes}}}
   * @param id {{{transacoes_correntes_resource_listar_processadas_param_id}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param dataVencimento {{{transacoes_processadas_request_data_vencimento_value}}}
   * @param dataInicio {{{transacoes_processadas_request_data_inicio_value}}}
   * @param dataFim {{{transacoes_processadas_request_data_fim_value}}}
   * @param idTipoTransacao {{{transacoes_processadas_request_tipo_transacao}}}
   * @return PageTransacoesCorrentesResponse
   */
  public PageTransacoesCorrentesResponse  listarProcessadasUsingGET (Long id, List<String> sort, Integer page, Integer limit, String dataVencimento, String dataInicio, String dataFim, Long idTipoTransacao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarProcessadasUsingGET");
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
   * {{{conta_resource_listar}}}
   * {{{conta_resource_listar_notes}}}
   * @param authorization Authorization
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idProduto {{{conta_request_id_produto_value}}}
   * @param idOrigemComercial {{{conta_request_id_origem_comercial_value}}}
   * @param idPessoa {{{conta_request_id_pessoa_value}}}
   * @param idStatusConta {{{conta_request_id_status_conta_value}}}
   * @param diaVencimento {{{conta_request_dia_vencimento_value}}}
   * @param melhorDiaCompra {{{conta_request_melhor_dia_compra_value}}}
   * @param dataStatusConta {{{conta_request_data_status_conta_value}}}
   * @param dataCadastro {{{conta_request_data_cadastro_value}}}
   * @param dataUltimaAlteracaoVencimento {{{conta_request_data_ultima_alteracao_vencimento_value}}}
   * @return PageContaResponse
   */
  public PageContaResponse  listarUsingGET18 (String authorization, List<String> sort, Integer page, Integer limit, Long idProduto, Long idOrigemComercial, Long idPessoa, Long idStatusConta, Integer diaVencimento, Integer melhorDiaCompra, String dataStatusConta, String dataCadastro, String dataUltimaAlteracaoVencimento) throws ApiException {
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
    

    
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    

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
   * {{{transacoes_correntes_resource_listar_nao_processadas_e_processadas}}}
   * {{{transacoes_correntes_resource_listar_nao_processadas_e_processadas_notes}}}
   * @param id {{{transacoes_correntes_resource_listar_nao_processadas_param_id}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param dataVencimento {{{transacoes_processadas_request_data_vencimento_value}}}
   * @param dataInicio {{{transacoes_processadas_request_data_inicio_value}}}
   * @param dataFim {{{transacoes_processadas_request_data_fim_value}}}
   * @param idTipoTransacao {{{transacoes_processadas_request_tipo_transacao}}}
   * @return PageTransacaoProcessadaNaoProcessadaResponse
   */
  public PageTransacaoProcessadaNaoProcessadaResponse  listarUsingGET58 (Long id, List<String> sort, Integer page, Integer limit, String dataVencimento, String dataInicio, String dataFim, Long idTipoTransacao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarUsingGET58");
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
   * {{{transferencia_resource_listar}}}
   * {{{transferencia_resource_listar_notes}}}
   * @param id {{{transferencia_resource_listar_param_id}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idTransferencia {{{transferencia_request_id_transferencia_value}}}
   * @param idContaOrigem {{{transferencia_request_id_conta_origem_value}}}
   * @param idContaDestino {{{transferencia_request_id_conta_destino_value}}}
   * @param valorTransferencia {{{transferencia_request_valor_transferencia_value}}}
   * @param dataTransferencia {{{transferencia_request_data_transferencia_value}}}
   * @return PageTransferenciaResponse
   */
  public PageTransferenciaResponse  listarUsingGET60 (Long id, List<String> sort, Integer page, Integer limit, Long idTransferencia, Long idContaOrigem, Long idContaDestino, BigDecimal valorTransferencia, String dataTransferencia) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarUsingGET60");
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
   * {{{conta_resource_reativar}}}
   * {{{conta_resource_reativar_notes}}}
   * @param id {{{conta_resource_reativar_param_id}}}
   * @param authorization Authorization
   * @return Object
   */
  public Object  reativarUsingPOST1 (Long id, String authorization) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling reativarUsingPOST1");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/reativar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    

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
   * {{{conta_resource_salvar}}}
   * {{{conta_resource_salvar_notes}}}
   * @param contaPersist contaPersist
   * @param authorization Authorization
   * @return ContaResponse
   */
  public ContaResponse  salvarUsingPOST8 (ContaPersistValue contaPersist, String authorization) throws ApiException {
    Object postBody = contaPersist;
    
    // verify the required parameter 'contaPersist' is set
    if (contaPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'contaPersist' when calling salvarUsingPOST8");
    }
    

    // create path and map variables
    String path = "/api/contas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    

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
   * {{{financiamento_resource_simular_emprestimo_financiamento}}}
   * {{{financiamento_resource_simular_emprestimo_financiamento_notes}}}
   * @param id {{{financiamento_resource_simular_emprestimo_financiamento_param_id_conta}}}
   * @param request request
   * @return EmprestimoPessoalResponse
   */
  public EmprestimoPessoalResponse  simularEmprestimoFinanciamentoUsingPOST (Long id, EmprestimoPessoalRequest request) throws ApiException {
    Object postBody = request;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling simularEmprestimoFinanciamentoUsingPOST");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
       throw new ApiException(400, "Missing the required parameter 'request' when calling simularEmprestimoFinanciamentoUsingPOST");
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
   * {{{conta_resource_transacoes}}}
   * {{{conta_resource_transacoes_notes}}}
   * @param id {{{conta_resource_transacoes_param_id}}}
   * @param authorization Authorization
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return PageTransacaoResponse
   */
  public PageTransacaoResponse  transacoesUsingGET (Long id, String authorization, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling transacoesUsingGET");
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
    

    
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    

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
   * {{{transferencia_resource_transferir}}}
   * {{{transferencia_resource_transferir_notes}}}
   * @param id {{{transferencia_resource_transferir_param_id_conta_origem}}}
   * @param idContaDestino {{{transferencia_resource_transferir_param_id_conta_destino}}}
   * @param valorTransferencia {{{transferencia_resource_transferir_param_valor_transferencia}}}
   * @return TransferenciaDetalheResponse
   */
  public TransferenciaDetalheResponse  transferirUsingPOST1 (Long id, Long idContaDestino, BigDecimal valorTransferencia) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling transferirUsingPOST1");
    }
    
    // verify the required parameter 'idContaDestino' is set
    if (idContaDestino == null) {
       throw new ApiException(400, "Missing the required parameter 'idContaDestino' when calling transferirUsingPOST1");
    }
    
    // verify the required parameter 'valorTransferencia' is set
    if (valorTransferencia == null) {
       throw new ApiException(400, "Missing the required parameter 'valorTransferencia' when calling transferirUsingPOST1");
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

