package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.Base;
import br.com.conductor.pier.api.v2.model.BodyAccessToken;
import br.com.conductor.pier.api.v2.model.PageBases;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;


public class BaseApi {
  String basePath = "https://localhost/";
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
   * Alterar base
   * Este recurso permite que seja modificado uma base j\u00C3\u00A1 cadastrada
   * @param id C\u00C3\u00B3digo identificador da base
   * @param servidor IP do servidor
   * @param usuario Nome do usu\u00C3\u00A1rio
   * @param senha Senha
   * @param nomeBase Nome da base
   * @param senhaCriptografada senha Criptografada
   * @param domain Dom\u00C3\u00ADnio da base
   * @param nomeBaseControleAcesso Nome da base de controle acesso
   * @param servidorControleAcesso Servidor do controle de acesso
   * @param idEmissor C\u00C3\u00B3digo do identificador do emissor
   * @return Base
   */
  public Base  alterarUsingPUT (Long id, String servidor, String usuario, String senha, String nomeBase, Boolean senhaCriptografada, String domain, String nomeBaseControleAcesso, String servidorControleAcesso, Long idEmissor) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT");
    }
    
    // verify the required parameter 'servidor' is set
    if (servidor == null) {
       throw new ApiException(400, "Missing the required parameter 'servidor' when calling alterarUsingPUT");
    }
    
    // verify the required parameter 'usuario' is set
    if (usuario == null) {
       throw new ApiException(400, "Missing the required parameter 'usuario' when calling alterarUsingPUT");
    }
    
    // verify the required parameter 'senha' is set
    if (senha == null) {
       throw new ApiException(400, "Missing the required parameter 'senha' when calling alterarUsingPUT");
    }
    
    // verify the required parameter 'nomeBase' is set
    if (nomeBase == null) {
       throw new ApiException(400, "Missing the required parameter 'nomeBase' when calling alterarUsingPUT");
    }
    
    // verify the required parameter 'senhaCriptografada' is set
    if (senhaCriptografada == null) {
       throw new ApiException(400, "Missing the required parameter 'senhaCriptografada' when calling alterarUsingPUT");
    }
    
    // verify the required parameter 'domain' is set
    if (domain == null) {
       throw new ApiException(400, "Missing the required parameter 'domain' when calling alterarUsingPUT");
    }
    
    // verify the required parameter 'nomeBaseControleAcesso' is set
    if (nomeBaseControleAcesso == null) {
       throw new ApiException(400, "Missing the required parameter 'nomeBaseControleAcesso' when calling alterarUsingPUT");
    }
    
    // verify the required parameter 'servidorControleAcesso' is set
    if (servidorControleAcesso == null) {
       throw new ApiException(400, "Missing the required parameter 'servidorControleAcesso' when calling alterarUsingPUT");
    }
    

    // create path and map variables
    String path = "/api/bases".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "servidor", servidor));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "usuario", usuario));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "senha", senha));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeBase", nomeBase));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "senhaCriptografada", senhaCriptografada));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "domain", domain));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeBaseControleAcesso", nomeBaseControleAcesso));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEmissor", idEmissor));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "servidorControleAcesso", servidorControleAcesso));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

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
        return (Base) ApiInvoker.deserialize(response, "", Base.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Limpar mapa de bases
   * 
   * @return BodyAccessToken
   */
  public BodyAccessToken  clearUsingGET () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/bases/clear".replaceAll("\\{format\\}","json");

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
        return (BodyAccessToken) ApiInvoker.deserialize(response, "", BodyAccessToken.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Consultar base
   * Este recurso permite que seja consultada uma base do emissor atrav\u00C3\u00A9s de um id especifico
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da base (id).
   * @return Base
   */
  public Base  consultarUsingGET1 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET1");
    }
    

    // create path and map variables
    String path = "/api/bases/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (Base) ApiInvoker.deserialize(response, "", Base.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Listar bases
   * Este recurso permite que sejam listadas as bases existentes
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 100, Max = 100)
   * @param id C\u00C3\u00B3digo identificador da base
   * @param servidor IP do servidor
   * @param usuario Nome do usu\u00C3\u00A1rio
   * @param senha Senha
   * @param nomeBase Nome da base
   * @param senhaCriptografada senha Criptografada
   * @param domain Dom\u00C3\u00ADnio da base
   * @param nomeBaseControleAcesso Nome da base de controle acesso
   * @param idEmissor C\u00C3\u00B3digo do identificador do emissor
   * @param servidorControleAcesso Servidor do controle de acesso
   * @return PageBases
   */
  public PageBases  listarUsingGET1 (Integer page, Integer limit, Long id, String servidor, String usuario, String senha, String nomeBase, Boolean senhaCriptografada, String domain, String nomeBaseControleAcesso, Long idEmissor, String servidorControleAcesso) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/bases".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "servidor", servidor));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "usuario", usuario));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "senha", senha));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeBase", nomeBase));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "senhaCriptografada", senhaCriptografada));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "domain", domain));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeBaseControleAcesso", nomeBaseControleAcesso));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEmissor", idEmissor));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "servidorControleAcesso", servidorControleAcesso));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

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
        return (PageBases) ApiInvoker.deserialize(response, "", PageBases.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Salvar base
   * Este recurso permite que seja adicionado uma nova base
   * @param servidor IP do servidor
   * @param usuario Nome do usu\u00C3\u00A1rio
   * @param senha Senha
   * @param nomeBase Nome da base
   * @param senhaCriptografada senha Criptografada
   * @param domain Dom\u00C3\u00ADnio da base
   * @param nomeBaseControleAcesso Nome da base de controle acesso
   * @param servidorControleAcesso Servidor do controle de acesso
   * @param idEmissor C\u00C3\u00B3digo do identificador do emissor
   * @return Base
   */
  public Base  salvarUsingPOST1 (String servidor, String usuario, String senha, String nomeBase, Boolean senhaCriptografada, String domain, String nomeBaseControleAcesso, String servidorControleAcesso, Long idEmissor) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'servidor' is set
    if (servidor == null) {
       throw new ApiException(400, "Missing the required parameter 'servidor' when calling salvarUsingPOST1");
    }
    
    // verify the required parameter 'usuario' is set
    if (usuario == null) {
       throw new ApiException(400, "Missing the required parameter 'usuario' when calling salvarUsingPOST1");
    }
    
    // verify the required parameter 'senha' is set
    if (senha == null) {
       throw new ApiException(400, "Missing the required parameter 'senha' when calling salvarUsingPOST1");
    }
    
    // verify the required parameter 'nomeBase' is set
    if (nomeBase == null) {
       throw new ApiException(400, "Missing the required parameter 'nomeBase' when calling salvarUsingPOST1");
    }
    
    // verify the required parameter 'senhaCriptografada' is set
    if (senhaCriptografada == null) {
       throw new ApiException(400, "Missing the required parameter 'senhaCriptografada' when calling salvarUsingPOST1");
    }
    
    // verify the required parameter 'domain' is set
    if (domain == null) {
       throw new ApiException(400, "Missing the required parameter 'domain' when calling salvarUsingPOST1");
    }
    
    // verify the required parameter 'nomeBaseControleAcesso' is set
    if (nomeBaseControleAcesso == null) {
       throw new ApiException(400, "Missing the required parameter 'nomeBaseControleAcesso' when calling salvarUsingPOST1");
    }
    
    // verify the required parameter 'servidorControleAcesso' is set
    if (servidorControleAcesso == null) {
       throw new ApiException(400, "Missing the required parameter 'servidorControleAcesso' when calling salvarUsingPOST1");
    }
    

    // create path and map variables
    String path = "/api/bases".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "servidor", servidor));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "usuario", usuario));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "senha", senha));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeBase", nomeBase));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "senhaCriptografada", senhaCriptografada));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "domain", domain));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeBaseControleAcesso", nomeBaseControleAcesso));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEmissor", idEmissor));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "servidorControleAcesso", servidorControleAcesso));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

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
        return (Base) ApiInvoker.deserialize(response, "", Base.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}

