package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.HistoricoImpressaoCartao;
import br.com.conductor.pier.api.v2.model.Cartao;
import br.com.conductor.pier.api.v2.model.LimiteDisponibilidade;
import br.com.conductor.pier.api.v2.model.LoteCartoesPrePagos;
import br.com.conductor.pier.api.v2.model.Portador;
import br.com.conductor.pier.api.v2.model.PageLoteCartoesPrePagosResponse;
import java.util.Date;
import br.com.conductor.pier.api.v2.model.PageCartoes;
import br.com.conductor.pier.api.v2.model.ValidaCartao;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;


public class CartaoApi {
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
   * Realiza a altera\u00C3\u00A7\u00C3\u00A3o da senha de um Cart\u00C3\u00A3o
   * Esta opera\u00C3\u00A7\u00C3\u00A3o tem como objetivo permitir que o portador de um determinado cart\u00C3\u00A3o possa definir uma senha a sua escolha.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   * @param senha Senha para ser cadastrada ou alterada.
   * @return String
   */
  public String  alterarAlterarSenhaUsingPUT (Long id, String senha) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarAlterarSenhaUsingPUT");
    }
    
    // verify the required parameter 'senha' is set
    if (senha == null) {
       throw new ApiException(400, "Missing the required parameter 'senha' when calling alterarAlterarSenhaUsingPUT");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/alterar-senha".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
   * Realiza a altera\u00C3\u00A7\u00C3\u00A3o do Status de Impress\u00C3\u00A3o do Cart\u00C3\u00A3o
   * Este m\u00C3\u00A9todo permite que uma Aplica\u00C3\u00A7\u00C3\u00A3o que realize a impress\u00C3\u00A3o de cart\u00C3\u00B5es possa indicar que um determinado idCartao fora impresso ou est\u00C3\u00A1 em processo de impress\u00C3\u00A3o. Para isso, basta informar o respectivo c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do cart\u00C3\u00A3o (id) que deseja ter seu um determinado id_status_impressao atribu\u00C3\u00ADdo a ele. Por padr\u00C3\u00A3o, cart\u00C3\u00B5es provis\u00C3\u00B3rios ou que j\u00C3\u00A1 tenham sido inclu\u00C3\u00ADdos em um arquivo para impress\u00C3\u00A3o via gr\u00C3\u00A1fica ter\u00C3\u00A3o esta requisi\u00C3\u00A7\u00C3\u00A3o negada, se utilizada.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   * @param idStatusImpressao C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status Impress\u00C3\u00A3o (Id).
   * @return HistoricoImpressaoCartao
   */
  public HistoricoImpressaoCartao  alterarStatusImpressaoUsingPUT (Long id, Long idStatusImpressao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarStatusImpressaoUsingPUT");
    }
    
    // verify the required parameter 'idStatusImpressao' is set
    if (idStatusImpressao == null) {
       throw new ApiException(400, "Missing the required parameter 'idStatusImpressao' when calling alterarStatusImpressaoUsingPUT");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/alterar-status-impressao".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id_status_impressao", idStatusImpressao));
    

    

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
        return (HistoricoImpressaoCartao) ApiInvoker.deserialize(response, "", HistoricoImpressaoCartao.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza a atribui\u00C3\u00A7\u00C3\u00A3o de um cart\u00C3\u00A3o pr\u00C3\u00A9-pago a uma pessoa
   * Esta m\u00C3\u00A9todo permite que um cart\u00C3\u00A3o pr\u00C3\u00A9-pago impresso de forma avulsa e an\u00C3\u00B4nimo seja atribu\u00C3\u00ADdo a uma pessoa para que esta passe a ser a portadora titular dele.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id)
   * @param idPessoa C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o de uma Pessoa (id).
   * @return Cartao
   */
  public Cartao  atribuirPessoaUsingPUT (Long id, Long idPessoa) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling atribuirPessoaUsingPUT");
    }
    
    // verify the required parameter 'idPessoa' is set
    if (idPessoa == null) {
       throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling atribuirPessoaUsingPUT");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/atribuir-pessoa".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id_pessoa", idPessoa));
    

    

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
        return (Cartao) ApiInvoker.deserialize(response, "", Cartao.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza o bloqueio de um determinado Cart\u00C3\u00A3o
   * Este m\u00C3\u00A9todo permite a realiza\u00C3\u00A7\u00C3\u00A3o do bloqueio (tempor\u00C3\u00A1rio) ou do cancelamento (definitivo) de um determinado cart\u00C3\u00A3o a partir do seu c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id). Para isso, \u00C3\u00A9 preciso informar qual o motivo deste bloqueio que nada mais \u00C3\u00A9 do que atribuir um novo StatusCartao para ele dentre as op\u00C3\u00A7\u00C3\u00B5es praticadas pelo emissor.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   * @param idStatus C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Novo Status Cart\u00C3\u00A3o.
   * @param observacao Texto informando uma observa\u00C3\u00A7\u00C3\u00A3o sobre o bloqueio.
   * @return Cartao
   */
  public Cartao  bloquearUsingPUT (Long id, Long idStatus, String observacao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling bloquearUsingPUT");
    }
    
    // verify the required parameter 'idStatus' is set
    if (idStatus == null) {
       throw new ApiException(400, "Missing the required parameter 'idStatus' when calling bloquearUsingPUT");
    }
    
    // verify the required parameter 'observacao' is set
    if (observacao == null) {
       throw new ApiException(400, "Missing the required parameter 'observacao' when calling bloquearUsingPUT");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/bloquear".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id_status", idStatus));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "observacao", observacao));
    

    

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
        return (Cartao) ApiInvoker.deserialize(response, "", Cartao.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza o cadastro da senha de um Cart\u00C3\u00A3o
   * Esta opera\u00C3\u00A7\u00C3\u00A3o tem como objetivo permitir que o portador de um determinado cart\u00C3\u00A3o possa definir uma senha a sua escolha.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   * @param senha Senha para ser cadastrada ou alterada.
   * @return String
   */
  public String  cadastrarAlterarSenhaUsingPOST (Long id, String senha) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling cadastrarAlterarSenhaUsingPOST");
    }
    
    // verify the required parameter 'senha' is set
    if (senha == null) {
       throw new ApiException(400, "Missing the required parameter 'senha' when calling cadastrarAlterarSenhaUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/cadastrar-senha".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
   * Apresenta os limites do Portador do Cart\u00C3\u00A3o
   * Este m\u00C3\u00A9todo permite consultar os Limites configurados para o Portador de um determinado Cart\u00C3\u00A3o, seja ele o titular da conta ou um adicional, a partir do c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   * @return LimiteDisponibilidade
   */
  public LimiteDisponibilidade  consultarLimiteDisponibilidadeUsingGET (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarLimiteDisponibilidadeUsingGET");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/limites-disponibilidades".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (LimiteDisponibilidade) ApiInvoker.deserialize(response, "", LimiteDisponibilidade.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Permite consultar um determinado Lote de Cart\u00C3\u00B5es Pr\u00C3\u00A9-Pago
   * Este m\u00C3\u00A9todo permite consultar os cart\u00C3\u00B5es pr\u00C3\u00A9-pagos existentes na base do emissor atrav\u00C3\u00A9s do id do lote.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do lote de cart\u00C3\u00B5es (id)
   * @return LoteCartoesPrePagos
   */
  public LoteCartoesPrePagos  consultarLotesCartoesPrePagosUsingGET (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarLotesCartoesPrePagosUsingGET");
    }
    

    // create path and map variables
    String path = "/api/cartoes/lotes-cartoes-pre-pagos/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (LoteCartoesPrePagos) ApiInvoker.deserialize(response, "", LoteCartoesPrePagos.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Apresenta os dados do Portador do Cart\u00C3\u00A3o
   * Este m\u00C3\u00A9todo permite consultar as informa\u00C3\u00A7\u00C3\u00B5es do Portador de um determinado Cart\u00C3\u00A3o a partir do c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   * @return Portador
   */
  public Portador  consultarPortadorUsingGET (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarPortadorUsingGET");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/portadores".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (Portador) ApiInvoker.deserialize(response, "", Portador.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Apresenta os dados de um determinado Cart\u00C3\u00A3o
   * Este m\u00C3\u00A9todo permite consultar as informa\u00C3\u00A7\u00C3\u00B5es b\u00C3\u00A1sicas de um determinado Cart\u00C3\u00A3o a partir do seu c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   * @return Cartao
   */
  public Cartao  consultarUsingGET2 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET2");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (Cartao) ApiInvoker.deserialize(response, "", Cartao.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza o desbloqueio de um determinado Cart\u00C3\u00A3o
   * Este m\u00C3\u00A9todo permite que seja desbloqueado um determinado cart\u00C3\u00A3o a partir do seu c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   * @return Cartao
   */
  public Cartao  desbloquearUsingPUT (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling desbloquearUsingPUT");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/desbloquear".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (Cartao) ApiInvoker.deserialize(response, "", Cartao.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Permite gerar um novo Lote de Cart\u00C3\u00B5es Pr\u00C3\u00A9-Pago
   * Esta opera\u00C3\u00A7\u00C3\u00A3o tem como objetivo permitir que os Emissores gerem uma determinada quantidade de Cart\u00C3\u00B5es Pr\u00C3\u00A9-Pagos, de forma n\u00C3\u00A3o nominal, os quais poder\u00C3\u00A3o ser comercializados e posteriormente vinculados a um cliente que o adquirir. Para isso, al\u00C3\u00A9m de definir quantos cart\u00C3\u00B5es dever\u00C3\u00A3o ser gerados, ser\u00C3\u00A1 poss\u00C3\u00ADvel definir qual a Origem Comercial, o Produto, o Tipo do Cart\u00C3\u00A3o, a Imagem e o Endere\u00C3\u00A7o para entrega dos Cart\u00C3\u00B5es presentes no lote gerado. Por padr\u00C3\u00A3o, todos os cart\u00C3\u00B5es ser\u00C3\u00A3o associados a um idPessoa fict\u00C3\u00ADcio e receber\u00C3\u00A1 um idConta \u00C3\u00BAnico para cada um deles. Feito isso, os Cart\u00C3\u00B5es gerados por esta opera\u00C3\u00A7\u00C3\u00A3o seguir\u00C3\u00A3o os mesmos processos de impress\u00C3\u00A3o via gr\u00C3\u00A1fica previamente definidos entre o Emissor e a Conductor.
   * @param idOrigemComercial C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Origem Comercial (id).
   * @param idProduto C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto (id).
   * @param idTipoCartao C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Tipo do Cart\u00C3\u00A3o (id).
   * @param idImagem C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Imagem (id).
   * @param idEndereco C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Endere\u00C3\u00A7o (id).
   * @param quantidadeCartoes N\u00C3\u00BAmero de cart\u00C3\u00B5es existentes no Lote.
   * @return LoteCartoesPrePagos
   */
  public LoteCartoesPrePagos  gerarLotesCartoesPrePagosUsingPOST (Long idOrigemComercial, Long idProduto, Long idTipoCartao, Long idImagem, Long idEndereco, Integer quantidadeCartoes) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/cartoes/lotes-cartoes-pre-pagos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idOrigemComercial", idOrigemComercial));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idProduto", idProduto));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoCartao", idTipoCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idImagem", idImagem));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEndereco", idEndereco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "quantidadeCartoes", quantidadeCartoes));
    

    

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
        return (LoteCartoesPrePagos) ApiInvoker.deserialize(response, "", LoteCartoesPrePagos.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Gerar uma nova via de Cart\u00C3\u00A3o
   * Esta opera\u00C3\u00A7\u00C3\u00A3o tem como objetivo permitir que os Emissores ou seus clientes possam solicitar a gera\u00C3\u00A7\u00C3\u00A3o de uma nova via de Cart\u00C3\u00A3o que ser\u00C3\u00A1 encaminhando para impress\u00C3\u00A3o e postagem de acordo com os fluxos padr\u00C3\u00B5es j\u00C3\u00A1 definidos pelo emissor. Para isso, \u00C3\u00A9 preciso que o cliente j\u00C3\u00A1 possua um cart\u00C3\u00A3o gerado e informar o C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o deste (idCartao) para que ele possa utilizar esta opera\u00C3\u00A7\u00C3\u00A3o. Assim, esta funcionalidade se aplica apenas para a gera\u00C3\u00A7\u00C3\u00A3o de cart\u00C3\u00B5es f\u00C3\u00ADsicos.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id)
   * @return Cartao
   */
  public Cartao  gerarNovaViaUsingPOST (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling gerarNovaViaUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/gerar-nova-via".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (Cartao) ApiInvoker.deserialize(response, "", Cartao.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Permite listar os Lotes de Cart\u00C3\u00B5es Pr\u00C3\u00A9-Pago
   * Este m\u00C3\u00A9todo permite que sejam listados os cart\u00C3\u00B5es pr\u00C3\u00A9-pagos existentes na base do emissor.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 100, Max = 100)
   * @param idOrigemComercial C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Origem Comercial (id).
   * @param idProduto C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto (id).
   * @param idTipoCartao C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Tipo do Cart\u00C3\u00A3o (id).
   * @param idImagem C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Imagem (id).
   * @param idEndereco C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Endere\u00C3\u00A7o (id).
   * @param quantidadeCartoes N\u00C3\u00BAmero de cart\u00C3\u00B5es existentes no Lote.
   * @param dataCadastro Data de Cadastro do Lote de Cart\u00C3\u00B5es N\u00C3\u00A3o Nominais.
   * @param usuarioCadastro Nome do Usu\u00C3\u00A1rio que criou o Lote.
   * @param statusProcessamento Indica o Status de Processamento do Lote.
   * @return PageLoteCartoesPrePagosResponse
   */
  public PageLoteCartoesPrePagosResponse  listarLotesCartoesPrePagosUsingGET (Integer page, Integer limit, Long idOrigemComercial, Long idProduto, Long idTipoCartao, Long idImagem, Long idEndereco, Integer quantidadeCartoes, Date dataCadastro, String usuarioCadastro, Integer statusProcessamento) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/cartoes/lotes-cartoes-pre-pagos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idOrigemComercial", idOrigemComercial));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idProduto", idProduto));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoCartao", idTipoCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idImagem", idImagem));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEndereco", idEndereco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "quantidadeCartoes", quantidadeCartoes));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataCadastro", dataCadastro));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "usuarioCadastro", usuarioCadastro));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "statusProcessamento", statusProcessamento));
    

    

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
        return (PageLoteCartoesPrePagosResponse) ApiInvoker.deserialize(response, "", PageLoteCartoesPrePagosResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista os Cart\u00C3\u00B5es gerados pelo Emissor
   * Este m\u00C3\u00A9todo permite que sejam listados os cart\u00C3\u00B5es existentes na base do emissor.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 100, Max = 100)
   * @param idStatusCartao C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status do Cart\u00C3\u00A3o (id).
   * @param idEstagioCartao C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Est\u00C3\u00A1gio de Impress\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   * @param idConta C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta a qual o cart\u00C3\u00A3o pertence (id).
   * @param idPessoa C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa a qual o cart\u00C3\u00A3o pertence (id)
   * @param idProduto C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto a qual o cart\u00C3\u00A3o pertence (id).
   * @param tipoPortador Apresenta o tipo do Portador do cart\u00C3\u00A3o, sendo: (&#39;T&#39;: Titular, &#39;A&#39;: Adicional).
   * @param numeroCartao Apresenta o n\u00C3\u00BAmero do cart\u00C3\u00A3o.
   * @param nomeImpresso Apresenta o nome impresso no cart\u00C3\u00A3o.
   * @param dataGeracao Apresenta a data em que o cart\u00C3\u00A3o foi gerado.
   * @param dataStatusCartao Apresenta a data em que o idStatusCartao atual do cart\u00C3\u00A3o fora aplicado, quando houver.
   * @param dataEstagioCartao Apresenta a data em que o idEstagioCartao atual do cart\u00C3\u00A3o fora aplicado, quando houver.
   * @param dataValidade Apresenta a data de validade do cart\u00C3\u00A3o em formato yyyy-MM, quando houver.
   * @param dataImpressao Apresenta a data em que o cart\u00C3\u00A3o fora impresso, caso impress\u00C3\u00A3o em loja, ou a data em que ele fora inclu\u00C3\u00ADdo no arquivo para impress\u00C3\u00A3o via gr\u00C3\u00A1fica.
   * @param arquivoImpressao Apresenta o nome do arquivo onde o cart\u00C3\u00A3o fora inclu\u00C3\u00ADdo para impress\u00C3\u00A3o por uma gr\u00C3\u00A1fica, quando houver.
   * @param flagImpressaoOrigemComercial Quando ativa, indica que o cart\u00C3\u00A3o fora impresso na Origem Comercial.
   * @param flagProvisorio Quando ativa, indica que o cart\u00C3\u00A3o \u00C3\u00A9 provis\u00C3\u00B3rio. Ou seja, \u00C3\u00A9 um cart\u00C3\u00A3o para uso tempor\u00C3\u00A1rio quando se deseja permitir que o cliente transacione sem que ele tenha recebido um cart\u00C3\u00A3o definitivo.
   * @param codigoDesbloqueio Apresenta um c\u00C3\u00B3digo espec\u00C3\u00ADfico para ser utilizado como vari\u00C3\u00A1vel no processo de desbloqueio do cart\u00C3\u00A3o para emissores que querem usar esta funcionalidade.
   * @param sequencialCartao N\u00C3\u00BAmero sequencial do cart\u00C3\u00A3o
   * @return PageCartoes
   */
  public PageCartoes  listarUsingGET2 (Integer page, Integer limit, Long idStatusCartao, Long idEstagioCartao, Long idConta, Long idPessoa, Long idProduto, String tipoPortador, String numeroCartao, String nomeImpresso, Date dataGeracao, Date dataStatusCartao, Date dataEstagioCartao, String dataValidade, Date dataImpressao, String arquivoImpressao, Integer flagImpressaoOrigemComercial, Integer flagProvisorio, String codigoDesbloqueio, Integer sequencialCartao) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/cartoes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idStatusCartao", idStatusCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEstagioCartao", idEstagioCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idProduto", idProduto));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tipoPortador", tipoPortador));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroCartao", numeroCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeImpresso", nomeImpresso));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataGeracao", dataGeracao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataStatusCartao", dataStatusCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataEstagioCartao", dataEstagioCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataValidade", dataValidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataImpressao", dataImpressao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "arquivoImpressao", arquivoImpressao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagImpressaoOrigemComercial", flagImpressaoOrigemComercial));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagProvisorio", flagProvisorio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "codigoDesbloqueio", codigoDesbloqueio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sequencialCartao", sequencialCartao));
    

    

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
        return (PageCartoes) ApiInvoker.deserialize(response, "", PageCartoes.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Permite validar um Cart\u00C3\u00A3o com bandeira Mastercard a partir do chip
   * Esta opera\u00C3\u00A7\u00C3\u00A3o tem como objetivo permitir que os Emissores validem o criptograma gerado a partir da leitura de um chip EMV de um Cart\u00C3\u00A3o com bandeira Mastercard a fim de verificar a sua autenticidade. A utiliza\u00C3\u00A7\u00C3\u00A3o desde m\u00C3\u00A9todo tem diversas aplica\u00C3\u00A7\u00C3\u00B5es, sendo a principal delas a de Identifica\u00C3\u00A7\u00C3\u00A3o Positiva do Cart\u00C3\u00A3o antes de permitir que o portador realize transa\u00C3\u00A7\u00C3\u00B5es diversas, como as de compra e saque na modalidade d\u00C3\u00A9bito em conta corrente, dentre outras.
   * @param numeroCartao N\u00C3\u00BAmero do cart\u00C3\u00A3o a ser validado.
   * @param criptograma Criptograma do cart\u00C3\u00A3o no formato de55
   * @return ValidaCartao
   */
  public ValidaCartao  validarCartaoChipBandeiradoUsingGET (String numeroCartao, String criptograma) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'numeroCartao' is set
    if (numeroCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'numeroCartao' when calling validarCartaoChipBandeiradoUsingGET");
    }
    
    // verify the required parameter 'criptograma' is set
    if (criptograma == null) {
       throw new ApiException(400, "Missing the required parameter 'criptograma' when calling validarCartaoChipBandeiradoUsingGET");
    }
    

    // create path and map variables
    String path = "/api/cartoes/bandeirados/validar-chip".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numero_cartao", numeroCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "criptograma", criptograma));
    

    

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
        return (ValidaCartao) ApiInvoker.deserialize(response, "", ValidaCartao.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Permite validar um Cart\u00C3\u00A3o bandeirado a partir dos dados Impressos
   * Esta opera\u00C3\u00A7\u00C3\u00A3o tem como objetivo permitir que os Emissores validem a autenticidade de um determinado Cart\u00C3\u00A3o a partir do envio dos dados sens\u00C3\u00ADveis impressos nele. A utiliza\u00C3\u00A7\u00C3\u00A3o desde m\u00C3\u00A9todo tem diversas aplica\u00C3\u00A7\u00C3\u00B5es, sendo a principal delas a de Identifica\u00C3\u00A7\u00C3\u00A3o Positiva do Cart\u00C3\u00A3o para a realiza\u00C3\u00A7\u00C3\u00A3o de transa\u00C3\u00A7\u00C3\u00B5es e-commerce ou por meio de Centrais de Atendimento Eletr\u00C3\u00B4nico (URA), dentre outras.
   * @param numeroCartao N\u00C3\u00BAmero do cart\u00C3\u00A3o a ser validado.
   * @param nomePortador Nome do portador do cart\u00C3\u00A3o
   * @param dataValidade Data de validade do cart\u00C3\u00A3o no formato yyyy-MM
   * @param codigoSeguranca C\u00C3\u00B3digo de seguran\u00C3\u00A7a do cart\u00C3\u00A3o com tr\u00C3\u00AAs n\u00C3\u00BAmeros
   * @return ValidaCartao
   */
  public ValidaCartao  validarCartaoDigitadoBandeiradoUsingGET (String numeroCartao, String nomePortador, String dataValidade, String codigoSeguranca) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'numeroCartao' is set
    if (numeroCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'numeroCartao' when calling validarCartaoDigitadoBandeiradoUsingGET");
    }
    
    // verify the required parameter 'nomePortador' is set
    if (nomePortador == null) {
       throw new ApiException(400, "Missing the required parameter 'nomePortador' when calling validarCartaoDigitadoBandeiradoUsingGET");
    }
    
    // verify the required parameter 'dataValidade' is set
    if (dataValidade == null) {
       throw new ApiException(400, "Missing the required parameter 'dataValidade' when calling validarCartaoDigitadoBandeiradoUsingGET");
    }
    
    // verify the required parameter 'codigoSeguranca' is set
    if (codigoSeguranca == null) {
       throw new ApiException(400, "Missing the required parameter 'codigoSeguranca' when calling validarCartaoDigitadoBandeiradoUsingGET");
    }
    

    // create path and map variables
    String path = "/api/cartoes/bandeirados/validar-digitado".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numero_cartao", numeroCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nome_portador", nomePortador));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "data_validade", dataValidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "codigo_seguranca", codigoSeguranca));
    

    

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
        return (ValidaCartao) ApiInvoker.deserialize(response, "", ValidaCartao.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Permite validar um Cart\u00C3\u00A3o a partir dos dados Impressos
   * Esta opera\u00C3\u00A7\u00C3\u00A3o tem como objetivo permitir que os Emissores validem a autenticidade de um determinado Cart\u00C3\u00A3o a partir do envio dos dados sens\u00C3\u00ADveis impressos nele. A utiliza\u00C3\u00A7\u00C3\u00A3o desde m\u00C3\u00A9todo tem diversas aplica\u00C3\u00A7\u00C3\u00B5es, sendo a principal delas a de Identifica\u00C3\u00A7\u00C3\u00A3o Positiva do Cart\u00C3\u00A3o para a realiza\u00C3\u00A7\u00C3\u00A3o de transa\u00C3\u00A7\u00C3\u00B5es e-commerce ou por meio de Centrais de Atendimento Eletr\u00C3\u00B4nico (URA), dentre outras.
   * @param numeroCartao N\u00C3\u00BAmero do cart\u00C3\u00A3o a ser validado.
   * @param nomePortador Nome do portador do cart\u00C3\u00A3o
   * @param dataValidade Data de validade do cart\u00C3\u00A3o no formato yyyy-MM
   * @param codigoSeguranca C\u00C3\u00B3digo de seguran\u00C3\u00A7a do cart\u00C3\u00A3o com tr\u00C3\u00AAs n\u00C3\u00BAmeros
   * @return ValidaCartao
   */
  public ValidaCartao  validarCartaoDigitadoNaoBandeiradoUsingGET (String numeroCartao, String nomePortador, String dataValidade, String codigoSeguranca) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'numeroCartao' is set
    if (numeroCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'numeroCartao' when calling validarCartaoDigitadoNaoBandeiradoUsingGET");
    }
    
    // verify the required parameter 'nomePortador' is set
    if (nomePortador == null) {
       throw new ApiException(400, "Missing the required parameter 'nomePortador' when calling validarCartaoDigitadoNaoBandeiradoUsingGET");
    }
    
    // verify the required parameter 'dataValidade' is set
    if (dataValidade == null) {
       throw new ApiException(400, "Missing the required parameter 'dataValidade' when calling validarCartaoDigitadoNaoBandeiradoUsingGET");
    }
    
    // verify the required parameter 'codigoSeguranca' is set
    if (codigoSeguranca == null) {
       throw new ApiException(400, "Missing the required parameter 'codigoSeguranca' when calling validarCartaoDigitadoNaoBandeiradoUsingGET");
    }
    

    // create path and map variables
    String path = "/api/cartoes/nao-bandeirados/validar-digitado".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numero_cartao", numeroCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nome_portador", nomePortador));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "data_validade", dataValidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "codigo_seguranca", codigoSeguranca));
    

    

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
        return (ValidaCartao) ApiInvoker.deserialize(response, "", ValidaCartao.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Permite validar um Cart\u00C3\u00A3o Bandeirado a partir da Tarja
   * Esta opera\u00C3\u00A7\u00C3\u00A3o tem como objetivo permitir que os Emissores validem a autenticidade de um determinado Cart\u00C3\u00A3o a partir da leitura da tarja magn\u00C3\u00A9tica do mesmo. A utiliza\u00C3\u00A7\u00C3\u00A3o desde m\u00C3\u00A9todo tem diversas aplica\u00C3\u00A7\u00C3\u00B5es, sendo a principal delas a de Identifica\u00C3\u00A7\u00C3\u00A3o Positiva do Cart\u00C3\u00A3o antes de permitir que o portador realize transa\u00C3\u00A7\u00C3\u00B5es diversas, como as de compra e saque na modalidade d\u00C3\u00A9bito em conta corrente, dentre outras.
   * @param numeroCartao N\u00C3\u00BAmero do cart\u00C3\u00A3o a ser validado.
   * @param trilha1 Trilha 1 do cart\u00C3\u00A3o a ser validado
   * @param trilha2 Trilha 2 do cart\u00C3\u00A3o a ser validado
   * @return ValidaCartao
   */
  public ValidaCartao  validarCartaoTarjaBandeiradoUsingGET (String numeroCartao, String trilha1, String trilha2) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'numeroCartao' is set
    if (numeroCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'numeroCartao' when calling validarCartaoTarjaBandeiradoUsingGET");
    }
    
    // verify the required parameter 'trilha1' is set
    if (trilha1 == null) {
       throw new ApiException(400, "Missing the required parameter 'trilha1' when calling validarCartaoTarjaBandeiradoUsingGET");
    }
    
    // verify the required parameter 'trilha2' is set
    if (trilha2 == null) {
       throw new ApiException(400, "Missing the required parameter 'trilha2' when calling validarCartaoTarjaBandeiradoUsingGET");
    }
    

    // create path and map variables
    String path = "/api/cartoes/bandeirados/validar-tarja".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numero_cartao", numeroCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "trilha1", trilha1));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "trilha2", trilha2));
    

    

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
        return (ValidaCartao) ApiInvoker.deserialize(response, "", ValidaCartao.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Permite validar a senha de um Cart\u00C3\u00A3o
   * Esta opera\u00C3\u00A7\u00C3\u00A3o tem como objetivo permitir validar que a senha informada pelo portador de um determinado cart\u00C3\u00A3o est\u00C3\u00A1 correta.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   * @param senha Senha para ser validada.
   * @return String
   */
  public String  validarSenhaUsingGET (Long id, String senha) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling validarSenhaUsingGET");
    }
    
    // verify the required parameter 'senha' is set
    if (senha == null) {
       throw new ApiException(400, "Missing the required parameter 'senha' when calling validarSenhaUsingGET");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id}/validar-senha".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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

