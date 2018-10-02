package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.ContestarCompraRequest;
import br.com.conductor.pier.api.v2.model.PageGrupoChargebackResponse;
import java.math.BigDecimal;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class GlobaltagcompracontestadaApi {
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
   * {{{compra_contestada_transacoes_resource_contestar}}}
   * {{{compra_contestada_transacoes_resource_contestar_notes}}}
   * @param idCartao idCartao
   * @param request request
   * @param login login
   * @return Object
   */
  public Object  contestarUsingPOST (Long idCartao, ContestarCompraRequest request, String login) throws ApiException {
    Object postBody = login;
    
    // verify the required parameter 'idCartao' is set
    if (idCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'idCartao' when calling contestarUsingPOST");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
       throw new ApiException(400, "Missing the required parameter 'request' when calling contestarUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/cartoes-com-contestacoes/{idCartao}/contestar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idCartao" + "\\}", apiInvoker.escapeString(idCartao.toString()));

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
   * {{{compra_contestada_detalhe_cartao_resource_listar}}}
   * {{{compra_contestada_detalhe_cartao_resource_listar_notes}}}
   * @param idCartao idCartao
   * @return PageGrupoChargebackResponse
   */
  public PageGrupoChargebackResponse  detalheCartaoUsingGET (Long idCartao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idCartao' is set
    if (idCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'idCartao' when calling detalheCartaoUsingGET");
    }
    

    // create path and map variables
    String path = "/api/cartoes-com-contestacoes/{idCartao}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idCartao" + "\\}", apiInvoker.escapeString(idCartao.toString()));

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
        return (PageGrupoChargebackResponse) ApiInvoker.deserialize(response, "", PageGrupoChargebackResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{cartao_com_compra_contestada_resource_listar}}}
   * {{{cartao_com_compra_contestada_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param agingContestacao 
   * @param nome 
   * @param bandeira 
   * @param cartao 
   * @param cpf 
   * @param conta 
   * @param autorizacao 
   * @param statusCartao 
   * @param statusContestacao 
   * @param dataContestacaoInicio 
   * @param dataContestacaoFim 
   * @param dataAlteracaoInicio 
   * @param dataAlteracaoFim 
   * @param dataReapresentacaoInicio 
   * @param dataReapresentacaoFim 
   * @param diasContestacao 
   * @param diasCompra 
   * @param modoEntrada 
   * @param motivo 
   * @param valorCompra 
   * @return PageGrupoChargebackResponse
   */
  public PageGrupoChargebackResponse  listarUsingGET11 (List<String> sort, Integer page, Integer limit, Long agingContestacao, String nome, String bandeira, String cartao, String cpf, String conta, String autorizacao, Long statusCartao, Long statusContestacao, String dataContestacaoInicio, String dataContestacaoFim, String dataAlteracaoInicio, String dataAlteracaoFim, String dataReapresentacaoInicio, String dataReapresentacaoFim, Long diasContestacao, Long diasCompra, String modoEntrada, String motivo, BigDecimal valorCompra) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/cartoes-com-contestacoes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "agingContestacao", agingContestacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "bandeira", bandeira));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cartao", cartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cpf", cpf));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "conta", conta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "autorizacao", autorizacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "statusCartao", statusCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "statusContestacao", statusContestacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataContestacaoInicio", dataContestacaoInicio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataContestacaoFim", dataContestacaoFim));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataAlteracaoInicio", dataAlteracaoInicio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataAlteracaoFim", dataAlteracaoFim));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataReapresentacaoInicio", dataReapresentacaoInicio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataReapresentacaoFim", dataReapresentacaoFim));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "diasContestacao", diasContestacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "diasCompra", diasCompra));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "modoEntrada", modoEntrada));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "motivo", motivo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "valorCompra", valorCompra));
    

    

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
        return (PageGrupoChargebackResponse) ApiInvoker.deserialize(response, "", PageGrupoChargebackResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{compra_contestada_transacoes_resource_listar}}}
   * {{{compra_contestada_transacoes_resource_listar_notes}}}
   * @param idCartao idCartao
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param agingContestacao 
   * @param nome 
   * @param bandeira 
   * @param cartao 
   * @param cpf 
   * @param conta 
   * @param autorizacao 
   * @param statusCartao 
   * @param statusContestacao 
   * @param dataContestacaoInicio 
   * @param dataContestacaoFim 
   * @param dataAlteracaoInicio 
   * @param dataAlteracaoFim 
   * @param dataReapresentacaoInicio 
   * @param dataReapresentacaoFim 
   * @param diasContestacao 
   * @param diasCompra 
   * @param modoEntrada 
   * @param motivo 
   * @param valorCompra 
   * @return PageGrupoChargebackResponse
   */
  public PageGrupoChargebackResponse  transacaoUsingGET (Long idCartao, List<String> sort, Integer page, Integer limit, Long agingContestacao, String nome, String bandeira, String cartao, String cpf, String conta, String autorizacao, Long statusCartao, Long statusContestacao, String dataContestacaoInicio, String dataContestacaoFim, String dataAlteracaoInicio, String dataAlteracaoFim, String dataReapresentacaoInicio, String dataReapresentacaoFim, Long diasContestacao, Long diasCompra, String modoEntrada, String motivo, BigDecimal valorCompra) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idCartao' is set
    if (idCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'idCartao' when calling transacaoUsingGET");
    }
    

    // create path and map variables
    String path = "/api/cartoes-com-contestacoes/{idCartao}/transacoes".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idCartao" + "\\}", apiInvoker.escapeString(idCartao.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "agingContestacao", agingContestacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "bandeira", bandeira));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cartao", cartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cpf", cpf));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "conta", conta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "autorizacao", autorizacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "statusCartao", statusCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "statusContestacao", statusContestacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataContestacaoInicio", dataContestacaoInicio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataContestacaoFim", dataContestacaoFim));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataAlteracaoInicio", dataAlteracaoInicio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataAlteracaoFim", dataAlteracaoFim));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataReapresentacaoInicio", dataReapresentacaoInicio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataReapresentacaoFim", dataReapresentacaoFim));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "diasContestacao", diasContestacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "diasCompra", diasCompra));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "modoEntrada", modoEntrada));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "motivo", motivo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "valorCompra", valorCompra));
    

    

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
        return (PageGrupoChargebackResponse) ApiInvoker.deserialize(response, "", PageGrupoChargebackResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
