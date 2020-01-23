package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.EstabelecimentoUpdate;
import br.com.conductor.pier.api.v2.model.EstabelecimentoResponse;
import br.com.conductor.pier.api.v2.model.GrupoEconomicoDTO;
import br.com.conductor.pier.api.v2.model.GrupoEconomicoResponse;
import br.com.conductor.pier.api.v2.model.GrupoEstabelecimentoUpdate;
import br.com.conductor.pier.api.v2.model.GrupoEstabelecimentoResponse;
import br.com.conductor.pier.api.v2.model.MaquinetaResponse;
import br.com.conductor.pier.api.v2.model.MaquinetaUpdate;
import br.com.conductor.pier.api.v2.model.OperacaoCredorUpdate;
import br.com.conductor.pier.api.v2.model.OperacaoCredorResponse;
import br.com.conductor.pier.api.v2.model.OrigemComercialUpdate;
import br.com.conductor.pier.api.v2.model.OrigemComercialResponse;
import br.com.conductor.pier.api.v2.model.TelefoneEstabelecimentoResponse;
import br.com.conductor.pier.api.v2.model.TelefoneEstabelecimentoUpdate;
import br.com.conductor.pier.api.v2.model.TerminalUpdate;
import br.com.conductor.pier.api.v2.model.TerminalResponse;
import br.com.conductor.pier.api.v2.model.OrigemComercialPersist;
import br.com.conductor.pier.api.v2.model.DetalheOperacaoResponse;
import br.com.conductor.pier.api.v2.model.VinculoEstabelecimentoAdquirenteResponse;
import br.com.conductor.pier.api.v2.model.VinculoOperacaoPersist;
import br.com.conductor.pier.api.v2.model.PageEstabelecimentoResponse;
import br.com.conductor.pier.api.v2.model.PageMCCResponse;
import java.math.BigDecimal;
import br.com.conductor.pier.api.v2.model.PageGrupoEconomicoResponse;
import br.com.conductor.pier.api.v2.model.PageGrupoOrigemComercialResponse;
import br.com.conductor.pier.api.v2.model.PageMaquinetaResponse;
import br.com.conductor.pier.api.v2.model.PageMoedaResponse;
import br.com.conductor.pier.api.v2.model.PageOperacaoResponse;
import br.com.conductor.pier.api.v2.model.PageOperacaoCredorResponse;
import br.com.conductor.pier.api.v2.model.PageVinculoOperacaoResponse;
import br.com.conductor.pier.api.v2.model.PageOrigemComercialResponse;
import br.com.conductor.pier.api.v2.model.PageTelefoneEstabelecimentoResponse;
import br.com.conductor.pier.api.v2.model.PageTerminalResponse;
import br.com.conductor.pier.api.v2.model.PageEntidadeResponse;
import br.com.conductor.pier.api.v2.model.PageTipoEstabelecimentoResponse;
import br.com.conductor.pier.api.v2.model.PageCampoCodificadoDescricaoResponse;
import br.com.conductor.pier.api.v2.model.PageTipoOrigemComercialResponse;
import br.com.conductor.pier.api.v2.model.PageTipoTerminalResponse;
import br.com.conductor.pier.api.v2.model.PageTipoTerminalTransacoesResponse;
import br.com.conductor.pier.api.v2.model.VinculoOperacaoResponse;
import br.com.conductor.pier.api.v2.model.PageVinculoEstabelecimentoAdquirenteResponse;
import br.com.conductor.pier.api.v2.model.EstabelecimentoPersist;
import br.com.conductor.pier.api.v2.model.GrupoEstabelecimentoPersist;
import br.com.conductor.pier.api.v2.model.MaquinetaPersist;
import br.com.conductor.pier.api.v2.model.OperacaoCredorPersist;
import br.com.conductor.pier.api.v2.model.TelefoneEstabelecimentoPersist;
import br.com.conductor.pier.api.v2.model.TerminalPersist;
import br.com.conductor.pier.api.v2.model.VinculoEstabelecimentoAdquirentePersist;
import br.com.conductor.pier.api.v2.model.ResponseEntity;
import java.util.*;

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
   * Alterar um estabelecimento
   * Altera um estabelecimento
   * @param id Id
   * @param update update
   * @return EstabelecimentoResponse
   */
  public EstabelecimentoResponse  alterarEstabelecimento (Long id, EstabelecimentoUpdate update) throws ApiException {
    Object postBody = update;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarEstabelecimento");
    }
    
    // verify the required parameter 'update' is set
    if (update == null) {
       throw new ApiException(400, "Missing the required parameter 'update' when calling alterarEstabelecimento");
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
   * Alterar Grupo Econ\u00F4mico
   * Altera um grupo econ\u00F4mico
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do grupo econ\u00F4mico
   * @param grupoEconomicoDTO grupoEconomicoDTO
   * @return GrupoEconomicoResponse
   */
  public GrupoEconomicoResponse  alterarGrupoEconomico (Long id, GrupoEconomicoDTO grupoEconomicoDTO) throws ApiException {
    Object postBody = grupoEconomicoDTO;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarGrupoEconomico");
    }
    
    // verify the required parameter 'grupoEconomicoDTO' is set
    if (grupoEconomicoDTO == null) {
       throw new ApiException(400, "Missing the required parameter 'grupoEconomicoDTO' when calling alterarGrupoEconomico");
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
   * Alterar Grupo Estabelecimento
   * Altera um grupo de estabelecimento
   * @param id id
   * @param grupoEstabelecimentoUpdate grupoEstabelecimentoUpdate
   * @return GrupoEstabelecimentoResponse
   */
  public GrupoEstabelecimentoResponse  alterarGrupoEstabelecimentos (Long id, GrupoEstabelecimentoUpdate grupoEstabelecimentoUpdate) throws ApiException {
    Object postBody = grupoEstabelecimentoUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarGrupoEstabelecimentos");
    }
    
    // verify the required parameter 'grupoEstabelecimentoUpdate' is set
    if (grupoEstabelecimentoUpdate == null) {
       throw new ApiException(400, "Missing the required parameter 'grupoEstabelecimentoUpdate' when calling alterarGrupoEstabelecimentos");
    }
    

    // create path and map variables
    String path = "/api/grupos-estabelecimentos/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (GrupoEstabelecimentoResponse) ApiInvoker.deserialize(response, "", GrupoEstabelecimentoResponse.class);
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
   * Este m\u00E9todo realiza a altera\u00E7\u00E3o das maquinetas dos estabelecimentos
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da Maquineta (id)
   * @param maquinetaUpdate maquinetaUpdate
   * @return MaquinetaResponse
   */
  public MaquinetaResponse  alterarMaquineta (Long id, MaquinetaUpdate maquinetaUpdate) throws ApiException {
    Object postBody = maquinetaUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarMaquineta");
    }
    
    // verify the required parameter 'maquinetaUpdate' is set
    if (maquinetaUpdate == null) {
       throw new ApiException(400, "Missing the required parameter 'maquinetaUpdate' when calling alterarMaquineta");
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
   * Altera uma Regra Opera\u00E7\u00E3o
   * Este m\u00E9todo realiza a altera\u00E7\u00E3o de uma regra opera\u00E7\u00E3o
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da Regra Opera\u00E7\u00E3o (id)
   * @param operacaoCredorUpdate operacaoCredorUpdate
   * @return OperacaoCredorResponse
   */
  public OperacaoCredorResponse  alterarOperacaoCredor (Long id, OperacaoCredorUpdate operacaoCredorUpdate) throws ApiException {
    Object postBody = operacaoCredorUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarOperacaoCredor");
    }
    
    // verify the required parameter 'operacaoCredorUpdate' is set
    if (operacaoCredorUpdate == null) {
       throw new ApiException(400, "Missing the required parameter 'operacaoCredorUpdate' when calling alterarOperacaoCredor");
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
   * Alterar Origem Comercial
   * Altera uma origem comercial
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da origem comercial
   * @param origemComercialUpdate origemComercialUpdate
   * @return OrigemComercialResponse
   */
  public OrigemComercialResponse  alterarOrigemComercial (Long id, OrigemComercialUpdate origemComercialUpdate) throws ApiException {
    Object postBody = origemComercialUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarOrigemComercial");
    }
    
    // verify the required parameter 'origemComercialUpdate' is set
    if (origemComercialUpdate == null) {
       throw new ApiException(400, "Missing the required parameter 'origemComercialUpdate' when calling alterarOrigemComercial");
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
   * Altera um Telefone do estabelecimento
   * Este m\u00E9todo realiza a altera\u00E7\u00E3o dos telefones dos estabelecimentos
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Telefone Estabelecimento (id)
   * @param telefoneEstabelecimentoUpdate telefoneEstabelecimentoUpdate
   * @return TelefoneEstabelecimentoResponse
   */
  public TelefoneEstabelecimentoResponse  alterarTelefoneEstabelecimento (Long id, TelefoneEstabelecimentoUpdate telefoneEstabelecimentoUpdate) throws ApiException {
    Object postBody = telefoneEstabelecimentoUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarTelefoneEstabelecimento");
    }
    
    // verify the required parameter 'telefoneEstabelecimentoUpdate' is set
    if (telefoneEstabelecimentoUpdate == null) {
       throw new ApiException(400, "Missing the required parameter 'telefoneEstabelecimentoUpdate' when calling alterarTelefoneEstabelecimento");
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
   * Este m\u00E9todo realiza a altera\u00E7\u00E3o dos Terminais
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do terminal (id)
   * @param terminalUpdate terminalUpdate
   * @return TerminalResponse
   */
  public TerminalResponse  alterarTerminal (Long id, TerminalUpdate terminalUpdate) throws ApiException {
    Object postBody = terminalUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarTerminal");
    }
    
    // verify the required parameter 'terminalUpdate' is set
    if (terminalUpdate == null) {
       throw new ApiException(400, "Missing the required parameter 'terminalUpdate' when calling alterarTerminal");
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
   * Cadastrar Origem Comercial
   * Cadastra uma origem comercial
   * @param origemComercialPersist origemComercialPersist
   * @return OrigemComercialResponse
   */
  public OrigemComercialResponse  cadastrarOrigemComercial (OrigemComercialPersist origemComercialPersist) throws ApiException {
    Object postBody = origemComercialPersist;
    
    // verify the required parameter 'origemComercialPersist' is set
    if (origemComercialPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'origemComercialPersist' when calling cadastrarOrigemComercial");
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
   * Consultar estabelecimento por id
   * Consulta os detalhes de um determinado estabelecimento
   * @param id Id
   * @return EstabelecimentoResponse
   */
  public EstabelecimentoResponse  consultarEstabelecimento (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarEstabelecimento");
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
   * Consultar grupo econ\u00F4mico
   * Consulta um grupo econ\u00F4mico atrav\u00E9s do seu identificador
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do grupo econ\u00F4mico
   * @return GrupoEconomicoResponse
   */
  public GrupoEconomicoResponse  consultarGrupoEconomico (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarGrupoEconomico");
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
   * Consultar grupo de estabelecimento
   * Consulta um grupo de estabelecimento atrav\u00E9s do seu identificador
   * @param id id
   * @return GrupoEstabelecimentoResponse
   */
  public GrupoEstabelecimentoResponse  consultarGrupoEstabelecimentos (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarGrupoEstabelecimentos");
    }
    

    // create path and map variables
    String path = "/api/grupos-estabelecimentos/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (GrupoEstabelecimentoResponse) ApiInvoker.deserialize(response, "", GrupoEstabelecimentoResponse.class);
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
   * Este m\u00E9todo permite consultar uma determinada maquineta a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da Maquineta (id)
   * @return MaquinetaResponse
   */
  public MaquinetaResponse  consultarMaquineta (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarMaquineta");
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
   * Apresenta dados de um determinado tipo de opera\u00E7\u00E3o
   * Este recurso permite consultar dados de um determinado tipo opera\u00E7\u00E3o a partir do idoperacao
   * @param id C\u00F3digo de processamento da opera\u00E7\u00E3o (idOperacao)
   * @return DetalheOperacaoResponse
   */
  public DetalheOperacaoResponse  consultarOperacao (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarOperacao");
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
   * Apresenta os dados de uma determinada Regra Opera\u00E7\u00E3o
   * Este m\u00E9todo permite consultar uma determinada regra opera\u00E7\u00E3o a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da Regra Opera\u00E7\u00E3o (id)
   * @return OperacaoCredorResponse
   */
  public OperacaoCredorResponse  consultarOperacaoCredor (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarOperacaoCredor");
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
   * Consultar Origem Comercial
   * Consulta uma origem comercial atrav\u00E9s do seu identificador
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da origem comercial
   * @return OrigemComercialResponse
   */
  public OrigemComercialResponse  consultarOrigemComercial (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarOrigemComercial");
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
   * Apresenta os dados de um determinado telefone de um estabelecimento
   * Este m\u00E9todo permite consultar um determinado telefone de um estabelecimento a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Telefone Estabelecimento (id)
   * @return TelefoneEstabelecimentoResponse
   */
  public TelefoneEstabelecimentoResponse  consultarTelefoneEstabelecimento (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTelefoneEstabelecimento");
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
   * Este m\u00E9todo permite consultar um determinado Terminal a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Terminal (id)
   * @return TerminalResponse
   */
  public TerminalResponse  consultarTerminal (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTerminal");
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
   * Apresenta os dados de um determinado V\u00EDnculo
   * Este m\u00E9todo permite consultar um determinado V\u00EDnculo a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do V\u00EDnculo (id)
   * @return VinculoEstabelecimentoAdquirenteResponse
   */
  public VinculoEstabelecimentoAdquirenteResponse  consultarVinculoEstabelecimentoAdquirente (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarVinculoEstabelecimentoAdquirente");
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
   * Desabilitar um v\u00EDnculo opera\u00E7\u00E3o
   * Este m\u00E9todo permite desabilitar um v\u00EDnculo
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do estabelecimento (id)
   * @param vinculoOperacaoPersist vinculoOperacaoPersist
   * @return Object
   */
  public Object  desabilitarOperacaoEstabelecimento (Long id, VinculoOperacaoPersist vinculoOperacaoPersist) throws ApiException {
    Object postBody = vinculoOperacaoPersist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling desabilitarOperacaoEstabelecimento");
    }
    
    // verify the required parameter 'vinculoOperacaoPersist' is set
    if (vinculoOperacaoPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'vinculoOperacaoPersist' when calling desabilitarOperacaoEstabelecimento");
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
   * Desabilitar um V\u00EDnculo
   * Este m\u00E9todo realiza a desativa\u00E7\u00E3o de um v\u00EDnculo
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do V\u00EDnculo (id)
   * @return Object
   */
  public Object  desabilitarVinculoEstabelecimentoAdquirente (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling desabilitarVinculoEstabelecimentoAdquirente");
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
   * Habilitar um v\u00EDnculo opera\u00E7\u00E3o
   * Este m\u00E9todo permite habilitar um v\u00EDnculo
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do estabelecimento (id)
   * @param vinculoOperacaoPersist vinculoOperacaoPersist
   * @return Object
   */
  public Object  habilitarOperacaoEstabelecimento (Long id, VinculoOperacaoPersist vinculoOperacaoPersist) throws ApiException {
    Object postBody = vinculoOperacaoPersist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling habilitarOperacaoEstabelecimento");
    }
    
    // verify the required parameter 'vinculoOperacaoPersist' is set
    if (vinculoOperacaoPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'vinculoOperacaoPersist' when calling habilitarOperacaoEstabelecimento");
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
   * Habilitar um V\u00EDnculo
   * Este m\u00E9todo realiza a ativa\u00E7\u00E3o de um v\u00EDnculo
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do V\u00EDnculo (id)
   * @return Object
   */
  public Object  habilitarVinculoEstabelecimentoAdquirente (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling habilitarVinculoEstabelecimentoAdquirente");
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
   * Lista Estabelecimentos
   * Lista todos os Estabelecimentos
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do estabelecimento (id)
   * @param idGrupoEconomico Apresenta o n\u00FAmero de identifica\u00E7\u00E3o do Grupo Econ\u00F4mico
   * @param numeroReceitaFederal List o n\u00FAmero do estabelecimento na receita federal
   * @param nome Nome do Estabelecimento
   * @param descricao Raz\u00E3o Social do Estabelecimento
   * @param nomeFantasia T\u00EDtulo Comercial do Estabelecimento
   * @param cep C\u00F3digo de Endere\u00E7amento Postal (CEP)
   * @param nomeLogradouro Nome do Logradouro
   * @param numeroEndereco N\u00FAmero do endere\u00E7o
   * @param complemento Descri\u00E7\u00F5es complementares referente ao endere\u00E7o
   * @param bairro Nome do bairro do endere\u00E7o
   * @param cidade Nome da cidade do endere\u00E7o
   * @param uf Sigla de identifica\u00E7\u00E3o da Unidade Federativa do endere\u00E7o
   * @param pais Nome do pa\u00EDs
   * @param dataCadastramento Data de Cadastro do Estabelecimento, no formato yyyy-MM-dd
   * @param contato Nome da pessoa para contato com o Estabelecimento
   * @param email E-mail da pessoa para contato com o Estabelecimento
   * @param flagArquivoSecrFazenda Indica se o estabelecimento ser\u00E1 inclu\u00EDdo no arquivo de registro para a Secretaria da Fazenda Estadual
   * @param flagCartaoDigitado Indica se o estabelecimento poder\u00E1 originar transa\u00E7\u00F5es sem a leitura da tarja ou do chip do cart\u00E3o
   * @param inativo Indica se o estabelecimento est\u00E1 inativo
   * @param idPais Identificador de Pa\u00EDs
   * @param mcc C\u00F3digo de Categoria de Mercado
   * @param idTipoEstabelecimento C\u00F3digo de identifica\u00E7\u00E3o do tipo de Estabelecimento
   * @param correspondencia Indicador para qual endere\u00E7o as correspond\u00EAncias ser\u00E3o enviadas, onde 1 \u00E9 ORIGEM e 2 ENDERE\u00C7O DE CORRESPOND\u00CANCIA
   * @param idMoeda C\u00F3digo identificador da moeda
   * @param tipoPagamento Tipo do regime de pagamento do estabelecimento
   * @param numeroEstabelecimento N\u00FAmero de identifica\u00E7\u00E3o do Estabelecimento na Conductor
   * @param cep2 C\u00F3digo de Endere\u00E7amento Postal (CEP)
   * @param nomeLogradouro2 Nome do Logradouro
   * @param numeroEndereco2 N\u00FAmero do endere\u00E7o
   * @param complemento2 Descri\u00E7\u00F5es complementares referente ao endere\u00E7o
   * @param bairro2 Nome do bairro do endere\u00E7o
   * @param cidade2 Nome da cidade do endere\u00E7o
   * @param uf2 Sigla de identifica\u00E7\u00E3o da Unidade Federativa do endere\u00E7o
   * @param flagMatriz Indica se \u00E9 matriz ou filial
   * @return PageEstabelecimentoResponse
   */
  public PageEstabelecimentoResponse  listarEstabelecimentos (List<String> sort, Integer page, Integer limit, Long id, Long idGrupoEconomico, String numeroReceitaFederal, String nome, String descricao, String nomeFantasia, String cep, String nomeLogradouro, Integer numeroEndereco, String complemento, String bairro, String cidade, String uf, String pais, String dataCadastramento, String contato, String email, Integer flagArquivoSecrFazenda, Integer flagCartaoDigitado, Integer inativo, Long idPais, Long mcc, Long idTipoEstabelecimento, Integer correspondencia, Long idMoeda, String tipoPagamento, String numeroEstabelecimento, String cep2, String nomeLogradouro2, Integer numeroEndereco2, String complemento2, String bairro2, String cidade2, String uf2, Integer flagMatriz) throws ApiException {
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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idGrupoEconomico", idGrupoEconomico));
    
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
   * Lista os MCCs
   * Este m\u00E9todo permite que sejam listados os MCCs existentes na base de dados do Emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param id MCC dto id
   * @param descricao MCC dto descri\u00E7\u00E3o
   * @param duracao MCC dto duracao
   * @param percentualMinimo MCC dto percentual m\u00EDnimo
   * @param percentualMaximo MCC dto percentual m\u00E1ximo
   * @param idGrupoMCC MCC dto grupo MCC
   * @return PageMCCResponse
   */
  public PageMCCResponse  listarEstabelecimentosMCC (List<String> sort, Integer page, Integer limit, Long id, String descricao, Integer duracao, BigDecimal percentualMinimo, BigDecimal percentualMaximo, Long idGrupoMCC) throws ApiException {
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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "duracao", duracao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "percentualMinimo", percentualMinimo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "percentualMaximo", percentualMaximo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idGrupoMCC", idGrupoMCC));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

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
   * Lista os grupos de estabelecimento na base
   * Este m\u00E9todo permite que sejam listados todos os grupos de estabelecimento existentes na base do emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param descricao Descri\u00E7\u00E3o do grupo de estabelecimento
   * @param idLayout idLayout
   * @return GrupoEstabelecimentoResponse
   */
  public GrupoEstabelecimentoResponse  listarGrupoEstabelecimentos (List<String> sort, Integer page, Integer limit, String descricao, Long idLayout) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/grupos-estabelecimentos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idLayout", idLayout));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

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
        return (GrupoEstabelecimentoResponse) ApiInvoker.deserialize(response, "", GrupoEstabelecimentoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Listar grupos econ\u00F4micos
   * Lista grupos econ\u00F4micos cadastrados
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param razaoSocial Raz\u00E3o social da pessoa jur\u00EDdica
   * @param nomeCredor Nome do credor
   * @param numeroReceitaFederal N\u00FAmero da Receita Federal
   * @param inscricaoEstadual N\u00FAmero da inscri\u00E7\u00E3o estadual
   * @param contato Nome da pessoa para entrar em contato
   * @param banco C\u00F3digo do banco
   * @param agencia Raz\u00E3o social da pessoa jur\u00EDdica
   * @param digitoAgencia D\u00EDgito Verificador da ag\u00EAncia
   * @param contaCorrente C\u00F3digo da Conta Corrente
   * @param digitoContaCorrente D\u00EDgito Verificador da Conta Corrente
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
   * @param idCredorRAV C\u00F3digo identificador do credor RAV
   * @return PageGrupoEconomicoResponse
   */
  public PageGrupoEconomicoResponse  listarGruposEconomicos (List<String> sort, Integer page, Integer limit, String razaoSocial, String nomeCredor, String numeroReceitaFederal, String inscricaoEstadual, String contato, Integer banco, Integer agencia, String digitoAgencia, String contaCorrente, String digitoContaCorrente, String periodicidade, String pagamentoSemanal, Integer pagamentoMensal, Integer pagamentoDecendialPrimeiro, Integer pagamentoDecendialSegundo, Integer pagamentoDecendialTerceiro, Integer pagamentoQuinzenalPrimeiro, Integer pagamentoQuinzenalSegundo, BigDecimal percentualRAV, String recebeRAV, BigDecimal percentualMultiplica, BigDecimal taxaAdm, BigDecimal taxaBanco, BigDecimal limiteRAV, Long idCredorRAV) throws ApiException {
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
   * Listar grupos de origens comerciais
   * Lista os grupos de origens comerciais
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param nome Nome do grupo de origem comercial
   * @return PageGrupoOrigemComercialResponse
   */
  public PageGrupoOrigemComercialResponse  listarGruposOrigensComerciais (List<String> sort, Integer page, Integer limit, String nome) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/grupos-origens-comerciais".replaceAll("\\{format\\}","json");

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
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

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
        return (PageGrupoOrigemComercialResponse) ApiInvoker.deserialize(response, "", PageGrupoOrigemComercialResponse.class);
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
   * Este m\u00E9todo permite que sejam listadas as maquinetas existentes na base de dados do Emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idEstabelecimento C\u00F3digo de Identifica\u00E7\u00E3o do Tipo do Estabelecimento (id)
   * @return PageMaquinetaResponse
   */
  public PageMaquinetaResponse  listarMaquinetas (List<String> sort, Integer page, Integer limit, Long idEstabelecimento) throws ApiException {
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
   * Lista os mccs vinculados a opera\u00E7\u00E3o, produto e estabelecimento
   * Este m\u00E9todo permite listar os Mccs vinculados a opera\u00E7\u00E3o, produto e estabelcimento
   * @param idEstabelecimento C\u00F3digo de Identifica\u00E7\u00E3o do estabelecimento (id)
   * @param idOperacao C\u00F3digo de Identifica\u00E7\u00E3o da opera\u00E7\u00E3o (id)
   * @param idProduto C\u00F3digo de Identifica\u00E7\u00E3o do produto (id)
   * @return Object
   */
  public Object  listarMccVinculoProdutoOperacao (Long idEstabelecimento, Long idOperacao, Long idProduto) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idEstabelecimento' is set
    if (idEstabelecimento == null) {
       throw new ApiException(400, "Missing the required parameter 'idEstabelecimento' when calling listarMccVinculoProdutoOperacao");
    }
    
    // verify the required parameter 'idOperacao' is set
    if (idOperacao == null) {
       throw new ApiException(400, "Missing the required parameter 'idOperacao' when calling listarMccVinculoProdutoOperacao");
    }
    
    // verify the required parameter 'idProduto' is set
    if (idProduto == null) {
       throw new ApiException(400, "Missing the required parameter 'idProduto' when calling listarMccVinculoProdutoOperacao");
    }
    

    // create path and map variables
    String path = "/api/estabelecimentos/{idEstabelecimento}/produtos/{idProduto}/operacoes/{idOperacao}/codigosMCC".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idEstabelecimento" + "\\}", apiInvoker.escapeString(idEstabelecimento.toString())).replaceAll("\\{" + "idOperacao" + "\\}", apiInvoker.escapeString(idOperacao.toString())).replaceAll("\\{" + "idProduto" + "\\}", apiInvoker.escapeString(idProduto.toString()));

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
   * Lista os tipos de moedas do emissor
   * Este recurso permite que sejam listados os tipos de moedas existentes na base de dados do emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param codigoMoeda C\u00F3digo identificador do tipo de moeda
   * @param simbolo S\u00EDmbolo da Moeda
   * @param descricao Descri\u00E7\u00E3o do tipo da moeda
   * @return PageMoedaResponse
   */
  public PageMoedaResponse  listarMoedas (List<String> sort, Integer page, Integer limit, String codigoMoeda, String simbolo, String descricao) throws ApiException {
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
   * Apresenta dados de opera\u00E7\u00F5es em uma lista
   * Este recurso permite listar as opera\u00E7\u00E3o
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idOperacao C\u00F3digo que identifica a opera\u00E7\u00E3o
   * @param codigoProcessamento C\u00F3digo de processamento usado em transa\u00E7\u00F5es com o autorizador
   * @param nomeOperacao Nome completo da opera\u00E7\u00E3o ou parte do nome da opera\u00E7\u00E3o
   * @return PageOperacaoResponse
   */
  public PageOperacaoResponse  listarOperacoes (List<String> sort, Integer page, Integer limit, Long idOperacao, String codigoProcessamento, String nomeOperacao) throws ApiException {
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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeOperacao", nomeOperacao));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

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
   * Lista as Regras Opera\u00E7\u00F5es
   * Este m\u00E9todo permite que sejam listados as Regras opera\u00E7\u00F5es existentes na base de dados do Emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idOperacao Apresenta o id da Opera\u00E7\u00E3o
   * @param idCredor Apresenta o id do Credor
   * @param idProduto Apresenta o id do produto que vai ser alterado
   * @return PageOperacaoCredorResponse
   */
  public PageOperacaoCredorResponse  listarOperacoesCredores (List<String> sort, Integer page, Integer limit, Long idOperacao, Long idCredor, Long idProduto) throws ApiException {
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
   * Listar v\u00EDnculos de opera\u00E7\u00F5es do estabelecimento
   * Lista os v\u00EDnculos de opera\u00E7\u00F5es do estabelecimento
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do estabelecimento (id)
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idProduto C\u00F3digo de Identifica\u00E7\u00E3o do Produto (id)
   * @param idOperacao C\u00F3digo de Identifica\u00E7\u00E3o da Opera\u00E7\u00E3o (id)
   * @param codigoMCC C\u00F3digo MCC
   * @return PageVinculoOperacaoResponse
   */
  public PageVinculoOperacaoResponse  listarOperacoesEstabelecimento (Long id, List<String> sort, Integer page, Integer limit, Long idProduto, Long idOperacao, Integer codigoMCC) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarOperacoesEstabelecimento");
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
   * Listar Origens Comerciais
   * Lista origens comerciais cadastradas
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param id Id da origem comercial
   * @param nome Nome da origem comercial
   * @param status Indica o status da origem comercial
   * @param idEstabelecimento Identificador do estabelecimento
   * @param idProduto Identificador do produto
   * @param descricao Descri\u00E7\u00E3o da origem comercial
   * @param idTipoOrigemComercial Identificador do tipo de origem comercial
   * @param idGrupoOrigemComercial Identificador do grupo de origem comercial
   * @param flagPreAprovado Indica se permite pr\u00E9 aprova\u00E7\u00E3o
   * @param flagAprovacaoImediata Indica se permite aprova\u00E7\u00E3o imediata
   * @param nomeFantasiaPlastico Nome fantasia impresso no pl\u00E1stico
   * @param flagCartaoProvisorio Indica se permite cart\u00E3o provis\u00F3rio
   * @param flagCartaoDefinitivo Indica se permite cart\u00E3o definitivo
   * @param usuario Usu\u00E1rio para autentica\u00E7\u00E3o
   * @param senha Senha para autentica\u00E7\u00E3o
   * @param flagOrigemExterna Indica se \u00E9 origem externa
   * @param flagModificado Indica se h\u00E1 modifica\u00E7\u00E3o
   * @param flagEnviaFaturaUsuario Indica se envia fatura
   * @param flagCreditoFaturamento Indica se permite cr\u00E9dito de faturamento
   * @param flagConcedeLimiteProvisorio Indica se concede limite provis\u00F3rio
   * @param flagDigitalizarDoc Indica se digitaliza documento
   * @param flagEmbossingLoja Indica se realiza embossing em loja
   * @param flagConsultaPrevia Indica se realiza consulta pr\u00E9via
   * @param tipoPessoa Tipo de pessoa
   * @return PageOrigemComercialResponse
   */
  public PageOrigemComercialResponse  listarOrigensComerciais (List<String> sort, Integer page, Integer limit, Long id, String nome, Integer status, Long idEstabelecimento, Long idProduto, String descricao, Long idTipoOrigemComercial, Long idGrupoOrigemComercial, Boolean flagPreAprovado, Boolean flagAprovacaoImediata, String nomeFantasiaPlastico, Boolean flagCartaoProvisorio, Boolean flagCartaoDefinitivo, String usuario, String senha, Boolean flagOrigemExterna, Boolean flagModificado, Boolean flagEnviaFaturaUsuario, Boolean flagCreditoFaturamento, Boolean flagConcedeLimiteProvisorio, Boolean flagDigitalizarDoc, Boolean flagEmbossingLoja, Boolean flagConsultaPrevia, String tipoPessoa) throws ApiException {
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
   * Lista os Telefones Estabelecimentos
   * Este m\u00E9todo permite que sejam listados os telefones dos estabelecimentos existentes na base de dados do Emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idEstabelecimento C\u00F3digo de Identifica\u00E7\u00E3o do Tipo do Estabelecimento (id)
   * @return PageTelefoneEstabelecimentoResponse
   */
  public PageTelefoneEstabelecimentoResponse  listarTelefonesEstabelecimentos (List<String> sort, Integer page, Integer limit, Long idEstabelecimento) throws ApiException {
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
   * Este m\u00E9todo permite que sejam listados os terminais existentes na base de dados do Emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Terminal (id)
   * @param terminal C\u00F3digo de Identifica\u00E7\u00E3o do terminal
   * @param numeroEstabelecimento N\u00FAmero do estabelecimento a qual o terminal pertence
   * @param idEstabelecimento N\u00FAmero de identifica\u00E7\u00E3o do estabelecimento a qual o terminal pertence
   * @return PageTerminalResponse
   */
  public PageTerminalResponse  listarTerminais (List<String> sort, Integer page, Integer limit, Long id, String terminal, Long numeroEstabelecimento, Long idEstabelecimento) throws ApiException {
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
   * Lista os Tipos de adquirentes
   * Este m\u00E9todo permite que sejam listados os tipos de adquirentes
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageEntidadeResponse
   */
  public PageEntidadeResponse  listarTiposAdquirentes (List<String> sort, Integer page, Integer limit) throws ApiException {
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
   * Lista os tipos de estabelecimentos
   * Lista os tipos de estabelecimentos
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param descricao Descri\u00E7\u00E3o do tipo de estabelecimento
   * @return PageTipoEstabelecimentoResponse
   */
  public PageTipoEstabelecimentoResponse  listarTiposEstabelecimentos (List<String> sort, Integer page, Integer limit, String descricao) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/tipos-estabelecimentos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
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
        return (PageTipoEstabelecimentoResponse) ApiInvoker.deserialize(response, "", PageTipoEstabelecimentoResponse.class);
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
   * Este m\u00E9todo permite que sejam listadas os Tipos de maquinetas existentes na base de dados do Emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageCampoCodificadoDescricaoResponse
   */
  public PageCampoCodificadoDescricaoResponse  listarTiposMaquinetas (List<String> sort, Integer page, Integer limit) throws ApiException {
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
   * Listar tipos de origens comerciais
   * Lista os tipos de origens comerciais
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param nome Nome do tipo de origem comercial
   * @return PageTipoOrigemComercialResponse
   */
  public PageTipoOrigemComercialResponse  listarTiposOrigensComerciais (List<String> sort, Integer page, Integer limit, String nome) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/tipos-origens-comerciais".replaceAll("\\{format\\}","json");

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
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

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
        return (PageTipoOrigemComercialResponse) ApiInvoker.deserialize(response, "", PageTipoOrigemComercialResponse.class);
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
   * Este m\u00E9todo permite que sejam listados os tipos de terminais existentes na base de dados do Emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageTipoTerminalResponse
   */
  public PageTipoTerminalResponse  listarTiposTerminais (List<String> sort, Integer page, Integer limit) throws ApiException {
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
   * Listar transa\u00E7\u00F5es existentes no banco de dados do Terminal
   * Este recurso permite listar transa\u00E7\u00F5es existentes no banco de dados do Terminal
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do terminal (id)
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param dataTransacao Data inicial
   * @param codigoProcessamento C\u00F3digo de processamento da transa\u00E7\u00E3o
   * @param nsuEmissor NSU Emissor
   * @param nsuOrigem NSU Origem
   * @param statusConta Status da conta
   * @param valorTransacao Valor da transa\u00E7\u00E3o
   * @return PageTipoTerminalTransacoesResponse
   */
  public PageTipoTerminalTransacoesResponse  listarTransacoesPorTipoTerminalEstabelecimento (Long id, List<String> sort, Integer page, Integer limit, String dataTransacao, String codigoProcessamento, Integer nsuEmissor, Integer nsuOrigem, Integer statusConta, BigDecimal valorTransacao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarTransacoesPorTipoTerminalEstabelecimento");
    }
    

    // create path and map variables
    String path = "/api/tipos-terminais-estabelecimento/{id}/transacoes".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataTransacao", dataTransacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "codigoProcessamento", codigoProcessamento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nsuEmissor", nsuEmissor));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nsuOrigem", nsuOrigem));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "statusConta", statusConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "valorTransacao", valorTransacao));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

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
        return (PageTipoTerminalTransacoesResponse) ApiInvoker.deserialize(response, "", PageTipoTerminalTransacoesResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista todas as opera\u00E7\u00F5es vinculadas a um estabelecimento e produto
   * Este m\u00E9todo listar todas as opera\u00E7\u00F5es vinculadas a um estabelecimento e produto
   * @param idEstabelecimento C\u00F3digo de Identifica\u00E7\u00E3o do estabelecimento (id)
   * @param idProduto C\u00F3digo de Identifica\u00E7\u00E3o do produto (id)
   * @return VinculoOperacaoResponse
   */
  public VinculoOperacaoResponse  listarVinculoOperacoesProdutoEstabelecimento (Long idEstabelecimento, Long idProduto) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idEstabelecimento' is set
    if (idEstabelecimento == null) {
       throw new ApiException(400, "Missing the required parameter 'idEstabelecimento' when calling listarVinculoOperacoesProdutoEstabelecimento");
    }
    
    // verify the required parameter 'idProduto' is set
    if (idProduto == null) {
       throw new ApiException(400, "Missing the required parameter 'idProduto' when calling listarVinculoOperacoesProdutoEstabelecimento");
    }
    

    // create path and map variables
    String path = "/api/estabelecimentos/{idEstabelecimento}/produtos/{idProduto}/operacoes".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idEstabelecimento" + "\\}", apiInvoker.escapeString(idEstabelecimento.toString())).replaceAll("\\{" + "idProduto" + "\\}", apiInvoker.escapeString(idProduto.toString()));

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
        return (VinculoOperacaoResponse) ApiInvoker.deserialize(response, "", VinculoOperacaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista os V\u00EDnculos dos estabelecimento com os adquirentes
   * Este m\u00E9todo permite que sejam listados os V\u00EDnculos dos estabelecimento com os adquirentes
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idAdquirente C\u00F3digo de Identifica\u00E7\u00E3o do adquirente (id)
   * @param idEstabelecimento C\u00F3digo de Identifica\u00E7\u00E3o do estabelecimento
   * @param codigoEstabelecimentoAdquirente C\u00F3digo do v\u00EDnculo entre o estabelecimento e o adquirente
   * @return PageVinculoEstabelecimentoAdquirenteResponse
   */
  public PageVinculoEstabelecimentoAdquirenteResponse  listarVinculosEstabelecimentoAdquirente (List<String> sort, Integer page, Integer limit, Long idAdquirente, Long idEstabelecimento, String codigoEstabelecimentoAdquirente) throws ApiException {
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
   * Cadastrar um estabelecimento
   * Cadastra um novo estabelecimento
   * @param persist persist
   * @return EstabelecimentoResponse
   */
  public EstabelecimentoResponse  salvarEstabelecimento (EstabelecimentoPersist persist) throws ApiException {
    Object postBody = persist;
    
    // verify the required parameter 'persist' is set
    if (persist == null) {
       throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarEstabelecimento");
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
   * Cadastrar Grupo Econ\u00F4mico
   * Cadastra um grupo econ\u00F4mico
   * @param grupoEconomicoDTO GrupoEconomicoDTO
   * @return GrupoEconomicoResponse
   */
  public GrupoEconomicoResponse  salvarGrupoEconomico (GrupoEconomicoDTO grupoEconomicoDTO) throws ApiException {
    Object postBody = grupoEconomicoDTO;
    
    // verify the required parameter 'grupoEconomicoDTO' is set
    if (grupoEconomicoDTO == null) {
       throw new ApiException(400, "Missing the required parameter 'grupoEconomicoDTO' when calling salvarGrupoEconomico");
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
   * Cadastrar Grupo Estabelecimento
   * Cadastra um grupo de estabelecimento
   * @param grupoEstabelecimentoPersist grupoEstabelecimentoPersist
   * @return GrupoEstabelecimentoResponse
   */
  public GrupoEstabelecimentoResponse  salvarGrupoEstabelecimentos (GrupoEstabelecimentoPersist grupoEstabelecimentoPersist) throws ApiException {
    Object postBody = grupoEstabelecimentoPersist;
    
    // verify the required parameter 'grupoEstabelecimentoPersist' is set
    if (grupoEstabelecimentoPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'grupoEstabelecimentoPersist' when calling salvarGrupoEstabelecimentos");
    }
    

    // create path and map variables
    String path = "/api/grupos-estabelecimentos".replaceAll("\\{format\\}","json");

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
        return (GrupoEstabelecimentoResponse) ApiInvoker.deserialize(response, "", GrupoEstabelecimentoResponse.class);
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
   * Este m\u00E9todo permite que seja cadastrada uma nova maquineta para um estabelecimento
   * @param maquinetaPersist maquinetaPersist
   * @return MaquinetaResponse
   */
  public MaquinetaResponse  salvarMaquineta (MaquinetaPersist maquinetaPersist) throws ApiException {
    Object postBody = maquinetaPersist;
    
    // verify the required parameter 'maquinetaPersist' is set
    if (maquinetaPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'maquinetaPersist' when calling salvarMaquineta");
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
   * Realiza o cadastro de uma nova Regra Opera\u00E7\u00E3o
   * Este m\u00E9todo permite que seja cadastrada uma nova Regra Opera\u00E7\u00E3o
   * @param operacaoCredorPersist operacaoCredorPersist
   * @return OperacaoCredorResponse
   */
  public OperacaoCredorResponse  salvarOperacaoCredor (OperacaoCredorPersist operacaoCredorPersist) throws ApiException {
    Object postBody = operacaoCredorPersist;
    
    // verify the required parameter 'operacaoCredorPersist' is set
    if (operacaoCredorPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'operacaoCredorPersist' when calling salvarOperacaoCredor");
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
   * Este m\u00E9todo permite que seja cadastrado um novo telefone para um estabelecimento
   * @param telefoneEstabelecimentoPersist telefoneEstabelecimentoPersist
   * @return TelefoneEstabelecimentoResponse
   */
  public TelefoneEstabelecimentoResponse  salvarTelefoneEstabelecimento (TelefoneEstabelecimentoPersist telefoneEstabelecimentoPersist) throws ApiException {
    Object postBody = telefoneEstabelecimentoPersist;
    
    // verify the required parameter 'telefoneEstabelecimentoPersist' is set
    if (telefoneEstabelecimentoPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'telefoneEstabelecimentoPersist' when calling salvarTelefoneEstabelecimento");
    }
    

    // create path and map variables
    String path = "/api/telefones-estabelecimentos".replaceAll("\\{format\\}","json");

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
   * Este m\u00E9todo permite que seja cadastrado um novo Terminal
   * @param terminalPersist terminalPersist
   * @return TerminalResponse
   */
  public TerminalResponse  salvarTerminal (TerminalPersist terminalPersist) throws ApiException {
    Object postBody = terminalPersist;
    
    // verify the required parameter 'terminalPersist' is set
    if (terminalPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'terminalPersist' when calling salvarTerminal");
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
   * Este m\u00E9todo permite que seja cadastrado um novo VinculoEstabelecimentoAdquirente
   * @param vinculoEstabelecimentoAdquirentePersist vinculoEstabelecimentoAdquirentePersist
   * @return VinculoEstabelecimentoAdquirenteResponse
   */
  public VinculoEstabelecimentoAdquirenteResponse  salvarVinculoEstabelecimentoAdquirente (VinculoEstabelecimentoAdquirentePersist vinculoEstabelecimentoAdquirentePersist) throws ApiException {
    Object postBody = vinculoEstabelecimentoAdquirentePersist;
    
    // verify the required parameter 'vinculoEstabelecimentoAdquirentePersist' is set
    if (vinculoEstabelecimentoAdquirentePersist == null) {
       throw new ApiException(400, "Missing the required parameter 'vinculoEstabelecimentoAdquirentePersist' when calling salvarVinculoEstabelecimentoAdquirente");
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
  
  /**
   * Vincula as opera\u00E7\u00F5es ao estabelecimento e ao produto
   * Este m\u00E9todo permite vincular as opera\u00E7\u00F5es ao estabelecimento e ao produto
   * @param idEstabelecimento C\u00F3digo de Identifica\u00E7\u00E3o do estabelecimento (id)
   * @param idOperacao C\u00F3digo de Identifica\u00E7\u00E3o da opera\u00E7\u00E3o (id)
   * @param idProduto C\u00F3digo de Identifica\u00E7\u00E3o do produto (id)
   * @param mcc C\u00F3digo de Identifica\u00E7\u00E3o do mcc
   * @return ResponseEntity
   */
  public ResponseEntity  vinculoOperacoesProdutoEstabelecimento (Long idEstabelecimento, Long idOperacao, Long idProduto, List<Integer> mcc) throws ApiException {
    Object postBody = mcc;
    
    // verify the required parameter 'idEstabelecimento' is set
    if (idEstabelecimento == null) {
       throw new ApiException(400, "Missing the required parameter 'idEstabelecimento' when calling vinculoOperacoesProdutoEstabelecimento");
    }
    
    // verify the required parameter 'idOperacao' is set
    if (idOperacao == null) {
       throw new ApiException(400, "Missing the required parameter 'idOperacao' when calling vinculoOperacoesProdutoEstabelecimento");
    }
    
    // verify the required parameter 'idProduto' is set
    if (idProduto == null) {
       throw new ApiException(400, "Missing the required parameter 'idProduto' when calling vinculoOperacoesProdutoEstabelecimento");
    }
    
    // verify the required parameter 'mcc' is set
    if (mcc == null) {
       throw new ApiException(400, "Missing the required parameter 'mcc' when calling vinculoOperacoesProdutoEstabelecimento");
    }
    

    // create path and map variables
    String path = "/api/estabelecimentos/{idEstabelecimento}/produtos/{idProduto}/operacoes/{idOperacao}/vinculos".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idEstabelecimento" + "\\}", apiInvoker.escapeString(idEstabelecimento.toString())).replaceAll("\\{" + "idOperacao" + "\\}", apiInvoker.escapeString(idOperacao.toString())).replaceAll("\\{" + "idProduto" + "\\}", apiInvoker.escapeString(idProduto.toString()));

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
        return (ResponseEntity) ApiInvoker.deserialize(response, "", ResponseEntity.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Remove os v\u00EDnculos das opera\u00E7\u00F5es atrelado ao estabelecimento e ao produto
   * Este m\u00E9todo permite remover os v\u00EDnculos das opera\u00E7\u00F5es atrelado ao estabelecimento e ao produto
   * @param idEstabelecimento C\u00F3digo de Identifica\u00E7\u00E3o do estabelecimento (id)
   * @param idOperacao C\u00F3digo de Identifica\u00E7\u00E3o da opera\u00E7\u00E3o (id)
   * @param idProduto C\u00F3digo de Identifica\u00E7\u00E3o do produto (id)
   * @return ResponseEntity
   */
  public ResponseEntity  vinculoOperacoesProdutoEstabelecimentoRemove (Long idEstabelecimento, Long idOperacao, Long idProduto) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idEstabelecimento' is set
    if (idEstabelecimento == null) {
       throw new ApiException(400, "Missing the required parameter 'idEstabelecimento' when calling vinculoOperacoesProdutoEstabelecimentoRemove");
    }
    
    // verify the required parameter 'idOperacao' is set
    if (idOperacao == null) {
       throw new ApiException(400, "Missing the required parameter 'idOperacao' when calling vinculoOperacoesProdutoEstabelecimentoRemove");
    }
    
    // verify the required parameter 'idProduto' is set
    if (idProduto == null) {
       throw new ApiException(400, "Missing the required parameter 'idProduto' when calling vinculoOperacoesProdutoEstabelecimentoRemove");
    }
    

    // create path and map variables
    String path = "/api/estabelecimentos/{idEstabelecimento}/produtos/{idProduto}/operacoes/{idOperacao}/vinculos".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idEstabelecimento" + "\\}", apiInvoker.escapeString(idEstabelecimento.toString())).replaceAll("\\{" + "idOperacao" + "\\}", apiInvoker.escapeString(idOperacao.toString())).replaceAll("\\{" + "idProduto" + "\\}", apiInvoker.escapeString(idProduto.toString()));

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
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ResponseEntity) ApiInvoker.deserialize(response, "", ResponseEntity.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
