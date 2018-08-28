package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.CartaoResponse;
import br.com.conductor.pier.api.v2.model.EstagioCartaoUpdate;
import br.com.conductor.pier.api.v2.model.HistoricoImpressaoCartaoResponse;
import br.com.conductor.pier.api.v2.model.DadosCartaoImpressaoResponse;
import br.com.conductor.pier.api.v2.model.DadosCartaoResponse;
import br.com.conductor.pier.api.v2.model.LimiteDisponibilidadeResponse;
import br.com.conductor.pier.api.v2.model.LoteCartoesPrePagosResponse;
import br.com.conductor.pier.api.v2.model.PortadorResponse;
import br.com.conductor.pier.api.v2.model.CartaoDetalheResponse;
import br.com.conductor.pier.api.v2.model.VinculoCartoesResponse;
import br.com.conductor.pier.api.v2.model.CartaoMultiAppPersistValue;
import br.com.conductor.pier.api.v2.model.CartaoMultiAppImpressaoResponse;
import br.com.conductor.pier.api.v2.model.PageLoteCartoesPrePagosResponse;
import br.com.conductor.pier.api.v2.model.PageCartaoResponse;
import br.com.conductor.pier.api.v2.model.ValidaCVVRequest;
import br.com.conductor.pier.api.v2.model.ValidaCartaoResponse;
import br.com.conductor.pier.api.v2.model.ValidaSenhaCartaoResponse;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class GlobaltagcartaoApi {
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
   * {{{cartao_resource_alterar_alterar_senha}}}
   * {{{cartao_resource_alterar_alterar_senha_notes}}}
   * @param id {{{cartao_resource_alterar_alterar_senha_param_id}}}
   * @param senha {{{cartao_resource_alterar_alterar_senha_param_nova_senha}}}
   * @return String
   */
  public String  alterarAlterarSenhaUsingPUT (Long id, String senha) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarAlterarSenhaUsingPUT");
    }
    
    // verify the required parameter 'senha' is set
    if (senha == null) {
       throw new ApiException(400, "Missing the required parameter 'senha' when calling alterarAlterarSenhaUsingPUT");
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
   * {{{cartao_resource_alterar_estagio}}}
   * {{{cartao_resource_alterar_estagio_notes}}}
   * @param id {{{cartao_resource_alterar_estagio_param_id}}}
   * @param update {{{cartao_resource_alterar_estagio_param_id_estagio_cartao}}}
   * @return CartaoResponse
   */
  public CartaoResponse  alterarEstagioUsingPOST (Long id, EstagioCartaoUpdate update) throws ApiException {
    Object postBody = update;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarEstagioUsingPOST");
    }
    
    // verify the required parameter 'update' is set
    if (update == null) {
       throw new ApiException(400, "Missing the required parameter 'update' when calling alterarEstagioUsingPOST");
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
   * {{{cartao_resource_alterar_status_impressao}}}
   * {{{cartao_resource_alterar_status_impressao_notes}}}
   * @param id {{{cartao_resource_alterar_status_impressao_param_id}}}
   * @param idStatusImpressao {{{cartao_resource_alterar_status_impressao_param_id_status_impressao}}}
   * @return HistoricoImpressaoCartaoResponse
   */
  public HistoricoImpressaoCartaoResponse  alterarStatusImpressaoUsingPUT (Long id, Long idStatusImpressao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarStatusImpressaoUsingPUT");
    }
    
    // verify the required parameter 'idStatusImpressao' is set
    if (idStatusImpressao == null) {
       throw new ApiException(400, "Missing the required parameter 'idStatusImpressao' when calling alterarStatusImpressaoUsingPUT");
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
   * {{{cartao_resource_atribuir_pessoa}}}
   * {{{cartao_resource_atribuir_pessoa_notes}}}
   * @param id {{{cartao_resource_atribuir_pessoa_param_id_cartao}}}
   * @param idPessoa {{{cartao_resource_atribuir_pessoa_param_id_pessoa}}}
   * @return CartaoResponse
   */
  public CartaoResponse  atribuirPessoaUsingPUT (Long id, Long idPessoa) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling atribuirPessoaUsingPUT");
    }
    
    // verify the required parameter 'idPessoa' is set
    if (idPessoa == null) {
       throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling atribuirPessoaUsingPUT");
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
   * {{{cartao_resource_bloquear}}}
   * {{{cartao_resource_bloquear_notes}}}
   * @param id {{{cartao_resource_bloquear_param_id}}}
   * @param idStatus {{{cartao_resource_bloquear_param_id_status}}}
   * @param observacao {{{cartao_resource_bloquear_param_observacao}}}
   * @return CartaoResponse
   */
  public CartaoResponse  bloquearUsingPOST (Long id, Long idStatus, String observacao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling bloquearUsingPOST");
    }
    
    // verify the required parameter 'idStatus' is set
    if (idStatus == null) {
       throw new ApiException(400, "Missing the required parameter 'idStatus' when calling bloquearUsingPOST");
    }
    
    // verify the required parameter 'observacao' is set
    if (observacao == null) {
       throw new ApiException(400, "Missing the required parameter 'observacao' when calling bloquearUsingPOST");
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
   * {{{cartao_resource_cadastrar_alterar_senha}}}
   * {{{cartao_resource_cadastrar_alterar_senha_notes}}}
   * @param id {{{cartao_resource_cadastrar_alterar_senha_param_id}}}
   * @param senha {{{cartao_resource_cadastrar_alterar_senha_param_nova_senha}}}
   * @return String
   */
  public String  cadastrarAlterarSenhaUsingPOST (Long id, String senha) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling cadastrarAlterarSenhaUsingPOST");
    }
    
    // verify the required parameter 'senha' is set
    if (senha == null) {
       throw new ApiException(400, "Missing the required parameter 'senha' when calling cadastrarAlterarSenhaUsingPOST");
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
   * {{{cartao_resource_cancelar}}}
   * {{{cartao_resource_cancelar_notes}}}
   * @param id {{{cartao_resource_cancelar_param_id}}}
   * @param idStatus {{{cartao_resource_cancelar_param_id_status}}}
   * @param observacao {{{cartao_resource_cancelar_param_observacao}}}
   * @return CartaoResponse
   */
  public CartaoResponse  cancelarUsingPOST (Long id, Long idStatus, String observacao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling cancelarUsingPOST");
    }
    
    // verify the required parameter 'idStatus' is set
    if (idStatus == null) {
       throw new ApiException(400, "Missing the required parameter 'idStatus' when calling cancelarUsingPOST");
    }
    
    // verify the required parameter 'observacao' is set
    if (observacao == null) {
       throw new ApiException(400, "Missing the required parameter 'observacao' when calling cancelarUsingPOST");
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
   * {{{cartao_resource_consultar_cartao_impressao}}}
   * {{{cartao_resource_consultar_cartao_impressao_notes}}}
   * @param id {{{cartao_resource_consultar_cartao_impressao_param_id}}}
   * @return DadosCartaoImpressaoResponse
   */
  public DadosCartaoImpressaoResponse  consultarCartaoImpressaoUsingGET (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarCartaoImpressaoUsingGET");
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
   * {{{cartao_resource_consultar_dados_reais_cartao}}}
   * {{{cartao_resource_consultar_dados_reais_cartao_notes}}}
   * @param id id
   * @return DadosCartaoResponse
   */
  public DadosCartaoResponse  consultarDadosReaisCartaoUsingGET (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarDadosReaisCartaoUsingGET");
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
   * {{{cartao_resource_consultar_limite_disponibilidade}}}
   * {{{cartao_resource_consultar_limite_disponibilidade_notes}}}
   * @param id {{{cartao_resource_consultar_limite_disponibilidade_param_id}}}
   * @return LimiteDisponibilidadeResponse
   */
  public LimiteDisponibilidadeResponse  consultarLimiteDisponibilidadeUsingGET (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarLimiteDisponibilidadeUsingGET");
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
   * {{{cartao_resource_consultar_lotes_cartoes_pre_pagos}}}
   * {{{cartao_resource_consultar_lotes_cartoes_pre_pagos_notes}}}
   * @param id {{{cartao_resource_consultar_lotes_cartoes_pre_pagos_param_id_lote}}}
   * @return LoteCartoesPrePagosResponse
   */
  public LoteCartoesPrePagosResponse  consultarLotesCartoesPrePagosUsingGET (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarLotesCartoesPrePagosUsingGET");
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
   * {{{cartao_resource_consultar_portador}}}
   * {{{cartao_resource_consultar_portador_notes}}}
   * @param id {{{cartao_resource_consultar_portador_param_id}}}
   * @return PortadorResponse
   */
  public PortadorResponse  consultarPortadorUsingGET (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarPortadorUsingGET");
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
   * {{{cartao_resource_consultar}}}
   * {{{cartao_resource_consultar_notes}}}
   * @param id {{{cartao_resource_consultar_param_id}}}
   * @return CartaoDetalheResponse
   */
  public CartaoDetalheResponse  consultarUsingGET12 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET12");
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
   * {{{conta_resource_cadastrar_cartao_multiapp}}}
   * {{{conta_resource_cadastrar_cartao_multiapp_notes}}}
   * @param cartaoMultiAppPersist cartaoMultiAppPersist
   * @return VinculoCartoesResponse
   */
  public VinculoCartoesResponse  criarCartoesMultiAppUsingPOST (CartaoMultiAppPersistValue cartaoMultiAppPersist) throws ApiException {
    Object postBody = cartaoMultiAppPersist;
    
    // verify the required parameter 'cartaoMultiAppPersist' is set
    if (cartaoMultiAppPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'cartaoMultiAppPersist' when calling criarCartoesMultiAppUsingPOST");
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
   * {{{cartao_resource_desbloquear_senha_incorreta}}}
   * {{{cartao_resource_desbloquear_senha_incorreta_notes}}}
   * @param id {{{cartao_resource_desbloquear_senha_incorreta_param_id}}}
   * @return CartaoResponse
   */
  public CartaoResponse  desbloquearSenhaIncorretaUsingPOST (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling desbloquearSenhaIncorretaUsingPOST");
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
   * {{{cartao_resource_desbloquear}}}
   * {{{cartao_resource_desbloquear_notes}}}
   * @param id {{{cartao_resource_desbloquear_param_id}}}
   * @return CartaoResponse
   */
  public CartaoResponse  desbloquearUsingPOST (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling desbloquearUsingPOST");
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
   * {{{cartao_resource_gerar_lotes_cartoes_pre_pagos}}}
   * {{{cartao_resource_gerar_lotes_cartoes_pre_pagos_notes}}}
   * @param idOrigemComercial {{{lote_cartoes_pre_pagos_persist_id_origem_comercial_value}}}
   * @param idProduto {{{lote_cartoes_pre_pagos_persist_id_produto_value}}}
   * @param idTipoCartao {{{lote_cartoes_pre_pagos_persist_id_tipo_cartao_value}}}
   * @param idImagem {{{lote_cartoes_pre_pagos_persist_id_imagem_value}}}
   * @param idEndereco {{{lote_cartoes_pre_pagos_persist_id_endereco_value}}}
   * @param quantidadeCartoes {{{lote_cartoes_pre_pagos_persist_quantidade_cartoes_value}}}
   * @param identificadorExterno {{{lote_cartoes_pre_pagos_persist_identificador_externo_value}}}
   * @return LoteCartoesPrePagosResponse
   */
  public LoteCartoesPrePagosResponse  gerarLotesCartoesPrePagosUsingPOST (Long idOrigemComercial, Long idProduto, Long idTipoCartao, Long idImagem, Long idEndereco, Integer quantidadeCartoes, String identificadorExterno) throws ApiException {
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
   * {{{cartao_resource_gerar_nova_via_multiplo}}}
   * {{{cartao_resource_gerar_nova_via_multiplo_notes}}}
   * @param id {{{cartao_resource_gerar_nova_via_param_id_cartao}}}
   * @return CartaoMultiAppImpressaoResponse
   */
  public CartaoMultiAppImpressaoResponse  gerarNovaViaCartaoMultiAppUsingPOST (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling gerarNovaViaCartaoMultiAppUsingPOST");
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
   * {{{cartao_resource_gerar_nova_via}}}
   * {{{cartao_resource_gerar_nova_via_notes}}}
   * @param id {{{cartao_resource_gerar_nova_via_param_id_cartao}}}
   * @return CartaoResponse
   */
  public CartaoResponse  gerarNovaViaUsingPOST (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling gerarNovaViaUsingPOST");
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
   * {{{cartao_resource_lancar_tarifa_segunda_via}}}
   * {{{cartao_resource_lancar_tarifa_segunda_via_notes}}}
   * @param id {{{cartao_resource_lancar_tarifa_segunda_via_param_id}}}
   * @return Object
   */
  public Object  lancarTarifaSegundaViaUsingPOST (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling lancarTarifaSegundaViaUsingPOST");
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
   * {{{cartao_resource_listar_lotes_cartoes_pre_pagos}}}
   * {{{cartao_resource_listar_lotes_cartoes_pre_pagos_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idOrigemComercial {{{lote_cartoes_pre_pagos_request_id_origem_comercial_value}}}
   * @param idProduto {{{lote_cartoes_pre_pagos_request_id_produto_value}}}
   * @param idTipoCartao {{{lote_cartoes_pre_pagos_request_id_tipo_cartao_value}}}
   * @param idImagem {{{lote_cartoes_pre_pagos_request_id_imagem_value}}}
   * @param idEndereco {{{lote_cartoes_pre_pagos_request_id_endereco_value}}}
   * @param quantidadeCartoes {{{lote_cartoes_pre_pagos_request_quantidade_cartoes_value}}}
   * @param dataCadastro {{{lote_cartoes_pre_pagos_request_data_cadastro_value}}}
   * @param usuarioCadastro {{{lote_cartoes_pre_pagos_request_usuario_cadastro_value}}}
   * @param statusProcessamento {{{lote_cartoes_pre_pagos_request_status_processamento_value}}}
   * @param identificadorExterno {{{lote_cartoes_pre_pagos_request_identificador_externo_value}}}
   * @return PageLoteCartoesPrePagosResponse
   */
  public PageLoteCartoesPrePagosResponse  listarLotesCartoesPrePagosUsingGET (List<String> sort, Integer page, Integer limit, Long idOrigemComercial, Long idProduto, Long idTipoCartao, Long idImagem, Long idEndereco, Integer quantidadeCartoes, String dataCadastro, String usuarioCadastro, Integer statusProcessamento, String identificadorExterno) throws ApiException {
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
   * {{{cartao_resource_listar}}}
   * {{{cartao_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idStatusCartao {{{cartao_request_id_status_cartao_value}}}
   * @param idEstagioCartao {{{cartao_request_id_estagio_cartao_value}}}
   * @param idConta {{{cartao_request_id_conta_value}}}
   * @param idPessoa {{{cartao_request_id_pessoa_value}}}
   * @param idProduto {{{cartao_request_id_produto_value}}}
   * @param tipoPortador {{{cartao_request_tipo_portador_value}}}
   * @param numeroCartao {{{cartao_request_numero_cartao_value}}}
   * @param nomeImpresso {{{cartao_request_nome_impresso_value}}}
   * @param dataGeracao {{{cartao_request_data_geracao_value}}}
   * @param dataStatusCartao {{{cartao_request_data_status_cartao_value}}}
   * @param dataEstagioCartao {{{cartao_request_data_estagio_cartao_value}}}
   * @param dataValidade {{{cartao_request_data_validade_value}}}
   * @param dataImpressao {{{cartao_request_data_impressao_value}}}
   * @param arquivoImpressao {{{cartao_request_arquivo_impressao_value}}}
   * @param flagImpressaoOrigemComercial {{{cartao_request_flag_impressao_origem_comercial_value}}}
   * @param flagProvisorio {{{cartao_request_flag_provisorio_value}}}
   * @param codigoDesbloqueio {{{cartao_request_codigo_desbloqueio_value}}}
   * @param sequencialCartao {{{cartao_request_sequencial_cartao_value}}}
   * @param identificadorExterno {{{cartao_request_identificador_externo_value}}}
   * @return PageCartaoResponse
   */
  public PageCartaoResponse  listarUsingGET12 (List<String> sort, Integer page, Integer limit, Long idStatusCartao, Long idEstagioCartao, Long idConta, Long idPessoa, Long idProduto, String tipoPortador, String numeroCartao, String nomeImpresso, String dataGeracao, String dataStatusCartao, String dataEstagioCartao, String dataValidade, String dataImpressao, String arquivoImpressao, Integer flagImpressaoOrigemComercial, Integer flagProvisorio, String codigoDesbloqueio, Integer sequencialCartao, Long identificadorExterno) throws ApiException {
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
   * {{{cartao_resource_reativar}}}
   * {{{cartao_resource_reativar_notes}}}
   * @param id {{{cartao_resource_reativar_param_id}}}
   * @return CartaoResponse
   */
  public CartaoResponse  reativarUsingPOST (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling reativarUsingPOST");
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
   * {{{cartao_resource_validar_c_v_v}}}
   * {{{cartao_resource_validar_c_v_v_notes}}}
   * @param id {{{cartao_resource_validar_c_v_v_param_id}}}
   * @param validaCVV validaCVV
   * @return String
   */
  public String  validarCVVUsingPOST (Long id, ValidaCVVRequest validaCVV) throws ApiException {
    Object postBody = validaCVV;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling validarCVVUsingPOST");
    }
    
    // verify the required parameter 'validaCVV' is set
    if (validaCVV == null) {
       throw new ApiException(400, "Missing the required parameter 'validaCVV' when calling validarCVVUsingPOST");
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
   * {{{cartao_resource_validar_dados_impressos_bandeirado}}}
   * {{{cartao_resource_validar_dados_impressos_bandeirado_notes}}}
   * @param numeroCartao {{{cartao_resource_validar_dados_impressos_bandeirado_param_numero_cartao}}}
   * @param nomePortador {{{cartao_resource_validar_dados_impressos_bandeirado_param_nome_portador}}}
   * @param dataValidade {{{cartao_resource_validar_dados_impressos_bandeirado_param_data_validade}}}
   * @param codigoSeguranca {{{cartao_resource_validar_dados_impressos_bandeirado_param_codigo_seguranca}}}
   * @return ValidaCartaoResponse
   */
  public ValidaCartaoResponse  validarDadosImpressosBandeiradoUsingGET (String numeroCartao, String nomePortador, String dataValidade, String codigoSeguranca) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'numeroCartao' is set
    if (numeroCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'numeroCartao' when calling validarDadosImpressosBandeiradoUsingGET");
    }
    
    // verify the required parameter 'nomePortador' is set
    if (nomePortador == null) {
       throw new ApiException(400, "Missing the required parameter 'nomePortador' when calling validarDadosImpressosBandeiradoUsingGET");
    }
    
    // verify the required parameter 'dataValidade' is set
    if (dataValidade == null) {
       throw new ApiException(400, "Missing the required parameter 'dataValidade' when calling validarDadosImpressosBandeiradoUsingGET");
    }
    
    // verify the required parameter 'codigoSeguranca' is set
    if (codigoSeguranca == null) {
       throw new ApiException(400, "Missing the required parameter 'codigoSeguranca' when calling validarDadosImpressosBandeiradoUsingGET");
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
   * {{{cartao_resource_validar_dados_impressos_nao_bandeirado}}}
   * {{{cartao_resource_validar_dados_impressos_nao_bandeirado_notes}}}
   * @param numeroCartao {{{cartao_resource_validar_dados_impressos_nao_bandeirado_param_numero_cartao}}}
   * @param nomePortador {{{cartao_resource_validar_dados_impressos_nao_bandeirado_param_nome_portador}}}
   * @param dataValidade {{{cartao_resource_validar_dados_impressos_nao_bandeirado_param_data_validade}}}
   * @param codigoSeguranca {{{cartao_resource_validar_dados_impressos_nao_bandeirado_param_codigo_seguranca}}}
   * @return ValidaCartaoResponse
   */
  public ValidaCartaoResponse  validarDadosImpressosNaoBandeiradoUsingGET (String numeroCartao, String nomePortador, String dataValidade, String codigoSeguranca) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'numeroCartao' is set
    if (numeroCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'numeroCartao' when calling validarDadosImpressosNaoBandeiradoUsingGET");
    }
    
    // verify the required parameter 'nomePortador' is set
    if (nomePortador == null) {
       throw new ApiException(400, "Missing the required parameter 'nomePortador' when calling validarDadosImpressosNaoBandeiradoUsingGET");
    }
    
    // verify the required parameter 'dataValidade' is set
    if (dataValidade == null) {
       throw new ApiException(400, "Missing the required parameter 'dataValidade' when calling validarDadosImpressosNaoBandeiradoUsingGET");
    }
    
    // verify the required parameter 'codigoSeguranca' is set
    if (codigoSeguranca == null) {
       throw new ApiException(400, "Missing the required parameter 'codigoSeguranca' when calling validarDadosImpressosNaoBandeiradoUsingGET");
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
   * {{{cartao_resource_validar_de55_cartao_mastercard}}}
   * {{{cartao_resource_validar_de55_cartao_mastercard_notes}}}
   * @param numeroCartao {{{cartao_resource_validar_de55_cartao_mastercard_param_numero_cartao}}}
   * @param criptograma {{{cartao_resource_validar_de55_cartao_mastercard_param_criptograma}}}
   * @return ValidaCartaoResponse
   */
  public ValidaCartaoResponse  validarDe55CartaoMastercardUsingGET (String numeroCartao, String criptograma) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'numeroCartao' is set
    if (numeroCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'numeroCartao' when calling validarDe55CartaoMastercardUsingGET");
    }
    
    // verify the required parameter 'criptograma' is set
    if (criptograma == null) {
       throw new ApiException(400, "Missing the required parameter 'criptograma' when calling validarDe55CartaoMastercardUsingGET");
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
   * {{{cartao_resource_validar_senha}}}
   * {{{cartao_resource_validar_senha_notes}}}
   * @param id {{{cartao_resource_validar_senha_param_id}}}
   * @param senha {{{cartao_resource_validar_senha_param_senha}}}
   * @return ValidaSenhaCartaoResponse
   */
  public ValidaSenhaCartaoResponse  validarSenhaUsingGET (Long id, String senha) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling validarSenhaUsingGET");
    }
    
    // verify the required parameter 'senha' is set
    if (senha == null) {
       throw new ApiException(400, "Missing the required parameter 'senha' when calling validarSenhaUsingGET");
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
   * {{{cartao_resource_validar_tarja}}}
   * {{{cartao_resource_validar_tarja_notes}}}
   * @param numeroCartao {{{cartao_resource_validar_tarja_param_numero_cartao}}}
   * @param trilha1 {{{cartao_resource_validar_tarja_param_trilha1}}}
   * @param trilha2 {{{cartao_resource_validar_tarja_param_trilha2}}}
   * @return ValidaCartaoResponse
   */
  public ValidaCartaoResponse  validarTarjaUsingGET (String numeroCartao, String trilha1, String trilha2) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'numeroCartao' is set
    if (numeroCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'numeroCartao' when calling validarTarjaUsingGET");
    }
    
    // verify the required parameter 'trilha1' is set
    if (trilha1 == null) {
       throw new ApiException(400, "Missing the required parameter 'trilha1' when calling validarTarjaUsingGET");
    }
    
    // verify the required parameter 'trilha2' is set
    if (trilha2 == null) {
       throw new ApiException(400, "Missing the required parameter 'trilha2' when calling validarTarjaUsingGET");
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
