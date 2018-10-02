package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.UsuarioUpdateValue;
import br.com.conductor.pier.api.v2.model.UsuarioResponse;
import br.com.conductor.pier.api.v2.model.ControleSegurancaDispositivoResponse;
import br.com.conductor.pier.api.v2.model.ControleSegurancaDispositivoUpdateValor;
import br.com.conductor.pier.api.v2.model.PageUsuarioContasResponse;
import br.com.conductor.pier.api.v2.model.PageControleSegurancaDispositivoResponse;
import br.com.conductor.pier.api.v2.model.PageUsuarioResponse;
import br.com.conductor.pier.api.v2.model.UsuarioPersistencia;
import br.com.conductor.pier.api.v2.model.ControleSegurancaDispositivoPersistencia;
import br.com.conductor.pier.api.v2.model.UsuarioSenhaFortePersistencia;
import br.com.conductor.pier.api.v2.model.ValidarSenhaLoginRequest;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class GlobaltagusuarioApi {
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
   * {{{usuario_resource_alterar_senha_login}}}
   * {{{usuario_resource_alterar_senha_login_notes}}}
   * @param login {{{usuario_resource_alterar_senha_login_param_login}}}
   * @param senhaNova {{{usuario_resource_alterar_senha_login_param_senha_nova}}}
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
   * {{{usuario_resource_alterar_senha}}}
   * {{{usuario_resource_alterar_senha_notes}}}
   * @param id {{{usuario_resource_alterar_senha_param_id}}}
   * @param senhaAtual {{{usuario_resource_alterar_senha_param_senha_atual}}}
   * @param senhaNova {{{usuario_resource_alterar_senha_param_senha_nova}}}
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
   * {{{usuario_resource_alterar}}}
   * {{{usuario_resource_alterar_notes}}}
   * @param id {{{usuario_resource_alterar_param_id}}}
   * @param update update
   * @return UsuarioResponse
   */
  public UsuarioResponse  alterarUsingPUT19 (Long id, UsuarioUpdateValue update) throws ApiException {
    Object postBody = update;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT19");
    }
    
    // verify the required parameter 'update' is set
    if (update == null) {
       throw new ApiException(400, "Missing the required parameter 'update' when calling alterarUsingPUT19");
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
   * {{{usuario_resource_ativar_usuario}}}
   * {{{usuario_resource_ativar_usuario_notes}}}
   * @param id {{{usuario_resource_ativar_usuario_param_id}}}
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
   * {{{controle_seguranca_dispositivo_atualizar}}}
   * {{{controle_seguranca_dispositivo_atualizar_notas}}}
   * @param id {{{controle_seguranca_dispositivo_resource_param_id}}}
   * @param update update
   * @return ControleSegurancaDispositivoResponse
   */
  public ControleSegurancaDispositivoResponse  atualizarUsingPUT2 (Long id, ControleSegurancaDispositivoUpdateValor update) throws ApiException {
    Object postBody = update;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarUsingPUT2");
    }
    
    // verify the required parameter 'update' is set
    if (update == null) {
       throw new ApiException(400, "Missing the required parameter 'update' when calling atualizarUsingPUT2");
    }
    

    // create path and map variables
    String path = "/api/controles-seguranca-dispositivos/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (ControleSegurancaDispositivoResponse) ApiInvoker.deserialize(response, "", ControleSegurancaDispositivoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{usuario_recurso_listar_por_id_usuario}}}
   * {{{usuario_recurso_listar_por_id_usuario_notas}}}
   * @param id {{{usuario_recurso_listar_por_id_param_id_usuario}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return PageUsuarioContasResponse
   */
  public PageUsuarioContasResponse  consultarContasVinculadasUsingGET (Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarContasVinculadasUsingGET");
    }
    

    // create path and map variables
    String path = "/api/usuarios/{id}/vincular-contas".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (PageUsuarioContasResponse) ApiInvoker.deserialize(response, "", PageUsuarioContasResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{controle_seguranca_dispositivo_consultar}}}
   * {{{controle_seguranca_dispositivo_consultar_notas}}}
   * @param idUsuario {{{usuario_resource_consultar_param_idUsuario}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return PageControleSegurancaDispositivoResponse
   */
  public PageControleSegurancaDispositivoResponse  consultarUsingGET14 (Long idUsuario, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idUsuario' is set
    if (idUsuario == null) {
       throw new ApiException(400, "Missing the required parameter 'idUsuario' when calling consultarUsingGET14");
    }
    

    // create path and map variables
    String path = "/api/controles-seguranca-dispositivos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idUsuario", idUsuario));
    
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
        return (PageControleSegurancaDispositivoResponse) ApiInvoker.deserialize(response, "", PageControleSegurancaDispositivoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{usuario_resource_consultar}}}
   * {{{usuario_resource_consultar_notes}}}
   * @param id {{{usuario_resource_consultar_param_id}}}
   * @return UsuarioResponse
   */
  public UsuarioResponse  consultarUsingGET46 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET46");
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
   * {{{controle_seguranca_dispositivo_deletar}}}
   * {{{controle_seguranca_dispositivo_deletar_notes}}}
   * @param id {{{controle_seguranca_dispositivo_resource_param_id}}}
   * @return ControleSegurancaDispositivoResponse
   */
  public ControleSegurancaDispositivoResponse  deletarUsingDELETE (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling deletarUsingDELETE");
    }
    

    // create path and map variables
    String path = "/api/controles-seguranca-dispositivos/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (ControleSegurancaDispositivoResponse) ApiInvoker.deserialize(response, "", ControleSegurancaDispositivoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{usuario_resource_desativar_usuario}}}
   * {{{usuario_resource_desativar_usuario_notes}}}
   * @param id {{{usuario_resource_desativar_usuario_param_id}}}
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
   * {{{usuario_resource_listar}}}
   * {{{usuario_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param nome {{{usuario_request_nome_value}}}
   * @param cpf {{{usuario_request_cpf_value}}}
   * @param email {{{usuario_request_email_value}}}
   * @param status {{{usuario_request_status_value}}}
   * @return PageUsuarioResponse
   */
  public PageUsuarioResponse  listarUsingGET56 (List<String> sort, Integer page, Integer limit, String nome, String cpf, String email, String status) throws ApiException {
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
   * {{{usuario_resource_recuperar_senha}}}
   * {{{usuario_resource_recuperar_senha_notes}}}
   * @param id {{{usuario_resource_recuperar_senha_param_id}}}
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
   * {{{usuario_resource_salvar}}}
   * {{{usuario_resource_salvar_notes}}}
   * @param persist persist
   * @return UsuarioResponse
   */
  public UsuarioResponse  salvarUsingPOST28 (UsuarioPersistencia persist) throws ApiException {
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
   * {{{controle_seguranca_dispositivo_salvar}}}
   * {{{controle_seguranca_dispositivo_salvar_notas}}}
   * @param persist persist
   * @return ControleSegurancaDispositivoResponse
   */
  public ControleSegurancaDispositivoResponse  salvarUsingPOST8 (ControleSegurancaDispositivoPersistencia persist) throws ApiException {
    Object postBody = persist;
    
    // verify the required parameter 'persist' is set
    if (persist == null) {
       throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarUsingPOST8");
    }
    

    // create path and map variables
    String path = "/api/controles-seguranca-dispositivos".replaceAll("\\{format\\}","json");

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
        return (ControleSegurancaDispositivoResponse) ApiInvoker.deserialize(response, "", ControleSegurancaDispositivoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{usuario_resource_validar_senha_forte}}}
   * {{{usuario_resource_validar_senha_forte_notes}}}
   * @param senha {{{usuario_resource_validar_senha_forte_param_senha}}}
   * @param usuarioSenhaFortePersist {{{usuario_resource_validar_senha_forte_param_id_plataforma}}}
   * @return String
   */
  public String  validarSenhaForteUsingPOST (String senha, UsuarioSenhaFortePersistencia usuarioSenhaFortePersist) throws ApiException {
    Object postBody = usuarioSenhaFortePersist;
    
    // verify the required parameter 'senha' is set
    if (senha == null) {
       throw new ApiException(400, "Missing the required parameter 'senha' when calling validarSenhaForteUsingPOST");
    }
    
    // verify the required parameter 'usuarioSenhaFortePersist' is set
    if (usuarioSenhaFortePersist == null) {
       throw new ApiException(400, "Missing the required parameter 'usuarioSenhaFortePersist' when calling validarSenhaForteUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/usuarios/validar-senha-forte".replaceAll("\\{format\\}","json");

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
   * {{{usuario_resource_validar_senha_login}}}
   * {{{usuario_resource_validar_senha_login_notes}}}
   * @param login {{{usuario_resource_validar_senha_login_param_login}}}
   * @param senha {{{usuario_resource_validar_senha_login_param_senha}}}
   * @param request request
   * @return Object
   */
  public Object  validarSenhaLoginUsingPOST (String login, String senha, ValidarSenhaLoginRequest request) throws ApiException {
    Object postBody = request;
    
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
   * {{{usuario_resource_validar_senha}}}
   * {{{usuario_resource_validar_senha_notes}}}
   * @param senha {{{usuario_resource_validar_senha_param_senha}}}
   * @param id {{{usuario_resource_validar_senha_param_id}}}
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
  
  /**
   * {{{usuario_recurso_vincular_usuarios}}}
   * {{{usuario_recurso_vincular_usuarios_notas}}}
   * @param id {{{usuario_recurso_vincular_usuarios_param_id}}}
   * @return String
   */
  public String  vincularContasUsingPOST (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling vincularContasUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/usuarios/{id}/vincular-usuarios".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
  
}
