package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.PessoaJuridicaUpdate;
import br.com.conductor.pier.api.v2.model.PessoaJuridicaResponse;
import br.com.conductor.pier.api.v2.model.PagePessoaJuridicaResponse;
import br.com.conductor.pier.api.v2.model.PessoaJuridicaPersist;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class GlobaltagpessoasjuridicasApi {
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
   * {{{pessoa_juridica_resource_alterar}}}
   * {{{pessoa_juridica_resource_alterar_notes}}}
   * @param id id
   * @param request request
   * @param login login
   * @return PessoaJuridicaResponse
   */
  public PessoaJuridicaResponse  alterarUsingPUT15 (Long id, PessoaJuridicaUpdate request, String login) throws ApiException {
    Object postBody = request;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT15");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
       throw new ApiException(400, "Missing the required parameter 'request' when calling alterarUsingPUT15");
    }
    

    // create path and map variables
    String path = "/api/pessoas-juridicas/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
    headerParams.put("login", ApiInvoker.parameterToString(login));
    

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
        return (PessoaJuridicaResponse) ApiInvoker.deserialize(response, "", PessoaJuridicaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{pessoa_juridica_resource_consultar}}}
   * {{{pessoa_juridica_resource_consultar_notes}}}
   * @param id {{{pessoa_juridica_resource_consultar_param_id}}}
   * @return PessoaJuridicaResponse
   */
  public PessoaJuridicaResponse  consultarUsingGET30 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET30");
    }
    

    // create path and map variables
    String path = "/api/pessoas-juridicas/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (PessoaJuridicaResponse) ApiInvoker.deserialize(response, "", PessoaJuridicaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{pessoa_juridica_resource_listar}}}
   * {{{pessoa_juridica_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param contato {{{pessoa_juridica_request_contato_value}}}
   * @param razaoSocial {{{pessoa_juridica_request_razao_social_value}}}
   * @param numeroReceitaFederal {{{pessoa_juridica_request_CGC_value}}}
   * @param inscricaoEstadual {{{pessoa_juridica_request_inscricao_estadual_value}}}
   * @param banco {{{pessoa_juridica_request_banco_value}}}
   * @param agencia {{{pessoa_juridica_request_agencia_value}}}
   * @param digitoAgencia {{{pessoa_juridica_request_digito_agencia_value}}}
   * @param contaCorrente {{{pessoa_juridica_request_conta_corrente_value}}}
   * @param digitoContaCorrente {{{pessoa_juridica_request_digito_conta_corrente_value}}}
   * @return PagePessoaJuridicaResponse
   */
  public PagePessoaJuridicaResponse  listarUsingGET34 (List<String> sort, Integer page, Integer limit, String contato, String razaoSocial, String numeroReceitaFederal, String inscricaoEstadual, Integer banco, Integer agencia, String digitoAgencia, String contaCorrente, String digitoContaCorrente) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/pessoas-juridicas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "contato", contato));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "razaoSocial", razaoSocial));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroReceitaFederal", numeroReceitaFederal));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "inscricaoEstadual", inscricaoEstadual));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "banco", banco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "agencia", agencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "digitoAgencia", digitoAgencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "contaCorrente", contaCorrente));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "digitoContaCorrente", digitoContaCorrente));
    

    

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
        return (PagePessoaJuridicaResponse) ApiInvoker.deserialize(response, "", PagePessoaJuridicaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{pessoa_juridica_resource_salvar}}}
   * {{{pessoa_juridica_resource_salvar_notes}}}
   * @param pessoaJuridicaPersist pessoaJuridicaPersist
   * @param login login
   * @return PessoaJuridicaResponse
   */
  public PessoaJuridicaResponse  salvarUsingPOST23 (PessoaJuridicaPersist pessoaJuridicaPersist, String login) throws ApiException {
    Object postBody = pessoaJuridicaPersist;
    
    // verify the required parameter 'pessoaJuridicaPersist' is set
    if (pessoaJuridicaPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'pessoaJuridicaPersist' when calling salvarUsingPOST23");
    }
    

    // create path and map variables
    String path = "/api/pessoas-juridicas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
    headerParams.put("login", ApiInvoker.parameterToString(login));
    

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
        return (PessoaJuridicaResponse) ApiInvoker.deserialize(response, "", PessoaJuridicaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
