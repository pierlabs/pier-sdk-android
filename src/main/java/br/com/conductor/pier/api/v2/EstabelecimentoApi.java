package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.PessoaJuridicaResponse;
import br.com.conductor.pier.api.v2.model.TerminalUpdate;
import br.com.conductor.pier.api.v2.model.TerminalResponse;
import br.com.conductor.pier.api.v2.model.EstabelecimentoResponse;
import br.com.conductor.pier.api.v2.model.PageEstabelecimentoResponse;
import br.com.conductor.pier.api.v2.model.PagePessoaJuridicaResponse;
import br.com.conductor.pier.api.v2.model.PageTerminalResponse;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;


public class EstabelecimentoApi {
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
   * Alterar Pessoa Jur\u00C3\u00ADdica
   * Altera uma pessoa jur\u00C3\u00ADdica.
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da pessoa jur\u00C3\u00ADdica
   * @param razaoSocial Raz\u00C3\u00A3o social da pessoa jur\u00C3\u00ADdica
   * @param inscricaoEstadual N\u00C3\u00BAmero da inscri\u00C3\u00A7\u00C3\u00A3o estadual
   * @param contato Nome da pessoa para entrar em contato
   * @param banco C\u00C3\u00B3digo do banco
   * @param agencia Raz\u00C3\u00A3o social da pessoa jur\u00C3\u00ADdica
   * @param digitoVerificadorAgencia D\u00C3\u00ADgito Verificador da ag\u00C3\u00AAncia
   * @param contaCorrente C\u00C3\u00B3digo da Conta Corrente
   * @param digitoVerificadorContaCorrente D\u00C3\u00ADgito Verificador da Conta Corrente
   * @return PessoaJuridicaResponse
   */
  public PessoaJuridicaResponse  alterarUsingPUT10 (Long id, String razaoSocial, String inscricaoEstadual, String contato, Integer banco, Integer agencia, String digitoVerificadorAgencia, String contaCorrente, String digitoVerificadorContaCorrente) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT10");
    }
    
    // verify the required parameter 'razaoSocial' is set
    if (razaoSocial == null) {
       throw new ApiException(400, "Missing the required parameter 'razaoSocial' when calling alterarUsingPUT10");
    }
    

    // create path and map variables
    String path = "/api/pessoas-juridicas/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "razaoSocial", razaoSocial));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "inscricaoEstadual", inscricaoEstadual));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "contato", contato));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "banco", banco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "agencia", agencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "digitoVerificadorAgencia", digitoVerificadorAgencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "contaCorrente", contaCorrente));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "digitoVerificadorContaCorrente", digitoVerificadorContaCorrente));
    

    

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
   * Altera um Terminal
   * Este m\u00C3\u00A9todo realiza a altera\u00C3\u00A7\u00C3\u00A3o dos Terminais.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do terminal (id).
   * @param terminalUpdate terminalUpdate
   * @return TerminalResponse
   */
  public TerminalResponse  alterarUsingPUT13 (Long id, TerminalUpdate terminalUpdate) throws ApiException {
    Object postBody = terminalUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT13");
    }
    
    // verify the required parameter 'terminalUpdate' is set
    if (terminalUpdate == null) {
       throw new ApiException(400, "Missing the required parameter 'terminalUpdate' when calling alterarUsingPUT13");
    }
    

    // create path and map variables
    String path = "/api/terminais/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (TerminalResponse) ApiInvoker.deserialize(response, "", TerminalResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Cadastrar Pessoa Jur\u00C3\u00ADdica
   * Cadastra uma pessoa jur\u00C3\u00ADdica.
   * @param razaoSocial Raz\u00C3\u00A3o social da pessoa jur\u00C3\u00ADdica
   * @param cnpj C\u00C3\u00B3digo do Cadastro Nacional de Pessoas Jur\u00C3\u00ADdicas
   * @param inscricaoEstadual N\u00C3\u00BAmero da inscri\u00C3\u00A7\u00C3\u00A3o estadual
   * @param contato Nome da pessoa para entrar em contato
   * @param banco C\u00C3\u00B3digo do banco
   * @param agencia Raz\u00C3\u00A3o social da pessoa jur\u00C3\u00ADdica
   * @param digitoVerificadorAgencia D\u00C3\u00ADgito Verificador da ag\u00C3\u00AAncia
   * @param contaCorrente C\u00C3\u00B3digo da Conta Corrente
   * @param digitoVerificadorContaCorrente D\u00C3\u00ADgito Verificador da Conta Corrente
   * @return PessoaJuridicaResponse
   */
  public PessoaJuridicaResponse  cadastrarUsingPOST2 (String razaoSocial, String cnpj, String inscricaoEstadual, String contato, Integer banco, Integer agencia, String digitoVerificadorAgencia, String contaCorrente, String digitoVerificadorContaCorrente) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'razaoSocial' is set
    if (razaoSocial == null) {
       throw new ApiException(400, "Missing the required parameter 'razaoSocial' when calling cadastrarUsingPOST2");
    }
    
    // verify the required parameter 'cnpj' is set
    if (cnpj == null) {
       throw new ApiException(400, "Missing the required parameter 'cnpj' when calling cadastrarUsingPOST2");
    }
    

    // create path and map variables
    String path = "/api/pessoas-juridicas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "razaoSocial", razaoSocial));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cnpj", cnpj));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "inscricaoEstadual", inscricaoEstadual));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "contato", contato));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "banco", banco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "agencia", agencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "digitoVerificadorAgencia", digitoVerificadorAgencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "contaCorrente", contaCorrente));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "digitoVerificadorContaCorrente", digitoVerificadorContaCorrente));
    

    

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
  
  /**
   * Consultar estabelecimento por id
   * Consulta os detalhes de um determinado estabelecimento
   * @param id Id
   * @return EstabelecimentoResponse
   */
  public EstabelecimentoResponse  consultarUsingGET14 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET14");
    }
    

    // create path and map variables
    String path = "/api/estabelecimentos/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (EstabelecimentoResponse) ApiInvoker.deserialize(response, "", EstabelecimentoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Consultar pessoa jur\u00C3\u00ADdica
   * Consulta uma pessoa jur\u00C3\u00ADdica atrav\u00C3\u00A9s do seu identificador.
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da pessoa jur\u00C3\u00ADdica
   * @return PessoaJuridicaResponse
   */
  public PessoaJuridicaResponse  consultarUsingGET19 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET19");
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
   * Apresenta os dados de um determinado Terminal
   * Este m\u00C3\u00A9todo permite consultar um determinado Terminal a partir do seu c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Terminal (id).
   * @return TerminalResponse
   */
  public TerminalResponse  consultarUsingGET26 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET26");
    }
    

    // create path and map variables
    String path = "/api/terminais/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (TerminalResponse) ApiInvoker.deserialize(response, "", TerminalResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista Estabelecimentos
   * Lista todas os Estabelecimentos
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do estabelecimento (id).
   * @param numeroReceitaFederal Apresenta o n\u00C3\u00BAmero de identifica\u00C3\u00A7\u00C3\u00A3o do Estabelecimento na Receita Federal.
   * @param nome Nome do Estabelecimento.
   * @param descricao Raz\u00C3\u00A3o Social do Estabelecimento.
   * @param nomeFantasia T\u00C3\u00ADtulo Comercial do Estabelecimento.
   * @param cep C\u00C3\u00B3digo de Endere\u00C3\u00A7amento Postal (CEP).
   * @param nomeLogradouro Nome do Logradouro.
   * @param numeroEndereco N\u00C3\u00BAmero do endere\u00C3\u00A7o.
   * @param complemento Descri\u00C3\u00A7\u00C3\u00B5es complementares referente ao endere\u00C3\u00A7o.
   * @param bairro Nome do bairro do endere\u00C3\u00A7o.
   * @param cidade Nome da cidade do endere\u00C3\u00A7o.
   * @param uf Sigla de identifica\u00C3\u00A7\u00C3\u00A3o da Unidade Federativa do endere\u00C3\u00A7o.
   * @param pais Nome do pa\u00C3\u00ADs.
   * @param dataCadastramento Data de Cadastro do Estabelecimento, no formato yyyy-MM-dd.
   * @param contato Nome da pessoa para contato com o Estabelecimento.
   * @param email E-mail da pessoa para contato com o Estabelecimento.
   * @param flagArquivoSecrFazenda Indica se o estabelecimento ser\u00C3\u00A1 inclu\u00C3\u00ADdo no arquivo de registro para a Secretaria da Fazenda Estadual.
   * @param flagCartaoDigitado Indica se o estabelecimento poder\u00C3\u00A1 originar transa\u00C3\u00A7\u00C3\u00B5es sem a leitura da tarja ou do chip do cart\u00C3\u00A3o.
   * @param inativo Indica se o estabelecimento est\u00C3\u00A1 inativo.
   * @return PageEstabelecimentoResponse
   */
  public PageEstabelecimentoResponse  listarUsingGET18 (List<String> sort, Integer page, Integer limit, Long id, Long numeroReceitaFederal, String nome, String descricao, String nomeFantasia, String cep, String nomeLogradouro, Long numeroEndereco, String complemento, String bairro, String cidade, String uf, String pais, String dataCadastramento, String contato, String email, Integer flagArquivoSecrFazenda, Integer flagCartaoDigitado, Integer inativo) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/estabelecimentos".replaceAll("\\{format\\}","json");

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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroReceitaFederal", numeroReceitaFederal));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeFantasia", nomeFantasia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cep", cep));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeLogradouro", nomeLogradouro));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroEndereco", numeroEndereco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "complemento", complemento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "bairro", bairro));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cidade", cidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "uf", uf));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "pais", pais));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataCadastramento", dataCadastramento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "contato", contato));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "email", email));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagArquivoSecrFazenda", flagArquivoSecrFazenda));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagCartaoDigitado", flagCartaoDigitado));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "inativo", inativo));
    

    

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
        return (PageEstabelecimentoResponse) ApiInvoker.deserialize(response, "", PageEstabelecimentoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Listar pessoas jur\u00C3\u00ADdicas
   * Lista pessoas jur\u00C3\u00ADdicas cadastradas. 
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param razaoSocial Raz\u00C3\u00A3o social da pessoa jur\u00C3\u00ADdica
   * @param cnpj C\u00C3\u00B3digo do Cadastro Nacional de Pessoas Jur\u00C3\u00ADdicas
   * @param inscricaoEstadual N\u00C3\u00BAmero da inscri\u00C3\u00A7\u00C3\u00A3o estadual
   * @param contato Nome da pessoa para entrar em contato
   * @param banco C\u00C3\u00B3digo do banco
   * @param agencia Raz\u00C3\u00A3o social da pessoa jur\u00C3\u00ADdica
   * @param digitoVerificadorAgencia D\u00C3\u00ADgito Verificador da ag\u00C3\u00AAncia
   * @param contaCorrente C\u00C3\u00B3digo da Conta Corrente
   * @param digitoVerificadorContaCorrente D\u00C3\u00ADgito Verificador da Conta Corrente
   * @return PagePessoaJuridicaResponse
   */
  public PagePessoaJuridicaResponse  listarUsingGET23 (List<String> sort, Integer page, Integer limit, String razaoSocial, String cnpj, String inscricaoEstadual, String contato, Integer banco, Integer agencia, String digitoVerificadorAgencia, String contaCorrente, String digitoVerificadorContaCorrente) throws ApiException {
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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "razaoSocial", razaoSocial));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cnpj", cnpj));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "inscricaoEstadual", inscricaoEstadual));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "contato", contato));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "banco", banco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "agencia", agencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "digitoVerificadorAgencia", digitoVerificadorAgencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "contaCorrente", contaCorrente));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "digitoVerificadorContaCorrente", digitoVerificadorContaCorrente));
    

    

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
   * Lista os Terminais cadastrados no Emissor
   * Este m\u00C3\u00A9todo permite que sejam listados os terminais existentes na base de dados do Emissor.
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Terminal (id).
   * @param terminal C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do terminal.
   * @param numeroEstabelecimento N\u00C3\u00BAmero do estabelecimento a qual o terminal pertence.
   * @param idEstabelecimento N\u00C3\u00BAmero de identifica\u00C3\u00A7\u00C3\u00A3o do estabelecimento a qual o terminal pertence.
   * @return PageTerminalResponse
   */
  public PageTerminalResponse  listarUsingGET33 (List<String> sort, Integer page, Integer limit, Long id, String terminal, Long numeroEstabelecimento, Long idEstabelecimento) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/terminais".replaceAll("\\{format\\}","json");

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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "terminal", terminal));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroEstabelecimento", numeroEstabelecimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEstabelecimento", idEstabelecimento));
    

    

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
        return (PageTerminalResponse) ApiInvoker.deserialize(response, "", PageTerminalResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza o cadastro de um novo Terminal
   * Este m\u00C3\u00A9todo permite que seja cadastrado um novo Terminal.
   * @param idEstabelecimento Apresenta o id do estabelecimento.
   * @param flagConsultaExtrato Flag indicando se o terminal \u00C3\u00A9 f\u00C3\u00ADsico ou virtual, sendo: (true: Sim), (false: N\u00C3\u00A3o)).
   * @param flagTerminalVirtual Flag indicando se o terminal permite consultar extrato, sendo: (true: Sim), (false: N\u00C3\u00A3o)).
   * @return TerminalResponse
   */
  public TerminalResponse  salvarUsingPOST20 (Long idEstabelecimento, Boolean flagConsultaExtrato, Boolean flagTerminalVirtual) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idEstabelecimento' is set
    if (idEstabelecimento == null) {
       throw new ApiException(400, "Missing the required parameter 'idEstabelecimento' when calling salvarUsingPOST20");
    }
    
    // verify the required parameter 'flagConsultaExtrato' is set
    if (flagConsultaExtrato == null) {
       throw new ApiException(400, "Missing the required parameter 'flagConsultaExtrato' when calling salvarUsingPOST20");
    }
    
    // verify the required parameter 'flagTerminalVirtual' is set
    if (flagTerminalVirtual == null) {
       throw new ApiException(400, "Missing the required parameter 'flagTerminalVirtual' when calling salvarUsingPOST20");
    }
    

    // create path and map variables
    String path = "/api/terminais".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEstabelecimento", idEstabelecimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagConsultaExtrato", flagConsultaExtrato));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagTerminalVirtual", flagTerminalVirtual));
    

    

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
        return (TerminalResponse) ApiInvoker.deserialize(response, "", TerminalResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
