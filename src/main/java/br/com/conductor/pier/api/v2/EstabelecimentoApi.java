package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.OrigemComercialUpdate;
import br.com.conductor.pier.api.v2.model.OrigemComercialResponse;
import br.com.conductor.pier.api.v2.model.MaquinetaResponse;
import br.com.conductor.pier.api.v2.model.MaquinetaUpdate;
import br.com.conductor.pier.api.v2.model.OperacaoCredorUpdate;
import br.com.conductor.pier.api.v2.model.OperacaoCredorResponse;
import br.com.conductor.pier.api.v2.model.TelefoneEstabelecimentoResponse;
import br.com.conductor.pier.api.v2.model.TerminalUpdate;
import br.com.conductor.pier.api.v2.model.TerminalResponse;
import br.com.conductor.pier.api.v2.model.EstabelecimentoUpdate;
import br.com.conductor.pier.api.v2.model.EstabelecimentoResponse;
import br.com.conductor.pier.api.v2.model.GrupoEconomicoDTO;
import br.com.conductor.pier.api.v2.model.GrupoEconomicoResponse;
import br.com.conductor.pier.api.v2.model.OrigemComercialPersist;
import br.com.conductor.pier.api.v2.model.EstabelecimentoPersist;
import br.com.conductor.pier.api.v2.model.DetalheOperacaoResponse;
import br.com.conductor.pier.api.v2.model.VinculoEstabelecimentoAdquirenteResponse;
import br.com.conductor.pier.api.v2.model.VinculoOperacaoPersist;
import br.com.conductor.pier.api.v2.model.PageOperacaoResponse;
import br.com.conductor.pier.api.v2.model.PageMCCResponse;
import br.com.conductor.pier.api.v2.model.PageOrigemComercialResponse;
import br.com.conductor.pier.api.v2.model.PageEntidadeResponse;
import br.com.conductor.pier.api.v2.model.PageCampoCodificadoDescricaoResponse;
import br.com.conductor.pier.api.v2.model.PageTipoTerminalResponse;
import br.com.conductor.pier.api.v2.model.PageEstabelecimentoResponse;
import br.com.conductor.pier.api.v2.model.PageGrupoEconomicoResponse;
import java.math.BigDecimal;
import br.com.conductor.pier.api.v2.model.PageMaquinetaResponse;
import br.com.conductor.pier.api.v2.model.PageMoedaResponse;
import br.com.conductor.pier.api.v2.model.PageOperacaoCredorResponse;
import br.com.conductor.pier.api.v2.model.PageTelefoneEstabelecimentoResponse;
import br.com.conductor.pier.api.v2.model.PageTerminalResponse;
import br.com.conductor.pier.api.v2.model.PageVinculoEstabelecimentoAdquirenteResponse;
import br.com.conductor.pier.api.v2.model.PageVinculoOperacaoResponse;
import br.com.conductor.pier.api.v2.model.MaquinetaPersist;
import br.com.conductor.pier.api.v2.model.OperacaoCredorPersist;
import br.com.conductor.pier.api.v2.model.TerminalPersist;
import br.com.conductor.pier.api.v2.model.VinculoEstabelecimentoAdquirentePersist;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class EstabelecimentoApi {
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
   * Alterar Origem Comercial
   * Altera uma origem comercial.
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da origem comercial
   * @param origemComercialUpdate origemComercialUpdate
   * @return OrigemComercialResponse
   */
  public OrigemComercialResponse  alterarOrigemComercialUsingPUT (Long id, OrigemComercialUpdate origemComercialUpdate) throws ApiException {
    Object postBody = origemComercialUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarOrigemComercialUsingPUT");
    }
    
    // verify the required parameter 'origemComercialUpdate' is set
    if (origemComercialUpdate == null) {
       throw new ApiException(400, "Missing the required parameter 'origemComercialUpdate' when calling alterarOrigemComercialUsingPUT");
    }
    

    // create path and map variables
    String path = "/api/origens-comerciais/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (OrigemComercialResponse) ApiInvoker.deserialize(response, "", OrigemComercialResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Altera uma Maquineta
   * Este m\u00C3\u00A9todo realiza a altera\u00C3\u00A7\u00C3\u00A3o das maquinetas dos estabelecimentos.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Maquineta (id).
   * @param maquinetaUpdate maquinetaUpdate
   * @return MaquinetaResponse
   */
  public MaquinetaResponse  alterarUsingPUT10 (Long id, MaquinetaUpdate maquinetaUpdate) throws ApiException {
    Object postBody = maquinetaUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT10");
    }
    
    // verify the required parameter 'maquinetaUpdate' is set
    if (maquinetaUpdate == null) {
       throw new ApiException(400, "Missing the required parameter 'maquinetaUpdate' when calling alterarUsingPUT10");
    }
    

    // create path and map variables
    String path = "/api/maquinetas/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (MaquinetaResponse) ApiInvoker.deserialize(response, "", MaquinetaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Altera uma Regra Opera\u00C3\u00A7\u00C3\u00A3o
   * Este m\u00C3\u00A9todo realiza a altera\u00C3\u00A7\u00C3\u00A3o de uma regra opera\u00C3\u00A7\u00C3\u00A3o.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Regra Opera\u00C3\u00A7\u00C3\u00A3o (id).
   * @param operacaoCredorUpdate operacaoCredorUpdate
   * @return OperacaoCredorResponse
   */
  public OperacaoCredorResponse  alterarUsingPUT11 (Long id, OperacaoCredorUpdate operacaoCredorUpdate) throws ApiException {
    Object postBody = operacaoCredorUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT11");
    }
    
    // verify the required parameter 'operacaoCredorUpdate' is set
    if (operacaoCredorUpdate == null) {
       throw new ApiException(400, "Missing the required parameter 'operacaoCredorUpdate' when calling alterarUsingPUT11");
    }
    

    // create path and map variables
    String path = "/api/regras-operacoes-estabelecimentos/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (OperacaoCredorResponse) ApiInvoker.deserialize(response, "", OperacaoCredorResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Altera um Telefone do estabelecimento
   * Este m\u00C3\u00A9todo realiza a altera\u00C3\u00A7\u00C3\u00A3o dos telefones dos estabelecimentos.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Telefone Estabelecimento (id).
   * @param ddd C\u00C3\u00B3digo DDD do telefone (id).
   * @param telefone N\u00C3\u00BAmero do telefone.
   * @param ramal N\u00C3\u00BAmero do ramal.
   * @return TelefoneEstabelecimentoResponse
   */
  public TelefoneEstabelecimentoResponse  alterarUsingPUT15 (Long id, String ddd, String telefone, String ramal) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT15");
    }
    
    // verify the required parameter 'ddd' is set
    if (ddd == null) {
       throw new ApiException(400, "Missing the required parameter 'ddd' when calling alterarUsingPUT15");
    }
    
    // verify the required parameter 'telefone' is set
    if (telefone == null) {
       throw new ApiException(400, "Missing the required parameter 'telefone' when calling alterarUsingPUT15");
    }
    

    // create path and map variables
    String path = "/api/telefones-estabelecimentos/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "ddd", ddd));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "telefone", telefone));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "ramal", ramal));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

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
        return (TelefoneEstabelecimentoResponse) ApiInvoker.deserialize(response, "", TelefoneEstabelecimentoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Altera um Terminal
   * Este m\u00C3\u00A9todo realiza a altera\u00C3\u00A7\u00C3\u00A3o dos Terminais.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do terminal (id).
   * @param terminalUpdate terminalUpdate
   * @return TerminalResponse
   */
  public TerminalResponse  alterarUsingPUT17 (Long id, TerminalUpdate terminalUpdate) throws ApiException {
    Object postBody = terminalUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT17");
    }
    
    // verify the required parameter 'terminalUpdate' is set
    if (terminalUpdate == null) {
       throw new ApiException(400, "Missing the required parameter 'terminalUpdate' when calling alterarUsingPUT17");
    }
    

    // create path and map variables
    String path = "/api/terminais/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (TerminalResponse) ApiInvoker.deserialize(response, "", TerminalResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Alterar um estabelecimento
   * Altera um estabelecimento
   * @param id Id
   * @param update update
   * @return EstabelecimentoResponse
   */
  public EstabelecimentoResponse  alterarUsingPUT6 (Long id, EstabelecimentoUpdate update) throws ApiException {
    Object postBody = update;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT6");
    }
    
    // verify the required parameter 'update' is set
    if (update == null) {
       throw new ApiException(400, "Missing the required parameter 'update' when calling alterarUsingPUT6");
    }
    

    // create path and map variables
    String path = "/api/estabelecimentos/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (EstabelecimentoResponse) ApiInvoker.deserialize(response, "", EstabelecimentoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Alterar Grupo Econ\u00C3\u00B4mico
   * Altera um grupo econ\u00C3\u00B4mico.
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do grupo econ\u00C3\u00B4mico
   * @param grupoEconomicoDTO grupoEconomicoDTO
   * @return GrupoEconomicoResponse
   */
  public GrupoEconomicoResponse  alterarUsingPUT8 (Long id, GrupoEconomicoDTO grupoEconomicoDTO) throws ApiException {
    Object postBody = grupoEconomicoDTO;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT8");
    }
    
    // verify the required parameter 'grupoEconomicoDTO' is set
    if (grupoEconomicoDTO == null) {
       throw new ApiException(400, "Missing the required parameter 'grupoEconomicoDTO' when calling alterarUsingPUT8");
    }
    

    // create path and map variables
    String path = "/api/grupos-economicos/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (GrupoEconomicoResponse) ApiInvoker.deserialize(response, "", GrupoEconomicoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Cadastrar Origem Comercial
   * Cadastra uma origem comercial.
   * @param origemComercialPersist origemComercialPersist
   * @return OrigemComercialResponse
   */
  public OrigemComercialResponse  cadastrarOrigemComercialUsingPOST (OrigemComercialPersist origemComercialPersist) throws ApiException {
    Object postBody = origemComercialPersist;
    
    // verify the required parameter 'origemComercialPersist' is set
    if (origemComercialPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'origemComercialPersist' when calling cadastrarOrigemComercialUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/origens-comerciais".replaceAll("\\{format\\}","json");

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
        return (OrigemComercialResponse) ApiInvoker.deserialize(response, "", OrigemComercialResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Cadastrar um estabelecimento
   * Cadastra um novo estabelecimento
   * @param persist persist
   * @return EstabelecimentoResponse
   */
  public EstabelecimentoResponse  cadastrarUsingPOST2 (EstabelecimentoPersist persist) throws ApiException {
    Object postBody = persist;
    
    // verify the required parameter 'persist' is set
    if (persist == null) {
       throw new ApiException(400, "Missing the required parameter 'persist' when calling cadastrarUsingPOST2");
    }
    

    // create path and map variables
    String path = "/api/estabelecimentos".replaceAll("\\{format\\}","json");

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
        return (EstabelecimentoResponse) ApiInvoker.deserialize(response, "", EstabelecimentoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Cadastrar Grupo Econ\u00C3\u00B4mico
   * Cadastra um grupo econ\u00C3\u00B4mico.
   * @param grupoEconomicoDTO GrupoEconomicoDTO
   * @return GrupoEconomicoResponse
   */
  public GrupoEconomicoResponse  cadastrarUsingPOST3 (GrupoEconomicoDTO grupoEconomicoDTO) throws ApiException {
    Object postBody = grupoEconomicoDTO;
    
    // verify the required parameter 'grupoEconomicoDTO' is set
    if (grupoEconomicoDTO == null) {
       throw new ApiException(400, "Missing the required parameter 'grupoEconomicoDTO' when calling cadastrarUsingPOST3");
    }
    

    // create path and map variables
    String path = "/api/grupos-economicos".replaceAll("\\{format\\}","json");

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
        return (GrupoEconomicoResponse) ApiInvoker.deserialize(response, "", GrupoEconomicoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Apresenta dados de um determinado tipo de opera\u00C3\u00A7\u00C3\u00A3o
   * Este recurso permite consultar dados de um determinado tipo opera\u00C3\u00A7\u00C3\u00A3o a partir do idoperacao
   * @param id C\u00C3\u00B3digo de processamento da opera\u00C3\u00A7\u00C3\u00A3o (idOperacao).
   * @return DetalheOperacaoResponse
   */
  public DetalheOperacaoResponse  consultaOperacaoUsingGET (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultaOperacaoUsingGET");
    }
    

    // create path and map variables
    String path = "/api/tipos-operacoes-estabelecimentos/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (DetalheOperacaoResponse) ApiInvoker.deserialize(response, "", DetalheOperacaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Consultar Origem Comercial
   * Consulta uma origem comercial atrav\u00C3\u00A9s do seu identificador.
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da origem comercial
   * @return OrigemComercialResponse
   */
  public OrigemComercialResponse  consultarOrigemComercialUsingGET (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarOrigemComercialUsingGET");
    }
    

    // create path and map variables
    String path = "/api/origens-comerciais/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (OrigemComercialResponse) ApiInvoker.deserialize(response, "", OrigemComercialResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Consultar estabelecimento por id
   * Consulta os detalhes de um determinado estabelecimento
   * @param id Id
   * @return EstabelecimentoResponse
   */
  public EstabelecimentoResponse  consultarUsingGET16 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET16");
    }
    

    // create path and map variables
    String path = "/api/estabelecimentos/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (EstabelecimentoResponse) ApiInvoker.deserialize(response, "", EstabelecimentoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Consultar grupo econ\u00C3\u00B4mico
   * Consulta um grupo econ\u00C3\u00B4mico atrav\u00C3\u00A9s do seu identificador.
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do grupo econ\u00C3\u00B4mico
   * @return GrupoEconomicoResponse
   */
  public GrupoEconomicoResponse  consultarUsingGET18 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET18");
    }
    

    // create path and map variables
    String path = "/api/grupos-economicos/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (GrupoEconomicoResponse) ApiInvoker.deserialize(response, "", GrupoEconomicoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Apresenta os dados de uma determinada maquineta
   * Este m\u00C3\u00A9todo permite consultar uma determinada maquineta a partir do seu c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Maquineta (id).
   * @return MaquinetaResponse
   */
  public MaquinetaResponse  consultarUsingGET20 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET20");
    }
    

    // create path and map variables
    String path = "/api/maquinetas/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (MaquinetaResponse) ApiInvoker.deserialize(response, "", MaquinetaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Apresenta os dados de uma determinada Regra Opera\u00C3\u00A7\u00C3\u00A3o
   * Este m\u00C3\u00A9todo permite consultar uma determinada regra opera\u00C3\u00A7\u00C3\u00A3o a partir do seu c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Regra Opera\u00C3\u00A7\u00C3\u00A3o (id).
   * @return OperacaoCredorResponse
   */
  public OperacaoCredorResponse  consultarUsingGET21 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET21");
    }
    

    // create path and map variables
    String path = "/api/regras-operacoes-estabelecimentos/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (OperacaoCredorResponse) ApiInvoker.deserialize(response, "", OperacaoCredorResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Apresenta os dados de um determinado telefone de um estabelecimento
   * Este m\u00C3\u00A9todo permite consultar um determinado telefone de um estabelecimento a partir do seu c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Telefone Estabelecimento (id).
   * @return TelefoneEstabelecimentoResponse
   */
  public TelefoneEstabelecimentoResponse  consultarUsingGET29 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET29");
    }
    

    // create path and map variables
    String path = "/api/telefones-estabelecimentos/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (TelefoneEstabelecimentoResponse) ApiInvoker.deserialize(response, "", TelefoneEstabelecimentoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Apresenta os dados de um determinado Terminal
   * Este m\u00C3\u00A9todo permite consultar um determinado Terminal a partir do seu c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Terminal (id).
   * @return TerminalResponse
   */
  public TerminalResponse  consultarUsingGET31 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET31");
    }
    

    // create path and map variables
    String path = "/api/terminais/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (TerminalResponse) ApiInvoker.deserialize(response, "", TerminalResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Apresenta os dados de um determinado V\u00C3\u00ADnculo
   * Este m\u00C3\u00A9todo permite consultar um determinado V\u00C3\u00ADnculo a partir do seu c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do V\u00C3\u008Dnculo (id).
   * @return VinculoEstabelecimentoAdquirenteResponse
   */
  public VinculoEstabelecimentoAdquirenteResponse  consultarUsingGET43 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET43");
    }
    

    // create path and map variables
    String path = "/api/adquirentes-estabelecimento/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (VinculoEstabelecimentoAdquirenteResponse) ApiInvoker.deserialize(response, "", VinculoEstabelecimentoAdquirenteResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Desabilitar um V\u00C3\u00ADnculo
   * Este m\u00C3\u00A9todo realiza a desativa\u00C3\u00A7\u00C3\u00A3o de um v\u00C3\u00ADnculo.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do V\u00C3\u00ADnculo (id).
   * @return Object
   */
  public Object  desabilitarVinculoUsingPOST (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling desabilitarVinculoUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/adquirentes-estabelecimento/{id}/desabilitar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
   * Desabilitar um v\u00C3\u00ADnculo opera\u00C3\u00A7\u00C3\u00A3o
   * Este m\u00C3\u00A9todo permite desabilitar um v\u00C3\u00ADnculo.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do estabelecimento (id).
   * @param vinculoOperacaoPersist vinculoOperacaoPersist
   * @return Object
   */
  public Object  desabilitarVinculoUsingPOST1 (Long id, VinculoOperacaoPersist vinculoOperacaoPersist) throws ApiException {
    Object postBody = vinculoOperacaoPersist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling desabilitarVinculoUsingPOST1");
    }
    
    // verify the required parameter 'vinculoOperacaoPersist' is set
    if (vinculoOperacaoPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'vinculoOperacaoPersist' when calling desabilitarVinculoUsingPOST1");
    }
    

    // create path and map variables
    String path = "/api/estabelecimentos/{id}/desabilitar-operacao".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
   * Habilitar um V\u00C3\u00ADnculo
   * Este m\u00C3\u00A9todo realiza a ativa\u00C3\u00A7\u00C3\u00A3o de um v\u00C3\u00ADnculo.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do V\u00C3\u00ADnculo (id).
   * @return Object
   */
  public Object  habilitarVinculoUsingPOST (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling habilitarVinculoUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/adquirentes-estabelecimento/{id}/habilitar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
   * Habilitar um v\u00C3\u00ADnculo opera\u00C3\u00A7\u00C3\u00A3o
   * Este m\u00C3\u00A9todo permite habilitar um v\u00C3\u00ADnculo.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do estabelecimento (id).
   * @param vinculoOperacaoPersist vinculoOperacaoPersist
   * @return Object
   */
  public Object  habilitarVinculoUsingPOST1 (Long id, VinculoOperacaoPersist vinculoOperacaoPersist) throws ApiException {
    Object postBody = vinculoOperacaoPersist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling habilitarVinculoUsingPOST1");
    }
    
    // verify the required parameter 'vinculoOperacaoPersist' is set
    if (vinculoOperacaoPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'vinculoOperacaoPersist' when calling habilitarVinculoUsingPOST1");
    }
    

    // create path and map variables
    String path = "/api/estabelecimentos/{id}/habilitar-operacao".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
   * Apresenta dados de opera\u00C3\u00A7\u00C3\u00B5es em uma lista
   * Este recurso permite listar as opera\u00C3\u00A7\u00C3\u00A3o
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param idOperacao C\u00C3\u00B3digo que identifica a opera\u00C3\u00A7\u00C3\u00A3o
   * @param codigoProcessamento C\u00C3\u00B3digo de processamento usado em transa\u00C3\u00A7\u00C3\u00B5es com o autorizador
   * @return PageOperacaoResponse
   */
  public PageOperacaoResponse  listaOperacaoUsingGET (List<String> sort, Integer page, Integer limit, Long idOperacao, String codigoProcessamento) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/tipos-operacoes-estabelecimentos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idOperacao", idOperacao));
    
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
        return (PageOperacaoResponse) ApiInvoker.deserialize(response, "", PageOperacaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista os MCCs
   * Este m\u00C3\u00A9todo permite que sejam listados os MCCs existentes na base de dados do Emissor.
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @return PageMCCResponse
   */
  public PageMCCResponse  listarMCCUsingGET (List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/mcc-estabelecimentos".replaceAll("\\{format\\}","json");

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
        return (PageMCCResponse) ApiInvoker.deserialize(response, "", PageMCCResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Listar Origens Comerciais
   * Lista origens comerciais cadastradas.
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param id Id da origem comercial
   * @param nome Nome da origem comercial
   * @param status Indica o status da origem comercial
   * @param idEstabelecimento Identificador do estabelecimento
   * @param idProduto Identificador do produto
   * @param descricao Descri\u00C3\u00A7\u00C3\u00A3o da origem comercial
   * @param idTipoOrigemComercial Identificador do tipo de origem comercial
   * @param idGrupoOrigemComercial Identificador do grupo de origem comercial
   * @param flagPreAprovado Indica se permite pr\u00C3\u00A9 aprova\u00C3\u00A7\u00C3\u00A3o
   * @param flagAprovacaoImediata Indica se permite aprova\u00C3\u00A7\u00C3\u00A3o imediata
   * @param nomeFantasiaPlastico Nome fantasia impresso no pl\u00C3\u00A1stico
   * @param flagCartaoProvisorio Indica se permite cart\u00C3\u00A3o provis\u00C3\u00B3rio
   * @param flagCartaoDefinitivo Indica se permite cart\u00C3\u00A3o definitivo
   * @param usuario Usu\u00C3\u00A1rio para autentica\u00C3\u00A7\u00C3\u00A3o
   * @param senha Senha para autentica\u00C3\u00A7\u00C3\u00A3o
   * @param flagOrigemExterna Indica se \u00C3\u00A9 origem externa
   * @param flagModificado Indica se h\u00C3\u00A1 modifica\u00C3\u00A7\u00C3\u00A3o
   * @param flagEnviaFaturaUsuario Indica se envia fatura
   * @param flagCreditoFaturamento Indica se permite cr\u00C3\u00A9dito de faturamento
   * @param flagConcedeLimiteProvisorio Indica se concede limite provis\u00C3\u00B3rio
   * @param flagDigitalizarDoc Indica se digitaliza documento
   * @param flagEmbossingLoja Indica se realiza embossing em loja
   * @param flagConsultaPrevia Indica se realiza consulta pr\u00C3\u00A9via
   * @param tipoPessoa Tipo de pessoa
   * @return PageOrigemComercialResponse
   */
  public PageOrigemComercialResponse  listarOrigensComerciaisUsingGET (List<String> sort, Integer page, Integer limit, Long id, String nome, Integer status, Long idEstabelecimento, Long idProduto, String descricao, Long idTipoOrigemComercial, Long idGrupoOrigemComercial, Boolean flagPreAprovado, Boolean flagAprovacaoImediata, String nomeFantasiaPlastico, Boolean flagCartaoProvisorio, Boolean flagCartaoDefinitivo, String usuario, String senha, Boolean flagOrigemExterna, Boolean flagModificado, Boolean flagEnviaFaturaUsuario, Boolean flagCreditoFaturamento, Boolean flagConcedeLimiteProvisorio, Boolean flagDigitalizarDoc, Boolean flagEmbossingLoja, Boolean flagConsultaPrevia, String tipoPessoa) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/origens-comerciais".replaceAll("\\{format\\}","json");

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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "status", status));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEstabelecimento", idEstabelecimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idProduto", idProduto));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoOrigemComercial", idTipoOrigemComercial));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idGrupoOrigemComercial", idGrupoOrigemComercial));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagPreAprovado", flagPreAprovado));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagAprovacaoImediata", flagAprovacaoImediata));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeFantasiaPlastico", nomeFantasiaPlastico));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagCartaoProvisorio", flagCartaoProvisorio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagCartaoDefinitivo", flagCartaoDefinitivo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "usuario", usuario));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "senha", senha));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagOrigemExterna", flagOrigemExterna));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagModificado", flagModificado));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagEnviaFaturaUsuario", flagEnviaFaturaUsuario));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagCreditoFaturamento", flagCreditoFaturamento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagConcedeLimiteProvisorio", flagConcedeLimiteProvisorio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagDigitalizarDoc", flagDigitalizarDoc));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagEmbossingLoja", flagEmbossingLoja));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagConsultaPrevia", flagConsultaPrevia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tipoPessoa", tipoPessoa));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

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
        return (PageOrigemComercialResponse) ApiInvoker.deserialize(response, "", PageOrigemComercialResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista os Tipos de adquirentes
   * Este m\u00C3\u00A9todo permite que sejam listados os tipos de adquirentes.
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @return PageEntidadeResponse
   */
  public PageEntidadeResponse  listarTiposAdquirentesUsingGET (List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/tipos-adquirentes".replaceAll("\\{format\\}","json");

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
        return (PageEntidadeResponse) ApiInvoker.deserialize(response, "", PageEntidadeResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista os Tipos de  Maquinetas
   * Este m\u00C3\u00A9todo permite que sejam listadas os Tipos de maquinetas existentes na base de dados do Emissor.
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @return PageCampoCodificadoDescricaoResponse
   */
  public PageCampoCodificadoDescricaoResponse  listarTiposMaquinetasUsingGET (List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/tipos-maquinetas".replaceAll("\\{format\\}","json");

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
   * Lista os Tipos Terminais
   * Este m\u00C3\u00A9todo permite que sejam listados os tipos de terminais existentes na base de dados do Emissor.
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @return PageTipoTerminalResponse
   */
  public PageTipoTerminalResponse  listarTiposTerminaisUsingGET1 (List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/tipos-terminais-estabelecimento".replaceAll("\\{format\\}","json");

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
        return (PageTipoTerminalResponse) ApiInvoker.deserialize(response, "", PageTipoTerminalResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista Estabelecimentos
   * Lista todas os Estabelecimentos
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do estabelecimento (id).
   * @param idCredor Apresenta o n\u00C3\u00BAmero de identifica\u00C3\u00A7\u00C3\u00A3o do Credor.
   * @param numeroReceitaFederal Apresenta o n\u00C3\u00BAmero de identifica\u00C3\u00A7\u00C3\u00A3o do Estabelecimento na Receita Federal.
   * @param nome Nome do Estabelecimento.
   * @param descricao Raz\u00C3\u00A3o Social do Estabelecimento.
   * @param nomeFantasia T\u00C3\u00ADtulo Comercial do Estabelecimento.
   * @param cep C\u00C3\u00B3digo de Endere\u00C3\u00A7amento Postal (CEP).
   * @param nomeLogradouro Nome do Logradouro.
   * @param numeroEndereco N\u00C3\u00BAmero do endere\u00C3\u00A7o.
   * @param complemento Descri\u00C3\u00A7\u00C3\u00B5es complementares referente ao endere\u00C3\u00A7o.
   * @param bairro Nome do bairro do endere\u00C3\u00A7o.
   * @param cidade Nome da cidade do endere\u00C3\u00A7o.
   * @param uf Sigla de identifica\u00C3\u00A7\u00C3\u00A3o da Unidade Federativa do endere\u00C3\u00A7o.
   * @param pais Nome do pa\u00C3\u00ADs.
   * @param dataCadastramento Data de Cadastro do Estabelecimento, no formato yyyy-MM-dd.
   * @param contato Nome da pessoa para contato com o Estabelecimento.
   * @param email E-mail da pessoa para contato com o Estabelecimento.
   * @param flagArquivoSecrFazenda Indica se o estabelecimento ser\u00C3\u00A1 inclu\u00C3\u00ADdo no arquivo de registro para a Secretaria da Fazenda Estadual.
   * @param flagCartaoDigitado Indica se o estabelecimento poder\u00C3\u00A1 originar transa\u00C3\u00A7\u00C3\u00B5es sem a leitura da tarja ou do chip do cart\u00C3\u00A3o.
   * @param inativo Indica se o estabelecimento est\u00C3\u00A1 inativo.
   * @param idPais Identificador de Pa\u00C3\u00ADs.
   * @param mcc C\u00C3\u00B3digo de Categoria de Mercado
   * @param idTipoEstabelecimento C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do Estabelecimento.
   * @param correspondencia Indicador para qual endere\u00C3\u00A7o as correspond\u00C3\u00AAncias ser\u00C3\u00A3o enviadas, onde 1 \u00C3\u00A9 ORIGEM e 2 ENDERE\u00C3\u0087O DE CORRESPOND\u00C3\u008ANCIA.
   * @param idMoeda C\u00C3\u00B3digo identificador da moeda.
   * @param tipoPagamento Tipo do regime de pagamento do estabelecimento.
   * @param numeroEstabelecimento N\u00C3\u00BAmero de identifica\u00C3\u00A7\u00C3\u00A3o do Estabelecimento na Conductor.
   * @param cep2 C\u00C3\u00B3digo de Endere\u00C3\u00A7amento Postal (CEP).
   * @param nomeLogradouro2 Nome do Logradouro.
   * @param numeroEndereco2 N\u00C3\u00BAmero do endere\u00C3\u00A7o.
   * @param complemento2 Descri\u00C3\u00A7\u00C3\u00B5es complementares referente ao endere\u00C3\u00A7o.
   * @param bairro2 Nome do bairro do endere\u00C3\u00A7o.
   * @param cidade2 Nome da cidade do endere\u00C3\u00A7o.
   * @param uf2 Sigla de identifica\u00C3\u00A7\u00C3\u00A3o da Unidade Federativa do endere\u00C3\u00A7o.
   * @param flagMatriz Indica se \u00C3\u00A9 matriz ou filial.
   * @return PageEstabelecimentoResponse
   */
  public PageEstabelecimentoResponse  listarUsingGET21 (List<String> sort, Integer page, Integer limit, Long id, Long idCredor, String numeroReceitaFederal, String nome, String descricao, String nomeFantasia, String cep, String nomeLogradouro, Integer numeroEndereco, String complemento, String bairro, String cidade, String uf, String pais, String dataCadastramento, String contato, String email, Integer flagArquivoSecrFazenda, Integer flagCartaoDigitado, Integer inativo, Long idPais, Long mcc, Long idTipoEstabelecimento, Integer correspondencia, Long idMoeda, String tipoPagamento, String numeroEstabelecimento, String cep2, String nomeLogradouro2, Integer numeroEndereco2, String complemento2, String bairro2, String cidade2, String uf2, Integer flagMatriz) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/estabelecimentos".replaceAll("\\{format\\}","json");

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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idCredor", idCredor));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroReceitaFederal", numeroReceitaFederal));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeFantasia", nomeFantasia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cep", cep));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeLogradouro", nomeLogradouro));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroEndereco", numeroEndereco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "complemento", complemento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "bairro", bairro));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cidade", cidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "uf", uf));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "pais", pais));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataCadastramento", dataCadastramento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "contato", contato));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "email", email));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagArquivoSecrFazenda", flagArquivoSecrFazenda));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagCartaoDigitado", flagCartaoDigitado));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "inativo", inativo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idPais", idPais));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "mcc", mcc));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoEstabelecimento", idTipoEstabelecimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "correspondencia", correspondencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idMoeda", idMoeda));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tipoPagamento", tipoPagamento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroEstabelecimento", numeroEstabelecimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cep2", cep2));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeLogradouro2", nomeLogradouro2));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroEndereco2", numeroEndereco2));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "complemento2", complemento2));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "bairro2", bairro2));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cidade2", cidade2));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "uf2", uf2));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagMatriz", flagMatriz));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

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
        return (PageEstabelecimentoResponse) ApiInvoker.deserialize(response, "", PageEstabelecimentoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Listar grupos econ\u00C3\u00B4micos
   * Lista grupos econ\u00C3\u00B4micos cadastrados. 
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param razaoSocial Raz\u00C3\u00A3o social da pessoa jur\u00C3\u00ADdica
   * @param nomeCredor Nome do credor
   * @param numeroReceitaFederal N\u00C3\u00BAmero da Receita Federal
   * @param inscricaoEstadual N\u00C3\u00BAmero da inscri\u00C3\u00A7\u00C3\u00A3o estadual
   * @param contato Nome da pessoa para entrar em contato
   * @param banco C\u00C3\u00B3digo do banco
   * @param agencia Raz\u00C3\u00A3o social da pessoa jur\u00C3\u00ADdica
   * @param digitoAgencia D\u00C3\u00ADgito Verificador da ag\u00C3\u00AAncia
   * @param contaCorrente C\u00C3\u00B3digo da Conta Corrente
   * @param digitoContaCorrente D\u00C3\u00ADgito Verificador da Conta Corrente
   * @param periodicidade Periodicidade do pagamento
   * @param pagamentoSemanal Dia para pagamento semanal
   * @param pagamentoMensal Dia da data para o pagamento mensal
   * @param pagamentoDecendialPrimeiro Dia da data para o primeiro pagamento decendial
   * @param pagamentoDecendialSegundo Dia da data para o segundo pagamento decendial
   * @param pagamentoDecendialTerceiro Dia da data para o terceiro pagamento decendial
   * @param pagamentoQuinzenalPrimeiro Dia da data para o primeiro pagamento quinzenal
   * @param pagamentoQuinzenalSegundo Dia da data para o segundo pagamento quinzenal
   * @param percentualRAV Valor percentual do RAV do credor
   * @param recebeRAV Indica se o credor recebe RAV e o tipo
   * @param percentualMultiplica Percentual Multiplica
   * @param taxaAdm Taxa Administrativa
   * @param taxaBanco Taxa do Banco
   * @param limiteRAV Valor limite do RAV
   * @param idCredorRAV C\u00C3\u00B3digo identificador do credor RAV
   * @return PageGrupoEconomicoResponse
   */
  public PageGrupoEconomicoResponse  listarUsingGET23 (List<String> sort, Integer page, Integer limit, String razaoSocial, String nomeCredor, String numeroReceitaFederal, String inscricaoEstadual, String contato, Integer banco, Integer agencia, String digitoAgencia, String contaCorrente, String digitoContaCorrente, String periodicidade, String pagamentoSemanal, Integer pagamentoMensal, Integer pagamentoDecendialPrimeiro, Integer pagamentoDecendialSegundo, Integer pagamentoDecendialTerceiro, Integer pagamentoQuinzenalPrimeiro, Integer pagamentoQuinzenalSegundo, BigDecimal percentualRAV, String recebeRAV, BigDecimal percentualMultiplica, BigDecimal taxaAdm, BigDecimal taxaBanco, BigDecimal limiteRAV, Long idCredorRAV) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/grupos-economicos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "razaoSocial", razaoSocial));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeCredor", nomeCredor));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroReceitaFederal", numeroReceitaFederal));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "inscricaoEstadual", inscricaoEstadual));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "contato", contato));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "banco", banco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "agencia", agencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "digitoAgencia", digitoAgencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "contaCorrente", contaCorrente));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "digitoContaCorrente", digitoContaCorrente));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "periodicidade", periodicidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "pagamentoSemanal", pagamentoSemanal));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "pagamentoMensal", pagamentoMensal));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "pagamentoDecendialPrimeiro", pagamentoDecendialPrimeiro));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "pagamentoDecendialSegundo", pagamentoDecendialSegundo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "pagamentoDecendialTerceiro", pagamentoDecendialTerceiro));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "pagamentoQuinzenalPrimeiro", pagamentoQuinzenalPrimeiro));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "pagamentoQuinzenalSegundo", pagamentoQuinzenalSegundo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "percentualRAV", percentualRAV));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "recebeRAV", recebeRAV));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "percentualMultiplica", percentualMultiplica));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "taxaAdm", taxaAdm));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "taxaBanco", taxaBanco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteRAV", limiteRAV));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idCredorRAV", idCredorRAV));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

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
        return (PageGrupoEconomicoResponse) ApiInvoker.deserialize(response, "", PageGrupoEconomicoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista as Maquinetas
   * Este m\u00C3\u00A9todo permite que sejam listadas as maquinetas existentes na base de dados do Emissor.
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param idEstabelecimento C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Tipo do Estabelecimento (id).
   * @return PageMaquinetaResponse
   */
  public PageMaquinetaResponse  listarUsingGET25 (List<String> sort, Integer page, Integer limit, Long idEstabelecimento) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/maquinetas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEstabelecimento", idEstabelecimento));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

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
        return (PageMaquinetaResponse) ApiInvoker.deserialize(response, "", PageMaquinetaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista os tipos de moedas do emissor 
   * Este recurso permite que sejam listados os tipos de moedas existentes na base de dados do emissor.
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param codigoMoeda C\u00C3\u00B3digo identificador do tipo de moeda.
   * @param simbolo S\u00C3\u00ADmbolo da Moeda.
   * @param descricao Descri\u00C3\u00A7\u00C3\u00A3o do tipo da moeda.
   * @return PageMoedaResponse
   */
  public PageMoedaResponse  listarUsingGET26 (List<String> sort, Integer page, Integer limit, String codigoMoeda, String simbolo, String descricao) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/tipos-moedas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "codigoMoeda", codigoMoeda));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "simbolo", simbolo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "descricao", descricao));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

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
        return (PageMoedaResponse) ApiInvoker.deserialize(response, "", PageMoedaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista as Regras Opera\u00C3\u00A7\u00C3\u00B5es
   * Este m\u00C3\u00A9todo permite que sejam listados as Regras opera\u00C3\u00A7\u00C3\u00B5es existentes na base de dados do Emissor.
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param idOperacao Apresenta o id da Opera\u00C3\u00A7\u00C3\u00A3o.
   * @param idCredor Apresenta o id do Credor.
   * @param idProduto Apresenta o id do produto que vai ser alterado.
   * @return PageOperacaoCredorResponse
   */
  public PageOperacaoCredorResponse  listarUsingGET27 (List<String> sort, Integer page, Integer limit, Long idOperacao, Long idCredor, Long idProduto) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/regras-operacoes-estabelecimentos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idOperacao", idOperacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idCredor", idCredor));
    
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
        return (PageOperacaoCredorResponse) ApiInvoker.deserialize(response, "", PageOperacaoCredorResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista os Telefones Estabelecimentos
   * Este m\u00C3\u00A9todo permite que sejam listados os telefones dos estabelecimentos existentes na base de dados do Emissor.
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param idEstabelecimento C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Tipo do Estabelecimento (id).
   * @return PageTelefoneEstabelecimentoResponse
   */
  public PageTelefoneEstabelecimentoResponse  listarUsingGET38 (List<String> sort, Integer page, Integer limit, Long idEstabelecimento) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/telefones-estabelecimentos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEstabelecimento", idEstabelecimento));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

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
        return (PageTelefoneEstabelecimentoResponse) ApiInvoker.deserialize(response, "", PageTelefoneEstabelecimentoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista os Terminais cadastrados no Emissor
   * Este m\u00C3\u00A9todo permite que sejam listados os terminais existentes na base de dados do Emissor.
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Terminal (id).
   * @param terminal C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do terminal.
   * @param numeroEstabelecimento N\u00C3\u00BAmero do estabelecimento a qual o terminal pertence.
   * @param idEstabelecimento N\u00C3\u00BAmero de identifica\u00C3\u00A7\u00C3\u00A3o do estabelecimento a qual o terminal pertence.
   * @return PageTerminalResponse
   */
  public PageTerminalResponse  listarUsingGET40 (List<String> sort, Integer page, Integer limit, Long id, String terminal, Long numeroEstabelecimento, Long idEstabelecimento) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/terminais".replaceAll("\\{format\\}","json");

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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "terminal", terminal));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroEstabelecimento", numeroEstabelecimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEstabelecimento", idEstabelecimento));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

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
        return (PageTerminalResponse) ApiInvoker.deserialize(response, "", PageTerminalResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista os V\u00C3\u00ADnculos dos estabelecimento com os adquirentes
   * Este m\u00C3\u00A9todo permite que sejam listados os V\u00C3\u00ADnculos dos estabelecimento com os adquirentes.
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param idAdquirente C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do adquirente (id).
   * @param idEstabelecimento C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do estabelecimento.
   * @param codigoEstabelecimentoAdquirente C\u00C3\u00B3digo do v\u00C3\u00ADnculo entre o estabelecimento e o adquirente.
   * @return PageVinculoEstabelecimentoAdquirenteResponse
   */
  public PageVinculoEstabelecimentoAdquirenteResponse  listarUsingGET51 (List<String> sort, Integer page, Integer limit, Long idAdquirente, Long idEstabelecimento, String codigoEstabelecimentoAdquirente) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/adquirentes-estabelecimento".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idAdquirente", idAdquirente));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEstabelecimento", idEstabelecimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "codigoEstabelecimentoAdquirente", codigoEstabelecimentoAdquirente));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

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
        return (PageVinculoEstabelecimentoAdquirenteResponse) ApiInvoker.deserialize(response, "", PageVinculoEstabelecimentoAdquirenteResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista os v\u00C3\u00ADnculos cadastrados no Emissor
   * Este m\u00C3\u00A9todo permite que sejam listados os v\u00C3\u00ADnculos opera\u00C3\u00A7\u00C3\u00B5es existentes na base de dados do Emissor.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do estabelecimento (id).
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param idProduto C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto (id).
   * @param idOperacao C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Opera\u00C3\u00A7\u00C3\u00A3o (id).
   * @param codigoMCC C\u00C3\u00B3digo MCC.
   * @return PageVinculoOperacaoResponse
   */
  public PageVinculoOperacaoResponse  listarUsingGET52 (Long id, List<String> sort, Integer page, Integer limit, Long idProduto, Long idOperacao, Integer codigoMCC) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarUsingGET52");
    }
    

    // create path and map variables
    String path = "/api/estabelecimentos/{id}/operacoes".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idOperacao", idOperacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "codigoMCC", codigoMCC));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

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
        return (PageVinculoOperacaoResponse) ApiInvoker.deserialize(response, "", PageVinculoOperacaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza o cadastro de uma nova maquineta para um estabelecimento 
   * Este m\u00C3\u00A9todo permite que seja cadastrada uma nova maquineta para um estabelecimento.
   * @param maquinetaPersist maquinetaPersist
   * @return MaquinetaResponse
   */
  public MaquinetaResponse  salvarUsingPOST16 (MaquinetaPersist maquinetaPersist) throws ApiException {
    Object postBody = maquinetaPersist;
    
    // verify the required parameter 'maquinetaPersist' is set
    if (maquinetaPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'maquinetaPersist' when calling salvarUsingPOST16");
    }
    

    // create path and map variables
    String path = "/api/maquinetas".replaceAll("\\{format\\}","json");

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
        return (MaquinetaResponse) ApiInvoker.deserialize(response, "", MaquinetaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza o cadastro de uma nova Regra Opera\u00C3\u00A7\u00C3\u00A3o
   * Este m\u00C3\u00A9todo permite que seja cadastrada uma nova Regra Opera\u00C3\u00A7\u00C3\u00A3o.
   * @param oprecaoCredorPersist oprecaoCredorPersist
   * @return OperacaoCredorResponse
   */
  public OperacaoCredorResponse  salvarUsingPOST17 (OperacaoCredorPersist oprecaoCredorPersist) throws ApiException {
    Object postBody = oprecaoCredorPersist;
    
    // verify the required parameter 'oprecaoCredorPersist' is set
    if (oprecaoCredorPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'oprecaoCredorPersist' when calling salvarUsingPOST17");
    }
    

    // create path and map variables
    String path = "/api/regras-operacoes-estabelecimentos".replaceAll("\\{format\\}","json");

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
        return (OperacaoCredorResponse) ApiInvoker.deserialize(response, "", OperacaoCredorResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza o cadastro de um novo telefone para um estabelecimento 
   * Este m\u00C3\u00A9todo permite que seja cadastrado um novo telefone para um estabelecimento.
   * @param idEstabelecimento C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Estabelecimento (id).
   * @param ddd C\u00C3\u00B3digo DDD do telefone (id).
   * @param telefone N\u00C3\u00BAmero do telefone.
   * @param ramal N\u00C3\u00BAmero do ramal.
   * @return TelefoneEstabelecimentoResponse
   */
  public TelefoneEstabelecimentoResponse  salvarUsingPOST22 (Long idEstabelecimento, String ddd, String telefone, String ramal) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idEstabelecimento' is set
    if (idEstabelecimento == null) {
       throw new ApiException(400, "Missing the required parameter 'idEstabelecimento' when calling salvarUsingPOST22");
    }
    
    // verify the required parameter 'ddd' is set
    if (ddd == null) {
       throw new ApiException(400, "Missing the required parameter 'ddd' when calling salvarUsingPOST22");
    }
    
    // verify the required parameter 'telefone' is set
    if (telefone == null) {
       throw new ApiException(400, "Missing the required parameter 'telefone' when calling salvarUsingPOST22");
    }
    

    // create path and map variables
    String path = "/api/telefones-estabelecimentos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEstabelecimento", idEstabelecimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "ddd", ddd));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "telefone", telefone));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "ramal", ramal));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

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
        return (TelefoneEstabelecimentoResponse) ApiInvoker.deserialize(response, "", TelefoneEstabelecimentoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza o cadastro de um novo Terminal
   * Este m\u00C3\u00A9todo permite que seja cadastrado um novo Terminal.
   * @param terminalPersist terminalPersist
   * @return TerminalResponse
   */
  public TerminalResponse  salvarUsingPOST24 (TerminalPersist terminalPersist) throws ApiException {
    Object postBody = terminalPersist;
    
    // verify the required parameter 'terminalPersist' is set
    if (terminalPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'terminalPersist' when calling salvarUsingPOST24");
    }
    

    // create path and map variables
    String path = "/api/terminais".replaceAll("\\{format\\}","json");

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
        return (TerminalResponse) ApiInvoker.deserialize(response, "", TerminalResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza o cadastro de um novo VinculoEstabelecimentoAdquirente
   * Este m\u00C3\u00A9todo permite que seja cadastrado um novo VinculoEstabelecimentoAdquirente.
   * @param vinculoEstabelecimentoAdquirentePersist vinculoEstabelecimentoAdquirentePersist
   * @return VinculoEstabelecimentoAdquirenteResponse
   */
  public VinculoEstabelecimentoAdquirenteResponse  salvarUsingPOST29 (VinculoEstabelecimentoAdquirentePersist vinculoEstabelecimentoAdquirentePersist) throws ApiException {
    Object postBody = vinculoEstabelecimentoAdquirentePersist;
    
    // verify the required parameter 'vinculoEstabelecimentoAdquirentePersist' is set
    if (vinculoEstabelecimentoAdquirentePersist == null) {
       throw new ApiException(400, "Missing the required parameter 'vinculoEstabelecimentoAdquirentePersist' when calling salvarUsingPOST29");
    }
    

    // create path and map variables
    String path = "/api/adquirentes-estabelecimento".replaceAll("\\{format\\}","json");

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
        return (VinculoEstabelecimentoAdquirenteResponse) ApiInvoker.deserialize(response, "", VinculoEstabelecimentoAdquirenteResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
