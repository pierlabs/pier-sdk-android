package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.TaxaJurosContaPersistValue;
import br.com.conductor.pier.api.v2.model.TaxaJurosContaResponse;
import br.com.conductor.pier.api.v2.model.ContaBancariaPortadorUpdateValue;
import br.com.conductor.pier.api.v2.model.ContaBancariaPortadorResponse;
import br.com.conductor.pier.api.v2.model.TransferenciaCreditoContaBancariaResponse;
import br.com.conductor.pier.api.v2.model.TransferenciaBancariaResponse;
import br.com.conductor.pier.api.v2.model.PageTransferenciaCreditoContaBancariaResponse;
import br.com.conductor.pier.api.v2.model.PageContaBancariaPortadorResponse;
import br.com.conductor.pier.api.v2.model.PageTransferenciaBancariaResponse;
import br.com.conductor.pier.api.v2.model.ContaBancariaPortadorPersistValue;
import br.com.conductor.pier.api.v2.model.PlanoParcelamentoTransferenciaCreditoContaBancariaRequest;
import br.com.conductor.pier.api.v2.model.PlanoParcelamentoTransferenciaCreditoContaBancariaResponse;
import br.com.conductor.pier.api.v2.model.TransferenciaCreditoContaBancariaPersistValue;
import br.com.conductor.pier.api.v2.model.TransferenciaBancariaPersistValue;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class GlobaltagtransferenciabancariaApi {
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
   * {{{transferencia_bancaria_resource_atualizar_taxas_juros_contas}}}
   * {{{transferencia_bancaria_resource_atualizar_taxas_juros_contas_notes}}}
   * @param id {{{transferencia_bancaria_resource_salvar_taxas_juros_contas_param_id}}}
   * @param update update
   * @return TaxaJurosContaResponse
   */
  public TaxaJurosContaResponse  atualizarTaxasJurosContasUsingPUT (Long id, TaxaJurosContaPersistValue update) throws ApiException {
    Object postBody = update;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarTaxasJurosContasUsingPUT");
    }
    
    // verify the required parameter 'update' is set
    if (update == null) {
       throw new ApiException(400, "Missing the required parameter 'update' when calling atualizarTaxasJurosContasUsingPUT");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/taxas-transferencias".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (TaxaJurosContaResponse) ApiInvoker.deserialize(response, "", TaxaJurosContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{conta_bancaria_resource_atualizar}}}
   * {{{conta_bancaria_resource_atualizar_notes}}}
   * @param id {{{conta_bancaria_resource_atualizar_param_id}}}
   * @param update update
   * @return ContaBancariaPortadorResponse
   */
  public ContaBancariaPortadorResponse  atualizarUsingPUT (Long id, ContaBancariaPortadorUpdateValue update) throws ApiException {
    Object postBody = update;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarUsingPUT");
    }
    
    // verify the required parameter 'update' is set
    if (update == null) {
       throw new ApiException(400, "Missing the required parameter 'update' when calling atualizarUsingPUT");
    }
    

    // create path and map variables
    String path = "/api/contas-bancarias-portador/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (ContaBancariaPortadorResponse) ApiInvoker.deserialize(response, "", ContaBancariaPortadorResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{transferencia_bancaria_resource_cancelar_transferencia_credito_conta_bancaria}}}
   * {{{transferencia_bancaria_resource_cancelar_transferencia_credito_conta_bancaria_notes}}}
   * @param idTransferencia {{{transferencia_bancaria_resource_cancelar_transferencia_credito_conta_bancaria_param_id_transferencia}}}
   * @return String
   */
  public String  cancelarTransferenciaCreditoContaBancariaUsingPOST (Long idTransferencia) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idTransferencia' is set
    if (idTransferencia == null) {
       throw new ApiException(400, "Missing the required parameter 'idTransferencia' when calling cancelarTransferenciaCreditoContaBancariaUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/transferencias-creditos-contas-bancarias/{idTransferencia}/cancelar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idTransferencia" + "\\}", apiInvoker.escapeString(idTransferencia.toString()));

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
   * {{{transferencia_bancaria_resource_confirmar_transferencia_credito_conta_bancaria}}}
   * {{{transferencia_bancaria_resource_confirmar_transferencia_credito_conta_bancaria_notes}}}
   * @param idTransferencia {{{transferencia_bancaria_resource_confirmar_transferencia_credito_conta_bancaria_param_id_transferencia}}}
   * @return String
   */
  public String  confirmarTransferenciaCreditoContaBancariaUsingPOST (Long idTransferencia) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idTransferencia' is set
    if (idTransferencia == null) {
       throw new ApiException(400, "Missing the required parameter 'idTransferencia' when calling confirmarTransferenciaCreditoContaBancariaUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/transferencias-creditos-contas-bancarias/{idTransferencia}/confirmar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idTransferencia" + "\\}", apiInvoker.escapeString(idTransferencia.toString()));

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
   * {{{transferencia_bancaria_resource_consultar_taxas_juros_contas}}}
   * {{{transferencia_bancaria_resource_consultar_taxas_juros_contas_notes}}}
   * @param id {{{transferencia_bancaria_resource_salvar_taxas_juros_contas_param_id}}}
   * @param numeroMesesCarencia numeroMesesCarencia
   * @return TaxaJurosContaResponse
   */
  public TaxaJurosContaResponse  consultarTaxasJurosContasUsingGET (Long id, Integer numeroMesesCarencia) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTaxasJurosContasUsingGET");
    }
    
    // verify the required parameter 'numeroMesesCarencia' is set
    if (numeroMesesCarencia == null) {
       throw new ApiException(400, "Missing the required parameter 'numeroMesesCarencia' when calling consultarTaxasJurosContasUsingGET");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/taxas-transferencias".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroMesesCarencia", numeroMesesCarencia));
    

    

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
        return (TaxaJurosContaResponse) ApiInvoker.deserialize(response, "", TaxaJurosContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{transferencia_bancaria_resource_consultar_transferencia_bancaria}}}
   * {{{transferencia_bancaria_resource_consultar_transferencia_bancaria_notes}}}
   * @param idTransferencia {{{transferencia_bancaria_resource_consultar_transferencia_bancaria_param_id_transferencia}}}
   * @return TransferenciaCreditoContaBancariaResponse
   */
  public TransferenciaCreditoContaBancariaResponse  consultarTransferenciaBancariaUsingGET (Long idTransferencia) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idTransferencia' is set
    if (idTransferencia == null) {
       throw new ApiException(400, "Missing the required parameter 'idTransferencia' when calling consultarTransferenciaBancariaUsingGET");
    }
    

    // create path and map variables
    String path = "/api/transferencias-creditos-contas-bancarias/{idTransferencia}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idTransferencia" + "\\}", apiInvoker.escapeString(idTransferencia.toString()));

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
        return (TransferenciaCreditoContaBancariaResponse) ApiInvoker.deserialize(response, "", TransferenciaCreditoContaBancariaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{conta_bancaria_resource_consultar}}}
   * {{{conta_bancaria_resource_consultar_notes}}}
   * @param id {{{conta_bancaria_resource_consultar_param_id}}}
   * @return ContaBancariaPortadorResponse
   */
  public ContaBancariaPortadorResponse  consultarUsingGET11 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET11");
    }
    

    // create path and map variables
    String path = "/api/contas-bancarias-portador/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (ContaBancariaPortadorResponse) ApiInvoker.deserialize(response, "", ContaBancariaPortadorResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{transferencia_bancaria_resource_consultar}}}
   * {{{transferencia_bancaria_resource_consultar_notes}}}
   * @param id {{{transferencia_bancaria_resource_consultar_param_id}}}
   * @param idTransferencia {{{transferencia_bancaria_resource_consultar_param_id_evento}}}
   * @param idContaBancariaDestino {{{transferencia_bancaria_resource_consultar_param_id_conta_portador}}}
   * @return TransferenciaBancariaResponse
   */
  public TransferenciaBancariaResponse  consultarUsingGET48 (Long id, Long idTransferencia, Long idContaBancariaDestino) throws ApiException {
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
    String path = "/api/contas/{id}/transferencias-creditos-contas-bancarias/{id_transferencia}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "id_transferencia" + "\\}", apiInvoker.escapeString(idTransferencia.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id_conta_bancaria_destino", idContaBancariaDestino));
    

    

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
        return (TransferenciaBancariaResponse) ApiInvoker.deserialize(response, "", TransferenciaBancariaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{transferencia_bancaria_resource_listar_transferencia_bancaria}}}
   * {{{transferencia_bancaria_resource_listar_transferencia_bancaria_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idConta {{{transferencia_credito_conta_bancaria_request_id_conta_value}}}
   * @param dataSolicitacaoInicial {{{transferencia_credito_conta_bancaria_request_data_solicitacao_inicial_value}}}
   * @param dataSolicitacaoFinal {{{transferencia_credito_conta_bancaria_request_data_solicitacao_final_value}}}
   * @param status {{{transferencia_credito_conta_bancaria_request_status_value}}}
   * @return PageTransferenciaCreditoContaBancariaResponse
   */
  public PageTransferenciaCreditoContaBancariaResponse  listarTransferenciaBancariaUsingGET (List<String> sort, Integer page, Integer limit, Long idConta, String dataSolicitacaoInicial, String dataSolicitacaoFinal, Integer status) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/transferencias-creditos-contas-bancarias".replaceAll("\\{format\\}","json");

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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataSolicitacaoInicial", dataSolicitacaoInicial));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataSolicitacaoFinal", dataSolicitacaoFinal));
    
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
        return (PageTransferenciaCreditoContaBancariaResponse) ApiInvoker.deserialize(response, "", PageTransferenciaCreditoContaBancariaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{conta_bancaria_resource_listar}}}
   * {{{conta_bancaria_resource_listar_notes}}}
   * @param idConta {{{conta_bancaria_portador_listar_request_id_conta_value}}}
   * @param nomeAgencia {{{conta_bancaria_portador_listar_request_nome_agencia_value}}}
   * @param banco {{{conta_bancaria_portador_listar_request_codigo_banco_value}}}
   * @param numeroAgencia {{{conta_bancaria_portador_listar_request_numero_agencia_value}}}
   * @param numeroConta {{{conta_bancaria_portador_listar_request_numero_conta_value}}}
   * @param flagAtivo {{{conta_bancaria_portador_listar_request_flag_ativo_value}}}
   * @param flagContaOrigemDoc {{{conta_bancaria_portador_listar_request_flag_conta_origem_doc_value}}}
   * @param idPessoaFisica {{{conta_bancaria_portador_listar_request_id_pessoa_fisica_value}}}
   * @param favorecido {{{conta_bancaria_portador_listar_request_favorecido_value}}}
   * @param numeroReceiraFederal {{{conta_bancaria_portador_listar_request_numero_receira_federal_value}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return PageContaBancariaPortadorResponse
   */
  public PageContaBancariaPortadorResponse  listarUsingGET13 (Long idConta, String nomeAgencia, Long banco, String numeroAgencia, String numeroConta, Integer flagAtivo, Integer flagContaOrigemDoc, Long idPessoaFisica, String favorecido, String numeroReceiraFederal, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/contas-bancarias-portador".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeAgencia", nomeAgencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "banco", banco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroAgencia", numeroAgencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroConta", numeroConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagAtivo", flagAtivo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagContaOrigemDoc", flagContaOrigemDoc));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idPessoaFisica", idPessoaFisica));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "favorecido", favorecido));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroReceiraFederal", numeroReceiraFederal));
    
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
        return (PageContaBancariaPortadorResponse) ApiInvoker.deserialize(response, "", PageContaBancariaPortadorResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{transferencia_bancaria_resource_listar}}}
   * {{{transferencia_bancaria_resource_listar_notes}}}
   * @param id {{{transferencia_bancaria_resource_listar_param_id}}}
   * @param idContaBancariaDestino {{{transferencia_bancaria_resource_listar_param_id_conta_portador}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return PageTransferenciaBancariaResponse
   */
  public PageTransferenciaBancariaResponse  listarUsingGET57 (Long id, Long idContaBancariaDestino, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarUsingGET57");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/transferencias-creditos-contas-bancarias".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id_conta_bancaria_destino", idContaBancariaDestino));
    
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
        return (PageTransferenciaBancariaResponse) ApiInvoker.deserialize(response, "", PageTransferenciaBancariaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{transferencia_bancaria_resource_salvar_taxas_juros_contas}}}
   * {{{transferencia_bancaria_resource_salvar_taxas_juros_contas_notes}}}
   * @param id {{{transferencia_bancaria_resource_salvar_taxas_juros_contas_param_id}}}
   * @param persist persist
   * @return TaxaJurosContaResponse
   */
  public TaxaJurosContaResponse  salvarTaxasJurosContasUsingPOST (Long id, TaxaJurosContaPersistValue persist) throws ApiException {
    Object postBody = persist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling salvarTaxasJurosContasUsingPOST");
    }
    
    // verify the required parameter 'persist' is set
    if (persist == null) {
       throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarTaxasJurosContasUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/taxas-transferencias".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (TaxaJurosContaResponse) ApiInvoker.deserialize(response, "", TaxaJurosContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{conta_bancaria_resource_salvar}}}
   * {{{conta_bancaria_resource_salvar_notes}}}
   * @param persist persist
   * @return ContaBancariaPortadorResponse
   */
  public ContaBancariaPortadorResponse  salvarUsingPOST6 (ContaBancariaPortadorPersistValue persist) throws ApiException {
    Object postBody = persist;
    
    // verify the required parameter 'persist' is set
    if (persist == null) {
       throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarUsingPOST6");
    }
    

    // create path and map variables
    String path = "/api/contas-bancarias-portador".replaceAll("\\{format\\}","json");

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
        return (ContaBancariaPortadorResponse) ApiInvoker.deserialize(response, "", ContaBancariaPortadorResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{transferencia_bancaria_resource_simular_transferencia_bancaria}}}
   * {{{transferencia_bancaria_resource_simular_transferencia_bancaria_notes}}}
   * @param request request
   * @return PlanoParcelamentoTransferenciaCreditoContaBancariaResponse
   */
  public PlanoParcelamentoTransferenciaCreditoContaBancariaResponse  simularTransferenciaBancariaUsingPOST (PlanoParcelamentoTransferenciaCreditoContaBancariaRequest request) throws ApiException {
    Object postBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
       throw new ApiException(400, "Missing the required parameter 'request' when calling simularTransferenciaBancariaUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/simular-transferencias-creditos-contas-bancarias".replaceAll("\\{format\\}","json");

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
        return (PlanoParcelamentoTransferenciaCreditoContaBancariaResponse) ApiInvoker.deserialize(response, "", PlanoParcelamentoTransferenciaCreditoContaBancariaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{transferencia_bancaria_resource_transferencia_credito_conta_bancaria}}}
   * {{{transferencia_bancaria_resource_transferencia_credito_conta_bancaria_notes}}}
   * @param persist persist
   * @return TransferenciaCreditoContaBancariaResponse
   */
  public TransferenciaCreditoContaBancariaResponse  transferenciaCreditoContaBancariaUsingPOST (TransferenciaCreditoContaBancariaPersistValue persist) throws ApiException {
    Object postBody = persist;
    
    // verify the required parameter 'persist' is set
    if (persist == null) {
       throw new ApiException(400, "Missing the required parameter 'persist' when calling transferenciaCreditoContaBancariaUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/transferencias-creditos-contas-bancarias".replaceAll("\\{format\\}","json");

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
        return (TransferenciaCreditoContaBancariaResponse) ApiInvoker.deserialize(response, "", TransferenciaCreditoContaBancariaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{transferencia_bancaria_resource_transferir}}}
   * {{{transferencia_bancaria_resource_transferir_notes}}}
   * @param id {{{transferencia_bancaria_resource_transferir_param_id}}}
   * @param transferenciaBancariaPersist transferenciaBancariaPersist
   * @return TransferenciaBancariaResponse
   */
  public TransferenciaBancariaResponse  transferirUsingPOST (Long id, TransferenciaBancariaPersistValue transferenciaBancariaPersist) throws ApiException {
    Object postBody = transferenciaBancariaPersist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling transferirUsingPOST");
    }
    
    // verify the required parameter 'transferenciaBancariaPersist' is set
    if (transferenciaBancariaPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'transferenciaBancariaPersist' when calling transferirUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/transferencias-creditos-contas-bancarias".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (TransferenciaBancariaResponse) ApiInvoker.deserialize(response, "", TransferenciaBancariaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
