package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.ContaBancariaPortadorUpdate;
import br.com.conductor.pier.api.v2.model.ContaBancariaPortadorResponse;
import br.com.conductor.pier.api.v2.model.TransferenciaCreditoContaBancariaResponse;
import br.com.conductor.pier.api.v2.model.TransferenciaBancariaResponse;
import br.com.conductor.pier.api.v2.model.PageTransferenciaCreditoContaBancariaResponse;
import br.com.conductor.pier.api.v2.model.PageContaBancariaPortadorResponse;
import br.com.conductor.pier.api.v2.model.PageTransferenciaBancariaResponse;
import br.com.conductor.pier.api.v2.model.ContaBancariaPortadorPersist;
import br.com.conductor.pier.api.v2.model.PlanoParcelamentoTransferenciaCreditoContaBancariaRequest;
import br.com.conductor.pier.api.v2.model.PlanoParcelamentoTransferenciaCreditoContaBancariaResponse;
import br.com.conductor.pier.api.v2.model.TransferenciaCreditoContaBancariaPersist;
import br.com.conductor.pier.api.v2.model.TransferenciaBancariaPersist;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class TransferenciaBancariaApi {
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
   * Atualiza conta banc\u00C3\u00A1ria portador
   * Esse recurso permite atualizar uma conta banc\u00C3\u00A1ria do portador.
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta banc\u00C3\u00A1ria do portador (id).
   * @param update update
   * @return ContaBancariaPortadorResponse
   */
  public ContaBancariaPortadorResponse  atualizarUsingPUT1 (Long id, ContaBancariaPortadorUpdate update) throws ApiException {
    Object postBody = update;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarUsingPUT1");
    }
    
    // verify the required parameter 'update' is set
    if (update == null) {
       throw new ApiException(400, "Missing the required parameter 'update' when calling atualizarUsingPUT1");
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
   * Realiza a consulta de uma transfer\u00C3\u00AAncia banc\u00C3\u00A1ria de cr\u00C3\u00A9dito entre contas banc\u00C3\u00A1rias de um portador
   * Recurso utilizado para recuperar uma transfer\u00C3\u00AAncia de cr\u00C3\u00A9dito entre contas banc\u00C3\u00A1ria de um portador, utiliza o ID da transfer\u00C3\u00AAncia banc\u00C3\u00A1riae o idConta para realizar a consulta.
   * @param idTransferencia Id Transfer\u00C3\u00AAncia
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
   * Consulta conta banc\u00C3\u00A1ria portador
   * Esse recurso permite consultar uma conta banc\u00C3\u00A1ria do portador a partir do seu c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta banc\u00C3\u00A1ria (id).
   * @return ContaBancariaPortadorResponse
   */
  public ContaBancariaPortadorResponse  consultarUsingGET10 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET10");
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
   * Consultar uma transfer\u00C3\u00AAncia banc\u00C3\u00A1ria para um banco
   * Este recurso permite consultar os detalhes de uma determinada transfer\u00C3\u00AAncia de cr\u00C3\u00A9dito realizada para uma conta banc\u00C3\u00A1ria. De modo geral, esta opera\u00C3\u00A7\u00C3\u00A3o poder\u00C3\u00A1 ser utilizada para uma consulta simples destes detalhes ou para realizar a montagem de um comprovante de 2\u00C2\u00AA via de transfer\u00C3\u00AAncia entre contas.
   * @param id Id Conta
   * @param idTransferencia Id Transfer\u00C3\u00AAncia
   * @param idContaBancariaDestino C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta banc\u00C3\u00A1ria de destino (id)
   * @return TransferenciaBancariaResponse
   */
  public TransferenciaBancariaResponse  consultarUsingGET39 (Long id, Long idTransferencia, Long idContaBancariaDestino) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET39");
    }
    
    // verify the required parameter 'idTransferencia' is set
    if (idTransferencia == null) {
       throw new ApiException(400, "Missing the required parameter 'idTransferencia' when calling consultarUsingGET39");
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
   * Realiza a listagem das transfer\u00C3\u00AAncias banc\u00C3\u00A1rias de cr\u00C3\u00A9dito entre contas banc\u00C3\u00A1rias
   * Recurso utilizado para listar as transfer\u00C3\u00AAncia de cr\u00C3\u00A9dito entre contas banc\u00C3\u00A1ria de um portador solicitadas.
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param idConta C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da Conta.
   * @param dataSolicitacaoInicial Data inicial da solicita\u00C3\u00A7\u00C3\u00A3o de transfer\u00C3\u00AAncia.
   * @param dataSolicitacaoFinal Data final da solicita\u00C3\u00A7\u00C3\u00A3o de transfer\u00C3\u00AAncia
   * @return PageTransferenciaCreditoContaBancariaResponse
   */
  public PageTransferenciaCreditoContaBancariaResponse  listarTransferenciaBancariaUsingGET (List<String> sort, Integer page, Integer limit, Long idConta, String dataSolicitacaoInicial, String dataSolicitacaoFinal) throws ApiException {
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
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

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
   * Lista contas banc\u00C3\u00A1rias portador
   * Esse recurso permite listar contas banc\u00C3\u00A1rias do portador.
   * @param idConta C\u00C3\u00B3digo identificador da conta cart\u00C3\u00A3o
   * @param nomeAgencia Descri\u00C3\u00A7\u00C3\u00A3o da ag\u00C3\u00AAncia
   * @param numeroAgencia N\u00C3\u00BAmero da ag\u00C3\u00AAncia
   * @param numeroConta N\u00C3\u00BAmero da conta
   * @param flagContaOrigemDoc Sinaliza se origem \u00C3\u00A9 DOC (1: DOC, 0: TED)
   * @param idPessoaFisica C\u00C3\u00B3digo da pessoa
   * @param favorecido Nome do favorecido
   * @param numeroReceiraFederal Documento do favorecido
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @return PageContaBancariaPortadorResponse
   */
  public PageContaBancariaPortadorResponse  listarUsingGET12 (Long idConta, String nomeAgencia, String numeroAgencia, String numeroConta, Integer flagContaOrigemDoc, Long idPessoaFisica, String favorecido, String numeroReceiraFederal, List<String> sort, Integer page, Integer limit) throws ApiException {
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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroAgencia", numeroAgencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroConta", numeroConta));
    
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
   * Listar as transfer\u00C3\u00AAncias banc\u00C3\u00A1rias realizadas
   * Este recurso tem como objetivo permitir que o portador de um Cart\u00C3\u00A3o possa consultar uma lista das Transfer\u00C3\u00AAncias Banc\u00C3\u00A1rias para os Favorecidos cadastrados.
   * @param id Id Conta
   * @param idContaBancariaDestino C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta banc\u00C3\u00A1ria de destino (id)
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @return PageTransferenciaBancariaResponse
   */
  public PageTransferenciaBancariaResponse  listarUsingGET45 (Long id, Long idContaBancariaDestino, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarUsingGET45");
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
   * Cadastra uma conta banc\u00C3\u00A1ria do portador
   * Esse recurso permite cadastrar contas banc\u00C3\u00A1rias do portador.
   * @param persist persist
   * @return ContaBancariaPortadorResponse
   */
  public ContaBancariaPortadorResponse  salvarUsingPOST7 (ContaBancariaPortadorPersist persist) throws ApiException {
    Object postBody = persist;
    
    // verify the required parameter 'persist' is set
    if (persist == null) {
       throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarUsingPOST7");
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
   * Realiza a simula\u00C3\u00A7\u00C3\u00A3o dos planos de parcelamentos para uma transfer\u00C3\u00AAncia banc\u00C3\u00A1ria de cr\u00C3\u00A9dito entre contas banc\u00C3\u00A1rias
   * Realiza a simula\u00C3\u00A7\u00C3\u00A3o dos planos de parcelamentos para uma transfer\u00C3\u00AAncia banc\u00C3\u00A1ria de cr\u00C3\u00A9dito entre contas banc\u00C3\u00A1rias.
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
   * Realizar transfer\u00C3\u00AAncia banc\u00C3\u00A1ria do cart\u00C3\u00A3o para contas banc\u00C3\u00A1rias
   * Este recurso tem como objetivo permitir que o portador de um cart\u00C3\u00A3o possa realizar a transfer\u00C3\u00AAncia de cr\u00C3\u00A9dito para uma conta banc\u00C3\u00A1ria. Assim, o valor do cr\u00C3\u00A9dito somado a tarifa para transfer\u00C3\u00AAncia, quando praticada pelo emissor, ser\u00C3\u00A1 debitado da conta de origem, se houver saldo suficiente, e ser\u00C3\u00A1 creditado na conta banc\u00C3\u00A1ria de destino.
   * @param persist persist
   * @return TransferenciaCreditoContaBancariaResponse
   */
  public TransferenciaCreditoContaBancariaResponse  transferenciaCreditoContaBancariaUsingPOST (TransferenciaCreditoContaBancariaPersist persist) throws ApiException {
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
   * Realizar transfer\u00C3\u00AAncia banc\u00C3\u00A1ria do cart\u00C3\u00A3o para contas banc\u00C3\u00A1rias
   * Este recurso tem como objetivo permitir que o portador de um cart\u00C3\u00A3o possa realizar a transfer\u00C3\u00AAncia de cr\u00C3\u00A9dito para uma conta banc\u00C3\u00A1ria. Assim, o valor do cr\u00C3\u00A9dito somado a tarifa para transfer\u00C3\u00AAncia, quando praticada pelo emissor, ser\u00C3\u00A1 debitado da conta de origem, se houver saldo suficiente, e ser\u00C3\u00A1 creditado na conta banc\u00C3\u00A1ria de destino.
   * @param id Id Conta
   * @param transferenciaBancariaPersist transferenciaBancariaPersist
   * @return TransferenciaBancariaResponse
   */
  public TransferenciaBancariaResponse  transferirUsingPOST (Long id, TransferenciaBancariaPersist transferenciaBancariaPersist) throws ApiException {
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
