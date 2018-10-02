package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.EstagioCartaoResponse;
import br.com.conductor.pier.api.v2.model.StatusCartaoResponse;
import br.com.conductor.pier.api.v2.model.StatusContaResponse;
import br.com.conductor.pier.api.v2.model.StatusImpressaoResponse;
import br.com.conductor.pier.api.v2.model.PageEstagioCartaoResponse;
import br.com.conductor.pier.api.v2.model.PageStatusCartaoResponse;
import br.com.conductor.pier.api.v2.model.PageStatusContaResponse;
import br.com.conductor.pier.api.v2.model.PageStatusImpressaoResponse;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class GlobaltagstatusparametroApi {
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
   * {{{estagio_cartao_resource_consultar_estagio_cartao}}}
   * {{{estagio_cartao_resource_consultar_estagio_cartao_notes}}}
   * @param id {{{estagio_cartao_resource_consultar_estagio_cartao_param_id}}}
   * @return EstagioCartaoResponse
   */
  public EstagioCartaoResponse  consultarEstagioCartaoUsingGET (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarEstagioCartaoUsingGET");
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
   * {{{status_cartao_resource_consultar_status_cartao}}}
   * {{{status_cartao_resource_consultar_status_cartao_notes}}}
   * @param id {{{status_cartao_resource_consultar_status_cartao_param_id}}}
   * @return StatusCartaoResponse
   */
  public StatusCartaoResponse  consultarStatusCartaoUsingGET (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarStatusCartaoUsingGET");
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
   * {{{status_conta_resource_consultar}}}
   * {{{status_conta_resource_consultar_notes}}}
   * @param id {{{status_conta_resource_consultar_param_id}}}
   * @return StatusContaResponse
   */
  public StatusContaResponse  consultarUsingGET32 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET32");
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
   * {{{status_impressao_resource_consultar}}}
   * {{{status_impressao_resource_consultar_notes}}}
   * @param id {{{status_impressao_resource_consultar_param_id}}}
   * @return StatusImpressaoResponse
   */
  public StatusImpressaoResponse  consultarUsingGET33 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET33");
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
   * {{{estagio_cartao_resource_listar_estagios_cartoes}}}
   * {{{estagio_cartao_resource_listar_estagios_cartoes_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param id {{{estagio_cartao_request_id_value}}}
   * @param nome {{{estagio_cartao_request_nome_value}}}
   * @return PageEstagioCartaoResponse
   */
  public PageEstagioCartaoResponse  listarEstagiosCartoesUsingGET (List<String> sort, Integer page, Integer limit, Long id, String nome) throws ApiException {
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
   * {{{status_cartao_resource_listar_status_cartoes}}}
   * {{{status_cartao_resource_listar_status_cartoes_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param id {{{status_cartao_request_id_value}}}
   * @param nome {{{status_cartao_request_nome_value}}}
   * @param permiteDesbloquear {{{status_cartao_request_permite_desbloquear_value}}}
   * @param permiteAtribuirComoBloqueio {{{status_cartao_request_permite_atribuir_como_bloqueio_value}}}
   * @param permiteAtribuirComoCancelamento {{{status_cartao_request_permite_atribuir_como_cancelamento_value}}}
   * @param cobrarTarifaAoEmitirNovaVia {{{status_cartao_request_cobrar_tarifa_ao_emitir_nova_via_value}}}
   * @return PageStatusCartaoResponse
   */
  public PageStatusCartaoResponse  listarStatusCartoesUsingGET (List<String> sort, Integer page, Integer limit, Long id, String nome, Integer permiteDesbloquear, Integer permiteAtribuirComoBloqueio, Integer permiteAtribuirComoCancelamento, Integer cobrarTarifaAoEmitirNovaVia) throws ApiException {
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
   * {{{status_conta_resource_listar}}}
   * {{{status_conta_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param id {{{status_conta_request_id_value}}}
   * @param nome {{{status_conta_request_nome_value}}}
   * @param permiteAlterarVencimento {{{status_conta_request_permite_alterar_vencimento_value}}}
   * @param permiteAlterarLimite {{{status_conta_request_permite_alterar_limite_value}}}
   * @param permiteEmitirNovaViaCartao {{{status_conta_request_permite_emitir_nova_via_cartao_value}}}
   * @param permiteFazerTransferencia {{{status_conta_request_permite_fazer_transferencia_value}}}
   * @param permiteReceberTransferencia {{{status_conta_request_permite_receber_transferencia_value}}}
   * @param permiteCriarAcordoCobranca {{{status_conta_request_permite_criar_acordo_cobranca_value}}}
   * @param permiteAtribuirComoBloqueio {{{status_conta_request_permite_atribuir_como_bloqueio_value}}}
   * @param permiteDesbloquear {{{status_conta_request_permite_desbloquear_value}}}
   * @param permiteAtribuirComoCancelamento {{{status_conta_request_permite_atribuir_como_cancelamento_value}}}
   * @return PageStatusContaResponse
   */
  public PageStatusContaResponse  listarUsingGET41 (List<String> sort, Integer page, Integer limit, Long id, String nome, Integer permiteAlterarVencimento, Integer permiteAlterarLimite, Integer permiteEmitirNovaViaCartao, Integer permiteFazerTransferencia, Integer permiteReceberTransferencia, Integer permiteCriarAcordoCobranca, Integer permiteAtribuirComoBloqueio, Integer permiteDesbloquear, Integer permiteAtribuirComoCancelamento) throws ApiException {
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
   * {{{status_impressao_resource_listar}}}
   * {{{status_impressao_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param id {{{status_impressao_request_id_value}}}
   * @param nome {{{status_impressao_request_nome_value}}}
   * @return PageStatusImpressaoResponse
   */
  public PageStatusImpressaoResponse  listarUsingGET42 (List<String> sort, Integer page, Integer limit, Long id, String nome) throws ApiException {
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
