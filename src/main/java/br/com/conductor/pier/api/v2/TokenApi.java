package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.Token;
import br.com.conductor.pier.api.v2.model.BodyAccessToken;
import br.com.conductor.pier.api.v2.model.PageBases;
import java.util.Date;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;


public class TokenApi {
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
   * Alterar token
   * Este recurso permite que seja modificado um token j\u00C3\u00A1 cadastrado
   * @param id C\u00C3\u00B3digo identificador do token
   * @param token Token
   * @param base C\u00C3\u00B3digo identificador da base
   * @param owner Owner do token
   * @param status Status do token
   * @param criadoPor Descri\u00C3\u00A7\u00C3\u00A3o de quem criou o token
   * @param alteradoPor Descri\u00C3\u00A7\u00C3\u00A3o de quem alterou o token
   * @return Token
   */
  public Token  alterarUsingPUT5 (Long id, String token, Long base, String owner, String status, String criadoPor, String alteradoPor) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT5");
    }
    

    // create path and map variables
    String path = "/api/tokens".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "token", token));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "base", base));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "owner", owner));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "status", status));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "criadoPor", criadoPor));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "alteradoPor", alteradoPor));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

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
        return (Token) ApiInvoker.deserialize(response, "", Token.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * /api/tokens/callback
   * 
   * @param bodyAccessToken bodyAccessToken
   * @return BodyAccessToken
   */
  public BodyAccessToken  callbackUsingPOST (BodyAccessToken bodyAccessToken) throws ApiException {
    Object postBody = bodyAccessToken;
    
    // verify the required parameter 'bodyAccessToken' is set
    if (bodyAccessToken == null) {
       throw new ApiException(400, "Missing the required parameter 'bodyAccessToken' when calling callbackUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/tokens/callback".replaceAll("\\{format\\}","json");

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
   * Consultar token
   * Este recurso permite que seja consultado um token do emissor atrav\u00C3\u00A9s de um id especifico
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do token (id).
   * @return Token
   */
  public Token  consultarUsingGET14 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET14");
    }
    

    // create path and map variables
    String path = "/api/tokens/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (Token) ApiInvoker.deserialize(response, "", Token.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Listar tokens
   * Este recurso permite que sejam listados os tokens existentes
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 100, Max = 100)
   * @param id C\u00C3\u00B3digo identificador do token
   * @param token Token
   * @param base C\u00C3\u00B3digo identificador da base
   * @param owner Owner do token
   * @param status Status do token
   * @param criadoPor Descri\u00C3\u00A7\u00C3\u00A3o de quem criou o token
   * @param dataCriacao Data de cria\u00C3\u00A7\u00C3\u00A3o do token
   * @param alteradoPor Descri\u00C3\u00A7\u00C3\u00A3o de quem alterou o token
   * @param dataModificacao Data de modifica\u00C3\u00A7\u00C3\u00A3o do token
   * @return PageBases
   */
  public PageBases  listarUsingGET14 (Integer page, Integer limit, Long id, String token, Long base, String owner, String status, String criadoPor, Date dataCriacao, String alteradoPor, Date dataModificacao) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/tokens".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "token", token));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "base", base));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "owner", owner));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "status", status));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "criadoPor", criadoPor));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataCriacao", dataCriacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "alteradoPor", alteradoPor));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataModificacao", dataModificacao));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

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
   * Salvar token
   * Este recurso permite que seja adicionado um novo token
   * @param token Token
   * @param base C\u00C3\u00B3digo identificador da base
   * @param owner Owner do token
   * @param status Status do token
   * @param criadoPor Descri\u00C3\u00A7\u00C3\u00A3o de quem criou o token
   * @param alteradoPor Descri\u00C3\u00A7\u00C3\u00A3o de quem alterou o token
   * @return Token
   */
  public Token  salvarUsingPOST5 (String token, Long base, String owner, String status, String criadoPor, String alteradoPor) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/tokens".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "token", token));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "base", base));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "owner", owner));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "status", status));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "criadoPor", criadoPor));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "alteradoPor", alteradoPor));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

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
        return (Token) ApiInvoker.deserialize(response, "", Token.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * /api/tokens/validar
   * 
   * @param bodyAccessToken bodyAccessToken
   * @return Object
   */
  public Object  validarUsingPOST (BodyAccessToken bodyAccessToken) throws ApiException {
    Object postBody = bodyAccessToken;
    
    // verify the required parameter 'bodyAccessToken' is set
    if (bodyAccessToken == null) {
       throw new ApiException(400, "Missing the required parameter 'bodyAccessToken' when calling validarUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/tokens/validar".replaceAll("\\{format\\}","json");

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
  
}

