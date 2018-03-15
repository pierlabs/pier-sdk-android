package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.UsuarioUpdate;
import br.com.conductor.pier.api.v2.model.UsuarioResponse;
import br.com.conductor.pier.api.v2.model.PageUsuarioResponse;
import br.com.conductor.pier.api.v2.model.UsuarioPersist;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class UsuarioApi {
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
   * Alterar senha do usu\u00E1rio.
   * Este m\u00E9todo realiza a altera\u00E7\u00E3o da senha do usu\u00E1rio.
   * @param login Login do usu\u00E1rio.
   * @param senhaNova Senha Nova
   * @return String
   */
  public String  alterarSenhaLoginUsingPOST (String login, String senhaNova) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'login' is set
    if (login == null) {
       throw new ApiException(400, "Missing the required parameter 'login' when calling alterarSenhaLoginUsingPOST");
    }
    
    // verify the required parameter 'senhaNova' is set
    if (senhaNova == null) {
       throw new ApiException(400, "Missing the required parameter 'senhaNova' when calling alterarSenhaLoginUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/usuarios/{login}/alterar-senha".replaceAll("\\{format\\}","json").replaceAll("\\{" + "login" + "\\}", apiInvoker.escapeString(login.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
    headerParams.put("senhaNova", ApiInvoker.parameterToString(senhaNova));
    

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
   * Alterar senha do usu\u00E1rio na base do PIER ou WS.
   * Este m\u00E9todo realiza a altera\u00E7\u00E3o da senha do usu\u00E1rio.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Usu\u00E1rio (id).
   * @param senhaAtual Senha Atual
   * @param senhaNova Senha Nova
   * @return String
   */
  public String  alterarSenhaUsingPUT (Long id, String senhaAtual, String senhaNova) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarSenhaUsingPUT");
    }
    
    // verify the required parameter 'senhaAtual' is set
    if (senhaAtual == null) {
       throw new ApiException(400, "Missing the required parameter 'senhaAtual' when calling alterarSenhaUsingPUT");
    }
    
    // verify the required parameter 'senhaNova' is set
    if (senhaNova == null) {
       throw new ApiException(400, "Missing the required parameter 'senhaNova' when calling alterarSenhaUsingPUT");
    }
    

    // create path and map variables
    String path = "/api/usuarios/{id}/alterar-senha".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
    headerParams.put("senha_atual", ApiInvoker.parameterToString(senhaAtual));
    
    headerParams.put("senha_nova", ApiInvoker.parameterToString(senhaNova));
    

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
   * Altera os usu\u00E1rios cadastrados na base.
   * Este m\u00E9todo realiza a altera\u00E7\u00E3o dos usu\u00E1rios.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Usu\u00E1rio (id).
   * @param update update
   * @return UsuarioResponse
   */
  public UsuarioResponse  alterarUsingPUT21 (Long id, UsuarioUpdate update) throws ApiException {
    Object postBody = update;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT21");
    }
    
    // verify the required parameter 'update' is set
    if (update == null) {
       throw new ApiException(400, "Missing the required parameter 'update' when calling alterarUsingPUT21");
    }
    

    // create path and map variables
    String path = "/api/usuarios/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (UsuarioResponse) ApiInvoker.deserialize(response, "", UsuarioResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Ativa os usu\u00E1rios cadastrados na base do PIER ou WS.
   * Este m\u00E9todo realiza a ativa\u00E7\u00E3o dos usu\u00E1rios.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Usu\u00E1rio (id).
   * @return UsuarioResponse
   */
  public UsuarioResponse  ativarUsuarioUsingPOST (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling ativarUsuarioUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/usuarios/{id}/ativar-usuario".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (UsuarioResponse) ApiInvoker.deserialize(response, "", UsuarioResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Apresenta os dados de um determinado Usu\u00E1rio na base do PIER ou WS.
   * Este m\u00E9todo permite consultar as informa\u00E7\u00F5es de um determinado Usu\u00E1rio a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id).
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Usu\u00E1rio (id).
   * @return UsuarioResponse
   */
  public UsuarioResponse  consultarUsingGET43 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET43");
    }
    

    // create path and map variables
    String path = "/api/usuarios/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (UsuarioResponse) ApiInvoker.deserialize(response, "", UsuarioResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Desativa os usu\u00E1rios cadastrados na base do PIER ou WS.
   * Este m\u00E9todo realiza a desativa\u00E7\u00E3o dos usu\u00E1rios.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Usu\u00E1rio (id).
   * @return UsuarioResponse
   */
  public UsuarioResponse  desativarUsuarioUsingPOST (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling desativarUsuarioUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/usuarios/{id}/desativar-usuario".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (UsuarioResponse) ApiInvoker.deserialize(response, "", UsuarioResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista os Usu\u00E1rios cadastrados na base do PIER ou WS.
   * Este m\u00E9todo permite que sejam listados os usu\u00E1rios existentes na base do PIER.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param nome Nome do Usuario
   * @param cpf CPF do Usuario
   * @param email Email do Usuario
   * @param status Status do Usuario
   * @return PageUsuarioResponse
   */
  public PageUsuarioResponse  listarUsingGET51 (List<String> sort, Integer page, Integer limit, String nome, String cpf, String email, String status) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/usuarios".replaceAll("\\{format\\}","json");

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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cpf", cpf));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "email", email));
    
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
        return (PageUsuarioResponse) ApiInvoker.deserialize(response, "", PageUsuarioResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Recuperar senha do usu\u00E1rio na base do PIER ou WS.
   * Esse recurso permite recuperar a senha do usu\u00E1rio.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Usu\u00E1rio (id).
   * @return String
   */
  public String  recuperarSenhaUsingPOST (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling recuperarSenhaUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/usuarios/{id}/recuperar-senha".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
   * Cadastra Usu\u00E1rio na base.
   * Esse recurso permite cadastrar usu\u00E1rios.
   * @param persist persist
   * @return UsuarioResponse
   */
  public UsuarioResponse  salvarUsingPOST28 (UsuarioPersist persist) throws ApiException {
    Object postBody = persist;
    
    // verify the required parameter 'persist' is set
    if (persist == null) {
       throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarUsingPOST28");
    }
    

    // create path and map variables
    String path = "/api/usuarios".replaceAll("\\{format\\}","json");

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
        return (UsuarioResponse) ApiInvoker.deserialize(response, "", UsuarioResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza login com valida\u00E7\u00E3o de senha dos usu\u00E1rios cadastrados na base do PIER ou WS.
   * O recurso permite fazer login do usu\u00E1rio atrav\u00E9s da senha definida pelo emissor.
   * @param login Login identificador do usu\u00E1rio (login).
   * @param senha Senha do usu\u00E1rio
   * @return Object
   */
  public Object  validarSenhaLoginUsingPOST (String login, String senha) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'login' is set
    if (login == null) {
       throw new ApiException(400, "Missing the required parameter 'login' when calling validarSenhaLoginUsingPOST");
    }
    
    // verify the required parameter 'senha' is set
    if (senha == null) {
       throw new ApiException(400, "Missing the required parameter 'senha' when calling validarSenhaLoginUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/usuarios/{login}/validar-senha".replaceAll("\\{format\\}","json").replaceAll("\\{" + "login" + "\\}", apiInvoker.escapeString(login.toString()));

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
   * Validar a senha do usu\u00E1rio na base do PIER ou WS.
   * Este m\u00E9todo permite validar a senha do usu\u00E1rio).
   * @param senha Senha do usu\u00E1rio
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Usu\u00E1rio (id).
   * @return String
   */
  public String  validarSenhaUsingGET1 (String senha, Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'senha' is set
    if (senha == null) {
       throw new ApiException(400, "Missing the required parameter 'senha' when calling validarSenhaUsingGET1");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling validarSenhaUsingGET1");
    }
    

    // create path and map variables
    String path = "/api/usuarios/{id}/validar-senha".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (String) ApiInvoker.deserialize(response, "", String.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
