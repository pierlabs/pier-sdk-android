package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.ContaDebitoRecorrente;
import br.com.conductor.pier.api.v2.model.ContaDebitoRecorrenteResponse;
import br.com.conductor.pier.api.v2.model.PortadorDebitoRecorrenteResponse;
import br.com.conductor.pier.api.v2.model.PortadorDebitoRecorrenteUpdate;
import br.com.conductor.pier.api.v2.model.PageContaDebitoRecorrenteResponse;
import br.com.conductor.pier.api.v2.model.PagePortadorDebitoRecorrenteResponse;
import br.com.conductor.pier.api.v2.model.PageTipoDebitoRecorrenteResponse;
import java.math.BigDecimal;
import br.com.conductor.pier.api.v2.model.PortadorDebitoRecorrentePersist;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class DebitoRecorrenteApi {
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
   * Aderir ao d\u00E9bito recorrente
   * Este m\u00E9todo permite que um determinado tipo d\u00E9bito recorrente seja adicionado a uma determinada conta, para que o mesmo passe a ser cobrado na fatura do cliente
   * @param contaDebitoRecorrentePersist contaDebitoRecorrentePersist
   * @return ContaDebitoRecorrenteResponse
   */
  public ContaDebitoRecorrenteResponse  aderirDebitoRecorrente (ContaDebitoRecorrente contaDebitoRecorrentePersist) throws ApiException {
    Object postBody = contaDebitoRecorrentePersist;
    
    // verify the required parameter 'contaDebitoRecorrentePersist' is set
    if (contaDebitoRecorrentePersist == null) {
       throw new ApiException(400, "Missing the required parameter 'contaDebitoRecorrentePersist' when calling aderirDebitoRecorrente");
    }
    

    // create path and map variables
    String path = "/api/debitos-recorrentes".replaceAll("\\{format\\}","json");

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
        return (ContaDebitoRecorrenteResponse) ApiInvoker.deserialize(response, "", ContaDebitoRecorrenteResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Atualiza parcialmente um d\u00E9bito recorrente por portador de uma determinada conta
   * Este recurso permite atualizar parcialmente um d\u00E9bito recorrente por portador de uma determinada conta
   * @param id C\u00F3digo Identificador da conta
   * @param idRegistro C\u00F3digo identificador do registro
   * @param portadorDebitoRecorrenteUpdate portadorDebitoRecorrenteUpdate
   * @return PortadorDebitoRecorrenteResponse
   */
  public PortadorDebitoRecorrenteResponse  atualizarParcialPortadorDebitoRecorrente (Long id, Long idRegistro, PortadorDebitoRecorrenteUpdate portadorDebitoRecorrenteUpdate) throws ApiException {
    Object postBody = portadorDebitoRecorrenteUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarParcialPortadorDebitoRecorrente");
    }
    
    // verify the required parameter 'idRegistro' is set
    if (idRegistro == null) {
       throw new ApiException(400, "Missing the required parameter 'idRegistro' when calling atualizarParcialPortadorDebitoRecorrente");
    }
    
    // verify the required parameter 'portadorDebitoRecorrenteUpdate' is set
    if (portadorDebitoRecorrenteUpdate == null) {
       throw new ApiException(400, "Missing the required parameter 'portadorDebitoRecorrenteUpdate' when calling atualizarParcialPortadorDebitoRecorrente");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/portadores/debitos-recorrentes/{idRegistro}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "idRegistro" + "\\}", apiInvoker.escapeString(idRegistro.toString()));

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
        return (PortadorDebitoRecorrenteResponse) ApiInvoker.deserialize(response, "", PortadorDebitoRecorrenteResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Cancelar o d\u00E9bito recorrente
   * Este m\u00E9todo permite cancelar um tipo d\u00E9bito recorrente de uma determinada conta
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do d\u00E9bito recorrente (id)
   * @param contaDebitoRecorrentePersist contaDebitoRecorrentePersist
   * @return ContaDebitoRecorrenteResponse
   */
  public ContaDebitoRecorrenteResponse  cancelarDebitoRecorrente (Long id, ContaDebitoRecorrente contaDebitoRecorrentePersist) throws ApiException {
    Object postBody = contaDebitoRecorrentePersist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling cancelarDebitoRecorrente");
    }
    
    // verify the required parameter 'contaDebitoRecorrentePersist' is set
    if (contaDebitoRecorrentePersist == null) {
       throw new ApiException(400, "Missing the required parameter 'contaDebitoRecorrentePersist' when calling cancelarDebitoRecorrente");
    }
    

    // create path and map variables
    String path = "/api/debitos-recorrentes/{id}/cancelar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (ContaDebitoRecorrenteResponse) ApiInvoker.deserialize(response, "", ContaDebitoRecorrenteResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista os d\u00E9bitos recorrentes de uma Conta
   * A entidade D\u00E9bito Recorrente trata dos registros contratados por um determinado cliente (idConta) onde a cobran\u00E7a dele se d\u00E1 de forma cont\u00EDnua, consistindo em uma assinatura ou pagamento de mensalidades. Isso significa que, enquanto o servi\u00E7o continuar a ser prestado, o cliente dever\u00E1 continuar realizando os pagamentos.  A determina\u00E7\u00E3o de quanto tempo essa rela\u00E7\u00E3o ir\u00E1 durar \u00E9 feita em contrato. Na maioria das vezes, existe um per\u00EDodo m\u00EDnimo e, caso o servi\u00E7o seja cancelado ou o pagamento n\u00E3o seja realizado,  o status do D\u00E9bito Recorrente ter\u00E1 a FlagAtivo com valor false. Assim, este m\u00E9todo lista todas as opera\u00E7\u00F5es de D\u00E9bitos Recorrentes que um determinado idConta j\u00E1 contratou, esteja ele ativo ou n\u00E3o
   * @param idConta C\u00F3digo de identifica\u00E7\u00E3o da Conta (id)
   * @param idTipoDebitoRecorrente C\u00F3digo de identifica\u00E7\u00E3o do tipo de d\u00E9bito recorrente (id)
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param dataHoraInicio Data e hora inicio do d\u00E9bito recorrente yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ. Ex: 2000-10-31T01:30:00.000-05:00
   * @param dataHoraFim Data e hora fim do d\u00E9bito recorrente yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ. Ex: 2000-10-31T01:30:00.000-05:00
   * @param ativo Identifica se o d\u00E9bito recorrente est\u00E1 ativo
   * @param dataHoraUltimoPagamento Data e hora do \u00FAltimo pagamento efetuado yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ. Ex: 2000-10-31T01:30:00.000-05:00
   * @return PageContaDebitoRecorrenteResponse
   */
  public PageContaDebitoRecorrenteResponse  listar (Long idConta, Long idTipoDebitoRecorrente, List<String> sort, Integer page, Integer limit, String dataHoraInicio, String dataHoraFim, Boolean ativo, String dataHoraUltimoPagamento) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/debitos-recorrentes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoDebitoRecorrente", idTipoDebitoRecorrente));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataHoraInicio", dataHoraInicio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataHoraFim", dataHoraFim));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "ativo", ativo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataHoraUltimoPagamento", dataHoraUltimoPagamento));
    

    

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
        return (PageContaDebitoRecorrenteResponse) ApiInvoker.deserialize(response, "", PageContaDebitoRecorrenteResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista os d\u00E9bitos recorrentes por portador de uma determinada conta
   * Este recurso permite consultar os d\u00E9bitos recorrentes por portador de uma determinada conta
   * @param id C\u00F3digo Identificador da conta
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PagePortadorDebitoRecorrenteResponse
   */
  public PagePortadorDebitoRecorrenteResponse  listarPortadorDebitoRecorrente (Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarPortadorDebitoRecorrente");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/portadores/debitos-recorrentes".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (PagePortadorDebitoRecorrenteResponse) ApiInvoker.deserialize(response, "", PagePortadorDebitoRecorrenteResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Listar Tipos Debitos Recorrentes
   * Para os emissores que utilizam a entidade Debitos Recorrentes precisam previamente solicitar a Conductor o cadastro de quais Tipos eles poder\u00E3o comercializar. Por isso, este recurso tem como objetivo apresentar todos os Tipos de D\u00E9bitos Recorrentes que est\u00E3o cadastrados para um determinado Emissor, independente do status dele
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do tipo de d\u00E9bito recorrente (id)
   * @param descricao Descri\u00E7\u00E3o do tipo de d\u00E9bito recorrente
   * @param valor Valor do tipo de d\u00E9bito recorrente
   * @param flagAtivo Flag que identifica se o tipo d\u00E9bito recorrente est\u00E1 ativo
   * @return PageTipoDebitoRecorrenteResponse
   */
  public PageTipoDebitoRecorrenteResponse  listar_1 (List<String> sort, Integer page, Integer limit, Long id, String descricao, BigDecimal valor, Boolean flagAtivo) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/tipos-debitos-recorrentes".replaceAll("\\{format\\}","json");

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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "valor", valor));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagAtivo", flagAtivo));
    

    

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
        return (PageTipoDebitoRecorrenteResponse) ApiInvoker.deserialize(response, "", PageTipoDebitoRecorrenteResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Salva os d\u00E9bitos recorrentes por portador de uma determinada conta
   * Este recurso permite salvar os d\u00E9bitos recorrentes por portador de uma determinada conta
   * @param id C\u00F3digo Identificador da conta
   * @param portadorDebitoRecorrentePersist portadorDebitoRecorrentePersist
   * @return PortadorDebitoRecorrenteResponse
   */
  public PortadorDebitoRecorrenteResponse  salvarPortadorDebitoRecorrente (Long id, PortadorDebitoRecorrentePersist portadorDebitoRecorrentePersist) throws ApiException {
    Object postBody = portadorDebitoRecorrentePersist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling salvarPortadorDebitoRecorrente");
    }
    
    // verify the required parameter 'portadorDebitoRecorrentePersist' is set
    if (portadorDebitoRecorrentePersist == null) {
       throw new ApiException(400, "Missing the required parameter 'portadorDebitoRecorrentePersist' when calling salvarPortadorDebitoRecorrente");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/portadores/debitos-recorrentes".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (PortadorDebitoRecorrenteResponse) ApiInvoker.deserialize(response, "", PortadorDebitoRecorrenteResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
