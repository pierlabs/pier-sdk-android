package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.ControleLimiteCartaoResponse;
import br.com.conductor.pier.api.v2.model.ControleLimiteCartaoUpdate;
import br.com.conductor.pier.api.v2.model.ConfiguracaoControleCartaoResponse;
import br.com.conductor.pier.api.v2.model.ConfiguracaoControleCartaoUpdate;
import br.com.conductor.pier.api.v2.model.ControleCartaoGrupoMCCResponse;
import br.com.conductor.pier.api.v2.model.PageControleLimiteCartaoResponse;
import br.com.conductor.pier.api.v2.model.PageConfiguracaoControleCartaoResponse;
import br.com.conductor.pier.api.v2.model.PageControleCartaoGrupoMCCResponse;
import br.com.conductor.pier.api.v2.model.ControleLimitesCartaoPersist;
import br.com.conductor.pier.api.v2.model.ConfiguracaoControleCartaoPersist;
import br.com.conductor.pier.api.v2.model.ControleCartaoGrupoMCCPersist;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class ControleCartaoApi {
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
   * Altera um controle de limites de um cart\u00E3o
   * Este recurso permite que seja alterado o controle de limites de um cart\u00E3o, o controle de limites tem por finalidade gerenciar a utiliza\u00E7\u00E3o do limite dipon\u00EDvel global da conta, limitando o gasto di\u00E1rio, semanal ou mensal, por cart\u00E3o
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o (id)
   * @param idControleLimite C\u00F3digo de identifica\u00E7\u00E3o do controle de limites do cart\u00E3o (id)
   * @param controleLimitesCartaoUpdate controleLimitesCartaoUpdate
   * @return ControleLimiteCartaoResponse
   */
  public ControleLimiteCartaoResponse  alterar (Long id, Long idControleLimite, ControleLimiteCartaoUpdate controleLimitesCartaoUpdate) throws ApiException {
    Object postBody = controleLimitesCartaoUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterar");
    }
    
    // verify the required parameter 'idControleLimite' is set
    if (idControleLimite == null) {
       throw new ApiException(400, "Missing the required parameter 'idControleLimite' when calling alterar");
    }
    
    // verify the required parameter 'controleLimitesCartaoUpdate' is set
    if (controleLimitesCartaoUpdate == null) {
       throw new ApiException(400, "Missing the required parameter 'controleLimitesCartaoUpdate' when calling alterar");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/controles-limites/{idControleLimite}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "idControleLimite" + "\\}", apiInvoker.escapeString(idControleLimite.toString()));

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
      String response = apiInvoker.invokeAPI(basePath, path, "PATCH", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ControleLimiteCartaoResponse) ApiInvoker.deserialize(response, "", ControleLimiteCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Altera qualquer parte do log de configura\u00E7\u00E3o
   * Esse m\u00E9todo permite alterar qualquer parte da configura\u00E7\u00E3o de bloqueio do cart\u00E3o ao validar o ticket de transa\u00E7\u00E3o.
   * @param idConfiguracaoCartao C\u00F3digo da configura\u00E7\u00E3o controle cart\u00E3o
   * @param id id
   * @param configuracaoControleCartaoUpdate configuracaoControleCartaoUpdate
   * @return ConfiguracaoControleCartaoResponse
   */
  public ConfiguracaoControleCartaoResponse  alterarConfiguracaoControleCartao (Long idConfiguracaoCartao, Long id, ConfiguracaoControleCartaoUpdate configuracaoControleCartaoUpdate) throws ApiException {
    Object postBody = configuracaoControleCartaoUpdate;
    
    // verify the required parameter 'idConfiguracaoCartao' is set
    if (idConfiguracaoCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'idConfiguracaoCartao' when calling alterarConfiguracaoControleCartao");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarConfiguracaoControleCartao");
    }
    
    // verify the required parameter 'configuracaoControleCartaoUpdate' is set
    if (configuracaoControleCartaoUpdate == null) {
       throw new ApiException(400, "Missing the required parameter 'configuracaoControleCartaoUpdate' when calling alterarConfiguracaoControleCartao");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/controles-configuracoes/{idConfiguracaoCartao}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idConfiguracaoCartao" + "\\}", apiInvoker.escapeString(idConfiguracaoCartao.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
      String response = apiInvoker.invokeAPI(basePath, path, "PATCH", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ConfiguracaoControleCartaoResponse) ApiInvoker.deserialize(response, "", ConfiguracaoControleCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Ativa um controle de limites de um cart\u00E3o
   * Este recurso permite que seja ativado o controle de limites de um cart\u00E3o, o controle de limites tem por finalidade gerenciar a utiliza\u00E7\u00E3o do limite dipon\u00EDvel global da conta, limitando o gasto di\u00E1rio, semanal ou mensal, por cart\u00E3o
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o (id)
   * @param idControleLimite C\u00F3digo de identifica\u00E7\u00E3o do controle de limites do cart\u00E3o (id)
   * @return ControleLimiteCartaoResponse
   */
  public ControleLimiteCartaoResponse  ativarControleLimiteCartao (Long id, Long idControleLimite) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling ativarControleLimiteCartao");
    }
    
    // verify the required parameter 'idControleLimite' is set
    if (idControleLimite == null) {
       throw new ApiException(400, "Missing the required parameter 'idControleLimite' when calling ativarControleLimiteCartao");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/controles-limites/{idControleLimite}/ativar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "idControleLimite" + "\\}", apiInvoker.escapeString(idControleLimite.toString()));

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
        return (ControleLimiteCartaoResponse) ApiInvoker.deserialize(response, "", ControleLimiteCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Apresenta o controle de limites do cart\u00E3o
   * Este recurso permite que seja mostrado o controle de limites do cart\u00E3o, o controle de limites tem por finalidade gerenciar a utiliza\u00E7\u00E3o do limite dipon\u00EDvel global da conta, limitando o gasto di\u00E1rio, semanal ou mensal, por cart\u00E3o
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o (id)
   * @param idControleLimite C\u00F3digo de identifica\u00E7\u00E3o do controle de limites do cart\u00E3o (id)
   * @return ControleLimiteCartaoResponse
   */
  public ControleLimiteCartaoResponse  consultar (Long id, Long idControleLimite) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultar");
    }
    
    // verify the required parameter 'idControleLimite' is set
    if (idControleLimite == null) {
       throw new ApiException(400, "Missing the required parameter 'idControleLimite' when calling consultar");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/controles-limites/{idControleLimite}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "idControleLimite" + "\\}", apiInvoker.escapeString(idControleLimite.toString()));

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
        return (ControleLimiteCartaoResponse) ApiInvoker.deserialize(response, "", ControleLimiteCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Exibe as configura\u00E7\u00F5es de bloqueio para um cart\u00E3o espec\u00EDfico.
   * Este m\u00E9todo permite consultar a informa\u00E7\u00E3o da permiss\u00E3o em transa\u00E7\u00F5es de um certo Cart\u00E3o do c\u00F3digo de identifica\u00E7\u00E3o (id)
   * @param idConfiguracaoCartao C\u00F3digo da configura\u00E7\u00E3o controle cart\u00E3o
   * @param id id
   * @return ConfiguracaoControleCartaoResponse
   */
  public ConfiguracaoControleCartaoResponse  consultarConfiguracaoControleCartao (Long idConfiguracaoCartao, Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConfiguracaoCartao' is set
    if (idConfiguracaoCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'idConfiguracaoCartao' when calling consultarConfiguracaoControleCartao");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarConfiguracaoControleCartao");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/controles-configuracoes/{idConfiguracaoCartao}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idConfiguracaoCartao" + "\\}", apiInvoker.escapeString(idConfiguracaoCartao.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (ConfiguracaoControleCartaoResponse) ApiInvoker.deserialize(response, "", ConfiguracaoControleCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Exibe todos os mcc de bloqueio vinculado a um cart\u00E3o espec\u00EDfico.
   * Este m\u00E9todo permite consultar a informa\u00E7\u00E3o de todos os mcc que est\u00E3o vinculado a um Cart\u00E3o pelo seu c\u00F3digo de identifica\u00E7\u00E3o (id).
   * @param id C\u00F3digo de controle de grupo MCC do cart\u00E3o.
   * @param idControleCartaoGrupoMCC idControleCartaoGrupoMCC
   * @return ControleCartaoGrupoMCCResponse
   */
  public ControleCartaoGrupoMCCResponse  consultarControleGrupoMccCartao (Long id, Long idControleCartaoGrupoMCC) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarControleGrupoMccCartao");
    }
    
    // verify the required parameter 'idControleCartaoGrupoMCC' is set
    if (idControleCartaoGrupoMCC == null) {
       throw new ApiException(400, "Missing the required parameter 'idControleCartaoGrupoMCC' when calling consultarControleGrupoMccCartao");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/controles-grupomcc/{idControleCartaoGrupoMCC}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "idControleCartaoGrupoMCC" + "\\}", apiInvoker.escapeString(idControleCartaoGrupoMCC.toString()));

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
        return (ControleCartaoGrupoMCCResponse) ApiInvoker.deserialize(response, "", ControleCartaoGrupoMCCResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Deletar uma configura\u00E7\u00E3o de um cart\u00E3o.
   * O metodo Deleta a configura\u00E7\u00E3o que est\u00E1 vinculada ao cart\u00E3o e deixar sem bloqueio nas transa\u00E7\u00F5es relacionadas ao mesmo.
   * @param idConfiguracaoCartao C\u00F3digo da configura\u00E7\u00E3o controle cart\u00E3o
   * @param id id
   * @return ConfiguracaoControleCartaoResponse
   */
  public ConfiguracaoControleCartaoResponse  deletarConfiguracaoControleCartao (Long idConfiguracaoCartao, Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConfiguracaoCartao' is set
    if (idConfiguracaoCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'idConfiguracaoCartao' when calling deletarConfiguracaoControleCartao");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling deletarConfiguracaoControleCartao");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/controles-configuracoes/{idConfiguracaoCartao}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idConfiguracaoCartao" + "\\}", apiInvoker.escapeString(idConfiguracaoCartao.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (ConfiguracaoControleCartaoResponse) ApiInvoker.deserialize(response, "", ConfiguracaoControleCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Deletar o vinculo do mcc com um cart\u00E3o.
   * O metodo Deleta o vinculo do cart\u00E3o com o grupo MCC, deixando livre para transacionar de qualquer bloqueio para aquele grupo de mcc.
   * @param id C\u00F3digo de controle de grupo MCC do cart\u00E3o.
   * @param idControleCartaoGrupoMCC idControleCartaoGrupoMCC
   * @return ControleCartaoGrupoMCCResponse
   */
  public ControleCartaoGrupoMCCResponse  deletarControleGrupoMccCartao (Long id, Long idControleCartaoGrupoMCC) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling deletarControleGrupoMccCartao");
    }
    
    // verify the required parameter 'idControleCartaoGrupoMCC' is set
    if (idControleCartaoGrupoMCC == null) {
       throw new ApiException(400, "Missing the required parameter 'idControleCartaoGrupoMCC' when calling deletarControleGrupoMccCartao");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/controles-grupomcc/{idControleCartaoGrupoMCC}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "idControleCartaoGrupoMCC" + "\\}", apiInvoker.escapeString(idControleCartaoGrupoMCC.toString()));

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
        return (ControleCartaoGrupoMCCResponse) ApiInvoker.deserialize(response, "", ControleCartaoGrupoMCCResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Desativa um controle de limites de um cart\u00E3o
   * Este recurso permite que seja desativado o controle de limites de um cart\u00E3o, o controle de limites tem por finalidade gerenciar a utiliza\u00E7\u00E3o do limite dipon\u00EDvel global da conta, limitando o gasto di\u00E1rio, semanal ou mensal, por cart\u00E3o
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o (id)
   * @param idControleLimite C\u00F3digo de identifica\u00E7\u00E3o do controle de limites do cart\u00E3o (id)
   * @return ControleLimiteCartaoResponse
   */
  public ControleLimiteCartaoResponse  desativarControleLimiteCartao (Long id, Long idControleLimite) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling desativarControleLimiteCartao");
    }
    
    // verify the required parameter 'idControleLimite' is set
    if (idControleLimite == null) {
       throw new ApiException(400, "Missing the required parameter 'idControleLimite' when calling desativarControleLimiteCartao");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/controles-limites/{idControleLimite}/desativar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "idControleLimite" + "\\}", apiInvoker.escapeString(idControleLimite.toString()));

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
        return (ControleLimiteCartaoResponse) ApiInvoker.deserialize(response, "", ControleLimiteCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista o controle de limites dos cart\u00F5es
   * Este recurso permite que sejam listados todos os controles de limites por cart\u00E3o, o controle de limites tem por finalidade gerenciar a utiliza\u00E7\u00E3o do limite dipon\u00EDvel global da conta, limitando o gasto di\u00E1rio, semanal ou mensal, por cart\u00E3o
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idCartao Id do cart\u00E3o
   * @return PageControleLimiteCartaoResponse
   */
  public PageControleLimiteCartaoResponse  listar (List<String> sort, Integer page, Integer limit, Long idCartao) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/cartoes/controles-limites".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idCartao", idCartao));
    

    

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
        return (PageControleLimiteCartaoResponse) ApiInvoker.deserialize(response, "", PageControleLimiteCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista os cart\u00F5es configurados pelo remetente
   * Esse m\u00E9todo permite listar os cart\u00F5es configurados para bloqueios de transa\u00E7\u00E3o na base do remetente
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idCartao C\u00F3digo Identificador do cartao na base (id)
   * @param permiteEcommerce Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es ecommerce
   * @param permiteSaque Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es de saque
   * @param permiteWallet Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es por meio wallet
   * @param permiteControleMCC Indica se o cart\u00E3o est\u00E1 ativo para controle por grupos de MCCs
   * @return PageConfiguracaoControleCartaoResponse
   */
  public PageConfiguracaoControleCartaoResponse  listarConfiguracaoControleCartao (List<String> sort, Integer page, Integer limit, Long idCartao, Boolean permiteEcommerce, Boolean permiteSaque, Boolean permiteWallet, Boolean permiteControleMCC) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/cartoes/controles-configuracoes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idCartao", idCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "permiteEcommerce", permiteEcommerce));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "permiteSaque", permiteSaque));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "permiteWallet", permiteWallet));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "permiteControleMCC", permiteControleMCC));
    

    

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
        return (PageConfiguracaoControleCartaoResponse) ApiInvoker.deserialize(response, "", PageConfiguracaoControleCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista os cart\u00F5es vinculados aos estabelecimentos.
   * Esse m\u00E9todo permite listar os cart\u00F5es registrados respectivamente para grupos MCC.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idCartao C\u00F3digo Identificador do cartao na base (id)
   * @param idGrupoMCC C\u00F3digo Identificador do grupo mcc na base.
   * @return PageControleCartaoGrupoMCCResponse
   */
  public PageControleCartaoGrupoMCCResponse  listarControleGrupoMccCartao (List<String> sort, Integer page, Integer limit, Long idCartao, Long idGrupoMCC) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/cartoes/controles-grupomcc".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idCartao", idCartao));
    
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
        return (PageControleCartaoGrupoMCCResponse) ApiInvoker.deserialize(response, "", PageControleCartaoGrupoMCCResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Cadastra um controle de limites para um cart\u00E3o
   * Este recurso permite que seja cadastrado um controle de limites para um cart\u00E3o, o controle de limites tem por finalidade gerenciar a utiliza\u00E7\u00E3o do limite dipon\u00EDvel global da conta, limitando o gasto di\u00E1rio, semanal ou mensal, por cart\u00E3o
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o (id)
   * @param controleLimitesCartaoPersist controleLimitesCartaoPersist
   * @return ControleLimiteCartaoResponse
   */
  public ControleLimiteCartaoResponse  salvar (Long id, ControleLimitesCartaoPersist controleLimitesCartaoPersist) throws ApiException {
    Object postBody = controleLimitesCartaoPersist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling salvar");
    }
    
    // verify the required parameter 'controleLimitesCartaoPersist' is set
    if (controleLimitesCartaoPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'controleLimitesCartaoPersist' when calling salvar");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/controles-limites".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (ControleLimiteCartaoResponse) ApiInvoker.deserialize(response, "", ControleLimiteCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Registra a configura\u00E7\u00E3o do cart\u00E3o.
   * O m\u00E9todo registra a configura\u00E7\u00E3o do bloqueio ou n\u00E3o algum tipo de transa\u00E7\u00E3o de uma determinada carta portadora.
   * @param id id
   * @param configuracaoControleCartaoPersist configuracaoControleCartaoPersist
   * @return ConfiguracaoControleCartaoResponse
   */
  public ConfiguracaoControleCartaoResponse  salvarConfiguracaoControleCartao (Long id, ConfiguracaoControleCartaoPersist configuracaoControleCartaoPersist) throws ApiException {
    Object postBody = configuracaoControleCartaoPersist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling salvarConfiguracaoControleCartao");
    }
    
    // verify the required parameter 'configuracaoControleCartaoPersist' is set
    if (configuracaoControleCartaoPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'configuracaoControleCartaoPersist' when calling salvarConfiguracaoControleCartao");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/controles-configuracoes".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (ConfiguracaoControleCartaoResponse) ApiInvoker.deserialize(response, "", ConfiguracaoControleCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Registra o grupo mcc ao cart\u00E3o.
   * Cria o vinculo de grupo mcc com o cart\u00E3o para controle transa\u00E7\u00F5es por grupo de mcc.
   * @param id id
   * @param controleCartaoMCCPersist controleCartaoMCCPersist
   * @return ControleCartaoGrupoMCCResponse
   */
  public ControleCartaoGrupoMCCResponse  salvarControleGrupoMccCartao (Long id, ControleCartaoGrupoMCCPersist controleCartaoMCCPersist) throws ApiException {
    Object postBody = controleCartaoMCCPersist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling salvarControleGrupoMccCartao");
    }
    
    // verify the required parameter 'controleCartaoMCCPersist' is set
    if (controleCartaoMCCPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'controleCartaoMCCPersist' when calling salvarControleGrupoMccCartao");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/controles-grupomcc".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (ControleCartaoGrupoMCCResponse) ApiInvoker.deserialize(response, "", ControleCartaoGrupoMCCResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
