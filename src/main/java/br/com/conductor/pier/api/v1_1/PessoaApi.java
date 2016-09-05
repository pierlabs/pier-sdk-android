package br.com.conductor.pier.api.v1_1;

import br.com.conductor.pier.api.v1_1.invoker.ApiException;
import br.com.conductor.pier.api.v1_1.invoker.ApiInvoker;
import br.com.conductor.pier.api.v1_1.invoker.Pair;

import br.com.conductor.pier.api.v1_1.model.*;

import java.util.*;

import br.com.conductor.pier.api.v1_1.model.OrigemComercial;
import br.com.conductor.pier.api.v1_1.model.PagePessoas;
import java.util.Date;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;


public class PessoaApi {
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
   * Opera\u00C3\u00A7\u00C3\u00A3o utilizada para consultar uma determinada Origem Comercial 
   * Este m\u00C3\u00A9todo permite que sejam listados os registros de uma determinada Origem Comercial existente na base do emissor. Para isso, \u00C3\u00A9 preciso informar o seu respectivo c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id). 
   * @param idOrigemComercial ID da Origem Comercial
   * @return OrigemComercial
   */
  public OrigemComercial  consultarUsingGET1 (Long idOrigemComercial) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idOrigemComercial' is set
    if (idOrigemComercial == null) {
       throw new ApiException(400, "Missing the required parameter 'idOrigemComercial' when calling consultarUsingGET1");
    }
    

    // create path and map variables
    String path = "/api/pessoas/{id_origem_comercial}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id_origem_comercial" + "\\}", apiInvoker.escapeString(idOrigemComercial.toString()));

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
        return (OrigemComercial) ApiInvoker.deserialize(response, "", OrigemComercial.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista as Pessoas cadastradas no Emissor
   * Este m\u00C3\u00A9todo permite que sejam listadas as Pessoas existentes na base de dados do Emissor.
   * @param idPessoa C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa (id).
   * @param nome Apresenta o &#39;Nome Completo da PF&#39; ou o &#39;Nome Completo da Raz\u00C3\u00A3o Social (Nome Empresarial)&#39;.
   * @param tipo C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo da Pessoa, sendo: (\&quot;PF\&quot;: Pessoa F\u00C3\u00ADsica), (\&quot;PJ\&quot;: Pessoa Jur\u00C3\u00ADdica).
   * @param cpf N\u00C3\u00BAmero do CPF, quando PF.
   * @param cnpj N\u00C3\u00BAmero do CNPJ, quando PJ.
   * @param dataNascimento Data de Nascimento da Pessoa, quando PF, ou a Data de Abertura da Empresa, quando PJ.
   * @param cnpj2 N\u00C3\u00BAmero do CNPJ, quando PJ.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 100, Max = 100)
   * @return PagePessoas
   */
  public PagePessoas  listarUsingGET1 (Long idPessoa, String nome, String tipo, String cpf, String cnpj, Date dataNascimento, String cnpj2, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/pessoas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id_pessoa", idPessoa));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tipo", tipo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cpf", cpf));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cnpj", cnpj));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "data_nascimento", dataNascimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cnpj", cnpj2));
    
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
        return (PagePessoas) ApiInvoker.deserialize(response, "", PagePessoas.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}

