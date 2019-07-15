package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.ConfiguracaoEmailResponse;
import br.com.conductor.pier.api.v2.model.ConfiguracaoEmailPersist;
import br.com.conductor.pier.api.v2.model.ConfiguracaoSMSResponse;
import br.com.conductor.pier.api.v2.model.TemplateNotificacaoDetalheResponse;
import br.com.conductor.pier.api.v2.model.NotificacaoSMSResponse;
import br.com.conductor.pier.api.v2.model.CodigoSegurancaResponse;
import br.com.conductor.pier.api.v2.model.NotificacaoEmailRequest;
import br.com.conductor.pier.api.v2.model.Secure3dRequest;
import br.com.conductor.pier.api.v2.model.CodigoSegurancaSMSPersist;
import br.com.conductor.pier.api.v2.model.PageCodigoSegurancaResponse;
import br.com.conductor.pier.api.v2.model.PageConfiguracaoEmailResponse;
import br.com.conductor.pier.api.v2.model.PageConfiguracaoSMSResponse;
import br.com.conductor.pier.api.v2.model.PagePushResponse;
import br.com.conductor.pier.api.v2.model.PageSMSResponse;
import br.com.conductor.pier.api.v2.model.PageTemplateNotificacaoResponse;
import br.com.conductor.pier.api.v2.model.NotificacaoResponse;
import br.com.conductor.pier.api.v2.model.PushAPNS;
import java.util.*;
import br.com.conductor.pier.api.v2.model.PushFCMEGCM;
import br.com.conductor.pier.api.v2.model.NotificacaoSMSBody;
import br.com.conductor.pier.api.v2.model.CodigoSegurancaEMAILPersist;
import br.com.conductor.pier.api.v2.model.CodigoSegurancaSMSRequest;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class NotificacaoApi {
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
   * Altera configura\u00E7\u00F5es de E-mail
   * Esse recurso permite salvar altera\u00E7\u00F5es de configura\u00E7\u00F5es de E-mail
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da configura\u00E7\u00E3o de e-mail
   * @param persist persist
   * @return ConfiguracaoEmailResponse
   */
  public ConfiguracaoEmailResponse  alterarConfiguracaoEmail (Long id, ConfiguracaoEmailPersist persist) throws ApiException {
    Object postBody = persist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarConfiguracaoEmail");
    }
    
    // verify the required parameter 'persist' is set
    if (persist == null) {
       throw new ApiException(400, "Missing the required parameter 'persist' when calling alterarConfiguracaoEmail");
    }
    

    // create path and map variables
    String path = "/api/configuracoes-email/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (ConfiguracaoEmailResponse) ApiInvoker.deserialize(response, "", ConfiguracaoEmailResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Altera as informa\u00E7\u00F5es da configura\u00E7\u00E3o sms informada
   * Este m\u00E9todo realiza a altera\u00E7\u00E3o na configura\u00E7\u00E3o sms, a partir do id informado
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da configura\u00E7\u00E3o sms (id)
   * @param idEmissor C\u00F3digo identifica\u00E7\u00E3o emissor
   * @param usuarioSMS Apresenta o usu\u00E1rio sms
   * @param senhaSMS Apresenta a senha sms
   * @return ConfiguracaoSMSResponse
   */
  public ConfiguracaoSMSResponse  alterarConfiguracaoSMS (Long id, Long idEmissor, String usuarioSMS, String senhaSMS) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarConfiguracaoSMS");
    }
    
    // verify the required parameter 'idEmissor' is set
    if (idEmissor == null) {
       throw new ApiException(400, "Missing the required parameter 'idEmissor' when calling alterarConfiguracaoSMS");
    }
    
    // verify the required parameter 'usuarioSMS' is set
    if (usuarioSMS == null) {
       throw new ApiException(400, "Missing the required parameter 'usuarioSMS' when calling alterarConfiguracaoSMS");
    }
    
    // verify the required parameter 'senhaSMS' is set
    if (senhaSMS == null) {
       throw new ApiException(400, "Missing the required parameter 'senhaSMS' when calling alterarConfiguracaoSMS");
    }
    

    // create path and map variables
    String path = "/api/configuracoes-sms/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEmissor", idEmissor));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "usuarioSMS", usuarioSMS));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "senhaSMS", senhaSMS));
    

    

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
        return (ConfiguracaoSMSResponse) ApiInvoker.deserialize(response, "", ConfiguracaoSMSResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Alterar template de notifica\u00E7\u00E3o
   * Esse recurso permite salvar altera\u00E7\u00F5es de templates notifica\u00E7\u00F5es
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do layout de e-mail
   * @param conteudo Template HTML
   * @param idConfiguracaoEmail C\u00F3digo de identifica\u00E7\u00E3o da configra\u00E7\u00E3o de EMAIL
   * @param tipoLayout Tipo do layout
   * @param tipoNotificacao Tipo da notifica\u00E7\u00E3o
   * @param remetente Remetente
   * @param assunto Assunto da Notificaca\u00E7\u00E3o
   * @param templatePadrao Template Padr\u00E3o
   * @return TemplateNotificacaoDetalheResponse
   */
  public TemplateNotificacaoDetalheResponse  alterarTemplate (Long id, String conteudo, Long idConfiguracaoEmail, String tipoLayout, String tipoNotificacao, String remetente, String assunto, Boolean templatePadrao) throws ApiException {
    Object postBody = conteudo;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarTemplate");
    }
    
    // verify the required parameter 'conteudo' is set
    if (conteudo == null) {
       throw new ApiException(400, "Missing the required parameter 'conteudo' when calling alterarTemplate");
    }
    

    // create path and map variables
    String path = "/api/templates-notificacoes/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConfiguracaoEmail", idConfiguracaoEmail));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tipoLayout", tipoLayout));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tipoNotificacao", tipoNotificacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "remetente", remetente));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "assunto", assunto));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "templatePadrao", templatePadrao));
    

    

    String[] contentTypes = {
      "text/plain"
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
        return (TemplateNotificacaoDetalheResponse) ApiInvoker.deserialize(response, "", TemplateNotificacaoDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Atualizar SMS
   * Esse recurso permite atualizar o status do SMS do emissor
   * @param nsu Seu n\u00FAmero
   * @param status Status
   * @param data Data
   * @param textoStatus TextoStatus
   * @param operadora Operadora
   * @return NotificacaoSMSResponse
   */
  public NotificacaoSMSResponse  atualizarStatusSMS (String nsu, String status, String data, String textoStatus, String operadora) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/notificacoes/sms/atualizar-status".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nsu", nsu));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "status", status));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "data", data));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "texto_status", textoStatus));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "operadora", operadora));
    

    

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
        return (NotificacaoSMSResponse) ApiInvoker.deserialize(response, "", NotificacaoSMSResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Consulta c\u00F3digo de seguran\u00E7a E-mail
   * Esse recurso permite consultar um c\u00F3digo de seguran\u00E7a E-mail espec\u00EDfico por id
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da configura\u00E7\u00E3o de e-mail
   * @return CodigoSegurancaResponse
   */
  public CodigoSegurancaResponse  consultarCodigoSegurancaEmail (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarCodigoSegurancaEmail");
    }
    

    // create path and map variables
    String path = "/api/codigos-seguranca-email/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (CodigoSegurancaResponse) ApiInvoker.deserialize(response, "", CodigoSegurancaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Consulta c\u00F3digo de seguran\u00E7a SMS
   * Esse recurso permite consultar um c\u00F3digo de seguran\u00E7a SMS espec\u00EDfico por id
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da configura\u00E7\u00E3o de e-mail
   * @return CodigoSegurancaResponse
   */
  public CodigoSegurancaResponse  consultarCodigoSegurancaSMS (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarCodigoSegurancaSMS");
    }
    

    // create path and map variables
    String path = "/api/codigos-seguranca-sms/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (CodigoSegurancaResponse) ApiInvoker.deserialize(response, "", CodigoSegurancaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Consulta configura\u00E7\u00E3o de E-mail
   * Esse recurso permite consultar uma configura\u00E7\u00E3o espec\u00EDfica por id
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da configura\u00E7\u00E3o de e-mail
   * @return ConfiguracaoEmailResponse
   */
  public ConfiguracaoEmailResponse  consultarConfiguracaoEmail (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarConfiguracaoEmail");
    }
    

    // create path and map variables
    String path = "/api/configuracoes-email/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (ConfiguracaoEmailResponse) ApiInvoker.deserialize(response, "", ConfiguracaoEmailResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Apresenta os dados de uma determinada configura\u00E7\u00E3o
   * Este m\u00E9todo permite consultar os par\u00E2metros de uma determinada Configura\u00E7\u00E3o a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (idConfiguracaoSMS)
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da configura\u00E7\u00E3o sms (id)
   * @return ConfiguracaoSMSResponse
   */
  public ConfiguracaoSMSResponse  consultarConfiguracaoSMS (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarConfiguracaoSMS");
    }
    

    // create path and map variables
    String path = "/api/configuracoes-sms/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (ConfiguracaoSMSResponse) ApiInvoker.deserialize(response, "", ConfiguracaoSMSResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Consulta template de notifica\u00E7\u00E3o
   * Esse recurso permite consultar uma configura\u00E7\u00E3o espec\u00EDfica por id
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do layout de e-mail
   * @return TemplateNotificacaoDetalheResponse
   */
  public TemplateNotificacaoDetalheResponse  consultarTemplate (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTemplate");
    }
    

    // create path and map variables
    String path = "/api/templates-notificacoes/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (TemplateNotificacaoDetalheResponse) ApiInvoker.deserialize(response, "", TemplateNotificacaoDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Deleta as informa\u00E7\u00F5es da configura\u00E7\u00E3o sms informada
   * Este m\u00E9todo realiza a exclus\u00E3o da configura\u00E7\u00E3o sms, a partir do id informado
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da configura\u00E7\u00E3o sms (id)
   * @return ConfiguracaoSMSResponse
   */
  public ConfiguracaoSMSResponse  deletarConfiguracaoSMS (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling deletarConfiguracaoSMS");
    }
    

    // create path and map variables
    String path = "/api/configuracoes-sms/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (ConfiguracaoSMSResponse) ApiInvoker.deserialize(response, "", ConfiguracaoSMSResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Enviar notifica\u00E7\u00E3o por email
   * Esse recurso permite enviar uma mensagem de notifica\u00E7\u00E3o por email
   * @param request request
   * @return Object
   */
  public Object  enviarEmail (NotificacaoEmailRequest request) throws ApiException {
    Object postBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
       throw new ApiException(400, "Missing the required parameter 'request' when calling enviarEmail");
    }
    

    // create path and map variables
    String path = "/api/notificacoes-email".replaceAll("\\{format\\}","json");

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
   * Enviar OTP 3D Secure
   * Esse recursos permite enviar uma notifica\u00E7\u00E3o com o OTP do 3D Secure para um determinado cliente
   * @param secure3dRequest secure3dRequest
   * @return Object
   */
  public Object  enviarOTP (Secure3dRequest secure3dRequest) throws ApiException {
    Object postBody = secure3dRequest;
    
    // verify the required parameter 'secure3dRequest' is set
    if (secure3dRequest == null) {
       throw new ApiException(400, "Missing the required parameter 'secure3dRequest' when calling enviarOTP");
    }
    

    // create path and map variables
    String path = "/api/notificacoes/3d-secure".replaceAll("\\{format\\}","json");

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
   * Gerar c\u00F3digo de seguran\u00E7a e enviar por e-mail
   * Esse recurso permite gerar e enviar c\u00F3digos de seguran\u00E7a por e-mail, para valida\u00E7\u00E3o de dispositivos
   * @param email email
   * @return String
   */
  public String  gerarCodigoSegurancaNotificacaoEmail (String email) throws ApiException {
    Object postBody = email;
    
    // verify the required parameter 'email' is set
    if (email == null) {
       throw new ApiException(400, "Missing the required parameter 'email' when calling gerarCodigoSegurancaNotificacaoEmail");
    }
    

    // create path and map variables
    String path = "/api/notificacoes-email/gerar-codigo-seguranca".replaceAll("\\{format\\}","json");

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
   * Gerar c\u00F3digo de seguran\u00E7a e enviar por sms
   * Esse recurso permite gerar e enviar c\u00F3digos de seguran\u00E7a por sms, para valida\u00E7\u00E3o de dispositivos
   * @param persist persist
   * @return String
   */
  public String  gerarCodigoSegurancaNotificacaoSMS (CodigoSegurancaSMSPersist persist) throws ApiException {
    Object postBody = persist;
    
    // verify the required parameter 'persist' is set
    if (persist == null) {
       throw new ApiException(400, "Missing the required parameter 'persist' when calling gerarCodigoSegurancaNotificacaoSMS");
    }
    

    // create path and map variables
    String path = "/api/notificacoes-sms/gerar-codigo-seguranca".replaceAll("\\{format\\}","json");

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
   * Lista os c\u00F3digos de seguran\u00E7a E-Mail
   * Esse recurso permite listar os codigos de seguran\u00E7a por E-Mail
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageCodigoSegurancaResponse
   */
  public PageCodigoSegurancaResponse  listarCodigosSegurancaEmail (List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/codigos-seguranca-email".replaceAll("\\{format\\}","json");

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
        return (PageCodigoSegurancaResponse) ApiInvoker.deserialize(response, "", PageCodigoSegurancaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista os c\u00F3digos de seguran\u00E7a SMS
   * Esse recurso permite listar os codigos de seguran\u00E7a por SMS
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageCodigoSegurancaResponse
   */
  public PageCodigoSegurancaResponse  listarCodigosSegurancaSMS (List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/codigos-seguranca-sms".replaceAll("\\{format\\}","json");

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
        return (PageCodigoSegurancaResponse) ApiInvoker.deserialize(response, "", PageCodigoSegurancaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista configura\u00E7\u00F5es de E-mails
   * Esse recurso permite listar as configura\u00E7\u00F5es de E-mails
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageConfiguracaoEmailResponse
   */
  public PageConfiguracaoEmailResponse  listarConfiguracaoEmail (List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/configuracoes-email".replaceAll("\\{format\\}","json");

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
        return (PageConfiguracaoEmailResponse) ApiInvoker.deserialize(response, "", PageConfiguracaoEmailResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Este m\u00E9todo permite que sejam listados todas as configura\u00E7\u00F5es de sms existentes
   * Lista todas as configura\u00E7\u00F5es
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param id Id da configura\u00E7\u00E3o
   * @param idEmissor Id do emissor
   * @return PageConfiguracaoSMSResponse
   */
  public PageConfiguracaoSMSResponse  listarConfiguracaoSMS (List<String> sort, Integer page, Integer limit, Long id, Long idEmissor) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/configuracoes-sms".replaceAll("\\{format\\}","json");

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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEmissor", idEmissor));
    

    

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
        return (PageConfiguracaoSMSResponse) ApiInvoker.deserialize(response, "", PageConfiguracaoSMSResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Listar Push
   * Esse recurso permite listar os Pushes do emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param dataEnvio Apresenta a data e em que o registro foi enviado para o dispositivo
   * @param tipoEvento Nome do tipoEvento da notifica\u00E7\u00E3o
   * @param status Status de envio da notifica\u00E7\u00E3o
   * @param plataforma Plataforma de Push notifications
   * @param protocolo N\u00FAmero do protocolo de envio de notifica\u00E7\u00F5es
   * @return PagePushResponse
   */
  public PagePushResponse  listarPush (List<String> sort, Integer page, Integer limit, String dataEnvio, String tipoEvento, String status, String plataforma, String protocolo) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/notificacoes/push".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataEnvio", dataEnvio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tipoEvento", tipoEvento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "status", status));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "plataforma", plataforma));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "protocolo", protocolo));
    

    

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
        return (PagePushResponse) ApiInvoker.deserialize(response, "", PagePushResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Listar SMS
   * Esse recurso permite listar os SMS do emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param dataInclusao Apresenta a data e em que o registro foi inclu\u00EDdo na base para ser enviado
   * @param tipoEvento Nome do tipoEvento da notifica\u00E7\u00E3o
   * @param status Status de envio da notifica\u00E7\u00E3o
   * @param operadora Nome da operadora a qual a notifica\u00E7\u00E3o foi enviada
   * @param protocolo N\u00FAmero do protocolo de envio de notifica\u00E7\u00F5es
   * @param nsu Apresenta o nsu da notifica\u00E7\u00E3o
   * @return PageSMSResponse
   */
  public PageSMSResponse  listarSMS (List<String> sort, Integer page, Integer limit, String dataInclusao, String tipoEvento, String status, String operadora, String protocolo, Long nsu) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/notificacoes/sms".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataInclusao", dataInclusao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tipoEvento", tipoEvento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "status", status));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "operadora", operadora));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "protocolo", protocolo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nsu", nsu));
    

    

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
        return (PageSMSResponse) ApiInvoker.deserialize(response, "", PageSMSResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista templates de notifica\u00E7\u00F5es
   * Esse recurso permite listar templates notifica\u00E7\u00F5es
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageTemplateNotificacaoResponse
   */
  public PageTemplateNotificacaoResponse  listarTemplates (List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/templates-notificacoes".replaceAll("\\{format\\}","json");

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
        return (PageTemplateNotificacaoResponse) ApiInvoker.deserialize(response, "", PageTemplateNotificacaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista os tipos templates de notifica\u00E7\u00E3o
   * Esse recurso permite listar os tipos de templates dispon\u00EDveis os par\u00E2metros devem ser usados entre chaves. Ex: {{nomeParametro}} 
   * @return List<Object>
   */
  public List<Object>  listarTiposLayouts () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/tipos-layouts".replaceAll("\\{format\\}","json");

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
        return (List<Object>) ApiInvoker.deserialize(response, "array", Object.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Reenviar c\u00F3digo de seguran\u00E7a por sms
   * Esse recurso permite que seja reenviado para um determinado n\u00FAmero de telefone, atrav\u00E9s de SMS, o c\u00F3digo de seguran\u00E7a gerado previamente para ele. Caso o c\u00F3digo de seguran\u00E7a j\u00E1 n\u00E3o esteja mais v\u00E1lido, o recurso retornar\u00E1 uma mensagem orientando que seja solicitada uma nova gera\u00E7\u00E3o para o telefone em quest\u00E3o
   * @param persist persist
   * @return String
   */
  public String  reenviarCodigoSegurancaNotificacaoSMS (CodigoSegurancaSMSPersist persist) throws ApiException {
    Object postBody = persist;
    
    // verify the required parameter 'persist' is set
    if (persist == null) {
       throw new ApiException(400, "Missing the required parameter 'persist' when calling reenviarCodigoSegurancaNotificacaoSMS");
    }
    

    // create path and map variables
    String path = "/api/notificacoes-sms/reenviar-codigo-seguranca".replaceAll("\\{format\\}","json");

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
   * Responder SMS
   * Esse recurso permite atualizar a resposta do SMS, fornecida pedo usu\u00E1rio
   * @param nsu Seu n\u00FAmero
   * @param data Data
   * @param resposta TextoStatus
   * @return NotificacaoSMSResponse
   */
  public NotificacaoSMSResponse  responderSMS (String nsu, String data, String resposta) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/notificacoes/sms/responder".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nsu", nsu));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "data", data));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "resposta", resposta));
    

    

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
        return (NotificacaoSMSResponse) ApiInvoker.deserialize(response, "", NotificacaoSMSResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Salva configura\u00E7\u00F5es de E-mail
   * Esse recurso salvar configura\u00E7\u00F5es de E-mail
   * @param persist persist
   * @return ConfiguracaoEmailResponse
   */
  public ConfiguracaoEmailResponse  salvarConfiguracaoEmail (ConfiguracaoEmailPersist persist) throws ApiException {
    Object postBody = persist;
    
    // verify the required parameter 'persist' is set
    if (persist == null) {
       throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarConfiguracaoEmail");
    }
    

    // create path and map variables
    String path = "/api/configuracoes-email".replaceAll("\\{format\\}","json");

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
        return (ConfiguracaoEmailResponse) ApiInvoker.deserialize(response, "", ConfiguracaoEmailResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza o cadastro uma nova configura\u00E7\u00E3o de sms
   * 
   * @param idEmissor C\u00F3digo identifica\u00E7\u00E3o emissor
   * @param usuarioSMS Apresenta o usu\u00E1rio sms
   * @param senhaSMS Apresenta a senha sms
   * @return ConfiguracaoSMSResponse
   */
  public ConfiguracaoSMSResponse  salvarConfiguracaoSMS (Long idEmissor, String usuarioSMS, String senhaSMS) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idEmissor' is set
    if (idEmissor == null) {
       throw new ApiException(400, "Missing the required parameter 'idEmissor' when calling salvarConfiguracaoSMS");
    }
    
    // verify the required parameter 'usuarioSMS' is set
    if (usuarioSMS == null) {
       throw new ApiException(400, "Missing the required parameter 'usuarioSMS' when calling salvarConfiguracaoSMS");
    }
    
    // verify the required parameter 'senhaSMS' is set
    if (senhaSMS == null) {
       throw new ApiException(400, "Missing the required parameter 'senhaSMS' when calling salvarConfiguracaoSMS");
    }
    

    // create path and map variables
    String path = "/api/configuracoes-sms".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEmissor", idEmissor));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "usuarioSMS", usuarioSMS));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "senhaSMS", senhaSMS));
    

    

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
        return (ConfiguracaoSMSResponse) ApiInvoker.deserialize(response, "", ConfiguracaoSMSResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Enviar Push APNS
   * Esse recurso permite enviar Push para um determinado dipositivo movel atrav\u00E9s da plataforma APNS (Apple Push Notification Service)
   * @param pushPersists pushPersists
   * @return NotificacaoResponse
   */
  public NotificacaoResponse  salvarPushAPNS (List<PushAPNS> pushPersists) throws ApiException {
    Object postBody = pushPersists;
    
    // verify the required parameter 'pushPersists' is set
    if (pushPersists == null) {
       throw new ApiException(400, "Missing the required parameter 'pushPersists' when calling salvarPushAPNS");
    }
    

    // create path and map variables
    String path = "/api/notificacoes/push/apns".replaceAll("\\{format\\}","json");

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
        return (NotificacaoResponse) ApiInvoker.deserialize(response, "", NotificacaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Enviar Push FCM
   * Esse recurso permite enviar Push para um determinado dipositivo movel atrav\u00E9s da plataforma FCM (Firebase Cloud Messaging)
   * @param pushPersists pushPersists
   * @return NotificacaoResponse
   */
  public NotificacaoResponse  salvarPushFCM (List<PushFCMEGCM> pushPersists) throws ApiException {
    Object postBody = pushPersists;
    
    // verify the required parameter 'pushPersists' is set
    if (pushPersists == null) {
       throw new ApiException(400, "Missing the required parameter 'pushPersists' when calling salvarPushFCM");
    }
    

    // create path and map variables
    String path = "/api/notificacoes/push/fcm".replaceAll("\\{format\\}","json");

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
        return (NotificacaoResponse) ApiInvoker.deserialize(response, "", NotificacaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Enviar Push GCM
   * Esse recurso permite enviar Push para um determinado dipositivo movel atrav\u00E9s da plataforma GCM (Google Cloud Messaging)
   * @param pushPersists pushPersists
   * @return NotificacaoResponse
   */
  public NotificacaoResponse  salvarPushGCM (List<PushFCMEGCM> pushPersists) throws ApiException {
    Object postBody = pushPersists;
    
    // verify the required parameter 'pushPersists' is set
    if (pushPersists == null) {
       throw new ApiException(400, "Missing the required parameter 'pushPersists' when calling salvarPushGCM");
    }
    

    // create path and map variables
    String path = "/api/notificacoes/push/gcm".replaceAll("\\{format\\}","json");

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
        return (NotificacaoResponse) ApiInvoker.deserialize(response, "", NotificacaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Enviar SMS
   * Esse recurso permite enviar uma lista de SMS
   * @param listaSMS listaSMS
   * @return NotificacaoResponse
   */
  public NotificacaoResponse  salvarSMS (List<NotificacaoSMSBody> listaSMS) throws ApiException {
    Object postBody = listaSMS;
    
    // verify the required parameter 'listaSMS' is set
    if (listaSMS == null) {
       throw new ApiException(400, "Missing the required parameter 'listaSMS' when calling salvarSMS");
    }
    

    // create path and map variables
    String path = "/api/notificacoes/sms".replaceAll("\\{format\\}","json");

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
        return (NotificacaoResponse) ApiInvoker.deserialize(response, "", NotificacaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Salva template de notifica\u00E7\u00E3o
   * Esse recurso salvar template notifica\u00E7\u00F5e
   * @param conteudo Template HTML
   * @param idConfiguracaoEmail C\u00F3digo de identifica\u00E7\u00E3o da configra\u00E7\u00E3o de EMAIL
   * @param tipoLayout Tipo do layout
   * @param tipoNotificacao Tipo da notifica\u00E7\u00E3o
   * @param remetente Remetente
   * @param assunto Assunto da Notificaca\u00E7\u00E3o
   * @param templatePadrao Template Padr\u00E3o
   * @return TemplateNotificacaoDetalheResponse
   */
  public TemplateNotificacaoDetalheResponse  salvarTemplate (String conteudo, Long idConfiguracaoEmail, String tipoLayout, String tipoNotificacao, String remetente, String assunto, Boolean templatePadrao) throws ApiException {
    Object postBody = conteudo;
    
    // verify the required parameter 'conteudo' is set
    if (conteudo == null) {
       throw new ApiException(400, "Missing the required parameter 'conteudo' when calling salvarTemplate");
    }
    

    // create path and map variables
    String path = "/api/templates-notificacoes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConfiguracaoEmail", idConfiguracaoEmail));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tipoLayout", tipoLayout));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tipoNotificacao", tipoNotificacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "remetente", remetente));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "assunto", assunto));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "templatePadrao", templatePadrao));
    

    

    String[] contentTypes = {
      "text/plain"
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
        return (TemplateNotificacaoDetalheResponse) ApiInvoker.deserialize(response, "", TemplateNotificacaoDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Validar c\u00F3digo de seguran\u00E7a enviado por e-mail
   * Esse recurso permite validar os c\u00F3digos de seguran\u00E7a enviador por e-mail, para valida\u00E7\u00E3o de dispositivos
   * @param request request
   * @return String
   */
  public String  validarCodigoSegurancaNotificacaoEmail (CodigoSegurancaEMAILPersist request) throws ApiException {
    Object postBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
       throw new ApiException(400, "Missing the required parameter 'request' when calling validarCodigoSegurancaNotificacaoEmail");
    }
    

    // create path and map variables
    String path = "/api/notificacoes-email/validar-codigo-seguranca".replaceAll("\\{format\\}","json");

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
   * Validar c\u00F3digo de seguran\u00E7a enviado por sms
   * Esse recurso permite validar os c\u00F3digos de seguran\u00E7a enviador por sms, para valida\u00E7\u00E3o de dispositivos
   * @param request request
   * @return String
   */
  public String  validarCodigoSegurancaNotificacaoSMS (CodigoSegurancaSMSRequest request) throws ApiException {
    Object postBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
       throw new ApiException(400, "Missing the required parameter 'request' when calling validarCodigoSegurancaNotificacaoSMS");
    }
    

    // create path and map variables
    String path = "/api/notificacoes-sms/validar-codigo-seguranca".replaceAll("\\{format\\}","json");

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
